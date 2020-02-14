package minecraftschurli.arsmagicalegacy.api.network;

import minecraftschurli.arsmagicalegacy.api.*;
import minecraftschurli.arsmagicalegacy.api.capability.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.network.*;

import java.util.function.*;

/**
 * @author Minecraftschurli
 * @version 2019-11-14
 */
public class SyncBurnoutPacket implements IPacket {
    private float burnout;
    private float maxBurnout;

    public SyncBurnoutPacket(PacketBuffer buf) {
        this.maxBurnout = buf.readFloat();
        this.burnout = buf.readFloat();
    }

    public SyncBurnoutPacket(float burnout, float maxBurnout) {
        this.maxBurnout = maxBurnout;
        this.burnout = burnout;
    }

    @Override
    public void toBytes(PacketBuffer buf) {
        buf.writeFloat(this.maxBurnout);
        buf.writeFloat(this.burnout);
    }

    @Override
    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ArsMagicaAPI.getLocalPlayer().getCapability(CapabilityHelper.getBurnoutCapability()).ifPresent(iBurnoutStorage -> {
            iBurnoutStorage.setMaxBurnout(this.maxBurnout);
            iBurnoutStorage.setBurnout(this.burnout);
        });
        ctx.get().setPacketHandled(true);
    }
}
