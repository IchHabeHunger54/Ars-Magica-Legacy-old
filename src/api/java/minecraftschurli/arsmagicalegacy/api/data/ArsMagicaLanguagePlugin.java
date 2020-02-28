package minecraftschurli.arsmagicalegacy.api.data;


import minecraftschurli.arsmagicalegacy.api.SpellRegistry;
import minecraftschurli.arsmagicalegacy.api.affinity.Affinity;
import minecraftschurli.arsmagicalegacy.api.skill.Skill;
import minecraftschurli.arsmagicalegacy.api.skill.SkillPoint;
import minecraftschurli.arsmagicalegacy.api.spell.AbstractSpellPart;

import java.util.function.Supplier;

/**
 * @author Minecraftschurli
 * @version 2020-01-15
 */
public interface ArsMagicaLanguagePlugin {
    /**
     * Creates a new language provider, based on the vanilla language provider.
     * @param part        the data generator
     * @param name        the mod id to use (e. g. ArsMagicaLegacy)
     * @param description the file name
     */
    default void addSpellPart(Supplier<? extends AbstractSpellPart> part, String name, String description) {
        add(part.get(), name, description);
    }

    /**
     * Adds a spell part translation
     * @param part        the spell part supplier to add the translation for
     * @param name        the name for the spell part
     * @param description the description for the spell part
     */
    default void add(AbstractSpellPart part, String name, String description) {
        add(SpellRegistry.getSkillFromPart(part), name, description);
    }

    /**
     * Adds a skill translation
     * @param skill       the skill supplier to add the translation for
     * @param name        the name for the skill
     * @param description the description for the skill
     */
    default void addSkill(Supplier<? extends Skill> skill, String name, String description) {
        add(skill.get(), name, description);
    }

    /**
     * Adds a skill translation
     * @param skill       the skill to add the translation for
     * @param name        the name for the skill
     * @param description the description for the skill
     */
    default void add(Skill skill, String name, String description) {
        addWithDescription(skill.getTranslationKey(), name, description);
    }

    /**
     * Adds a skill point translation
     * @param point the skill point supplier to add the translation for
     * @param name  the name for the skill point
     */
    default void addSkillPoint(Supplier<SkillPoint> point, String name) {
        add(point.get(), name);
    }

    /**
     * Adds a skill point translation
     * @param point the skill point to add the translation for
     * @param name  the name for the skill point
     */
    default void add(SkillPoint point, String name) {
        add(point.getTranslationKey(), name);
    }

    /**
     * Adds an affinities point translation
     * @param affinity the skill point supplier to add the translation for
     * @param name     the name for the skill point
     */
    default void addAffinity(Supplier<SkillPoint> affinity, String name) {
        add(affinity.get(), name);
    }

    /**
     * Adds an affinities point translation
     * @param affinity the skill point to add the translation for
     * @param name     the name for the skill point
     */
    default void add(Affinity affinity, String name) {
        add(affinity.getTranslationKey(), name);
    }

    /**
     * Adds the translation for the given category key
     * @param key         the key of the category
     * @param name        the translated name
     * @param description the translated description
     */
    default void addCategory(String key, String name, String description){
        addWithDescription("compendium.categories."+key, name, description);
    }

    /**
     * Adds the translation for anything that has a name and a description
     * @param key         the base translation key
     * @param name        the translated name
     * @param description the translated description
     */
    default void addWithDescription(String key, String name, String description) {
        add(key+".name", name);
        add(key+".description", description);
    }

    /**
     * Adds the translation for a text page
     * @param category    the page's category
     * @param entry       the page's entry
     * @param number      the page number
     * @param translation the translated text
     */
    default void addTextPage(String category, String entry, int number, String translation) {
        add("compendium.entries." + category + "." + entry + ".page." + number, translation);
    }

    /**
     * Adds the translation for a section's title
     * @param category    the section's category
     * @param entry       the section's actual name
     * @param translation the translated text
     */
    default void addSectionTitle(String category, String entry, String translation) {
        add("compendium.entries." + category + "." + entry + ".name", translation);
    }

    void add(String key, String value);
}
