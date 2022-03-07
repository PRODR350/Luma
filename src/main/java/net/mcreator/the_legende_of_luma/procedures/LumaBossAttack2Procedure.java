package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.EvokerFangs;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class LumaBossAttack2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 0);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 5);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 10);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 15);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 25);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 30);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 35);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 40);
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 0), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 0), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 0), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 1), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 1), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 1), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 2), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 2), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 3), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 3), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 3), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 4), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 4), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 4), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 5), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 5), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 5), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 6), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 6), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 6), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 7), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 7), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 7), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 8), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 8), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 8), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 9), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 9), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 9), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 10), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 45);
	}
}
