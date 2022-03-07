
package net.mcreator.the_legende_of_luma.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.procedures.LumanitGuardianItIsStruckByLightningProcedure;
import net.mcreator.the_legende_of_luma.procedures.LumanitGuardianEntityDiesProcedure;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModEntities;

import java.util.Set;

@Mod.EventBusSubscriber
public class LumaGuardinEntity extends Monster implements RangedAttackMob {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("the_legende_of_luma:luma"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MONSTER)
					.add(new MobSpawnSettings.SpawnerData(TheLegendeOfLumaModEntities.LUMA_GUARDIN, 7, 2, 4));
	}

	public LumaGuardinEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		this(TheLegendeOfLumaModEntities.LUMA_GUARDIN, world);
	}

	public LumaGuardinEntity(EntityType<LumaGuardinEntity> type, Level world) {
		super(type, world);
		xpReward = 7;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(TheLegendeOfLumaModItems.LUMA_SPECTRE));
		this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM));
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
		this.goalSelector.addGoal(7, new MeleeAttackGoal(this, 1.2, false));
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(9, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, LumaChickenEntity.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, AmbientCreature.class, false, false));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(TheLegendeOfLumaModItems.LUMANIT_CRISTAL));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.power_select"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.nether_bricks.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.nether_bricks.hit"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.deactivate"));
	}

	@Override
	public void thunderHit(ServerLevel serverWorld, LightningBolt lightningBolt) {
		super.thunderHit(serverWorld, lightningBolt);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		LumanitGuardianItIsStruckByLightningProcedure.execute(entity);
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosion())
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity sourceentity = source.getEntity();
		Entity entity = this;
		Level world = this.level;

		LumanitGuardianEntityDiesProcedure.execute(world, x, y, z);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		LumaSpectreEntity.shoot(this, target);
	}

	public static void init() {
		SpawnPlacements.register(TheLegendeOfLumaModEntities.LUMA_GUARDIN, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		return builder;
	}
}
