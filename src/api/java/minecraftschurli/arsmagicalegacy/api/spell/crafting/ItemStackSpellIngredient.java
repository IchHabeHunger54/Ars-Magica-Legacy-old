package minecraftschurli.arsmagicalegacy.api.spell.crafting;

import net.minecraft.entity.item.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.*;
import net.minecraft.world.*;
import net.minecraftforge.items.*;

import java.util.*;
import java.util.function.*;

/**
 * @author Minecraftschurli
 * @version 2019-11-19
 */
public class ItemStackSpellIngredient implements ISpellIngredient {
    public static final String TYPE = "item_stack";
    private ItemStack stack;

    ItemStackSpellIngredient(CompoundNBT nbt) {
        deserializeNBT(nbt);
    }

    public ItemStackSpellIngredient(ItemStack stack) {
        this.stack = stack;
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT nbt = new CompoundNBT();
        nbt.putString(TYPE_KEY, TYPE);
        return this.stack.write(nbt);
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        //nbt.remove(TYPE_KEY);
        this.stack = ItemStack.read(nbt);
    }

    @Override
    public boolean canCombine(ISpellIngredient other) {
        return (other instanceof ItemStackSpellIngredient) &&
                ItemHandlerHelper.canItemStacksStack(stack, ((ItemStackSpellIngredient) other).stack);
    }

    @Override
    public ISpellIngredient combine(ISpellIngredient other) {
        ItemStack newStack = new ItemStack(stack.getItem(), stack.getCount(), stack.getTag());
        newStack.grow(((ItemStackSpellIngredient) other).stack.getCount());
        return new ItemStackSpellIngredient(newStack);
    }

    @Override
    public ITextComponent getTooltip() {
        return stack.getDisplayName().appendSibling(new StringTextComponent(": " + stack.getCount()));
    }

    @Override
    public boolean consume(World world, BlockPos pos) {
        List<ItemEntity> items = world.getEntitiesWithinAABB(ItemEntity.class, new AxisAlignedBB(pos).grow(0.5, 1, 0.5).offset(0, -2, 0));
        if (items.isEmpty())
            return false;
        Predicate<ItemEntity> filter = entity -> stack.equals(entity.getItem(), false);
        Optional<ItemEntity> optional = items.stream().filter(filter).findFirst();
        if (optional.isPresent()) {
            ItemEntity entity = optional.get();
            entity.getItem().shrink(1);
            return true;
        }
        return false;
    }

    public ItemStack getStack() {
        return stack;
    }
}