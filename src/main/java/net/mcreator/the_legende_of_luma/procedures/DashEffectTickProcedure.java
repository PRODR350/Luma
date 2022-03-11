package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.Direction;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class DashEffectTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDirection()) == Direction.NORTH) {
			entity.setDeltaMovement(0, 0.01, (-1.5));
		}
		if ((entity.getDirection()) == Direction.SOUTH) {
			entity.setDeltaMovement(0, 0.01, 1.5);
		}
		if ((entity.getDirection()) == Direction.WEST) {
			entity.setDeltaMovement((-1.5), 0.01, 0);
		}
		if ((entity.getDirection()) == Direction.EAST) {
			entity.setDeltaMovement(1.5, 0.01, 0);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 255, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10, 255, (false), (false)));
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
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
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
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
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
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
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
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
															new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
													"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
															new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
													"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
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
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																	new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
															"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																	new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
															"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
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
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
																			4, "", new TextComponent(""), _level.getServer(), null)
																					.withSuppressedOutput(),
																	"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
																			4, "", new TextComponent(""), _level.getServer(), null)
																					.withSuppressedOutput(),
																	"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
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
																if (world instanceof ServerLevel _level)
																	_level.getServer().getCommands().performCommand(
																			new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
																					_level, 4, "", new TextComponent(""), _level.getServer(), null)
																							.withSuppressedOutput(),
																			"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
																if (world instanceof ServerLevel _level)
																	_level.getServer().getCommands().performCommand(
																			new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
																					_level, 4, "", new TextComponent(""), _level.getServer(), null)
																							.withSuppressedOutput(),
																			"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
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
																		if (world instanceof ServerLevel _level)
																			_level.getServer().getCommands().performCommand(
																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z),
																							Vec2.ZERO, _level, 4, "", new TextComponent(""),
																							_level.getServer(), null).withSuppressedOutput(),
																					"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
																		if (world instanceof ServerLevel _level)
																			_level.getServer().getCommands().performCommand(
																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z),
																							Vec2.ZERO, _level, 4, "", new TextComponent(""),
																							_level.getServer(), null).withSuppressedOutput(),
																					"summon firework_rocket ~ ~ ~ {Fire:25,HasVisualFire:1b,Life:25,LifeTime:25,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Trail:1b,Colors:[I;16777215,0,15073024,54783],FadeColors:[I;0,16777215,6816767,16724736]}]}}}}");
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 1);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 1);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 1);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 1);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 1);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 1);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 1);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 0);
	}
}
