package minecraftschurli.arsmagicalegacy.objects.entity;

import minecraftschurli.arsmagicalegacy.init.ModEntities;
import minecraftschurli.arsmagicalegacy.util.SpellUtils;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonPartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FireRainEntity extends Entity {
    private int ticksToExist = 100;
    private ItemStack spell;
    private PlayerEntity caster;
    private static final DataParameter<ItemStack> STACK_DATA = EntityDataManager.createKey(FireRainEntity.class, DataSerializers.ITEMSTACK);
    private static final DataParameter<Float> RADIUS_DATA = EntityDataManager.createKey(FireRainEntity.class, DataSerializers.FLOAT);
    private static final DataParameter<Float> DAMAGE_DATA = EntityDataManager.createKey(FireRainEntity.class, DataSerializers.FLOAT);

    public FireRainEntity(World world) {
        this(ModEntities.FIRE_RAIN.get(), world);
    }

    public FireRainEntity(EntityType<?> type, World world) {
        super(type, world);
        setBoundingBox(new AxisAlignedBB(getPosX() - 0.25, getPosY() - 0.25, getPosZ() - 0.25, getPosX() + 0.25, getPosY() + 0.25, getPosZ() + 0.25));
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return null;
    }

    @Override
    protected void readAdditional(CompoundNBT compound) {
    }

    @Override
    protected void registerData() {
        dataManager.register(DAMAGE_DATA, 1f);
        dataManager.register(RADIUS_DATA, 3f);
        dataManager.register(STACK_DATA, new ItemStack(Items.GOLDEN_APPLE));
    }

    @Override
    public void tick(){
        if (caster != null)
            caster.tick();
        float radius = dataManager.get(RADIUS_DATA);
        if (world.isRemote) {
//            if (stack == null) stack = dataManager.get(STACK_DATA);
//            stack = stack.copy();
//            int color = 0xFFFFFF;
//            if (SpellUtils.hasModifier(SpellModifiers.COLOR, stack)){
//                List<SpellModifier> mods = SpellUtils.getModifiers(stack, -1);
//                for (SpellModifier mod : mods) if (mod instanceof Color) color = (int)mod.getModifier(SpellModifiers.COLOR, null, null, null, stack.getTag());
//            }
//            for (int i = 0; i < 10; ++i){
//                double x = getPosX() - radius + (rand.nextDouble() * radius * 2);
//                double z = getPosZ() - radius + (rand.nextDouble() * radius * 2);
//                double y = getPosY() + 10;
//                AMParticle particle = (AMParticle)ArsMagica2.proxy.particleManager.spawn(world, "explosion_2", x, y, z);
//                if (particle != null){
//                    particle.setMaxAge(20);
//                    particle.addVelocity(rand.nextDouble() * 0.2f, 0, rand.nextDouble() * 0.2f);
//                    particle.setAffectedByGravity();
//                    particle.setDontRequireControllers();
//                    particle.setRGBColorI(color);
//                }
//            }
            //TODO: SoundHelper.instance.loopSound(world, (float)getPosX(), (float)getPosY(), (float)getPosZ(), "arsmagica2:spell.loop.fire", 1.0f);
        } else {
            for (Entity e : world.getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(getPosX() - radius, getPosY() - 1, getPosZ() - radius, getPosX() + radius, getPosY() + 3, getPosZ() + radius))){
                if (e != caster){
                    if (e instanceof EnderDragonPartEntity && ((EnderDragonPartEntity) e).dragon != null)
                        e = ((EnderDragonPartEntity)e).dragon;
                    if (SpellUtils.attackWithType(null, e, DamageSource.ON_FIRE, 0.75f * dataManager.get(DAMAGE_DATA)) && !(e instanceof PlayerEntity))
                        e.hurtResistantTime = 10;
                }
            }
            if (rand.nextInt(10) < 2){
                BlockPos pos = new BlockPos(getPosX() - radius + rand.nextInt((int)Math.ceil(radius) * 2), getPosY(), getPosZ() - radius + rand.nextInt((int)Math.ceil(radius) * 2));
                if (world.isAirBlock(pos))
                    world.setBlockState(pos, Blocks.FIRE.getDefaultState());
            }
        }
        if (!world.isRemote && ticksExisted >= ticksToExist) remove();
    }

    @Override
    protected void writeAdditional(CompoundNBT compound) {
    }

    public void setCasterAndStack(LivingEntity entity, ItemStack stack) {
        if (entity instanceof PlayerEntity) caster = (PlayerEntity) entity;
        spell = stack;
        if (stack != null)
            dataManager.set(STACK_DATA, stack);
    }

    public void setDamage(float damage){
        dataManager.set(DAMAGE_DATA, damage);
    }

    public void setRadius(float radius){
        dataManager.set(RADIUS_DATA, radius);
    }

    public void setTicksToExist(int ticks){
        ticksToExist = ticks;
    }
}