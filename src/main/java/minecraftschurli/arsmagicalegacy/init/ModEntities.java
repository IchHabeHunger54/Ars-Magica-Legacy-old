package minecraftschurli.arsmagicalegacy.init;

import minecraftschurli.arsmagicalegacy.objects.entity.BlizzardEntity;
import minecraftschurli.arsmagicalegacy.objects.entity.FireRainEntity;
import minecraftschurli.arsmagicalegacy.objects.entity.SpellProjectileEntity;
import minecraftschurli.arsmagicalegacy.objects.entity.ThrownRockEntity;
import minecraftschurli.arsmagicalegacy.objects.spell.component.FireRain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

/**
 * @author Minecraftschurli
 * @version 2019-11-25
 */
public final class ModEntities implements IInit {
    public static final RegistryObject<EntityType<Entity>> SPELL_PROJECTILE = ENTITIES.register("spell_projectile", () -> EntityType.Builder.create(SpellProjectileEntity::new, EntityClassification.MISC).build("spell_projectile"));
    public static final RegistryObject<EntityType<Entity>> THROWN_ROCK = ENTITIES.register("thrown_rock", () -> EntityType.Builder.create(ThrownRockEntity::new, EntityClassification.MISC).build("thrown_rock"));
    public static final RegistryObject<EntityType<Entity>> BLIZZARD = ENTITIES.register("blizzard", () -> EntityType.Builder.create(BlizzardEntity::new, EntityClassification.MISC).build("blizzard"));
    public static final RegistryObject<EntityType<Entity>> FIRE_RAIN = ENTITIES.register("fire_rain", () -> EntityType.Builder.create(FireRainEntity::new, EntityClassification.MISC).build("fire_rain"));

    public static void register() {
    }
}
