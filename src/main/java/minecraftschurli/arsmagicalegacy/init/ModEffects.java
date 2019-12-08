package minecraftschurli.arsmagicalegacy.init;

import minecraftschurli.arsmagicalegacy.objects.effect.*;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;

/**
 * @author Minecraftschurli
 * @version 2019-11-14
 */
public final class ModEffects implements IInit {
    public static final int DEFAULT_BUFF_DURATION = 600;

    public static final RegistryObject<Effect> AGILITY = POTIONS.register("agility", AgilityEffect::new);
    public static final RegistryObject<Effect> ASTRAL_DISTORTION = POTIONS.register("astral_distortion", AstralDistortionEffect::new);
    public static final BurnoutReductionEffect burnout_reduction_effect = new BurnoutReductionEffect();
    public static final RegistryObject<Effect> BURNOUT_REDUCTION = POTIONS.register("burnout_reduction", () -> burnout_reduction_effect);
    public static final RegistryObject<Effect> CLARITY = POTIONS.register("clarity", ClarityEffect::new);
    public static final RegistryObject<Effect> ENTANGLE = POTIONS.register("entangle", EntangleEffect::new);
    public static final RegistryObject<Effect> FLIGHT = POTIONS.register("flight", FlightEffect::new);
    public static final RegistryObject<Effect> FROST = POTIONS.register("frost", FrostEffect::new);
    public static final RegistryObject<Effect> FURY = POTIONS.register("fury", FuryEffect::new);
    public static final RegistryObject<Effect> GRAVITY_WELL = POTIONS.register("gravity_well", GravityWellEffect::new);
    public static final RegistryObject<Effect> ILLUMINATION = POTIONS.register("illumination", IlluminationEffect::new);
    public static final RegistryObject<Effect> INSTANT_MANA = POTIONS.register("instant_mana", InstantManaEffect::new);
    public static final RegistryObject<Effect> MAGIC_SHIELD = POTIONS.register("magic_shield", MagicShieldEffect::new);
    public static final RegistryObject<Effect> MANA_BOOST = POTIONS.register("mana_boost", ManaBoostEffect::new);
    public static final ManaRegenEffect mana_regen_effect = new ManaRegenEffect();
    public static final RegistryObject<Effect> MANA_REGEN = POTIONS.register("mana_regen", () -> mana_regen_effect);
    public static final RegistryObject<Effect> SCRAMBLE_SYNAPSES = POTIONS.register("scramble_synapses", ScrambleSynapsesEffect::new);
    public static final RegistryObject<Effect> SHIELD = POTIONS.register("shield", ShieldEffect::new);
    public static final RegistryObject<Effect> SHRINK = POTIONS.register("shrink", ShrinkEffect::new);
    public static final RegistryObject<Effect> SILENCE = POTIONS.register("silence", SilenceEffect::new);
    public static final RegistryObject<Effect> SPELL_REFLECT = POTIONS.register("spell_reflect", SpellReflectEffect::new);
    public static final RegistryObject<Effect> SWIFT_SWIM = POTIONS.register("swift_swim", SwiftSwimEffect::new);
    public static final RegistryObject<Effect> TEMPORAL_ANCHOR = POTIONS.register("temporal_anchor", TemporalAnchorEffect::new);
    public static final RegistryObject<Effect> TRUE_SIGHT = POTIONS.register("true_sight", TrueSightEffect::new);
    public static final RegistryObject<Effect> WATERY_GRAVE = POTIONS.register("watery_grave", WateryGraveEffect::new);
    /*public static final RegistryObject<Effect> CHARME = POTIONS.register("charme",
            () -> new AMEffect(EffectType.NEUTRAL, 0)
    );*/

    public static void register() {
    }
}
