package minecraftschurli.arsmagicalegacy.objects.spell.modifier;

import minecraftschurli.arsmagicalegacy.api.spellsystem.SpellModifier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.EnumSet;

/**
 * @author Minecraftschurli
 * @version 2019-11-17
 */
public class Color extends SpellModifier {
    /**
     * Returns a list of the aspects of a spell that this modifier can change.
     *
     * @return
     */
    @Override
    public EnumSet<Type> getAspectsModified() {
        return null;
    }

    /**
     * Returns the modified value for the specified type.
     *
     * @param type     The type of value we are modifying
     * @param caster   The caster
     * @param target   The target (can be the same as the caster)
     * @param world    The world in which the spell is being cast.
     * @param metadata Any metadata written to the spell for this modifier (obtained from getModifierMetadata)
     * @return A factor to multiply the default value by (or add, depending on the component's programming)
     */
    @Override
    public float getModifier(Type type, LivingEntity caster, Entity target, World world, byte[] metadata) {
        return 0;
    }

    /**
     * Gets the amount that adding this modifier to the spell alters the mana cost.
     *
     * @param spellStack The itemstack comprising the spell (in case you want to base it on other modifiers added)
     * @param stage      The stage in which this modifier has been added (if the modifier is added to multiple stages, this will be called multiple times, once per stage)
     * @param quantity   The quantity of this multiplier in the specified stage.
     */
    @Override
    public float getManaCostMultiplier(ItemStack spellStack, int stage, int quantity) {
        return 0;
    }

    @Override
    public Object[] getRecipeItems() {
        return new Object[0];
    }
}