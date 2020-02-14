package minecraftschurli.arsmagicalegacy.objects.spell.shape;

import minecraftschurli.arsmagicalegacy.api.*;
import minecraftschurli.arsmagicalegacy.api.spell.*;
import minecraftschurli.arsmagicalegacy.api.spell.crafting.*;
import minecraftschurli.arsmagicalegacy.init.*;
import minecraftschurli.arsmagicalegacy.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.boss.dragon.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraftforge.common.*;

import java.util.*;

public class Touch extends SpellShape {
    @Override
    public boolean isChanneled() {
        return false;
    }

    @Override
    public float manaCostMultiplier(ItemStack spellStack) {
        return 1;
    }

    @Override
    public boolean isTerminusShape() {
        return false;
    }

    @Override
    public boolean isPrincipumShape() {
        return false;
    }

    @Override
    public SpellCastResult beginStackStage(ISpellItem item, ItemStack stack, LivingEntity caster, LivingEntity target, World world, double x, double y, double z, Direction side, boolean giveXP, int useCount) {
        if (target != null) {
            return SpellUtils.applyStageToEntity(stack, caster, world, target, giveXP);
        }
        boolean targetWater = SpellUtils.modifierIsPresent(SpellModifiers.TARGET_NONSOLID_BLOCKS, stack);
        RayTraceResult mop = item.getMovingObjectPosition(caster, world, 2.5f, true, targetWater);
        if (mop == null) return SpellCastResult.EFFECT_FAILED;
        else {
            if (mop.getType() == RayTraceResult.Type.ENTITY) {
                Entity e = ((EntityRayTraceResult) mop).getEntity();
                if (e instanceof EnderDragonPartEntity && ((EnderDragonPartEntity) e).dragon != null)
                    e = ((EnderDragonPartEntity) e).dragon;
                SpellCastResult result = SpellUtils.applyStageToEntity(stack, caster, world, e, giveXP);
                if (result != SpellCastResult.SUCCESS) return result;
                return SpellUtils.applyStackStage(stack, caster, target, mop.getHitVec().getX(), mop.getHitVec().getY(), mop.getHitVec().getZ(), null, world, true, giveXP, 0);
            } else if (mop.getType() == RayTraceResult.Type.BLOCK) {
                SpellCastResult result = SpellUtils.applyStageToGround(stack, caster, world, ((BlockRayTraceResult) mop).getPos(), ((BlockRayTraceResult) mop).getFace(), mop.getHitVec().getX(), mop.getHitVec().getY(), mop.getHitVec().getZ(), giveXP);
                if (result != SpellCastResult.SUCCESS) return result;
                return SpellUtils.applyStackStage(stack, caster, target, ((BlockRayTraceResult) mop).getPos().getX(), ((BlockRayTraceResult) mop).getPos().getY(), ((BlockRayTraceResult) mop).getPos().getZ(), ((BlockRayTraceResult) mop).getFace(), world, true, giveXP, 0);
            } else {
                return SpellCastResult.EFFECT_FAILED;
            }
        }
    }

    @Override
    public ISpellIngredient[] getRecipe() {
        return new ISpellIngredient[]{
                new ItemTagSpellIngredient(ModTags.Items.DUSTS_VINTEUM),
                new ItemStackSpellIngredient(new ItemStack(Items.CLAY_BALL)),
                new ItemStackSpellIngredient(new ItemStack(Items.COD)),
                new ItemTagSpellIngredient(Tags.Items.FEATHERS)
        };
    }

    @Override
    public void encodeBasicData(CompoundNBT tag, ISpellIngredient[] recipe) {

    }

    @Override
    public EnumSet<SpellModifiers> getModifiers() {
        return EnumSet.of(SpellModifiers.TARGET_NONSOLID_BLOCKS);
    }
}
