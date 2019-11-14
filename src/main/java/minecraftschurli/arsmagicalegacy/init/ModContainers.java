package minecraftschurli.arsmagicalegacy.init;

import minecraftschurli.arsmagicalegacy.objects.item.spellbook.SpellBookContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;

/**
 * @author Minecraftschurli
 * @version 2019-11-08
 */
public final class ModContainers implements Registries {

    public static final RegistryObject<ContainerType<SpellBookContainer>> SPELLBOOK = CONTAINERS.register("spellbook", () -> new ContainerType<>(SpellBookContainer::new));

    public static void register() {}
}