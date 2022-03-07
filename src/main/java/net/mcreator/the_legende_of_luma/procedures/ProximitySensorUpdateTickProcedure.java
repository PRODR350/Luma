package net.mcreator.the_legende_of_luma.procedures;

import org.jline.terminal.Size;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ProximitySensorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double Size = 0;
		boolean found = false;
		boolean Damage = false;
		Damage = true;
		Size = 10;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(Size / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					for (int index0 = 0; index0 < (int) (1); index0++) {
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos((int) x, (int) y, (int) z), ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")), SoundSource.BLOCKS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")),
												SoundSource.BLOCKS, 1, 1, false);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 20);
					}
				}
				if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
					for (int index1 = 0; index1 < (int) (1); index1++) {
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos((int) x, (int) y, (int) z), ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")), SoundSource.BLOCKS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")),
												SoundSource.BLOCKS, 1, 1, false);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 20);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, (entityiterator.getX()), (entityiterator.getY() + 1),
								(entityiterator.getZ()), 1, 0.5, 0, 0.5, 0.1);
					if (Damage == true) {
						entityiterator.hurt(DamageSource.GENERIC, 1);
					}
				}
				if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ARTHROPOD : false) {
					for (int index2 = 0; index2 < (int) (1); index2++) {
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos((int) x, (int) y, (int) z), ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")), SoundSource.BLOCKS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")),
												SoundSource.BLOCKS, 1, 1, false);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 20);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, (entityiterator.getX()), (entityiterator.getY() + 1),
								(entityiterator.getZ()), 1, 0.5, 0, 0.5, 0.1);
					if (Damage == true) {
						entityiterator.hurt(DamageSource.GENERIC, 1);
					}
				}
				if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ILLAGER : false) {
					for (int index3 = 0; index3 < (int) (1); index3++) {
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos((int) x, (int) y, (int) z), ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")), SoundSource.BLOCKS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("the_legende_of_luma:luma_sensor_activat")),
												SoundSource.BLOCKS, 1, 1, false);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 20);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, (entityiterator.getX()), (entityiterator.getY() + 1),
								(entityiterator.getZ()), 1, 0.5, 0, 0.5, 0.1);
					if (Damage == true) {
						entityiterator.hurt(DamageSource.GENERIC, 1);
					}
				}
			}
		}
	}
}
