package minecraftschurli.arsmagicalegacy.api;

import minecraftschurli.arsmagicalegacy.api.advancements.ArsMagicaCriteriaTriggers;
import minecraftschurli.arsmagicalegacy.api.affinity.Affinity;
import minecraftschurli.arsmagicalegacy.api.capability.CapabilityHelper;
import minecraftschurli.arsmagicalegacy.api.skill.Skill;
import minecraftschurli.arsmagicalegacy.api.skill.SkillTree;
import minecraftschurli.arsmagicalegacy.api.spell.AbstractSpellPart;
import minecraftschurli.arsmagicalegacy.api.spell.crafting.EssenceType;
import minecraftschurli.arsmagicalegacy.api.spell.crafting.IngredientTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Minecraftschurli
 * @version 2019-12-03
 */
public class ArsMagicaAPI {
    public static final String MODID = "arsmagicalegacy";
    public static final String MODNAME = "ArsMagicaLegacy";

    public static final Logger LOGGER = LogManager.getLogger();

    private static IForgeRegistry<SkillTree> SKILL_TREE_REGISTRY = null;
    private static IForgeRegistry<AbstractSpellPart> SPELL_PART_REGISTRY = null;
    private static IForgeRegistry<Skill> SKILL_REGISTRY = null;
    private static IForgeRegistry<Affinity> AFFINITY_REGISTRY = null;
    private static IForgeRegistry<EssenceType> ESSENCE_TYPE_REGISTRY = null;

    public static void setup() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(SpellRegistry::onSpellPartRegister);
        modEventBus.addListener(SkillRegistry::onSkillRegister);
        modEventBus.addListener(SkillTreeRegistry::onSkillTreeRegister);
        modEventBus.addListener(AffinityRegistry::onAffinityRegister);
        modEventBus.addListener(ArsMagicaAPI::registerRegistries);

        CapabilityHelper.setup();
    }

    public static void init() {
        IngredientTypes.registerDefault();
        ArsMagicaCriteriaTriggers.registerDefaults();
    }

    private static void registerRegistries(final RegistryEvent.NewRegistry event) {
        SPELL_PART_REGISTRY = new RegistryBuilder<AbstractSpellPart>().setName(new ResourceLocation(ArsMagicaAPI.MODID, "spell_parts")).setType(AbstractSpellPart.class).create();
        SKILL_REGISTRY = new RegistryBuilder<Skill>().setName(new ResourceLocation(ArsMagicaAPI.MODID, "skills")).setType(Skill.class).create();
        SKILL_TREE_REGISTRY = new RegistryBuilder<SkillTree>().setName(new ResourceLocation(ArsMagicaAPI.MODID, "skill_trees")).setType(SkillTree.class).create();
        AFFINITY_REGISTRY = new RegistryBuilder<Affinity>().setName(new ResourceLocation(ArsMagicaAPI.MODID, "affinities")).setType(Affinity.class).create();
        ESSENCE_TYPE_REGISTRY = new RegistryBuilder<EssenceType>().setName(new ResourceLocation(ArsMagicaAPI.MODID, "essence_types")).setType(EssenceType.class).create();
    }

    public static IForgeRegistry<AbstractSpellPart> getSpellPartRegistry() {
        return SPELL_PART_REGISTRY;
    }

    public static IForgeRegistry<Skill> getSkillRegistry() {
        return SKILL_REGISTRY;
    }

    public static IForgeRegistry<SkillTree> getSkillTreeRegistry() {
        return SKILL_TREE_REGISTRY;
    }

    public static IForgeRegistry<Affinity> getAffinityRegistry() {
        return AFFINITY_REGISTRY;
    }

    public static IForgeRegistry<EssenceType> getEssenceTypeRegistry() {
        return ESSENCE_TYPE_REGISTRY;
    }

    public static PlayerEntity getLocalPlayer() {
        return DistExecutor.callWhenOn(Dist.CLIENT, () -> () -> net.minecraft.client.Minecraft.getInstance().player);
    }
}
