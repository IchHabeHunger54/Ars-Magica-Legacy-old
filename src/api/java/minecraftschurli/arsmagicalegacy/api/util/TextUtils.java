package minecraftschurli.arsmagicalegacy.api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * @author Minecraftschurli
 * @version 2020-03-21
 */
public class TextUtils {
    public static final String NEWPAGE = "<newpage>";

    public static List<ITextComponent> getLocalized(String key, Object... args) {
        return breakUp(new TranslationTextComponent(key, args));
    }

    public static List<ITextComponent> breakUp(ITextComponent component) {
        return Arrays.stream(component.getFormattedText().split("\n"))
                .map(StringTextComponent::new)
                .collect(Collectors.toList());
    }

    public static void writePartToNBT(CompoundNBT compound, List<StringNBT> storyData) {
        ListNBT pages = new ListNBT();
        for (StringNBT page : storyData) {
            StringNBT newPage = StringNBT.valueOf("{\"text\":\"" + page.getString() + "\"}");
            pages.add(newPage);
        }
        compound.put("pages", pages);
    }

    public static ItemStack finalizeStory(ItemStack stack, ITextComponent title, String author) {
        if (stack.getTag() == null) return stack;
        stack.getTag().put("title", StringNBT.valueOf(title.getUnformattedComponentText()));
        stack.setDisplayName(title);
        stack.getTag().put("author", StringNBT.valueOf(author));
        return stack;
    }

    public static List<StringNBT> splitStoryPartIntoPages(String storyPart) {
        ArrayList<StringNBT> parts = new ArrayList<>();
        String[] words = storyPart.split(" ");
        String currentPage = "";
        for (String word : words) {
            if (word.contains(NEWPAGE)) {
                int idx = word.indexOf(NEWPAGE);
                String preNewPage = word.substring(0, idx);
                String postNewPage = word.substring(idx + NEWPAGE.length());
                while (preNewPage.endsWith("\n")) preNewPage = preNewPage.substring(0, preNewPage.lastIndexOf('\n'));
                if (getStringOverallLength(currentPage + preNewPage) > 256) {
                    parts.add(StringNBT.valueOf(currentPage));
                    currentPage = preNewPage.trim();
                } else currentPage += " " + preNewPage.trim();
                parts.add(StringNBT.valueOf(currentPage));
                while (postNewPage.startsWith("\n")) postNewPage = postNewPage.replaceFirst("\n", "");
                currentPage = postNewPage.trim();
                continue;
            }
            if (getStringOverallLength(currentPage + word) > 256) {
                parts.add(StringNBT.valueOf(currentPage));
                currentPage = word;
                if (getStringOverallLength(currentPage) > 256) {
                    int length = 0;
                    int index = 0;
                    for (int i = 0; i < currentPage.length(); i++) {
                        char c = currentPage.charAt(i);
                        if (c == '\n') length += length % 19;
                        else length++;
                        index++;
                    }
                    if(length <= 255) index--;
                    currentPage = currentPage.substring(0, index);
                    parts.add(StringNBT.valueOf(currentPage));
                    currentPage = "";
                }
                continue;
            }
            if (currentPage.equals("")) currentPage = word.trim();
            else currentPage += " " + word;
        }
        parts.add(StringNBT.valueOf(currentPage));
        return parts;
    }

    private static int getStringOverallLength(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\n') length += length % 19;
            else length++;
        }
        return length;
    }
}