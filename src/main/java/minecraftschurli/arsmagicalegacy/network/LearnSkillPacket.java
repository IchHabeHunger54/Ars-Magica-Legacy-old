package minecraftschurli.arsmagicalegacy.network;

import minecraftschurli.arsmagicalegacy.util.MagicHelper;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

/**
 * @author Minecraftschurli
 * @version 2019-12-02
 */
public class LearnSkillPacket implements IPacket{
    private final String skillId;

    public LearnSkillPacket(String id) {
        this.skillId = id;
    }

    public LearnSkillPacket(PacketBuffer buf) {
        this.skillId = buf.readString(32767);
    }

    @Override
    public void toBytes(PacketBuffer buf) {
        buf.writeString(skillId);
    }

    @Override
    public void handle(Supplier<NetworkEvent.Context> ctx) {
        MagicHelper.learnSkill(ctx.get().getSender(), this.skillId);
        ctx.get().setPacketHandled(true);
    }
}
