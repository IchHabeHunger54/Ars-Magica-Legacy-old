package minecraftschurli.arsmagicalegacy.init;

import minecraftschurli.arsmagicalegacy.objects.block.inscriptiontable.InscriptionTableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

/**
 * @author Minecraftschurli
 * @version 2019-12-02
 */
public class ModTileEntities implements IInit {
    public static final RegistryObject<TileEntityType<InscriptionTableTileEntity>> INSCRIPTION_TABLE = TILE_ENTITIES.register("inscription_table", () -> TileEntityType.Builder.create(InscriptionTableTileEntity::new, ModBlocks.INSCRIPTION_TABLE.get()).build(null));

    public static void register() {
    }
}
