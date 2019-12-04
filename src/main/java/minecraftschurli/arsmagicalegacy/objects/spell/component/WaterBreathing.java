package minecraftschurli.arsmagicalegacy.spell.component;

import com.google.common.collect.*;
import minecraftschurli.arsmagicalegacy.api.affinity.*;
import minecraftschurli.arsmagicalegacy.api.blocks.*;
import minecraftschurli.arsmagicalegacy.api.rituals.*;
import minecraftschurli.arsmagicalegacy.api.spell.*;
import minecraftschurli.arsmagicalegacy.buffs.*;
import minecraftschurli.arsmagicalegacy.init.*;
import minecraftschurli.arsmagicalegacy.particles.*;
import minecraftschurli.arsmagicalegacy.utils.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

import java.util.*;

public class WaterBreathing extends SpellComponent {
    @Override
    public boolean applyEffectBlock(ItemStack stack, World world, BlockPos pos, Direction blockFace, double impactX, double impactY, double impactZ, LivingEntity caster) {
        return false;
    }

    @Override
    public boolean applyEffectEntity(ItemStack stack, World world, LivingEntity caster, Entity target) {
        if (target instanceof LivingEntity) {
            int duration = SpellUtils.getModifiedIntMul(PotionEffectsDefs.default_buff_duration, stack, caster, target, world, SpellModifiers.DURATION);
            //duration = SpellUtils.modifyDurationBasedOnArmor(caster, duration);
            if (RitualShapeHelper.instance.matchesRitual(this, world, target.getPosition())) {
                duration += (3600 * (SpellUtils.countModifiers(SpellModifiers.BUFF_POWER, stack) + 1));
                RitualShapeHelper.instance.consumeReagents(this, world, target.getPosition());
            }
            if (!world.isRemote)
                ((LivingEntity) target).addPotionEffect(new BuffEffectWaterBreathing(duration, SpellUtils.countModifiers(SpellModifiers.BUFF_POWER, stack)));
            return true;
        }
        return false;
    }

    @Override
    public float getManaCost(LivingEntity caster) {
        return 80;
    }

    @Override
    public ItemStack[] reagents(LivingEntity caster) {
        return null;
    }

    @Override
    public void spawnParticles(World world, double x, double y, double z, LivingEntity caster, Entity target, Random rand, int colorModifier) {
        for (int i = 0; i < 25; ++i) {
            AMParticle particle = (AMParticle) ArsMagica2.proxy.particleManager.spawn(world, "water_ball", x, y - 1, z);
            if (particle != null) {
                particle.addRandomOffset(1, 1, 1);
                particle.AddParticleController(new ParticleFloatUpward(particle, 0, 0.1f, 1, false));
                particle.AddParticleController(new ParticleOrbitEntity(particle, target, 0.5f, 2, false).setIgnoreYCoordinate(true).SetTargetDistance(0.3f + rand.nextDouble() * 0.3));
                particle.setMaxAge(20);
                particle.setParticleScale(0.1f);
                particle.SetParticleAlpha(0.2f);
                if (colorModifier > -1) {
                    particle.setRGBColorF(((colorModifier >> 16) & 0xFF) / 255.0f, ((colorModifier >> 8) & 0xFF) / 255.0f, (colorModifier & 0xFF) / 255.0f);
                }
            }
        }
    }

    @Override
    public Set<Affinity> getAffinity() {
        return Sets.newHashSet(Affinity.WATER);
    }

    @Override
    public ISpellIngredient[] getRecipe() {
        return new ISpellIngredient[]{
                new ItemStack(ModItems.BLUE_RUNE.get()),
                //TODO BlocksCommonProxy.wakebloom,
                Items.REEDS
        };
    }

    @Override
    public float getAffinityShift(Affinity affinity) {
        return 0.05f;
    }

    @Override
    public MultiblockStructureDefinition getRitualShape() {
        return RitualShapeHelper.instance.hourglass;
    }

    @Override
    public ItemStack[] getReagents() {
        return new ItemStack[]{
                new ItemStack(Items.REEDS)
        };
    }

    @Override
    public int getReagentSearchRadius() {
        return 3;
    }

    @Override
    public EnumSet<SpellModifiers> getModifiers() {
        return EnumSet.of(SpellModifiers.BUFF_POWER, SpellModifiers.DURATION);
    }

    @Override
    public void encodeBasicData(CompoundNBT tag, Object[] recipe) {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getResult() {
        return null;
    }
}