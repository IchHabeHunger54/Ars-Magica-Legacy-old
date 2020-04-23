package minecraftschurli.arsmagicalegacy.objects.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TorchBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Torch extends TorchBlock {
    public Torch(Block.Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
        double d0 = (double) pos.getX() + 0.5;
        double d1 = (double) pos.getY() + 0.7;
        double d2 = (double) pos.getZ() + 0.5;
        worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0, 0, 0);
    }
}
