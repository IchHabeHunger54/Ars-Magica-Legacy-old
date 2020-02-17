package minecraftschurli.arsmagicalegacy.data.lang;

import minecraftschurli.arsmagicalegacy.*;
import minecraftschurli.arsmagicalegacy.api.data.*;
import minecraftschurli.arsmagicalegacy.init.*;
import net.minecraft.data.*;
import net.minecraftforge.common.data.*;

/**
 * @author Minecraftschurli
 * @version 2020-01-01
 */
public class AMLEnglishLanguageProvider extends LanguageProvider implements ArsMagicaLanguagePlugin {
    public AMLEnglishLanguageProvider(DataGenerator gen) {
        super(gen, ArsMagicaLegacy.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlock(ModBlocks.SUNSTONE_BLOCK, "Sunstone Block");
        addBlock(ModBlocks.SUNSTONE_ORE, "Sunstone Ore");
        addItem(ModItems.SUNSTONE, "Sunstone");
        addBlock(ModBlocks.MOONSTONE_BLOCK, "Moonstone Block");
        addBlock(ModBlocks.MOONSTONE_ORE, "Moonstone Ore");
        addItem(ModItems.MOONSTONE, "Moonstone");
        addBlock(ModBlocks.CHIMERITE_BLOCK, "Chimerite Block");
        addBlock(ModBlocks.CHIMERITE_ORE, "Chimerite Ore");
        addItem(ModItems.CHIMERITE, "Chimerite");
        addBlock(ModBlocks.TOPAZ_BLOCK, "Topaz Block");
        addBlock(ModBlocks.TOPAZ_ORE, "Topaz Ore");
        addItem(ModItems.TOPAZ, "Topaz");
        addBlock(ModBlocks.VINTEUM_BLOCK, "Vinteum Block");
        addBlock(ModBlocks.VINTEUM_ORE, "Vinteum Ore");
        addItem(ModItems.VINTEUM, "Vinteum");
        addBlock(ModBlocks.WITCHWOOD_PLANKS, "Witchwood Planks");
        addBlock(ModBlocks.WITCHWOOD_LOG, "Witchwood Log");
        addBlock(ModBlocks.WITCHWOOD_STAIRS, "Witchwood Stairs");
        addBlock(ModBlocks.WITCHWOOD_SLAB, "Witchwood Slab");
        addBlock(ModBlocks.WITCHWOOD_BUTTON, "Witchwood Button");
        addBlock(ModBlocks.WITCHWOOD_DOOR, "Witchwood Door");
        addBlock(ModBlocks.WITCHWOOD_FENCE, "Witchwood Fence");
        addBlock(ModBlocks.WITCHWOOD_FENCE_GATE, "Witchwood Fence Gate");
        addBlock(ModBlocks.WITCHWOOD_LEAVES, "Witchwood Leaves");
        addBlock(ModBlocks.WITCHWOOD_PRESSURE_PLATE, "Witchwood Pressure Plate");
        addBlock(ModBlocks.WITCHWOOD_TRAPDOOR, "Witchwood Trapdoor");
        addBlock(ModBlocks.WITCHWOOD_WOOD, "Witchwood Wood");
        addBlock(ModBlocks.WITCHWOOD_SAPLING, "Witchwood Sapling");
        addBlock(ModBlocks.STRIPPED_WITCHWOOD_LOG, "Stripped Witchwood Log");
        addBlock(ModBlocks.STRIPPED_WITCHWOOD_WOOD, "Stripped Witchwood Wood");
        addBlock(ModBlocks.WAKEBLOOM, "Wakebloom");
        addBlock(ModBlocks.TARMA_ROOT, "Tarma Root");
        addBlock(ModBlocks.AUM, "Aum");
        addBlock(ModBlocks.DESERT_NOVA, "Desert Nova");
        addBlock(ModBlocks.CERUBLOSSOM, "Cerublossom");
        addItem(ModItems.RUNE, "Rune");
        addItem(ModItems.BLUE_RUNE, "Blue Rune");
        addItem(ModItems.WHITE_RUNE, "White Rune");
        addItem(ModItems.PURPLE_RUNE, "Purple Rune");
        addItem(ModItems.BLACK_RUNE, "Black Rune");
        addItem(ModItems.GREEN_RUNE, "Green Rune");
        addItem(ModItems.RED_RUNE, "Red Rune");
        addItem(ModItems.YELLOW_RUNE, "Yellow Rune");
        addItem(ModItems.ORANGE_RUNE, "Orange Rune");
        addItem(ModItems.BROWN_RUNE, "Brown Rune");
        addItem(ModItems.CYAN_RUNE, "Cyan Rune");
        addItem(ModItems.GRAY_RUNE, "Gray Rune");
        addItem(ModItems.LIGHT_BLUE_RUNE, "Light Blue Rune");
        addItem(ModItems.LIGHT_GRAY_RUNE, "Light Gray Rune");
        addItem(ModItems.LIME_RUNE, "Lime Rune");
        addItem(ModItems.MAGENTA_RUNE, "Magenta Rune");
        addItem(ModItems.PINK_RUNE, "Pink Rune");
        addItem(ModItems.LESSER_FOCUS, "Lesser Focus");
        addItem(ModItems.STANDARD_FOCUS, "Standard Focus");
        addItem(ModItems.GREATER_FOCUS, "Greater Focus");
        addItem(ModItems.MANA_FOCUS, "Mana Focus");
        addItem(ModItems.MONSTER_FOCUS, "Monster Focus");
        addItem(ModItems.PLAYER_FOCUS, "Player Focus");
        addItem(ModItems.CREATURE_FOCUS, "Creature Focus");
        addItem(ModItems.ITEM_FOCUS, "Item Focus");
        addItem(ModItems.CHARGE_FOCUS, "Charge Focus");
        addItem(ModItems.WATER_ESSENCE, "Water Essence");
        addItem(ModItems.FIRE_ESSENCE, "Fire Essence");
        addItem(ModItems.EARTH_ESSENCE, "Earth Essence");
        addItem(ModItems.AIR_ESSENCE, "Air Essence");
        addItem(ModItems.LIGHTNING_ESSENCE, "Lightning Essence");
        addItem(ModItems.ICE_ESSENCE, "Ice Essence");
        addItem(ModItems.NATURE_ESSENCE, "Nature Essence");
        addItem(ModItems.LIFE_ESSENCE, "Life Essence");
        addItem(ModItems.ARCANE_ESSENCE, "Arcane Essence");
        addItem(ModItems.ENDER_ESSENCE, "Ender Essence");
        addItem(ModItems.FLICKER_JAR, "Flicker Jar");
        addItem(ModItems.WATER_FLICKER_JAR, "Water Flicker Jar");
        addItem(ModItems.FIRE_FLICKER_JAR, "Fire Flicker Jar");
        addItem(ModItems.EARTH_FLICKER_JAR, "Earth Flicker Jar");
        addItem(ModItems.AIR_FLICKER_JAR, "Air Flicker Jar");
        addItem(ModItems.LIGHTNING_FLICKER_JAR, "Lightning Flicker Jar");
        addItem(ModItems.ICE_FLICKER_JAR, "Ice Flicker Jar");
        addItem(ModItems.NATURE_FLICKER_JAR, "Nature Flicker Jar");
        addItem(ModItems.LIFE_FLICKER_JAR, "Life Flicker Jar");
        addItem(ModItems.ARCANE_FLICKER_JAR, "Arcane Flicker Jar");
        addItem(ModItems.ENDER_FLICKER_JAR, "Ender Flicker Jar");
        addItem(ModItems.WATER_TOME, "Water Tome");
        addItem(ModItems.FIRE_TOME, "Fire Tome");
        addItem(ModItems.EARTH_TOME, "Earth Tome");
        addItem(ModItems.AIR_TOME, "Air Tome");
        addItem(ModItems.LIGHTNING_TOME, "Lightning Tome");
        addItem(ModItems.ICE_TOME, "Ice Tome");
        addItem(ModItems.NATURE_TOME, "Nature Tome");
        addItem(ModItems.LIFE_TOME, "Life Tome");
        addItem(ModItems.ARCANE_TOME, "Arcane Tome");
        addItem(ModItems.ENDER_TOME, "Ender Tome");
        addItem(ModItems.BUTCHER_FLICKER_FOCUS, "Focus: Butcher");
        addItem(ModItems.CONTAINMENT_FLICKER_FOCUS, "Focus: Containment");
        addItem(ModItems.FELLING_FLICKER_FOCUS, "Focus: Felling");
        addItem(ModItems.FISHING_FLICKER_FOCUS, "Focus: Fishing");
        addItem(ModItems.FLAT_LAND_FLICKER_FOCUS, "Focus: Flat Lands");
        addItem(ModItems.GENTLE_RAIN_FLICKER_FOCUS, "Focus: Gentle Rains");
        addItem(ModItems.INTERDICTION_FLICKER_FOCUS, "Focus: Interdiction");
        addItem(ModItems.ITEM_TRANSPORT_FLICKER_FOCUS, "Focus: Item");
        addItem(ModItems.LIGHT_FLICKER_FOCUS, "Focus: Light");
        addItem(ModItems.LUNAR_FLICKER_FOCUS, "Focus: Lunar");
        addItem(ModItems.NATURE_BOUNTY_FLICKER_FOCUS, "Focus: Nature's Bounty");
        addItem(ModItems.PACKED_EARTH_FLICKER_FOCUS, "Focus: Packed Earth");
        addItem(ModItems.PROGENY_FLICKER_FOCUS, "Focus: Progeny");
        addItem(ModItems.MANA_CAKE, "Mana Cake");
        addItem(ModItems.MANA_MARTINI, "Mana Martini");
        addBlock(ModBlocks.GOLD_INLAY, "Gold Inlay");
        addBlock(ModBlocks.IRON_INLAY, "Iron Inlay");
        addBlock(ModBlocks.REDSTONE_INLAY, "Redstone Inlay");
        addBlock(ModBlocks.VINTEUM_TORCH, "Vinteum Torch");
        addItem(ModItems.MAGE_HELMET, "Mage Helmet");
        addItem(ModItems.MAGE_CHESTPLATE, "Mage Chestplate");
        addItem(ModItems.MAGE_LEGGINGS, "Mage Leggings");
        addItem(ModItems.MAGE_BOOTS, "Mage Boots");
        addItem(ModItems.BATTLEMAGE_HELMET, "Battlemage Helmet");
        addItem(ModItems.BATTLEMAGE_CHESTPLATE, "Battlemage Chestplate");
        addItem(ModItems.BATTLEMAGE_LEGGINGS, "Battlemage Leggings");
        addItem(ModItems.BATTLEMAGE_BOOTS, "Battlemage Boots");
        addItem(ModItems.INFINITY_ORB, "%s Infinity Orb");
        addItemStack(ModItems.INSCRIPTION_UPGRADE.lazyMap(item -> item.getTieredStack(0)), "Tier I Upgrade");
        addItemStack(ModItems.INSCRIPTION_UPGRADE.lazyMap(item -> item.getTieredStack(1)), "Tier II Upgrade");
        addItemStack(ModItems.INSCRIPTION_UPGRADE.lazyMap(item -> item.getTieredStack(2)), "Tier III Upgrade");
        addBlock(ModBlocks.INSCRIPTION_TABLE, "Inscription Table");
        addBlock(ModBlocks.ALTAR_CORE, "Altar Core");
        addBlock(ModBlocks.MAGIC_WALL, "Magic Wall");
        addBlock(ModBlocks.OCCULUS, "Occulus");
        addBlock(ModBlocks.MANA_BATTERY, "Mana Battery");
        addBlock(ModBlocks.ESSENCE_REFINER, "Essence Refiner");
        addBlock(ModBlocks.ARMOR_IMBUEMENT_TABLE, "Armor Imbuement Table");
        addBlock(ModBlocks.SLIPSTREAM_GENERATOR, "Slipstream Generator");
        addBlock(ModBlocks.DRAINING_WELL, "Draining Well");
        addBlock(ModBlocks.FLICKER_LURE, "Flicker Lure");
        addBlock(ModBlocks.EVERSTONE, "Everstone");
        addBlock(ModBlocks.KEYSTONE_DOOR, "Keystone Door");
        addBlock(ModBlocks.SPELL_SEALED_DOOR, "Spell-Sealed Door");
        addBlock(ModBlocks.KEYSTONE_TRAPDOOR, "Keystone Trapdoor");
        addItem(ModItems.KEYSTONE, "Keystone");
        addItem(ModItems.PURIFIED_VINTEUM, "Purified Vinteum");
        addItem(ModItems.ARCANE_ASH, "Arcane Ash");
        addItem(ModItems.ARCANE_COMPOUND, "Arcane Compound");
        addItem(ModItems.SPELL_PARCHMENT, "Spell Parchment");
        addItem(ModItems.PIG_FAT, "Pig Fat");
        addItem(ModItems.WOODEN_LEG, "Wooden Leg");
        addItem(ModItems.EVIL_BOOK, "Evil Book");
        addItem(ModItems.SPELL_BOOK, "Spell Book");
        addItem(ModItems.SPELL, "Spell");
        addItem(ModItems.BASE_ESSENCE_CORE, "Base Essence Core");
        addItem(ModItems.HIGH_ESSENCE_CORE, "High Essence Core");
        addItem(ModItems.PURE_ESSENCE_CORE, "Pure Essence Core");
        addItem(ModItems.DEFICIT_CRYSTAL, "Deficit Crystal");
        addItem(ModItems.RUNE_BAG, "Rune Bag");
        addItem(ModItems.ESSENCE_BAG, "Essence Bag");
        addItem(ModItems.HELL_COW_HORN, "Hell Cow Horn");
        addItem(ModItems.JOURNAL, "Journal");
        addItem(ModItems.MAGITECH_GOGGLES, "Magitech Goggles");
        addItem(ModItems.MAGITECH_STAFF, "Magitech Staff");
        addItem(ModItems.CRYSTAL_WRENCH, "Crystal Wrench");
        addItem(ModItems.WIZARD_CHALK, "Wizard's Chalk");
        addItem(ModItems.CRYSTAL_PHYLACTERY, "Crystal Phylactery");
        addItem(ModItems.POTION_BUNDLE, "%s Potion Bundle");
        addItem(ModFluids.LIQUID_ESSENCE_BUCKET, "Liquid Essence Bucket");
        addBiome(ModBiomes.WITCHWOOD_FOREST, "Witchwood Forest");
        addEntityType(ModEntities.SPELL_PROJECTILE, "Spell Projectile");
        addEntityType(ModEntities.THROWN_ROCK, "Thrown Rock");
        addEffect(ModEffects.AGILITY, "Agility");
        addEffect(ModEffects.ASTRAL_DISTORTION, "Astral Distortion");
        addEffect(ModEffects.BURNOUT_REDUCTION, "Chillout");
        addEffect(ModEffects.CLARITY, "Clarity");
        addEffect(ModEffects.ENTANGLE, "Entangle");
        addEffect(ModEffects.FLIGHT, "Flight");
        addEffect(ModEffects.FROST, "Frost");
        addEffect(ModEffects.FURY, "Fury");
        addEffect(ModEffects.GRAVITY_WELL, "Gravity Well");
        addEffect(ModEffects.ILLUMINATION, "Illumination");
        addEffect(ModEffects.INSTANT_MANA, "Instant Mana");
        addEffect(ModEffects.MAGIC_SHIELD, "Magic Shield");
        addEffect(ModEffects.MANA_BOOST, "Mana Boost");
        addEffect(ModEffects.MANA_REGEN, "Mana Regen");
        addEffect(ModEffects.SCRAMBLE_SYNAPSES, "Scramble Synapses");
        addEffect(ModEffects.SHIELD, "Shield");
        addEffect(ModEffects.SHRINK, "Shrink");
        addEffect(ModEffects.SILENCE, "Silence");
        addEffect(ModEffects.SPELL_REFLECT, "Spell Reflect");
        addEffect(ModEffects.SWIFT_SWIM, "Swift Swim");
        addEffect(ModEffects.TEMPORAL_ANCHOR, "Temporal Anchor");
        addEffect(ModEffects.TRUE_SIGHT, "True Sight");
        addEffect(ModEffects.WATERY_GRAVE, "Watery Grave");
        addSpellPart(ModSpellParts.BLIZZARD, "Blizzard", "Snow. Lots of snow");
        addSpellPart(ModSpellParts.BUFF_POWER, "Buff Power", "Harder, better, faster and... my mana pool is empty.");
        addSpellPart(ModSpellParts.DAYLIGHT, "Daylight", "Does that mean I can control time?");
        addSpellPart(ModSpellParts.DISMEMBERING, "Dismembering", "Wasn't me. I swear he had no head when I came in.");
        addSpellPart(ModSpellParts.FALLING_STAR, "Starstrike", "Shiny! Wait, is it falling towards me?");
        addSpellPart(ModSpellParts.FIRE_RAIN, "Fire Rain", "Well, at least I'm not going to catch a cold...");
        addSpellPart(ModSpellParts.MANA_BLAST, "Mana Blast", "I LOVE mana, especially when it blows up in someone's face.");
        //addSpellPart(ModSpellParts.MANA_LINK, "Mana Link", "Tired? Keep going.");
        addSpellPart(ModSpellParts.MANA_SHIELD, "Mana Shield", "Well, now I know what boredom looks like.");
        addSpellPart(ModSpellParts.MOONRISE, "Moonrise", "Full Moon.");
        //addSpellPart(ModSpellParts.PROSPERITY, "Prosperity", "Gold. Loads of gold.");
        addSkill(ModSpellParts.AFFINITY_GAINS, "Affinity Gain Boost", "Let's skip to the part where I have superpowers.");
        addSkill(ModSpellParts.AUGMENTED_CASTING, "Augmented Casting", "Better Magic.");
        addSkill(ModSpellParts.EXTRA_SUMMONS, "Extra Summons", "Rise from the dead! And... one more...");
        addSkill(ModSpellParts.MAGE_POSSE_1, "Mage Band I", "Cool, a mage friend!");
        addSkill(ModSpellParts.MAGE_POSSE_2, "Mage Band II", "Let's share!");
        addSkill(ModSpellParts.MANA_REGEN_1, "Mana Regen I", "You can feel the mana flowing around you...");
        addSkill(ModSpellParts.MANA_REGEN_2, "Mana Regen II", "All this energy... why waste it?");
        addSkill(ModSpellParts.MANA_REGEN_3, "Mana Regen III", "Your control over mana has come to it's best.");
        addSkill(ModSpellParts.SHIELD_OVERLOAD, "Shield Overload", "Too much mana? Well it's always a good shield...");
        addSkill(ModSpellParts.SPELL_MOTION, "Spell Motion", "Mobile magic.");
        addSpellPart(ModSpellParts.COLOR, "Color", "Rainbow!");
        addSpellPart(ModSpellParts.AOE, "AoE", "Zone control.");
        addSpellPart(ModSpellParts.ASTRAL_DISTORTION, "Astral Distortion", "Going nowhere...");
        addSpellPart(ModSpellParts.BEAM, "Beam", "Beam me up, Scotty!");
        addSpellPart(ModSpellParts.BLIND, "Blind", "Can someone switch on the lights? No?");
        addSpellPart(ModSpellParts.BOUNCE, "Bounce", "Hey! Come back!");
        //addSpellPart(ModSpellParts.CONTINGENCY_FIRE, "Contingency: Fire", "You shall (not) burn!");
        addSpellPart(ModSpellParts.DAMAGE, "Damage", "Now it hurts...");
        addSpellPart(ModSpellParts.DROWN, "Drown", "How can you drown? There isn't any water.");
        addSpellPart(ModSpellParts.FIRE_DAMAGE, "Fire Damage", "You shall burn!");
        addSpellPart(ModSpellParts.FLING, "Fling", "Ready for an air fight?");
        addSpellPart(ModSpellParts.FORGE, "Forge", "Portable furnace!");
        addSpellPart(ModSpellParts.FREEZE, "Freeze", "Freeze!");
        addSpellPart(ModSpellParts.FROST_DAMAGE, "Frost Damage", "Cold...");
        addSpellPart(ModSpellParts.FURY, "Fury", "Berserker rage!");
        addSpellPart(ModSpellParts.GRAVITY, "Gravity", "Falling... okay...");
        addSpellPart(ModSpellParts.IGNITION, "Ignition", "Burn harder!");
        addSpellPart(ModSpellParts.KNOCKBACK, "Knockback", "Punch from a distance!");
        addSpellPart(ModSpellParts.LIGHTNING_DAMAGE, "Lightning Damage", "Zap!");
        addSpellPart(ModSpellParts.MAGIC_DAMAGE, "Magic Damage", "Hit from the void!");
        addSpellPart(ModSpellParts.PHYSICAL_DAMAGE, "Physical Damage", "Ranged sword... why not?");
        addSpellPart(ModSpellParts.PIERCING, "Piercing", "Armor here I come!");
        addSpellPart(ModSpellParts.PROJECTILE, "Projectile", "Snowball!");
        addSpellPart(ModSpellParts.SILENCE, "Silence", "No talking! (or casting in this case...)");
        addSpellPart(ModSpellParts.SOLAR, "Solar", "Sun power!");
        addSpellPart(ModSpellParts.STORM, "Thunderstorm", "It's raining...");
        addSpellPart(ModSpellParts.VELOCITY_ADDED, "Velocity Added", "Faster! FASTER!");
        addSpellPart(ModSpellParts.WATERY_GRAVE, "Watery Grave", "Bottom of the ocean.");
        addSpellPart(ModSpellParts.WAVE, "Wave", "You might not want to surf on this one...");
        addSpellPart(ModSpellParts.ABSORPTION, "Absorption", "Like a slightly flimsier shield.");
        addSpellPart(ModSpellParts.ACCELERATE, "Accelerate", "Seems like you won't be catching me anytime soon.");
        addSpellPart(ModSpellParts.APPROPRIATON, "Appropriation", "That's mine.");
        addSpellPart(ModSpellParts.CHRONO_ANCHOR, "Chrono Anchor", "Let's look at the time. Oh dear! It went backward!");
        //addSpellPart(ModSpellParts.CONTINGENCY_DAMAGE, "Contingency: Damage", "Hurting me? That would be bad...");
        //addSpellPart(ModSpellParts.CONTINGENCY_FALL, "Contingency: Fall", "Falling... Well, at least now it has a purpose.");
        //addSpellPart(ModSpellParts.CONTINGENCY_HEALTH, "Contingency: Health", "I'm not going down... not right now.");
        addSpellPart(ModSpellParts.DISPEL, "Dispel", "Cleaning up the mess.");
        addSpellPart(ModSpellParts.DURATION, "Duration", "Time manipulation tricks.");
        addSpellPart(ModSpellParts.ENTANGLE, "Entangle", "Stop right there.");
        addSpellPart(ModSpellParts.FLIGHT, "Flight", "I'd rather use a plane.");
        addSpellPart(ModSpellParts.GRAVITY_WELL, "Gravity Well", "NOT like a chicken. The opposite.");
        addSpellPart(ModSpellParts.HASTE, "Haste", "I'm out of here...");
        addSpellPart(ModSpellParts.HEAL, "Heal", "Instant healing.");
        addSpellPart(ModSpellParts.HEALING, "Healing", "Efficiency over number.");
        addSpellPart(ModSpellParts.LEAP, "Leap", "Not a frog? Who cares?");
        addSpellPart(ModSpellParts.LEVITATE, "Levitate", "Use the force.");
        addSpellPart(ModSpellParts.LIFE_DRAIN, "Life Drain", "Ahem... I'm taking all of it. Including you.");
        addSpellPart(ModSpellParts.LIFE_TAP, "Life Tap", "I'm burrowing this.");
        addSpellPart(ModSpellParts.MANA_DRAIN, "Mana Drain", "So much pools at my disposal!");
        addSpellPart(ModSpellParts.REFLECT, "Reflect", "Bounces back to you");
        addSpellPart(ModSpellParts.REGENERATION, "Regeneration", "A little bit of health");
        addSpellPart(ModSpellParts.REPEL, "Repel", "Go away from me!");
        addSpellPart(ModSpellParts.RUNE, "Rune", "Placeable magic.");
        addSpellPart(ModSpellParts.RUNE_PROCS, "Rune Procs", "I want more!");
        addSpellPart(ModSpellParts.SELF, "Self", "It's all about me.");
        addSpellPart(ModSpellParts.SHIELD, "Shield", "Don't worry about the weight, it's magic.");
        addSpellPart(ModSpellParts.SHRINK, "Shrink", "Looks like I'm smaller now...");
        addSpellPart(ModSpellParts.SLOW, "Slow", "No more running!");
        addSpellPart(ModSpellParts.SLOWFALL, "Slowfall", "Like a chicken...");
        addSpellPart(ModSpellParts.SPEED, "Speed", "Projectiles are slow, here's something that could solve that problem.");
        addSpellPart(ModSpellParts.SUMMON, "Summon", "Rise creation! Oh you look like the others...");
        addSpellPart(ModSpellParts.SWIFT_SWIM, "Swift Swim", "No more swimming for hours.");
        addSpellPart(ModSpellParts.WALL, "Wall", "You shall not pass.");
        addSpellPart(ModSpellParts.ZONE, "Zone", "No one can beat me in my sanctuary!");
        addSpellPart(ModSpellParts.ATTRACT, "Attract", "Come closer... or not, just stay where you are.");
        addSpellPart(ModSpellParts.BANISH_RAIN, "Banish Rain", "Come back latter. Or don't. It would be kind.");
        //addSpellPart(ModSpellParts.BINDING, "Binding", "Sword, axe, shovel... who needs tools?");
        addSpellPart(ModSpellParts.BLINK, "Blink", "Well, I'm out.");
        addSpellPart(ModSpellParts.CHAIN, "Chain", "Looks like you brought friends. Well I don't mind, you're all gonna die.");
        addSpellPart(ModSpellParts.CHANNEL, "Channel", "You might want to concentrate.");
        addSpellPart(ModSpellParts.CHARM, "Charm", "Friends! Lots of friends! And they blew up...");
        //addSpellPart(ModSpellParts.CONTINGENCY_DEATH, "Contingency: Death", "You're coming with me.");
        addSpellPart(ModSpellParts.CREATE_WATER, "Create Water", "Yop, totally intended turning my snow into water...");
        addSpellPart(ModSpellParts.DIG, "Dig", "Diggy Diggy Hole");
        addSpellPart(ModSpellParts.DISARM, "Disarm", "Woops, you dropped something?");
        addSpellPart(ModSpellParts.DIVINE_INTERVENTION, "Divine Intervention", "Help from across the cosmos.");
        addSpellPart(ModSpellParts.DROUGHT, "Drought", "Sand. Who doesn't know that?");
        addSpellPart(ModSpellParts.ENDER_INTERVENTION, "Ender Intervention", "Well, I didn't know what hell looked like...");
        addSpellPart(ModSpellParts.GROW, "Grow", "I won't sit all day.");
        addSpellPart(ModSpellParts.HARVEST_PLANTS, "Harvest", "Let's just say you're all grown.");
        addSpellPart(ModSpellParts.INVISIBILITY, "Invisibility", "Wanna play Hide & Seek?");
        addSpellPart(ModSpellParts.LIGHT, "Light", "The end of a tunnel.");
        addSpellPart(ModSpellParts.LUNAR, "Lunar", "I'm gonna be a werewolf!");
        addSpellPart(ModSpellParts.MARK, "Mark", "Home sweet home.");
        addSpellPart(ModSpellParts.MINING_POWER, "Mining Power", "Who needs diamond?");
        addSpellPart(ModSpellParts.NIGHT_VISION, "Night Vision", "Oh? There was a tunnel?");
        addSpellPart(ModSpellParts.PLACE_BLOCK, "Place Block", "Don't mind me, I'm just sending an Anvil.");
        addSpellPart(ModSpellParts.PLANT, "Plant", "Why bother using hand when magic can do the same?");
        addSpellPart(ModSpellParts.PLOW, "Plow", "Hoes are useless. Everyone knows that.");
        addSpellPart(ModSpellParts.RADIUS, "Radius", "I missed? Oh wait, this thing expands across a mile...");
        addSpellPart(ModSpellParts.RANDOM_TELEPORT, "Random Teleport", "I wanna go... there! Woops, wrong spot.");
        addSpellPart(ModSpellParts.RANGE, "Range", "Think you're far enough? No, you're not.");
        addSpellPart(ModSpellParts.RECALL, "Recall", "Can someone remind me who marked the trash?");
        addSpellPart(ModSpellParts.RIFT, "Rift Storage", "One day I'll walk through it, for now, it'll just store items.");
        addSpellPart(ModSpellParts.SILK_TOUCH, "Silk Touch", "Feels soft...");
        addSpellPart(ModSpellParts.TARGET_NON_SOLID_BLOCKS, "Target Non-Solid Blocks", "And I decided that I would fight the water.");
        addSpellPart(ModSpellParts.TELEKINESIS, "Telekinesis", "Up, down, up, down, I think you get and idea.");
        addSpellPart(ModSpellParts.TOUCH, "Touch", "Someone in there?");
        addSpellPart(ModSpellParts.TRANSPLACE, "Transplace", "From point A to point B.");
        addSpellPart(ModSpellParts.TRUE_SIGHT, "True Sight", "Reveal what is hidden.");
        addSpellPart(ModSpellParts.WATER_BREATHING, "Water Breathing", "Creating air directly inside my lungs? Cool!");
        addSpellPart(ModSpellParts.WIZARDS_AUTUMN, "Wizard's Autumn", "Leaves fall in autumn. But it's kind of a slow process...");
        addSkillPoint(ModSpellParts.SKILL_POINT_1, "Blue");
        addSkillPoint(ModSpellParts.SKILL_POINT_2, "Red");
        addSkillPoint(ModSpellParts.SKILL_POINT_3, "Green");
        add("itemGroup." + ArsMagicaLegacy.MODID, "Ars Magica: Legacy");
        add(ArsMagicaLegacy.MODID + ".altar.lowpower", "The altar power level is too low!");
        add(ArsMagicaLegacy.MODID + ".chat.appropriationError", "Couldn't appropriate this");
        add(ArsMagicaLegacy.MODID + ".chat.markSet", "Mark set");
        add(ArsMagicaLegacy.MODID + ".chat.markClear", "Mark cleared");
        add(ArsMagicaLegacy.MODID + ".chat.missingReagents", "Reagents missing");
        add(ArsMagicaLegacy.MODID + ".chat.noBlink", "Couldn't blink");
        add(ArsMagicaLegacy.MODID + ".chat.noIntervention", "Couldn't intervent");
        add(ArsMagicaLegacy.MODID + ".chat.noInterventionDistortion", "You are too distorted to intervent");
        add(ArsMagicaLegacy.MODID + ".chat.noInterventionNether", "The nether doesn't allow interventions");
        add(ArsMagicaLegacy.MODID + ".chat.noRecall", "Couldn't recall you from here");
        add(ArsMagicaLegacy.MODID + ".chat.noTeleport", "Couldn't teleport");
        add(ArsMagicaLegacy.MODID + ".chat.noTeleportDistortion", "You are too distorted to teleport");
        add(ArsMagicaLegacy.MODID + ".chat.noSummons", "Can't summon anything else right now");
        add(ArsMagicaLegacy.MODID + ".chat.placeBlockSpell", "Placed block");
        add(ArsMagicaLegacy.MODID + ".command.forget", "Forgot skill %s");
        add(ArsMagicaLegacy.MODID + ".command.forgetall", "Forgot all skills");
        add(ArsMagicaLegacy.MODID + ".command.learned", "Learned skill %s");
        add(ArsMagicaLegacy.MODID + ".command.skillnotfound", "Couldn't find skill: %s");
        add(ArsMagicaLegacy.MODID + ".gui.xp", "XP: ");
        add(ArsMagicaLegacy.MODID + ".inscriptiontable.bookOut", "Take the book out");
        add(ArsMagicaLegacy.MODID + ".inscriptiontable.search", "Search");
        add(ArsMagicaLegacy.MODID + ".inscriptiontable.makeSpell", "Make Spell");
        add(ArsMagicaLegacy.MODID + ".inscriptiontable.name", "Name");
        add(ArsMagicaLegacy.MODID + ".inscriptiontable.resetSpell", "Reset Spell");
        add(ArsMagicaLegacy.MODID + ".occulus.disabled", "Disabled");
        add(ArsMagicaLegacy.MODID + ".occulus.displayname", "Occulus");
        add(ArsMagicaLegacy.MODID + ".occulus.missingrequirements", "Missing requirements!");
        add(ArsMagicaLegacy.MODID + ".occulus.prevent", "Mythical forces prevent you from using this device!");
        add(ArsMagicaLegacy.MODID + ".spell.manacost", "Mana Cost: %d");
        add(ArsMagicaLegacy.MODID + ".spell.unfinishedSpellRecipe", "Unfinished Spell Recipe");
        add(ArsMagicaLegacy.MODID + ".spell.validate.invalid", "Invalid Spell");
        add(ArsMagicaLegacy.MODID + ".spell.validate.principum", "Principum Spell");
        add(ArsMagicaLegacy.MODID + ".spell.validate.terminus", "Terminus Spell");

        add(ArsMagicaLegacy.MODID + ".arcane_compendium.name", "Arcane Compendium");
        add(ArsMagicaLegacy.MODID + ".arcane_compendium.landing_text", "Hello World");

        addCategoryTranslation("guide", "Guides", "");

        addCategoryTranslation("mechanic", "Mechanics", "");
        addCategoryTranslation("mechanic.affinity", "Affinities", "");
        addCategoryTranslation("mechanic.enchants", "Enchantments", "");
        addCategoryTranslation("mechanic.infusions", "Infusions", "");

        addCategoryTranslation("item", "Items", "");
        addCategoryTranslation("item.ore", "Ars Magica Ores", "");
        addCategoryTranslation("item.essence", "Essence", "");
        addCategoryTranslation("item.rune", "Runes", "");
        addCategoryTranslation("item.armor", "Ars Magica Armor", "");
        addCategoryTranslation("item.armor.mage", "Mage Armor", "");
        addCategoryTranslation("item.armor.battlemage", "Battlemage Armor", "");
        addCategoryTranslation("item.affinity_tomes", "Affinity Tomes", "");
        addCategoryTranslation("item.foci", "Foci", "");
        addCategoryTranslation("item.mana_potion", "Mana Potions", "");
        addCategoryTranslation("item.binding_catalyst", "Binding Catalysts", "");
        addCategoryTranslation("item.flickerfocus", "Flicker Focus", "");
        addCategoryTranslation("item.inscription_upgrades", "Inscription Table Upgrades", "");

        addCategoryTranslation("block", "Blocks", "");
        addCategoryTranslation("block.illusion_blocks", "Illusion Blocks", "");
        addCategoryTranslation("block.crystalmarker", "Crystal Marker", "");
        addCategoryTranslation("block.inlays", "Inlays", "");

        addCategoryTranslation("shape", "Shapes", "");
        addCategoryTranslation("component", "Components", "");
        addCategoryTranslation("modifier", "Modifiers", "");
        addCategoryTranslation("talent", "Talents", "");

        addCategoryTranslation("mob", "Mobs", "");
        addCategoryTranslation("mob.flicker", "Flickers", "");

        addCategoryTranslation("structure", "Structures", "");
        addCategoryTranslation("boss", "Bosses", "");
    }

    @Override
    public void add(String key, String value) {
        super.add(key, value);
    }
}
