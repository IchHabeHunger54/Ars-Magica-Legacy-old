package minecraftschurli.arsmagicalegacy.objects.block.occulus;

import minecraftschurli.arsmagicalegacy.api.ArsMagicaAPI;
import minecraftschurli.arsmagicalegacy.api.skill.SkillTree;
import minecraftschurli.arsmagicalegacy.util.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;

public class SkillTreeGuiButton extends Button {

    public final int id;
    public final int page;
    SkillTree tree;
    boolean inverted;

    public SkillTreeGuiButton(int tabId, int x, int y, SkillTree tree, int page, boolean inverted, IPressable handler) {
        super(x, y, 22, 22, "", handler);
        this.tree = tree;
        this.inverted = inverted;
        this.page = page;
        this.id = tabId;
    }

    @Override
    public void renderButton(int mouseX, int mouseY, float partial) {
        if (visible) {
            Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation(ArsMagicaAPI.MODID, "textures/gui/occulus/overlay.png"));
            float f = 0.00390625F;
            if (inverted)
                RenderUtils.drawBox(x, y, 22, 22, getBlitOffset(), 22 * f, 210 * f + 22 * f, 0, 210 * f);
            else
                RenderUtils.drawBox(x, y, 22, 22, getBlitOffset(), 0, 210 * f, 22 * f, 210 * f + 22 * f);
            //blit(x, y, 0, 210, 22, 22);
            Minecraft.getInstance().getTextureManager().bindTexture(tree.getIcon());
            RenderUtils.drawBox(x + 2F, y + 2F, 18, 18, getBlitOffset(), 0, 0, 1, 1);
        }
    }

    public SkillTree getTree() {
        return tree;
    }
}
