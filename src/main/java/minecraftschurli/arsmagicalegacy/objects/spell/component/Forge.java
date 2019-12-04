package minecraftschurli.arsmagicalegacy.spell.component;

import com.google.common.collect.*;
import minecraftschurli.arsmagicalegacy.api.affinity.*;
import minecraftschurli.arsmagicalegacy.api.spell.*;
import minecraftschurli.arsmagicalegacy.init.*;
import minecraftschurli.arsmagicalegacy.particles.*;
import minecraftschurli.arsmagicalegacy.utils.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

import java.util.*;

public class Forge extends SpellComponent {
    @Override
    public boolean applyEffectBlock(ItemStack stack, World world, BlockPos pos, Direction blockFace, double impactX, double impactY, double impactZ, LivingEntity caster) {
        if (!CanApplyFurnaceToBlockAtCoords(caster, world, pos)) return false;
        ApplyFurnaceToBlockAtCoords(caster, world, pos);
        return true;
    }

    @Override
    public boolean applyEffectEntity(ItemStack stack, World world, LivingEntity caster, Entity target) {
        if (target instanceof EntityVillager && ArsMagica2.config.forgeSmeltsVillagers()) {
            if (!world.isRemote && !EntityUtils.isSummon((LivingEntity) target))
                target.dropItem(Items.EMERALD, 1);
            if (caster instanceof PlayerEntity)
                target.attackEntityFrom(DamageSource.causePlayerDamage((PlayerEntity) caster), 5000);
            else
                target.attackEntityFrom(DamageSource.causeMobDamage(caster), 5000);
            return true;
        }
        return false;
    }

    @Override
    public EnumSet<SpellModifiers> getModifiers() {
        return EnumSet.noneOf(SpellModifiers.class);
    }

    @Override
    public float getManaCost(LivingEntity caster) {
        return 55;
    }

    @Override
    public ItemStack[] reagents(LivingEntity caster) {
        return null;
    }

    @Override
    public void spawnParticles(World world, double x, double y, double z, LivingEntity caster, Entity target, Random rand, int colorModifier) {
        AMParticle particle = (AMParticle) ArsMagica2.proxy.particleManager.spawn(world, "radiant", x + 0.5, y + 0.5, z + 0.5);
        if (particle != null) {
            particle.AddParticleController(new ParticleHoldPosition(particle, 20, 1, false));
            particle.setMaxAge(20);
            particle.setParticleScale(0.3f);
            particle.setRGBColorF(0.7f, 0.4f, 0.2f);
            particle.SetParticleAlpha(0.1f);
            if (colorModifier > -1) {
                particle.setRGBColorF(((colorModifier >> 16) & 0xFF) / 255.0f, ((colorModifier >> 8) & 0xFF) / 255.0f, (colorModifier & 0xFF) / 255.0f);
            }
        }
    }

    @Override
    public Set<Affinity> getAffinity() {
        return Sets.newHashSet(Affinity.FIRE);
    }

    @SuppressWarnings("deprecation")
    private boolean ApplyFurnaceToBlockAtCoords(LivingEntity entity, World world, BlockPos pos) {
        Block block = world.getBlockState(pos).getBlock();
        if (block.equals(Blocks.AIR)) {
            return false;
        }
        if (block.equals(Blocks.ICE)) {
            if (!world.isRemote) {
                world.setBlockState(pos, Blocks.WATER.getDefaultState());
            }
            return true;
        }
        int meta = world.getBlockState(pos).getBlock().getMetaFromState(world.getBlockState(pos));
        ItemStack smelted = FurnaceRecipes.instance().getSmeltingResult(new ItemStack(block, 1, meta));
        if (smelted == null) {
            return false;
        }
        if (!world.isRemote) {
            if (ItemIsBlock(smelted.getItem())) {
                world.setBlockState(pos, ((ItemBlock) smelted.getItem()).block.getStateFromMeta(smelted.getItemDamage()));
            } else {
                ItemEntity item = new ItemEntity(world, pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5F, smelted.copy());
                float f3 = 0.05F;
                item.motionX = (float) world.rand.nextGaussian() * f3;
                item.motionY = (float) world.rand.nextGaussian() * f3 + 0.2F;
                item.motionZ = (float) world.rand.nextGaussian() * f3;
                world.addEntity(item);
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        return true;
    }

    private boolean CanApplyFurnaceToBlockAtCoords(LivingEntity entity, World world, BlockPos pos) {
        BlockState block = world.getBlockState(pos);
        if (block.getBlock().equals(Blocks.AIR)) {
            return false;
        }
        if (block.getBlock().equals(Blocks.ICE)) {
            return true;
        }
        int meta = block.getBlock().getMetaFromState(block);
        ItemStack smelted = FurnaceRecipes.instance().getSmeltingResult(new ItemStack(block.getBlock(), 1, meta));
        return smelted != null;
    }

    public boolean ItemIsBlock(Item smelted) {
        return smelted instanceof ItemBlock;
    }

    @Override
    public ISpellIngredient[] getRecipe() {
        return new ISpellIngredient[]{
                new ItemStack(ModItems.RED_RUNE.get()),
                Blocks.FURNACE
        };
    }

    @Override
    public float getAffinityShift(Affinity affinity) {
        return 0.01f;
    }

    @Override
    public void encodeBasicData(CompoundNBT tag, Object[] recipe) {
    }
}