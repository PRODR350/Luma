package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

import java.util.Map;

public class TeyProcedure {
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
				if (world.isEmptyBlock(new BlockPos((int) (x + 10), (int) y, (int) (z + 0))) == true) {
					{
						BlockPos _bp = new BlockPos((int) (x + 10), (int) y, (int) (z + 0));
						BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
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
						if (world.isEmptyBlock(new BlockPos((int) (x + 10), (int) y, (int) (z + 1))) == true) {
							{
								BlockPos _bp = new BlockPos((int) (x + 10), (int) y, (int) (z + 1));
								BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
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
								if (world.isEmptyBlock(new BlockPos((int) (x + 10), (int) y, (int) (z + 2))) == true) {
									{
										BlockPos _bp = new BlockPos((int) (x + 10), (int) y, (int) (z + 2));
										BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK.defaultBlockState();
										BlockState _bso = world.getBlockState(_bp);
										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
											Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
											if (_property != null && _bs.getValue(_property) != null)
												try {
													_bs = _bs.setValue(_property, (Comparable) entry.getValue());
												} catch (Exception e) {
												}
										}
										world.setBlock(_bp, _bs, 3);
									}
								}
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
										if (world.isEmptyBlock(new BlockPos((int) (x + 10), (int) y, (int) (z + 3))) == true) {
											{
												BlockPos _bp = new BlockPos((int) (x + 10), (int) y, (int) (z + 3));
												BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK.defaultBlockState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
													if (_property != null && _bs.getValue(_property) != null)
														try {
															_bs = _bs.setValue(_property, (Comparable) entry.getValue());
														} catch (Exception e) {
														}
												}
												world.setBlock(_bp, _bs, 3);
											}
										}
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
												if (world.isEmptyBlock(new BlockPos((int) (x + 9), (int) y, (int) (z + 4))) == true) {
													{
														BlockPos _bp = new BlockPos((int) (x + 9), (int) y, (int) (z + 4));
														BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK.defaultBlockState();
														BlockState _bso = world.getBlockState(_bp);
														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
															Property _property = _bs.getBlock().getStateDefinition()
																	.getProperty(entry.getKey().getName());
															if (_property != null && _bs.getValue(_property) != null)
																try {
																	_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																} catch (Exception e) {
																}
														}
														world.setBlock(_bp, _bs, 3);
													}
												}
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
														if (world.isEmptyBlock(new BlockPos((int) (x + 9), (int) y, (int) (z + 5))) == true) {
															{
																BlockPos _bp = new BlockPos((int) (x + 9), (int) y, (int) (z + 5));
																BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK.defaultBlockState();
																BlockState _bso = world.getBlockState(_bp);
																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																	Property _property = _bs.getBlock().getStateDefinition()
																			.getProperty(entry.getKey().getName());
																	if (_property != null && _bs.getValue(_property) != null)
																		try {
																			_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																		} catch (Exception e) {
																		}
																}
																world.setBlock(_bp, _bs, 3);
															}
														}
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
																if (world.isEmptyBlock(new BlockPos((int) (x + 8), (int) y, (int) (z + 6))) == true) {
																	{
																		BlockPos _bp = new BlockPos((int) (x + 8), (int) y, (int) (z + 6));
																		BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK.defaultBlockState();
																		BlockState _bso = world.getBlockState(_bp);
																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																				.entrySet()) {
																			Property _property = _bs.getBlock().getStateDefinition()
																					.getProperty(entry.getKey().getName());
																			if (_property != null && _bs.getValue(_property) != null)
																				try {
																					_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																				} catch (Exception e) {
																				}
																		}
																		world.setBlock(_bp, _bs, 3);
																	}
																}
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
																		if (world.isEmptyBlock(
																				new BlockPos((int) (x + 7), (int) y, (int) (z + 7))) == true) {
																			{
																				BlockPos _bp = new BlockPos((int) (x + 7), (int) y, (int) (z + 7));
																				BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																						.defaultBlockState();
																				BlockState _bso = world.getBlockState(_bp);
																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																						.entrySet()) {
																					Property _property = _bs.getBlock().getStateDefinition()
																							.getProperty(entry.getKey().getName());
																					if (_property != null && _bs.getValue(_property) != null)
																						try {
																							_bs = _bs.setValue(_property,
																									(Comparable) entry.getValue());
																						} catch (Exception e) {
																						}
																				}
																				world.setBlock(_bp, _bs, 3);
																			}
																		}
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
																				if (world.isEmptyBlock(new BlockPos((int) (x + 6), (int) y,
																						(int) (z + 8))) == true) {
																					{
																						BlockPos _bp = new BlockPos((int) (x + 6), (int) y,
																								(int) (z + 8));
																						BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																								.defaultBlockState();
																						BlockState _bso = world.getBlockState(_bp);
																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																								.getValues().entrySet()) {
																							Property _property = _bs.getBlock().getStateDefinition()
																									.getProperty(entry.getKey().getName());
																							if (_property != null && _bs.getValue(_property) != null)
																								try {
																									_bs = _bs.setValue(_property,
																											(Comparable) entry.getValue());
																								} catch (Exception e) {
																								}
																						}
																						world.setBlock(_bp, _bs, 3);
																					}
																				}
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
																						if (world.isEmptyBlock(new BlockPos((int) (x + 5), (int) y,
																								(int) (z + 9))) == true) {
																							{
																								BlockPos _bp = new BlockPos((int) (x + 5), (int) y,
																										(int) (z + 9));
																								BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																										.defaultBlockState();
																								BlockState _bso = world.getBlockState(_bp);
																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																										.getValues().entrySet()) {
																									Property _property = _bs.getBlock()
																											.getStateDefinition()
																											.getProperty(entry.getKey().getName());
																									if (_property != null
																											&& _bs.getValue(_property) != null)
																										try {
																											_bs = _bs.setValue(_property,
																													(Comparable) entry.getValue());
																										} catch (Exception e) {
																										}
																								}
																								world.setBlock(_bp, _bs, 3);
																							}
																						}
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
																								if (world.isEmptyBlock(new BlockPos((int) (x + 4),
																										(int) y, (int) (z + 9))) == true) {
																									{
																										BlockPos _bp = new BlockPos((int) (x + 4),
																												(int) y, (int) (z + 9));
																										BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																												.defaultBlockState();
																										BlockState _bso = world.getBlockState(_bp);
																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																												.getValues().entrySet()) {
																											Property _property = _bs.getBlock()
																													.getStateDefinition().getProperty(
																															entry.getKey().getName());
																											if (_property != null && _bs
																													.getValue(_property) != null)
																												try {
																													_bs = _bs.setValue(_property,
																															(Comparable) entry
																																	.getValue());
																												} catch (Exception e) {
																												}
																										}
																										world.setBlock(_bp, _bs, 3);
																									}
																								}
																								new Object() {
																									private int ticks = 0;
																									private float waitTicks;
																									private LevelAccessor world;

																									public void start(LevelAccessor world,
																											int waitTicks) {
																										this.waitTicks = waitTicks;
																										MinecraftForge.EVENT_BUS.register(this);
																										this.world = world;
																									}

																									@SubscribeEvent
																									public void tick(
																											TickEvent.ServerTickEvent event) {
																										if (event.phase == TickEvent.Phase.END) {
																											this.ticks += 1;
																											if (this.ticks >= this.waitTicks)
																												run();
																										}
																									}

																									private void run() {
																										if (world.isEmptyBlock(
																												new BlockPos((int) (x + 3), (int) y,
																														(int) (z + 10))) == true) {
																											{
																												BlockPos _bp = new BlockPos(
																														(int) (x + 3), (int) y,
																														(int) (z + 10));
																												BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																														.defaultBlockState();
																												BlockState _bso = world
																														.getBlockState(_bp);
																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																														.getValues().entrySet()) {
																													Property _property = _bs
																															.getBlock()
																															.getStateDefinition()
																															.getProperty(entry
																																	.getKey()
																																	.getName());
																													if (_property != null
																															&& _bs.getValue(
																																	_property) != null)
																														try {
																															_bs = _bs.setValue(
																																	_property,
																																	(Comparable) entry
																																			.getValue());
																														} catch (Exception e) {
																														}
																												}
																												world.setBlock(_bp, _bs, 3);
																											}
																										}
																										new Object() {
																											private int ticks = 0;
																											private float waitTicks;
																											private LevelAccessor world;

																											public void start(LevelAccessor world,
																													int waitTicks) {
																												this.waitTicks = waitTicks;
																												MinecraftForge.EVENT_BUS
																														.register(this);
																												this.world = world;
																											}

																											@SubscribeEvent
																											public void tick(
																													TickEvent.ServerTickEvent event) {
																												if (event.phase == TickEvent.Phase.END) {
																													this.ticks += 1;
																													if (this.ticks >= this.waitTicks)
																														run();
																												}
																											}

																											private void run() {
																												if (world.isEmptyBlock(new BlockPos(
																														(int) (x + 2), (int) y,
																														(int) (z + 10))) == true) {
																													{
																														BlockPos _bp = new BlockPos(
																																(int) (x + 2),
																																(int) y,
																																(int) (z + 10));
																														BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																.defaultBlockState();
																														BlockState _bso = world
																																.getBlockState(_bp);
																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																.getValues()
																																.entrySet()) {
																															Property _property = _bs
																																	.getBlock()
																																	.getStateDefinition()
																																	.getProperty(entry
																																			.getKey()
																																			.getName());
																															if (_property != null
																																	&& _bs.getValue(
																																			_property) != null)
																																try {
																																	_bs = _bs
																																			.setValue(
																																					_property,
																																					(Comparable) entry
																																							.getValue());
																																} catch (Exception e) {
																																}
																														}
																														world.setBlock(_bp, _bs, 3);
																													}
																												}
																												new Object() {
																													private int ticks = 0;
																													private float waitTicks;
																													private LevelAccessor world;

																													public void start(
																															LevelAccessor world,
																															int waitTicks) {
																														this.waitTicks = waitTicks;
																														MinecraftForge.EVENT_BUS
																																.register(this);
																														this.world = world;
																													}

																													@SubscribeEvent
																													public void tick(
																															TickEvent.ServerTickEvent event) {
																														if (event.phase == TickEvent.Phase.END) {
																															this.ticks += 1;
																															if (this.ticks >= this.waitTicks)
																																run();
																														}
																													}

																													private void run() {
																														if (world.isEmptyBlock(
																																new BlockPos(
																																		(int) (x + 1),
																																		(int) y,
																																		(int) (z + 10))) == true) {
																															{
																																BlockPos _bp = new BlockPos(
																																		(int) (x + 1),
																																		(int) y,
																																		(int) (z + 10));
																																BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																		.defaultBlockState();
																																BlockState _bso = world
																																		.getBlockState(
																																				_bp);
																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																		.getValues()
																																		.entrySet()) {
																																	Property _property = _bs
																																			.getBlock()
																																			.getStateDefinition()
																																			.getProperty(
																																					entry.getKey()
																																							.getName());
																																	if (_property != null
																																			&& _bs.getValue(
																																					_property) != null)
																																		try {
																																			_bs = _bs
																																					.setValue(
																																							_property,
																																							(Comparable) entry
																																									.getValue());
																																		} catch (Exception e) {
																																		}
																																}
																																world.setBlock(_bp,
																																		_bs, 3);
																															}
																														}
																														new Object() {
																															private int ticks = 0;
																															private float waitTicks;
																															private LevelAccessor world;

																															public void start(
																																	LevelAccessor world,
																																	int waitTicks) {
																																this.waitTicks = waitTicks;
																																MinecraftForge.EVENT_BUS
																																		.register(
																																				this);
																																this.world = world;
																															}

																															@SubscribeEvent
																															public void tick(
																																	TickEvent.ServerTickEvent event) {
																																if (event.phase == TickEvent.Phase.END) {
																																	this.ticks += 1;
																																	if (this.ticks >= this.waitTicks)
																																		run();
																																}
																															}

																															private void run() {
																																if (world
																																		.isEmptyBlock(
																																				new BlockPos(
																																						(int) (x + 0),
																																						(int) y,
																																						(int) (z + 10))) == true) {
																																	{
																																		BlockPos _bp = new BlockPos(
																																				(int) (x + 0),
																																				(int) y,
																																				(int) (z + 10));
																																		BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																				.defaultBlockState();
																																		BlockState _bso = world
																																				.getBlockState(
																																						_bp);
																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																				.getValues()
																																				.entrySet()) {
																																			Property _property = _bs
																																					.getBlock()
																																					.getStateDefinition()
																																					.getProperty(
																																							entry.getKey()
																																									.getName());
																																			if (_property != null
																																					&& _bs.getValue(
																																							_property) != null)
																																				try {
																																					_bs = _bs
																																							.setValue(
																																									_property,
																																									(Comparable) entry
																																											.getValue());
																																				} catch (Exception e) {
																																				}
																																		}
																																		world.setBlock(
																																				_bp,
																																				_bs,
																																				3);
																																	}
																																}
																																new Object() {
																																	private int ticks = 0;
																																	private float waitTicks;
																																	private LevelAccessor world;

																																	public void start(
																																			LevelAccessor world,
																																			int waitTicks) {
																																		this.waitTicks = waitTicks;
																																		MinecraftForge.EVENT_BUS
																																				.register(
																																						this);
																																		this.world = world;
																																	}

																																	@SubscribeEvent
																																	public void tick(
																																			TickEvent.ServerTickEvent event) {
																																		if (event.phase == TickEvent.Phase.END) {
																																			this.ticks += 1;
																																			if (this.ticks >= this.waitTicks)
																																				run();
																																		}
																																	}

																																	private void run() {
																																		if (world
																																				.isEmptyBlock(
																																						new BlockPos(
																																								(int) (x + -1),
																																								(int) y,
																																								(int) (z + 10))) == true) {
																																			{
																																				BlockPos _bp = new BlockPos(
																																						(int) (x + -1),
																																						(int) y,
																																						(int) (z + 10));
																																				BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																						.defaultBlockState();
																																				BlockState _bso = world
																																						.getBlockState(
																																								_bp);
																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																						.getValues()
																																						.entrySet()) {
																																					Property _property = _bs
																																							.getBlock()
																																							.getStateDefinition()
																																							.getProperty(
																																									entry.getKey()
																																											.getName());
																																					if (_property != null
																																							&& _bs.getValue(
																																									_property) != null)
																																						try {
																																							_bs = _bs
																																									.setValue(
																																											_property,
																																											(Comparable) entry
																																													.getValue());
																																						} catch (Exception e) {
																																						}
																																				}
																																				world.setBlock(
																																						_bp,
																																						_bs,
																																						3);
																																			}
																																		}
																																		new Object() {
																																			private int ticks = 0;
																																			private float waitTicks;
																																			private LevelAccessor world;

																																			public void start(
																																					LevelAccessor world,
																																					int waitTicks) {
																																				this.waitTicks = waitTicks;
																																				MinecraftForge.EVENT_BUS
																																						.register(
																																								this);
																																				this.world = world;
																																			}

																																			@SubscribeEvent
																																			public void tick(
																																					TickEvent.ServerTickEvent event) {
																																				if (event.phase == TickEvent.Phase.END) {
																																					this.ticks += 1;
																																					if (this.ticks >= this.waitTicks)
																																						run();
																																				}
																																			}

																																			private void run() {
																																				if (world
																																						.isEmptyBlock(
																																								new BlockPos(
																																										(int) (x + -2),
																																										(int) y,
																																										(int) (z + 10))) == true) {
																																					{
																																						BlockPos _bp = new BlockPos(
																																								(int) (x + -2),
																																								(int) y,
																																								(int) (z + 10));
																																						BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																								.defaultBlockState();
																																						BlockState _bso = world
																																								.getBlockState(
																																										_bp);
																																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																								.getValues()
																																								.entrySet()) {
																																							Property _property = _bs
																																									.getBlock()
																																									.getStateDefinition()
																																									.getProperty(
																																											entry.getKey()
																																													.getName());
																																							if (_property != null
																																									&& _bs.getValue(
																																											_property) != null)
																																								try {
																																									_bs = _bs
																																											.setValue(
																																													_property,
																																													(Comparable) entry
																																															.getValue());
																																								} catch (Exception e) {
																																								}
																																						}
																																						world.setBlock(
																																								_bp,
																																								_bs,
																																								3);
																																					}
																																				}
																																				new Object() {
																																					private int ticks = 0;
																																					private float waitTicks;
																																					private LevelAccessor world;

																																					public void start(
																																							LevelAccessor world,
																																							int waitTicks) {
																																						this.waitTicks = waitTicks;
																																						MinecraftForge.EVENT_BUS
																																								.register(
																																										this);
																																						this.world = world;
																																					}

																																					@SubscribeEvent
																																					public void tick(
																																							TickEvent.ServerTickEvent event) {
																																						if (event.phase == TickEvent.Phase.END) {
																																							this.ticks += 1;
																																							if (this.ticks >= this.waitTicks)
																																								run();
																																						}
																																					}

																																					private void run() {
																																						if (world
																																								.isEmptyBlock(
																																										new BlockPos(
																																												(int) (x + -3),
																																												(int) y,
																																												(int) (z + 10))) == true) {
																																							{
																																								BlockPos _bp = new BlockPos(
																																										(int) (x + -3),
																																										(int) y,
																																										(int) (z + 10));
																																								BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																										.defaultBlockState();
																																								BlockState _bso = world
																																										.getBlockState(
																																												_bp);
																																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																										.getValues()
																																										.entrySet()) {
																																									Property _property = _bs
																																											.getBlock()
																																											.getStateDefinition()
																																											.getProperty(
																																													entry.getKey()
																																															.getName());
																																									if (_property != null
																																											&& _bs.getValue(
																																													_property) != null)
																																										try {
																																											_bs = _bs
																																													.setValue(
																																															_property,
																																															(Comparable) entry
																																																	.getValue());
																																										} catch (Exception e) {
																																										}
																																								}
																																								world.setBlock(
																																										_bp,
																																										_bs,
																																										3);
																																							}
																																						}
																																						new Object() {
																																							private int ticks = 0;
																																							private float waitTicks;
																																							private LevelAccessor world;

																																							public void start(
																																									LevelAccessor world,
																																									int waitTicks) {
																																								this.waitTicks = waitTicks;
																																								MinecraftForge.EVENT_BUS
																																										.register(
																																												this);
																																								this.world = world;
																																							}

																																							@SubscribeEvent
																																							public void tick(
																																									TickEvent.ServerTickEvent event) {
																																								if (event.phase == TickEvent.Phase.END) {
																																									this.ticks += 1;
																																									if (this.ticks >= this.waitTicks)
																																										run();
																																								}
																																							}

																																							private void run() {
																																								if (world
																																										.isEmptyBlock(
																																												new BlockPos(
																																														(int) (x + -4),
																																														(int) y,
																																														(int) (z + 9))) == true) {
																																									{
																																										BlockPos _bp = new BlockPos(
																																												(int) (x + -4),
																																												(int) y,
																																												(int) (z + 9));
																																										BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																												.defaultBlockState();
																																										BlockState _bso = world
																																												.getBlockState(
																																														_bp);
																																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																												.getValues()
																																												.entrySet()) {
																																											Property _property = _bs
																																													.getBlock()
																																													.getStateDefinition()
																																													.getProperty(
																																															entry.getKey()
																																																	.getName());
																																											if (_property != null
																																													&& _bs.getValue(
																																															_property) != null)
																																												try {
																																													_bs = _bs
																																															.setValue(
																																																	_property,
																																																	(Comparable) entry
																																																			.getValue());
																																												} catch (Exception e) {
																																												}
																																										}
																																										world.setBlock(
																																												_bp,
																																												_bs,
																																												3);
																																									}
																																								}
																																								new Object() {
																																									private int ticks = 0;
																																									private float waitTicks;
																																									private LevelAccessor world;

																																									public void start(
																																											LevelAccessor world,
																																											int waitTicks) {
																																										this.waitTicks = waitTicks;
																																										MinecraftForge.EVENT_BUS
																																												.register(
																																														this);
																																										this.world = world;
																																									}

																																									@SubscribeEvent
																																									public void tick(
																																											TickEvent.ServerTickEvent event) {
																																										if (event.phase == TickEvent.Phase.END) {
																																											this.ticks += 1;
																																											if (this.ticks >= this.waitTicks)
																																												run();
																																										}
																																									}

																																									private void run() {
																																										if (world
																																												.isEmptyBlock(
																																														new BlockPos(
																																																(int) (x + -5),
																																																(int) y,
																																																(int) (z + 9))) == true) {
																																											{
																																												BlockPos _bp = new BlockPos(
																																														(int) (x + -5),
																																														(int) y,
																																														(int) (z + 9));
																																												BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																														.defaultBlockState();
																																												BlockState _bso = world
																																														.getBlockState(
																																																_bp);
																																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																														.getValues()
																																														.entrySet()) {
																																													Property _property = _bs
																																															.getBlock()
																																															.getStateDefinition()
																																															.getProperty(
																																																	entry.getKey()
																																																			.getName());
																																													if (_property != null
																																															&& _bs.getValue(
																																																	_property) != null)
																																														try {
																																															_bs = _bs
																																																	.setValue(
																																																			_property,
																																																			(Comparable) entry
																																																					.getValue());
																																														} catch (Exception e) {
																																														}
																																												}
																																												world.setBlock(
																																														_bp,
																																														_bs,
																																														3);
																																											}
																																										}
																																										new Object() {
																																											private int ticks = 0;
																																											private float waitTicks;
																																											private LevelAccessor world;

																																											public void start(
																																													LevelAccessor world,
																																													int waitTicks) {
																																												this.waitTicks = waitTicks;
																																												MinecraftForge.EVENT_BUS
																																														.register(
																																																this);
																																												this.world = world;
																																											}

																																											@SubscribeEvent
																																											public void tick(
																																													TickEvent.ServerTickEvent event) {
																																												if (event.phase == TickEvent.Phase.END) {
																																													this.ticks += 1;
																																													if (this.ticks >= this.waitTicks)
																																														run();
																																												}
																																											}

																																											private void run() {
																																												if (world
																																														.isEmptyBlock(
																																																new BlockPos(
																																																		(int) (x + -6),
																																																		(int) y,
																																																		(int) (z + 8))) == true) {
																																													{
																																														BlockPos _bp = new BlockPos(
																																																(int) (x + -6),
																																																(int) y,
																																																(int) (z + 8));
																																														BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																.defaultBlockState();
																																														BlockState _bso = world
																																																.getBlockState(
																																																		_bp);
																																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																.getValues()
																																																.entrySet()) {
																																															Property _property = _bs
																																																	.getBlock()
																																																	.getStateDefinition()
																																																	.getProperty(
																																																			entry.getKey()
																																																					.getName());
																																															if (_property != null
																																																	&& _bs.getValue(
																																																			_property) != null)
																																																try {
																																																	_bs = _bs
																																																			.setValue(
																																																					_property,
																																																					(Comparable) entry
																																																							.getValue());
																																																} catch (Exception e) {
																																																}
																																														}
																																														world.setBlock(
																																																_bp,
																																																_bs,
																																																3);
																																													}
																																												}
																																												new Object() {
																																													private int ticks = 0;
																																													private float waitTicks;
																																													private LevelAccessor world;

																																													public void start(
																																															LevelAccessor world,
																																															int waitTicks) {
																																														this.waitTicks = waitTicks;
																																														MinecraftForge.EVENT_BUS
																																																.register(
																																																		this);
																																														this.world = world;
																																													}

																																													@SubscribeEvent
																																													public void tick(
																																															TickEvent.ServerTickEvent event) {
																																														if (event.phase == TickEvent.Phase.END) {
																																															this.ticks += 1;
																																															if (this.ticks >= this.waitTicks)
																																																run();
																																														}
																																													}

																																													private void run() {
																																														if (world
																																																.isEmptyBlock(
																																																		new BlockPos(
																																																				(int) (x + -7),
																																																				(int) y,
																																																				(int) (z + 7))) == true) {
																																															{
																																																BlockPos _bp = new BlockPos(
																																																		(int) (x + -7),
																																																		(int) y,
																																																		(int) (z + 7));
																																																BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																		.defaultBlockState();
																																																BlockState _bso = world
																																																		.getBlockState(
																																																				_bp);
																																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																		.getValues()
																																																		.entrySet()) {
																																																	Property _property = _bs
																																																			.getBlock()
																																																			.getStateDefinition()
																																																			.getProperty(
																																																					entry.getKey()
																																																							.getName());
																																																	if (_property != null
																																																			&& _bs.getValue(
																																																					_property) != null)
																																																		try {
																																																			_bs = _bs
																																																					.setValue(
																																																							_property,
																																																							(Comparable) entry
																																																									.getValue());
																																																		} catch (Exception e) {
																																																		}
																																																}
																																																world.setBlock(
																																																		_bp,
																																																		_bs,
																																																		3);
																																															}
																																														}
																																														new Object() {
																																															private int ticks = 0;
																																															private float waitTicks;
																																															private LevelAccessor world;

																																															public void start(
																																																	LevelAccessor world,
																																																	int waitTicks) {
																																																this.waitTicks = waitTicks;
																																																MinecraftForge.EVENT_BUS
																																																		.register(
																																																				this);
																																																this.world = world;
																																															}

																																															@SubscribeEvent
																																															public void tick(
																																																	TickEvent.ServerTickEvent event) {
																																																if (event.phase == TickEvent.Phase.END) {
																																																	this.ticks += 1;
																																																	if (this.ticks >= this.waitTicks)
																																																		run();
																																																}
																																															}

																																															private void run() {
																																																if (world
																																																		.isEmptyBlock(
																																																				new BlockPos(
																																																						(int) (x + -8),
																																																						(int) y,
																																																						(int) (z + 6))) == true) {
																																																	{
																																																		BlockPos _bp = new BlockPos(
																																																				(int) (x + -8),
																																																				(int) y,
																																																				(int) (z + 6));
																																																		BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																				.defaultBlockState();
																																																		BlockState _bso = world
																																																				.getBlockState(
																																																						_bp);
																																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																				.getValues()
																																																				.entrySet()) {
																																																			Property _property = _bs
																																																					.getBlock()
																																																					.getStateDefinition()
																																																					.getProperty(
																																																							entry.getKey()
																																																									.getName());
																																																			if (_property != null
																																																					&& _bs.getValue(
																																																							_property) != null)
																																																				try {
																																																					_bs = _bs
																																																							.setValue(
																																																									_property,
																																																									(Comparable) entry
																																																											.getValue());
																																																				} catch (Exception e) {
																																																				}
																																																		}
																																																		world.setBlock(
																																																				_bp,
																																																				_bs,
																																																				3);
																																																	}
																																																}
																																																new Object() {
																																																	private int ticks = 0;
																																																	private float waitTicks;
																																																	private LevelAccessor world;

																																																	public void start(
																																																			LevelAccessor world,
																																																			int waitTicks) {
																																																		this.waitTicks = waitTicks;
																																																		MinecraftForge.EVENT_BUS
																																																				.register(
																																																						this);
																																																		this.world = world;
																																																	}

																																																	@SubscribeEvent
																																																	public void tick(
																																																			TickEvent.ServerTickEvent event) {
																																																		if (event.phase == TickEvent.Phase.END) {
																																																			this.ticks += 1;
																																																			if (this.ticks >= this.waitTicks)
																																																				run();
																																																		}
																																																	}

																																																	private void run() {
																																																		if (world
																																																				.isEmptyBlock(
																																																						new BlockPos(
																																																								(int) (x + -9),
																																																								(int) y,
																																																								(int) (z + 5))) == true) {
																																																			{
																																																				BlockPos _bp = new BlockPos(
																																																						(int) (x + -9),
																																																						(int) y,
																																																						(int) (z + 5));
																																																				BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																						.defaultBlockState();
																																																				BlockState _bso = world
																																																						.getBlockState(
																																																								_bp);
																																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																						.getValues()
																																																						.entrySet()) {
																																																					Property _property = _bs
																																																							.getBlock()
																																																							.getStateDefinition()
																																																							.getProperty(
																																																									entry.getKey()
																																																											.getName());
																																																					if (_property != null
																																																							&& _bs.getValue(
																																																									_property) != null)
																																																						try {
																																																							_bs = _bs
																																																									.setValue(
																																																											_property,
																																																											(Comparable) entry
																																																													.getValue());
																																																						} catch (Exception e) {
																																																						}
																																																				}
																																																				world.setBlock(
																																																						_bp,
																																																						_bs,
																																																						3);
																																																			}
																																																		}
																																																		new Object() {
																																																			private int ticks = 0;
																																																			private float waitTicks;
																																																			private LevelAccessor world;

																																																			public void start(
																																																					LevelAccessor world,
																																																					int waitTicks) {
																																																				this.waitTicks = waitTicks;
																																																				MinecraftForge.EVENT_BUS
																																																						.register(
																																																								this);
																																																				this.world = world;
																																																			}

																																																			@SubscribeEvent
																																																			public void tick(
																																																					TickEvent.ServerTickEvent event) {
																																																				if (event.phase == TickEvent.Phase.END) {
																																																					this.ticks += 1;
																																																					if (this.ticks >= this.waitTicks)
																																																						run();
																																																				}
																																																			}

																																																			private void run() {
																																																				if (world
																																																						.isEmptyBlock(
																																																								new BlockPos(
																																																										(int) (x + -9),
																																																										(int) y,
																																																										(int) (z + 4))) == true) {
																																																					{
																																																						BlockPos _bp = new BlockPos(
																																																								(int) (x + -9),
																																																								(int) y,
																																																								(int) (z + 4));
																																																						BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																								.defaultBlockState();
																																																						BlockState _bso = world
																																																								.getBlockState(
																																																										_bp);
																																																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																								.getValues()
																																																								.entrySet()) {
																																																							Property _property = _bs
																																																									.getBlock()
																																																									.getStateDefinition()
																																																									.getProperty(
																																																											entry.getKey()
																																																													.getName());
																																																							if (_property != null
																																																									&& _bs.getValue(
																																																											_property) != null)
																																																								try {
																																																									_bs = _bs
																																																											.setValue(
																																																													_property,
																																																													(Comparable) entry
																																																															.getValue());
																																																								} catch (Exception e) {
																																																								}
																																																						}
																																																						world.setBlock(
																																																								_bp,
																																																								_bs,
																																																								3);
																																																					}
																																																				}
																																																				new Object() {
																																																					private int ticks = 0;
																																																					private float waitTicks;
																																																					private LevelAccessor world;

																																																					public void start(
																																																							LevelAccessor world,
																																																							int waitTicks) {
																																																						this.waitTicks = waitTicks;
																																																						MinecraftForge.EVENT_BUS
																																																								.register(
																																																										this);
																																																						this.world = world;
																																																					}

																																																					@SubscribeEvent
																																																					public void tick(
																																																							TickEvent.ServerTickEvent event) {
																																																						if (event.phase == TickEvent.Phase.END) {
																																																							this.ticks += 1;
																																																							if (this.ticks >= this.waitTicks)
																																																								run();
																																																						}
																																																					}

																																																					private void run() {
																																																						if (world
																																																								.isEmptyBlock(
																																																										new BlockPos(
																																																												(int) (x + -10),
																																																												(int) y,
																																																												(int) (z + 3))) == true) {
																																																							{
																																																								BlockPos _bp = new BlockPos(
																																																										(int) (x + -10),
																																																										(int) y,
																																																										(int) (z + 3));
																																																								BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																										.defaultBlockState();
																																																								BlockState _bso = world
																																																										.getBlockState(
																																																												_bp);
																																																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																										.getValues()
																																																										.entrySet()) {
																																																									Property _property = _bs
																																																											.getBlock()
																																																											.getStateDefinition()
																																																											.getProperty(
																																																													entry.getKey()
																																																															.getName());
																																																									if (_property != null
																																																											&& _bs.getValue(
																																																													_property) != null)
																																																										try {
																																																											_bs = _bs
																																																													.setValue(
																																																															_property,
																																																															(Comparable) entry
																																																																	.getValue());
																																																										} catch (Exception e) {
																																																										}
																																																								}
																																																								world.setBlock(
																																																										_bp,
																																																										_bs,
																																																										3);
																																																							}
																																																						}
																																																						new Object() {
																																																							private int ticks = 0;
																																																							private float waitTicks;
																																																							private LevelAccessor world;

																																																							public void start(
																																																									LevelAccessor world,
																																																									int waitTicks) {
																																																								this.waitTicks = waitTicks;
																																																								MinecraftForge.EVENT_BUS
																																																										.register(
																																																												this);
																																																								this.world = world;
																																																							}

																																																							@SubscribeEvent
																																																							public void tick(
																																																									TickEvent.ServerTickEvent event) {
																																																								if (event.phase == TickEvent.Phase.END) {
																																																									this.ticks += 1;
																																																									if (this.ticks >= this.waitTicks)
																																																										run();
																																																								}
																																																							}

																																																							private void run() {
																																																								if (world
																																																										.isEmptyBlock(
																																																												new BlockPos(
																																																														(int) (x + -10),
																																																														(int) y,
																																																														(int) (z + 2))) == true) {
																																																									{
																																																										BlockPos _bp = new BlockPos(
																																																												(int) (x + -10),
																																																												(int) y,
																																																												(int) (z + 2));
																																																										BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																												.defaultBlockState();
																																																										BlockState _bso = world
																																																												.getBlockState(
																																																														_bp);
																																																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																												.getValues()
																																																												.entrySet()) {
																																																											Property _property = _bs
																																																													.getBlock()
																																																													.getStateDefinition()
																																																													.getProperty(
																																																															entry.getKey()
																																																																	.getName());
																																																											if (_property != null
																																																													&& _bs.getValue(
																																																															_property) != null)
																																																												try {
																																																													_bs = _bs
																																																															.setValue(
																																																																	_property,
																																																																	(Comparable) entry
																																																																			.getValue());
																																																												} catch (Exception e) {
																																																												}
																																																										}
																																																										world.setBlock(
																																																												_bp,
																																																												_bs,
																																																												3);
																																																									}
																																																								}
																																																								new Object() {
																																																									private int ticks = 0;
																																																									private float waitTicks;
																																																									private LevelAccessor world;

																																																									public void start(
																																																											LevelAccessor world,
																																																											int waitTicks) {
																																																										this.waitTicks = waitTicks;
																																																										MinecraftForge.EVENT_BUS
																																																												.register(
																																																														this);
																																																										this.world = world;
																																																									}

																																																									@SubscribeEvent
																																																									public void tick(
																																																											TickEvent.ServerTickEvent event) {
																																																										if (event.phase == TickEvent.Phase.END) {
																																																											this.ticks += 1;
																																																											if (this.ticks >= this.waitTicks)
																																																												run();
																																																										}
																																																									}

																																																									private void run() {
																																																										if (world
																																																												.isEmptyBlock(
																																																														new BlockPos(
																																																																(int) (x + -10),
																																																																(int) y,
																																																																(int) (z + 1))) == true) {
																																																											{
																																																												BlockPos _bp = new BlockPos(
																																																														(int) (x + -10),
																																																														(int) y,
																																																														(int) (z + 1));
																																																												BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																														.defaultBlockState();
																																																												BlockState _bso = world
																																																														.getBlockState(
																																																																_bp);
																																																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																														.getValues()
																																																														.entrySet()) {
																																																													Property _property = _bs
																																																															.getBlock()
																																																															.getStateDefinition()
																																																															.getProperty(
																																																																	entry.getKey()
																																																																			.getName());
																																																													if (_property != null
																																																															&& _bs.getValue(
																																																																	_property) != null)
																																																														try {
																																																															_bs = _bs
																																																																	.setValue(
																																																																			_property,
																																																																			(Comparable) entry
																																																																					.getValue());
																																																														} catch (Exception e) {
																																																														}
																																																												}
																																																												world.setBlock(
																																																														_bp,
																																																														_bs,
																																																														3);
																																																											}
																																																										}
																																																										new Object() {
																																																											private int ticks = 0;
																																																											private float waitTicks;
																																																											private LevelAccessor world;

																																																											public void start(
																																																													LevelAccessor world,
																																																													int waitTicks) {
																																																												this.waitTicks = waitTicks;
																																																												MinecraftForge.EVENT_BUS
																																																														.register(
																																																																this);
																																																												this.world = world;
																																																											}

																																																											@SubscribeEvent
																																																											public void tick(
																																																													TickEvent.ServerTickEvent event) {
																																																												if (event.phase == TickEvent.Phase.END) {
																																																													this.ticks += 1;
																																																													if (this.ticks >= this.waitTicks)
																																																														run();
																																																												}
																																																											}

																																																											private void run() {
																																																												if (world
																																																														.isEmptyBlock(
																																																																new BlockPos(
																																																																		(int) (x + -10),
																																																																		(int) y,
																																																																		(int) (z + 0))) == true) {
																																																													{
																																																														BlockPos _bp = new BlockPos(
																																																																(int) (x + -10),
																																																																(int) y,
																																																																(int) (z + 0));
																																																														BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																.defaultBlockState();
																																																														BlockState _bso = world
																																																																.getBlockState(
																																																																		_bp);
																																																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																.getValues()
																																																																.entrySet()) {
																																																															Property _property = _bs
																																																																	.getBlock()
																																																																	.getStateDefinition()
																																																																	.getProperty(
																																																																			entry.getKey()
																																																																					.getName());
																																																															if (_property != null
																																																																	&& _bs.getValue(
																																																																			_property) != null)
																																																																try {
																																																																	_bs = _bs
																																																																			.setValue(
																																																																					_property,
																																																																					(Comparable) entry
																																																																							.getValue());
																																																																} catch (Exception e) {
																																																																}
																																																														}
																																																														world.setBlock(
																																																																_bp,
																																																																_bs,
																																																																3);
																																																													}
																																																												}
																																																												new Object() {
																																																													private int ticks = 0;
																																																													private float waitTicks;
																																																													private LevelAccessor world;

																																																													public void start(
																																																															LevelAccessor world,
																																																															int waitTicks) {
																																																														this.waitTicks = waitTicks;
																																																														MinecraftForge.EVENT_BUS
																																																																.register(
																																																																		this);
																																																														this.world = world;
																																																													}

																																																													@SubscribeEvent
																																																													public void tick(
																																																															TickEvent.ServerTickEvent event) {
																																																														if (event.phase == TickEvent.Phase.END) {
																																																															this.ticks += 1;
																																																															if (this.ticks >= this.waitTicks)
																																																																run();
																																																														}
																																																													}

																																																													private void run() {
																																																														if (world
																																																																.isEmptyBlock(
																																																																		new BlockPos(
																																																																				(int) (x + -10),
																																																																				(int) y,
																																																																				(int) (z + -1))) == true) {
																																																															{
																																																																BlockPos _bp = new BlockPos(
																																																																		(int) (x + -10),
																																																																		(int) y,
																																																																		(int) (z + -1));
																																																																BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																		.defaultBlockState();
																																																																BlockState _bso = world
																																																																		.getBlockState(
																																																																				_bp);
																																																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																		.getValues()
																																																																		.entrySet()) {
																																																																	Property _property = _bs
																																																																			.getBlock()
																																																																			.getStateDefinition()
																																																																			.getProperty(
																																																																					entry.getKey()
																																																																							.getName());
																																																																	if (_property != null
																																																																			&& _bs.getValue(
																																																																					_property) != null)
																																																																		try {
																																																																			_bs = _bs
																																																																					.setValue(
																																																																							_property,
																																																																							(Comparable) entry
																																																																									.getValue());
																																																																		} catch (Exception e) {
																																																																		}
																																																																}
																																																																world.setBlock(
																																																																		_bp,
																																																																		_bs,
																																																																		3);
																																																															}
																																																														}
																																																														new Object() {
																																																															private int ticks = 0;
																																																															private float waitTicks;
																																																															private LevelAccessor world;

																																																															public void start(
																																																																	LevelAccessor world,
																																																																	int waitTicks) {
																																																																this.waitTicks = waitTicks;
																																																																MinecraftForge.EVENT_BUS
																																																																		.register(
																																																																				this);
																																																																this.world = world;
																																																															}

																																																															@SubscribeEvent
																																																															public void tick(
																																																																	TickEvent.ServerTickEvent event) {
																																																																if (event.phase == TickEvent.Phase.END) {
																																																																	this.ticks += 1;
																																																																	if (this.ticks >= this.waitTicks)
																																																																		run();
																																																																}
																																																															}

																																																															private void run() {
																																																																if (world
																																																																		.isEmptyBlock(
																																																																				new BlockPos(
																																																																						(int) (x + -10),
																																																																						(int) y,
																																																																						(int) (z + -2))) == true) {
																																																																	{
																																																																		BlockPos _bp = new BlockPos(
																																																																				(int) (x + -10),
																																																																				(int) y,
																																																																				(int) (z + -2));
																																																																		BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																				.defaultBlockState();
																																																																		BlockState _bso = world
																																																																				.getBlockState(
																																																																						_bp);
																																																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																				.getValues()
																																																																				.entrySet()) {
																																																																			Property _property = _bs
																																																																					.getBlock()
																																																																					.getStateDefinition()
																																																																					.getProperty(
																																																																							entry.getKey()
																																																																									.getName());
																																																																			if (_property != null
																																																																					&& _bs.getValue(
																																																																							_property) != null)
																																																																				try {
																																																																					_bs = _bs
																																																																							.setValue(
																																																																									_property,
																																																																									(Comparable) entry
																																																																											.getValue());
																																																																				} catch (Exception e) {
																																																																				}
																																																																		}
																																																																		world.setBlock(
																																																																				_bp,
																																																																				_bs,
																																																																				3);
																																																																	}
																																																																}
																																																																new Object() {
																																																																	private int ticks = 0;
																																																																	private float waitTicks;
																																																																	private LevelAccessor world;

																																																																	public void start(
																																																																			LevelAccessor world,
																																																																			int waitTicks) {
																																																																		this.waitTicks = waitTicks;
																																																																		MinecraftForge.EVENT_BUS
																																																																				.register(
																																																																						this);
																																																																		this.world = world;
																																																																	}

																																																																	@SubscribeEvent
																																																																	public void tick(
																																																																			TickEvent.ServerTickEvent event) {
																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																			this.ticks += 1;
																																																																			if (this.ticks >= this.waitTicks)
																																																																				run();
																																																																		}
																																																																	}

																																																																	private void run() {
																																																																		if (world
																																																																				.isEmptyBlock(
																																																																						new BlockPos(
																																																																								(int) (x + -10),
																																																																								(int) y,
																																																																								(int) (z + -3))) == true) {
																																																																			{
																																																																				BlockPos _bp = new BlockPos(
																																																																						(int) (x + -10),
																																																																						(int) y,
																																																																						(int) (z + -3));
																																																																				BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																						.defaultBlockState();
																																																																				BlockState _bso = world
																																																																						.getBlockState(
																																																																								_bp);
																																																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																						.getValues()
																																																																						.entrySet()) {
																																																																					Property _property = _bs
																																																																							.getBlock()
																																																																							.getStateDefinition()
																																																																							.getProperty(
																																																																									entry.getKey()
																																																																											.getName());
																																																																					if (_property != null
																																																																							&& _bs.getValue(
																																																																									_property) != null)
																																																																						try {
																																																																							_bs = _bs
																																																																									.setValue(
																																																																											_property,
																																																																											(Comparable) entry
																																																																													.getValue());
																																																																						} catch (Exception e) {
																																																																						}
																																																																				}
																																																																				world.setBlock(
																																																																						_bp,
																																																																						_bs,
																																																																						3);
																																																																			}
																																																																		}
																																																																		new Object() {
																																																																			private int ticks = 0;
																																																																			private float waitTicks;
																																																																			private LevelAccessor world;

																																																																			public void start(
																																																																					LevelAccessor world,
																																																																					int waitTicks) {
																																																																				this.waitTicks = waitTicks;
																																																																				MinecraftForge.EVENT_BUS
																																																																						.register(
																																																																								this);
																																																																				this.world = world;
																																																																			}

																																																																			@SubscribeEvent
																																																																			public void tick(
																																																																					TickEvent.ServerTickEvent event) {
																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																					this.ticks += 1;
																																																																					if (this.ticks >= this.waitTicks)
																																																																						run();
																																																																				}
																																																																			}

																																																																			private void run() {
																																																																				if (world
																																																																						.isEmptyBlock(
																																																																								new BlockPos(
																																																																										(int) (x + -9),
																																																																										(int) y,
																																																																										(int) (z + -4))) == true) {
																																																																					{
																																																																						BlockPos _bp = new BlockPos(
																																																																								(int) (x + -9),
																																																																								(int) y,
																																																																								(int) (z + -4));
																																																																						BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																								.defaultBlockState();
																																																																						BlockState _bso = world
																																																																								.getBlockState(
																																																																										_bp);
																																																																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																								.getValues()
																																																																								.entrySet()) {
																																																																							Property _property = _bs
																																																																									.getBlock()
																																																																									.getStateDefinition()
																																																																									.getProperty(
																																																																											entry.getKey()
																																																																													.getName());
																																																																							if (_property != null
																																																																									&& _bs.getValue(
																																																																											_property) != null)
																																																																								try {
																																																																									_bs = _bs
																																																																											.setValue(
																																																																													_property,
																																																																													(Comparable) entry
																																																																															.getValue());
																																																																								} catch (Exception e) {
																																																																								}
																																																																						}
																																																																						world.setBlock(
																																																																								_bp,
																																																																								_bs,
																																																																								3);
																																																																					}
																																																																				}
																																																																				new Object() {
																																																																					private int ticks = 0;
																																																																					private float waitTicks;
																																																																					private LevelAccessor world;

																																																																					public void start(
																																																																							LevelAccessor world,
																																																																							int waitTicks) {
																																																																						this.waitTicks = waitTicks;
																																																																						MinecraftForge.EVENT_BUS
																																																																								.register(
																																																																										this);
																																																																						this.world = world;
																																																																					}

																																																																					@SubscribeEvent
																																																																					public void tick(
																																																																							TickEvent.ServerTickEvent event) {
																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																							this.ticks += 1;
																																																																							if (this.ticks >= this.waitTicks)
																																																																								run();
																																																																						}
																																																																					}

																																																																					private void run() {
																																																																						if (world
																																																																								.isEmptyBlock(
																																																																										new BlockPos(
																																																																												(int) (x + -9),
																																																																												(int) y,
																																																																												(int) (z + -5))) == true) {
																																																																							{
																																																																								BlockPos _bp = new BlockPos(
																																																																										(int) (x + -9),
																																																																										(int) y,
																																																																										(int) (z + -5));
																																																																								BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																										.defaultBlockState();
																																																																								BlockState _bso = world
																																																																										.getBlockState(
																																																																												_bp);
																																																																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																										.getValues()
																																																																										.entrySet()) {
																																																																									Property _property = _bs
																																																																											.getBlock()
																																																																											.getStateDefinition()
																																																																											.getProperty(
																																																																													entry.getKey()
																																																																															.getName());
																																																																									if (_property != null
																																																																											&& _bs.getValue(
																																																																													_property) != null)
																																																																										try {
																																																																											_bs = _bs
																																																																													.setValue(
																																																																															_property,
																																																																															(Comparable) entry
																																																																																	.getValue());
																																																																										} catch (Exception e) {
																																																																										}
																																																																								}
																																																																								world.setBlock(
																																																																										_bp,
																																																																										_bs,
																																																																										3);
																																																																							}
																																																																						}
																																																																						new Object() {
																																																																							private int ticks = 0;
																																																																							private float waitTicks;
																																																																							private LevelAccessor world;

																																																																							public void start(
																																																																									LevelAccessor world,
																																																																									int waitTicks) {
																																																																								this.waitTicks = waitTicks;
																																																																								MinecraftForge.EVENT_BUS
																																																																										.register(
																																																																												this);
																																																																								this.world = world;
																																																																							}

																																																																							@SubscribeEvent
																																																																							public void tick(
																																																																									TickEvent.ServerTickEvent event) {
																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																									this.ticks += 1;
																																																																									if (this.ticks >= this.waitTicks)
																																																																										run();
																																																																								}
																																																																							}

																																																																							private void run() {
																																																																								if (world
																																																																										.isEmptyBlock(
																																																																												new BlockPos(
																																																																														(int) (x + -8),
																																																																														(int) y,
																																																																														(int) (z + -6))) == true) {
																																																																									{
																																																																										BlockPos _bp = new BlockPos(
																																																																												(int) (x + -8),
																																																																												(int) y,
																																																																												(int) (z + -6));
																																																																										BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																												.defaultBlockState();
																																																																										BlockState _bso = world
																																																																												.getBlockState(
																																																																														_bp);
																																																																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																												.getValues()
																																																																												.entrySet()) {
																																																																											Property _property = _bs
																																																																													.getBlock()
																																																																													.getStateDefinition()
																																																																													.getProperty(
																																																																															entry.getKey()
																																																																																	.getName());
																																																																											if (_property != null
																																																																													&& _bs.getValue(
																																																																															_property) != null)
																																																																												try {
																																																																													_bs = _bs
																																																																															.setValue(
																																																																																	_property,
																																																																																	(Comparable) entry
																																																																																			.getValue());
																																																																												} catch (Exception e) {
																																																																												}
																																																																										}
																																																																										world.setBlock(
																																																																												_bp,
																																																																												_bs,
																																																																												3);
																																																																									}
																																																																								}
																																																																								new Object() {
																																																																									private int ticks = 0;
																																																																									private float waitTicks;
																																																																									private LevelAccessor world;

																																																																									public void start(
																																																																											LevelAccessor world,
																																																																											int waitTicks) {
																																																																										this.waitTicks = waitTicks;
																																																																										MinecraftForge.EVENT_BUS
																																																																												.register(
																																																																														this);
																																																																										this.world = world;
																																																																									}

																																																																									@SubscribeEvent
																																																																									public void tick(
																																																																											TickEvent.ServerTickEvent event) {
																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																											this.ticks += 1;
																																																																											if (this.ticks >= this.waitTicks)
																																																																												run();
																																																																										}
																																																																									}

																																																																									private void run() {
																																																																										if (world
																																																																												.isEmptyBlock(
																																																																														new BlockPos(
																																																																																(int) (x + -7),
																																																																																(int) y,
																																																																																(int) (z + -7))) == true) {
																																																																											{
																																																																												BlockPos _bp = new BlockPos(
																																																																														(int) (x + -7),
																																																																														(int) y,
																																																																														(int) (z + -7));
																																																																												BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																														.defaultBlockState();
																																																																												BlockState _bso = world
																																																																														.getBlockState(
																																																																																_bp);
																																																																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																														.getValues()
																																																																														.entrySet()) {
																																																																													Property _property = _bs
																																																																															.getBlock()
																																																																															.getStateDefinition()
																																																																															.getProperty(
																																																																																	entry.getKey()
																																																																																			.getName());
																																																																													if (_property != null
																																																																															&& _bs.getValue(
																																																																																	_property) != null)
																																																																														try {
																																																																															_bs = _bs
																																																																																	.setValue(
																																																																																			_property,
																																																																																			(Comparable) entry
																																																																																					.getValue());
																																																																														} catch (Exception e) {
																																																																														}
																																																																												}
																																																																												world.setBlock(
																																																																														_bp,
																																																																														_bs,
																																																																														3);
																																																																											}
																																																																										}
																																																																										new Object() {
																																																																											private int ticks = 0;
																																																																											private float waitTicks;
																																																																											private LevelAccessor world;

																																																																											public void start(
																																																																													LevelAccessor world,
																																																																													int waitTicks) {
																																																																												this.waitTicks = waitTicks;
																																																																												MinecraftForge.EVENT_BUS
																																																																														.register(
																																																																																this);
																																																																												this.world = world;
																																																																											}

																																																																											@SubscribeEvent
																																																																											public void tick(
																																																																													TickEvent.ServerTickEvent event) {
																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																													this.ticks += 1;
																																																																													if (this.ticks >= this.waitTicks)
																																																																														run();
																																																																												}
																																																																											}

																																																																											private void run() {
																																																																												if (world
																																																																														.isEmptyBlock(
																																																																																new BlockPos(
																																																																																		(int) (x + -6),
																																																																																		(int) y,
																																																																																		(int) (z + -8))) == true) {
																																																																													{
																																																																														BlockPos _bp = new BlockPos(
																																																																																(int) (x + -6),
																																																																																(int) y,
																																																																																(int) (z + -8));
																																																																														BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																.defaultBlockState();
																																																																														BlockState _bso = world
																																																																																.getBlockState(
																																																																																		_bp);
																																																																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																.getValues()
																																																																																.entrySet()) {
																																																																															Property _property = _bs
																																																																																	.getBlock()
																																																																																	.getStateDefinition()
																																																																																	.getProperty(
																																																																																			entry.getKey()
																																																																																					.getName());
																																																																															if (_property != null
																																																																																	&& _bs.getValue(
																																																																																			_property) != null)
																																																																																try {
																																																																																	_bs = _bs
																																																																																			.setValue(
																																																																																					_property,
																																																																																					(Comparable) entry
																																																																																							.getValue());
																																																																																} catch (Exception e) {
																																																																																}
																																																																														}
																																																																														world.setBlock(
																																																																																_bp,
																																																																																_bs,
																																																																																3);
																																																																													}
																																																																												}
																																																																												new Object() {
																																																																													private int ticks = 0;
																																																																													private float waitTicks;
																																																																													private LevelAccessor world;

																																																																													public void start(
																																																																															LevelAccessor world,
																																																																															int waitTicks) {
																																																																														this.waitTicks = waitTicks;
																																																																														MinecraftForge.EVENT_BUS
																																																																																.register(
																																																																																		this);
																																																																														this.world = world;
																																																																													}

																																																																													@SubscribeEvent
																																																																													public void tick(
																																																																															TickEvent.ServerTickEvent event) {
																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																															this.ticks += 1;
																																																																															if (this.ticks >= this.waitTicks)
																																																																																run();
																																																																														}
																																																																													}

																																																																													private void run() {
																																																																														if (world
																																																																																.isEmptyBlock(
																																																																																		new BlockPos(
																																																																																				(int) (x + -5),
																																																																																				(int) y,
																																																																																				(int) (z + -9))) == true) {
																																																																															{
																																																																																BlockPos _bp = new BlockPos(
																																																																																		(int) (x + -5),
																																																																																		(int) y,
																																																																																		(int) (z + -9));
																																																																																BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																		.defaultBlockState();
																																																																																BlockState _bso = world
																																																																																		.getBlockState(
																																																																																				_bp);
																																																																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																		.getValues()
																																																																																		.entrySet()) {
																																																																																	Property _property = _bs
																																																																																			.getBlock()
																																																																																			.getStateDefinition()
																																																																																			.getProperty(
																																																																																					entry.getKey()
																																																																																							.getName());
																																																																																	if (_property != null
																																																																																			&& _bs.getValue(
																																																																																					_property) != null)
																																																																																		try {
																																																																																			_bs = _bs
																																																																																					.setValue(
																																																																																							_property,
																																																																																							(Comparable) entry
																																																																																									.getValue());
																																																																																		} catch (Exception e) {
																																																																																		}
																																																																																}
																																																																																world.setBlock(
																																																																																		_bp,
																																																																																		_bs,
																																																																																		3);
																																																																															}
																																																																														}
																																																																														new Object() {
																																																																															private int ticks = 0;
																																																																															private float waitTicks;
																																																																															private LevelAccessor world;

																																																																															public void start(
																																																																																	LevelAccessor world,
																																																																																	int waitTicks) {
																																																																																this.waitTicks = waitTicks;
																																																																																MinecraftForge.EVENT_BUS
																																																																																		.register(
																																																																																				this);
																																																																																this.world = world;
																																																																															}

																																																																															@SubscribeEvent
																																																																															public void tick(
																																																																																	TickEvent.ServerTickEvent event) {
																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																	this.ticks += 1;
																																																																																	if (this.ticks >= this.waitTicks)
																																																																																		run();
																																																																																}
																																																																															}

																																																																															private void run() {
																																																																																if (world
																																																																																		.isEmptyBlock(
																																																																																				new BlockPos(
																																																																																						(int) (x + -4),
																																																																																						(int) y,
																																																																																						(int) (z + -9))) == true) {
																																																																																	{
																																																																																		BlockPos _bp = new BlockPos(
																																																																																				(int) (x + -4),
																																																																																				(int) y,
																																																																																				(int) (z + -9));
																																																																																		BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																				.defaultBlockState();
																																																																																		BlockState _bso = world
																																																																																				.getBlockState(
																																																																																						_bp);
																																																																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																				.getValues()
																																																																																				.entrySet()) {
																																																																																			Property _property = _bs
																																																																																					.getBlock()
																																																																																					.getStateDefinition()
																																																																																					.getProperty(
																																																																																							entry.getKey()
																																																																																									.getName());
																																																																																			if (_property != null
																																																																																					&& _bs.getValue(
																																																																																							_property) != null)
																																																																																				try {
																																																																																					_bs = _bs
																																																																																							.setValue(
																																																																																									_property,
																																																																																									(Comparable) entry
																																																																																											.getValue());
																																																																																				} catch (Exception e) {
																																																																																				}
																																																																																		}
																																																																																		world.setBlock(
																																																																																				_bp,
																																																																																				_bs,
																																																																																				3);
																																																																																	}
																																																																																}
																																																																																new Object() {
																																																																																	private int ticks = 0;
																																																																																	private float waitTicks;
																																																																																	private LevelAccessor world;

																																																																																	public void start(
																																																																																			LevelAccessor world,
																																																																																			int waitTicks) {
																																																																																		this.waitTicks = waitTicks;
																																																																																		MinecraftForge.EVENT_BUS
																																																																																				.register(
																																																																																						this);
																																																																																		this.world = world;
																																																																																	}

																																																																																	@SubscribeEvent
																																																																																	public void tick(
																																																																																			TickEvent.ServerTickEvent event) {
																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																			this.ticks += 1;
																																																																																			if (this.ticks >= this.waitTicks)
																																																																																				run();
																																																																																		}
																																																																																	}

																																																																																	private void run() {
																																																																																		if (world
																																																																																				.isEmptyBlock(
																																																																																						new BlockPos(
																																																																																								(int) (x + -3),
																																																																																								(int) y,
																																																																																								(int) (z + -10))) == true) {
																																																																																			{
																																																																																				BlockPos _bp = new BlockPos(
																																																																																						(int) (x + -3),
																																																																																						(int) y,
																																																																																						(int) (z + -10));
																																																																																				BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																						.defaultBlockState();
																																																																																				BlockState _bso = world
																																																																																						.getBlockState(
																																																																																								_bp);
																																																																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																						.getValues()
																																																																																						.entrySet()) {
																																																																																					Property _property = _bs
																																																																																							.getBlock()
																																																																																							.getStateDefinition()
																																																																																							.getProperty(
																																																																																									entry.getKey()
																																																																																											.getName());
																																																																																					if (_property != null
																																																																																							&& _bs.getValue(
																																																																																									_property) != null)
																																																																																						try {
																																																																																							_bs = _bs
																																																																																									.setValue(
																																																																																											_property,
																																																																																											(Comparable) entry
																																																																																													.getValue());
																																																																																						} catch (Exception e) {
																																																																																						}
																																																																																				}
																																																																																				world.setBlock(
																																																																																						_bp,
																																																																																						_bs,
																																																																																						3);
																																																																																			}
																																																																																		}
																																																																																		new Object() {
																																																																																			private int ticks = 0;
																																																																																			private float waitTicks;
																																																																																			private LevelAccessor world;

																																																																																			public void start(
																																																																																					LevelAccessor world,
																																																																																					int waitTicks) {
																																																																																				this.waitTicks = waitTicks;
																																																																																				MinecraftForge.EVENT_BUS
																																																																																						.register(
																																																																																								this);
																																																																																				this.world = world;
																																																																																			}

																																																																																			@SubscribeEvent
																																																																																			public void tick(
																																																																																					TickEvent.ServerTickEvent event) {
																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																					this.ticks += 1;
																																																																																					if (this.ticks >= this.waitTicks)
																																																																																						run();
																																																																																				}
																																																																																			}

																																																																																			private void run() {
																																																																																				if (world
																																																																																						.isEmptyBlock(
																																																																																								new BlockPos(
																																																																																										(int) (x + -2),
																																																																																										(int) y,
																																																																																										(int) (z + -10))) == true) {
																																																																																					{
																																																																																						BlockPos _bp = new BlockPos(
																																																																																								(int) (x + -2),
																																																																																								(int) y,
																																																																																								(int) (z + -10));
																																																																																						BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																								.defaultBlockState();
																																																																																						BlockState _bso = world
																																																																																								.getBlockState(
																																																																																										_bp);
																																																																																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																								.getValues()
																																																																																								.entrySet()) {
																																																																																							Property _property = _bs
																																																																																									.getBlock()
																																																																																									.getStateDefinition()
																																																																																									.getProperty(
																																																																																											entry.getKey()
																																																																																													.getName());
																																																																																							if (_property != null
																																																																																									&& _bs.getValue(
																																																																																											_property) != null)
																																																																																								try {
																																																																																									_bs = _bs
																																																																																											.setValue(
																																																																																													_property,
																																																																																													(Comparable) entry
																																																																																															.getValue());
																																																																																								} catch (Exception e) {
																																																																																								}
																																																																																						}
																																																																																						world.setBlock(
																																																																																								_bp,
																																																																																								_bs,
																																																																																								3);
																																																																																					}
																																																																																				}
																																																																																				new Object() {
																																																																																					private int ticks = 0;
																																																																																					private float waitTicks;
																																																																																					private LevelAccessor world;

																																																																																					public void start(
																																																																																							LevelAccessor world,
																																																																																							int waitTicks) {
																																																																																						this.waitTicks = waitTicks;
																																																																																						MinecraftForge.EVENT_BUS
																																																																																								.register(
																																																																																										this);
																																																																																						this.world = world;
																																																																																					}

																																																																																					@SubscribeEvent
																																																																																					public void tick(
																																																																																							TickEvent.ServerTickEvent event) {
																																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																																							this.ticks += 1;
																																																																																							if (this.ticks >= this.waitTicks)
																																																																																								run();
																																																																																						}
																																																																																					}

																																																																																					private void run() {
																																																																																						if (world
																																																																																								.isEmptyBlock(
																																																																																										new BlockPos(
																																																																																												(int) (x + -1),
																																																																																												(int) y,
																																																																																												(int) (z + -10))) == true) {
																																																																																							{
																																																																																								BlockPos _bp = new BlockPos(
																																																																																										(int) (x + -1),
																																																																																										(int) y,
																																																																																										(int) (z + -10));
																																																																																								BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																										.defaultBlockState();
																																																																																								BlockState _bso = world
																																																																																										.getBlockState(
																																																																																												_bp);
																																																																																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																										.getValues()
																																																																																										.entrySet()) {
																																																																																									Property _property = _bs
																																																																																											.getBlock()
																																																																																											.getStateDefinition()
																																																																																											.getProperty(
																																																																																													entry.getKey()
																																																																																															.getName());
																																																																																									if (_property != null
																																																																																											&& _bs.getValue(
																																																																																													_property) != null)
																																																																																										try {
																																																																																											_bs = _bs
																																																																																													.setValue(
																																																																																															_property,
																																																																																															(Comparable) entry
																																																																																																	.getValue());
																																																																																										} catch (Exception e) {
																																																																																										}
																																																																																								}
																																																																																								world.setBlock(
																																																																																										_bp,
																																																																																										_bs,
																																																																																										3);
																																																																																							}
																																																																																						}
																																																																																						new Object() {
																																																																																							private int ticks = 0;
																																																																																							private float waitTicks;
																																																																																							private LevelAccessor world;

																																																																																							public void start(
																																																																																									LevelAccessor world,
																																																																																									int waitTicks) {
																																																																																								this.waitTicks = waitTicks;
																																																																																								MinecraftForge.EVENT_BUS
																																																																																										.register(
																																																																																												this);
																																																																																								this.world = world;
																																																																																							}

																																																																																							@SubscribeEvent
																																																																																							public void tick(
																																																																																									TickEvent.ServerTickEvent event) {
																																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																																									this.ticks += 1;
																																																																																									if (this.ticks >= this.waitTicks)
																																																																																										run();
																																																																																								}
																																																																																							}

																																																																																							private void run() {
																																																																																								if (world
																																																																																										.isEmptyBlock(
																																																																																												new BlockPos(
																																																																																														(int) (x + 0),
																																																																																														(int) y,
																																																																																														(int) (z + -10))) == true) {
																																																																																									{
																																																																																										BlockPos _bp = new BlockPos(
																																																																																												(int) (x + 0),
																																																																																												(int) y,
																																																																																												(int) (z + -10));
																																																																																										BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																												.defaultBlockState();
																																																																																										BlockState _bso = world
																																																																																												.getBlockState(
																																																																																														_bp);
																																																																																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																												.getValues()
																																																																																												.entrySet()) {
																																																																																											Property _property = _bs
																																																																																													.getBlock()
																																																																																													.getStateDefinition()
																																																																																													.getProperty(
																																																																																															entry.getKey()
																																																																																																	.getName());
																																																																																											if (_property != null
																																																																																													&& _bs.getValue(
																																																																																															_property) != null)
																																																																																												try {
																																																																																													_bs = _bs
																																																																																															.setValue(
																																																																																																	_property,
																																																																																																	(Comparable) entry
																																																																																																			.getValue());
																																																																																												} catch (Exception e) {
																																																																																												}
																																																																																										}
																																																																																										world.setBlock(
																																																																																												_bp,
																																																																																												_bs,
																																																																																												3);
																																																																																									}
																																																																																								}
																																																																																								new Object() {
																																																																																									private int ticks = 0;
																																																																																									private float waitTicks;
																																																																																									private LevelAccessor world;

																																																																																									public void start(
																																																																																											LevelAccessor world,
																																																																																											int waitTicks) {
																																																																																										this.waitTicks = waitTicks;
																																																																																										MinecraftForge.EVENT_BUS
																																																																																												.register(
																																																																																														this);
																																																																																										this.world = world;
																																																																																									}

																																																																																									@SubscribeEvent
																																																																																									public void tick(
																																																																																											TickEvent.ServerTickEvent event) {
																																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																																											this.ticks += 1;
																																																																																											if (this.ticks >= this.waitTicks)
																																																																																												run();
																																																																																										}
																																																																																									}

																																																																																									private void run() {
																																																																																										if (world
																																																																																												.isEmptyBlock(
																																																																																														new BlockPos(
																																																																																																(int) (x + 1),
																																																																																																(int) y,
																																																																																																(int) (z + -10))) == true) {
																																																																																											{
																																																																																												BlockPos _bp = new BlockPos(
																																																																																														(int) (x + 1),
																																																																																														(int) y,
																																																																																														(int) (z + -10));
																																																																																												BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																														.defaultBlockState();
																																																																																												BlockState _bso = world
																																																																																														.getBlockState(
																																																																																																_bp);
																																																																																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																														.getValues()
																																																																																														.entrySet()) {
																																																																																													Property _property = _bs
																																																																																															.getBlock()
																																																																																															.getStateDefinition()
																																																																																															.getProperty(
																																																																																																	entry.getKey()
																																																																																																			.getName());
																																																																																													if (_property != null
																																																																																															&& _bs.getValue(
																																																																																																	_property) != null)
																																																																																														try {
																																																																																															_bs = _bs
																																																																																																	.setValue(
																																																																																																			_property,
																																																																																																			(Comparable) entry
																																																																																																					.getValue());
																																																																																														} catch (Exception e) {
																																																																																														}
																																																																																												}
																																																																																												world.setBlock(
																																																																																														_bp,
																																																																																														_bs,
																																																																																														3);
																																																																																											}
																																																																																										}
																																																																																										new Object() {
																																																																																											private int ticks = 0;
																																																																																											private float waitTicks;
																																																																																											private LevelAccessor world;

																																																																																											public void start(
																																																																																													LevelAccessor world,
																																																																																													int waitTicks) {
																																																																																												this.waitTicks = waitTicks;
																																																																																												MinecraftForge.EVENT_BUS
																																																																																														.register(
																																																																																																this);
																																																																																												this.world = world;
																																																																																											}

																																																																																											@SubscribeEvent
																																																																																											public void tick(
																																																																																													TickEvent.ServerTickEvent event) {
																																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																																													this.ticks += 1;
																																																																																													if (this.ticks >= this.waitTicks)
																																																																																														run();
																																																																																												}
																																																																																											}

																																																																																											private void run() {
																																																																																												if (world
																																																																																														.isEmptyBlock(
																																																																																																new BlockPos(
																																																																																																		(int) (x + 2),
																																																																																																		(int) y,
																																																																																																		(int) (z + -10))) == true) {
																																																																																													{
																																																																																														BlockPos _bp = new BlockPos(
																																																																																																(int) (x + 2),
																																																																																																(int) y,
																																																																																																(int) (z + -10));
																																																																																														BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																.defaultBlockState();
																																																																																														BlockState _bso = world
																																																																																																.getBlockState(
																																																																																																		_bp);
																																																																																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																.getValues()
																																																																																																.entrySet()) {
																																																																																															Property _property = _bs
																																																																																																	.getBlock()
																																																																																																	.getStateDefinition()
																																																																																																	.getProperty(
																																																																																																			entry.getKey()
																																																																																																					.getName());
																																																																																															if (_property != null
																																																																																																	&& _bs.getValue(
																																																																																																			_property) != null)
																																																																																																try {
																																																																																																	_bs = _bs
																																																																																																			.setValue(
																																																																																																					_property,
																																																																																																					(Comparable) entry
																																																																																																							.getValue());
																																																																																																} catch (Exception e) {
																																																																																																}
																																																																																														}
																																																																																														world.setBlock(
																																																																																																_bp,
																																																																																																_bs,
																																																																																																3);
																																																																																													}
																																																																																												}
																																																																																												new Object() {
																																																																																													private int ticks = 0;
																																																																																													private float waitTicks;
																																																																																													private LevelAccessor world;

																																																																																													public void start(
																																																																																															LevelAccessor world,
																																																																																															int waitTicks) {
																																																																																														this.waitTicks = waitTicks;
																																																																																														MinecraftForge.EVENT_BUS
																																																																																																.register(
																																																																																																		this);
																																																																																														this.world = world;
																																																																																													}

																																																																																													@SubscribeEvent
																																																																																													public void tick(
																																																																																															TickEvent.ServerTickEvent event) {
																																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																																															this.ticks += 1;
																																																																																															if (this.ticks >= this.waitTicks)
																																																																																																run();
																																																																																														}
																																																																																													}

																																																																																													private void run() {
																																																																																														if (world
																																																																																																.isEmptyBlock(
																																																																																																		new BlockPos(
																																																																																																				(int) (x + 3),
																																																																																																				(int) y,
																																																																																																				(int) (z + -10))) == true) {
																																																																																															{
																																																																																																BlockPos _bp = new BlockPos(
																																																																																																		(int) (x + 3),
																																																																																																		(int) y,
																																																																																																		(int) (z + -10));
																																																																																																BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																		.defaultBlockState();
																																																																																																BlockState _bso = world
																																																																																																		.getBlockState(
																																																																																																				_bp);
																																																																																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																		.getValues()
																																																																																																		.entrySet()) {
																																																																																																	Property _property = _bs
																																																																																																			.getBlock()
																																																																																																			.getStateDefinition()
																																																																																																			.getProperty(
																																																																																																					entry.getKey()
																																																																																																							.getName());
																																																																																																	if (_property != null
																																																																																																			&& _bs.getValue(
																																																																																																					_property) != null)
																																																																																																		try {
																																																																																																			_bs = _bs
																																																																																																					.setValue(
																																																																																																							_property,
																																																																																																							(Comparable) entry
																																																																																																									.getValue());
																																																																																																		} catch (Exception e) {
																																																																																																		}
																																																																																																}
																																																																																																world.setBlock(
																																																																																																		_bp,
																																																																																																		_bs,
																																																																																																		3);
																																																																																															}
																																																																																														}
																																																																																														new Object() {
																																																																																															private int ticks = 0;
																																																																																															private float waitTicks;
																																																																																															private LevelAccessor world;

																																																																																															public void start(
																																																																																																	LevelAccessor world,
																																																																																																	int waitTicks) {
																																																																																																this.waitTicks = waitTicks;
																																																																																																MinecraftForge.EVENT_BUS
																																																																																																		.register(
																																																																																																				this);
																																																																																																this.world = world;
																																																																																															}

																																																																																															@SubscribeEvent
																																																																																															public void tick(
																																																																																																	TickEvent.ServerTickEvent event) {
																																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																																	this.ticks += 1;
																																																																																																	if (this.ticks >= this.waitTicks)
																																																																																																		run();
																																																																																																}
																																																																																															}

																																																																																															private void run() {
																																																																																																if (world
																																																																																																		.isEmptyBlock(
																																																																																																				new BlockPos(
																																																																																																						(int) (x + 4),
																																																																																																						(int) y,
																																																																																																						(int) (z + -9))) == true) {
																																																																																																	{
																																																																																																		BlockPos _bp = new BlockPos(
																																																																																																				(int) (x + 4),
																																																																																																				(int) y,
																																																																																																				(int) (z + -9));
																																																																																																		BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																				.defaultBlockState();
																																																																																																		BlockState _bso = world
																																																																																																				.getBlockState(
																																																																																																						_bp);
																																																																																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																				.getValues()
																																																																																																				.entrySet()) {
																																																																																																			Property _property = _bs
																																																																																																					.getBlock()
																																																																																																					.getStateDefinition()
																																																																																																					.getProperty(
																																																																																																							entry.getKey()
																																																																																																									.getName());
																																																																																																			if (_property != null
																																																																																																					&& _bs.getValue(
																																																																																																							_property) != null)
																																																																																																				try {
																																																																																																					_bs = _bs
																																																																																																							.setValue(
																																																																																																									_property,
																																																																																																									(Comparable) entry
																																																																																																											.getValue());
																																																																																																				} catch (Exception e) {
																																																																																																				}
																																																																																																		}
																																																																																																		world.setBlock(
																																																																																																				_bp,
																																																																																																				_bs,
																																																																																																				3);
																																																																																																	}
																																																																																																}
																																																																																																new Object() {
																																																																																																	private int ticks = 0;
																																																																																																	private float waitTicks;
																																																																																																	private LevelAccessor world;

																																																																																																	public void start(
																																																																																																			LevelAccessor world,
																																																																																																			int waitTicks) {
																																																																																																		this.waitTicks = waitTicks;
																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																				.register(
																																																																																																						this);
																																																																																																		this.world = world;
																																																																																																	}

																																																																																																	@SubscribeEvent
																																																																																																	public void tick(
																																																																																																			TickEvent.ServerTickEvent event) {
																																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																																			this.ticks += 1;
																																																																																																			if (this.ticks >= this.waitTicks)
																																																																																																				run();
																																																																																																		}
																																																																																																	}

																																																																																																	private void run() {
																																																																																																		if (world
																																																																																																				.isEmptyBlock(
																																																																																																						new BlockPos(
																																																																																																								(int) (x + 5),
																																																																																																								(int) y,
																																																																																																								(int) (z + -9))) == true) {
																																																																																																			{
																																																																																																				BlockPos _bp = new BlockPos(
																																																																																																						(int) (x + 5),
																																																																																																						(int) y,
																																																																																																						(int) (z + -9));
																																																																																																				BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																						.defaultBlockState();
																																																																																																				BlockState _bso = world
																																																																																																						.getBlockState(
																																																																																																								_bp);
																																																																																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																						.getValues()
																																																																																																						.entrySet()) {
																																																																																																					Property _property = _bs
																																																																																																							.getBlock()
																																																																																																							.getStateDefinition()
																																																																																																							.getProperty(
																																																																																																									entry.getKey()
																																																																																																											.getName());
																																																																																																					if (_property != null
																																																																																																							&& _bs.getValue(
																																																																																																									_property) != null)
																																																																																																						try {
																																																																																																							_bs = _bs
																																																																																																									.setValue(
																																																																																																											_property,
																																																																																																											(Comparable) entry
																																																																																																													.getValue());
																																																																																																						} catch (Exception e) {
																																																																																																						}
																																																																																																				}
																																																																																																				world.setBlock(
																																																																																																						_bp,
																																																																																																						_bs,
																																																																																																						3);
																																																																																																			}
																																																																																																		}
																																																																																																		new Object() {
																																																																																																			private int ticks = 0;
																																																																																																			private float waitTicks;
																																																																																																			private LevelAccessor world;

																																																																																																			public void start(
																																																																																																					LevelAccessor world,
																																																																																																					int waitTicks) {
																																																																																																				this.waitTicks = waitTicks;
																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																						.register(
																																																																																																								this);
																																																																																																				this.world = world;
																																																																																																			}

																																																																																																			@SubscribeEvent
																																																																																																			public void tick(
																																																																																																					TickEvent.ServerTickEvent event) {
																																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																																					this.ticks += 1;
																																																																																																					if (this.ticks >= this.waitTicks)
																																																																																																						run();
																																																																																																				}
																																																																																																			}

																																																																																																			private void run() {
																																																																																																				if (world
																																																																																																						.isEmptyBlock(
																																																																																																								new BlockPos(
																																																																																																										(int) (x + 6),
																																																																																																										(int) y,
																																																																																																										(int) (z + -8))) == true) {
																																																																																																					{
																																																																																																						BlockPos _bp = new BlockPos(
																																																																																																								(int) (x + 6),
																																																																																																								(int) y,
																																																																																																								(int) (z + -8));
																																																																																																						BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																								.defaultBlockState();
																																																																																																						BlockState _bso = world
																																																																																																								.getBlockState(
																																																																																																										_bp);
																																																																																																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																								.getValues()
																																																																																																								.entrySet()) {
																																																																																																							Property _property = _bs
																																																																																																									.getBlock()
																																																																																																									.getStateDefinition()
																																																																																																									.getProperty(
																																																																																																											entry.getKey()
																																																																																																													.getName());
																																																																																																							if (_property != null
																																																																																																									&& _bs.getValue(
																																																																																																											_property) != null)
																																																																																																								try {
																																																																																																									_bs = _bs
																																																																																																											.setValue(
																																																																																																													_property,
																																																																																																													(Comparable) entry
																																																																																																															.getValue());
																																																																																																								} catch (Exception e) {
																																																																																																								}
																																																																																																						}
																																																																																																						world.setBlock(
																																																																																																								_bp,
																																																																																																								_bs,
																																																																																																								3);
																																																																																																					}
																																																																																																				}
																																																																																																				new Object() {
																																																																																																					private int ticks = 0;
																																																																																																					private float waitTicks;
																																																																																																					private LevelAccessor world;

																																																																																																					public void start(
																																																																																																							LevelAccessor world,
																																																																																																							int waitTicks) {
																																																																																																						this.waitTicks = waitTicks;
																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																								.register(
																																																																																																										this);
																																																																																																						this.world = world;
																																																																																																					}

																																																																																																					@SubscribeEvent
																																																																																																					public void tick(
																																																																																																							TickEvent.ServerTickEvent event) {
																																																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																																																							this.ticks += 1;
																																																																																																							if (this.ticks >= this.waitTicks)
																																																																																																								run();
																																																																																																						}
																																																																																																					}

																																																																																																					private void run() {
																																																																																																						if (world
																																																																																																								.isEmptyBlock(
																																																																																																										new BlockPos(
																																																																																																												(int) (x + 7),
																																																																																																												(int) y,
																																																																																																												(int) (z + -7))) == true) {
																																																																																																							{
																																																																																																								BlockPos _bp = new BlockPos(
																																																																																																										(int) (x + 7),
																																																																																																										(int) y,
																																																																																																										(int) (z + -7));
																																																																																																								BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																										.defaultBlockState();
																																																																																																								BlockState _bso = world
																																																																																																										.getBlockState(
																																																																																																												_bp);
																																																																																																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																										.getValues()
																																																																																																										.entrySet()) {
																																																																																																									Property _property = _bs
																																																																																																											.getBlock()
																																																																																																											.getStateDefinition()
																																																																																																											.getProperty(
																																																																																																													entry.getKey()
																																																																																																															.getName());
																																																																																																									if (_property != null
																																																																																																											&& _bs.getValue(
																																																																																																													_property) != null)
																																																																																																										try {
																																																																																																											_bs = _bs
																																																																																																													.setValue(
																																																																																																															_property,
																																																																																																															(Comparable) entry
																																																																																																																	.getValue());
																																																																																																										} catch (Exception e) {
																																																																																																										}
																																																																																																								}
																																																																																																								world.setBlock(
																																																																																																										_bp,
																																																																																																										_bs,
																																																																																																										3);
																																																																																																							}
																																																																																																						}
																																																																																																						new Object() {
																																																																																																							private int ticks = 0;
																																																																																																							private float waitTicks;
																																																																																																							private LevelAccessor world;

																																																																																																							public void start(
																																																																																																									LevelAccessor world,
																																																																																																									int waitTicks) {
																																																																																																								this.waitTicks = waitTicks;
																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																										.register(
																																																																																																												this);
																																																																																																								this.world = world;
																																																																																																							}

																																																																																																							@SubscribeEvent
																																																																																																							public void tick(
																																																																																																									TickEvent.ServerTickEvent event) {
																																																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																																																									this.ticks += 1;
																																																																																																									if (this.ticks >= this.waitTicks)
																																																																																																										run();
																																																																																																								}
																																																																																																							}

																																																																																																							private void run() {
																																																																																																								if (world
																																																																																																										.isEmptyBlock(
																																																																																																												new BlockPos(
																																																																																																														(int) (x + 8),
																																																																																																														(int) y,
																																																																																																														(int) (z + -6))) == true) {
																																																																																																									{
																																																																																																										BlockPos _bp = new BlockPos(
																																																																																																												(int) (x + 8),
																																																																																																												(int) y,
																																																																																																												(int) (z + -6));
																																																																																																										BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																												.defaultBlockState();
																																																																																																										BlockState _bso = world
																																																																																																												.getBlockState(
																																																																																																														_bp);
																																																																																																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																												.getValues()
																																																																																																												.entrySet()) {
																																																																																																											Property _property = _bs
																																																																																																													.getBlock()
																																																																																																													.getStateDefinition()
																																																																																																													.getProperty(
																																																																																																															entry.getKey()
																																																																																																																	.getName());
																																																																																																											if (_property != null
																																																																																																													&& _bs.getValue(
																																																																																																															_property) != null)
																																																																																																												try {
																																																																																																													_bs = _bs
																																																																																																															.setValue(
																																																																																																																	_property,
																																																																																																																	(Comparable) entry
																																																																																																																			.getValue());
																																																																																																												} catch (Exception e) {
																																																																																																												}
																																																																																																										}
																																																																																																										world.setBlock(
																																																																																																												_bp,
																																																																																																												_bs,
																																																																																																												3);
																																																																																																									}
																																																																																																								}
																																																																																																								new Object() {
																																																																																																									private int ticks = 0;
																																																																																																									private float waitTicks;
																																																																																																									private LevelAccessor world;

																																																																																																									public void start(
																																																																																																											LevelAccessor world,
																																																																																																											int waitTicks) {
																																																																																																										this.waitTicks = waitTicks;
																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																												.register(
																																																																																																														this);
																																																																																																										this.world = world;
																																																																																																									}

																																																																																																									@SubscribeEvent
																																																																																																									public void tick(
																																																																																																											TickEvent.ServerTickEvent event) {
																																																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																																																											this.ticks += 1;
																																																																																																											if (this.ticks >= this.waitTicks)
																																																																																																												run();
																																																																																																										}
																																																																																																									}

																																																																																																									private void run() {
																																																																																																										if (world
																																																																																																												.isEmptyBlock(
																																																																																																														new BlockPos(
																																																																																																																(int) (x + 9),
																																																																																																																(int) y,
																																																																																																																(int) (z + -5))) == true) {
																																																																																																											{
																																																																																																												BlockPos _bp = new BlockPos(
																																																																																																														(int) (x + 9),
																																																																																																														(int) y,
																																																																																																														(int) (z + -5));
																																																																																																												BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																														.defaultBlockState();
																																																																																																												BlockState _bso = world
																																																																																																														.getBlockState(
																																																																																																																_bp);
																																																																																																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																														.getValues()
																																																																																																														.entrySet()) {
																																																																																																													Property _property = _bs
																																																																																																															.getBlock()
																																																																																																															.getStateDefinition()
																																																																																																															.getProperty(
																																																																																																																	entry.getKey()
																																																																																																																			.getName());
																																																																																																													if (_property != null
																																																																																																															&& _bs.getValue(
																																																																																																																	_property) != null)
																																																																																																														try {
																																																																																																															_bs = _bs
																																																																																																																	.setValue(
																																																																																																																			_property,
																																																																																																																			(Comparable) entry
																																																																																																																					.getValue());
																																																																																																														} catch (Exception e) {
																																																																																																														}
																																																																																																												}
																																																																																																												world.setBlock(
																																																																																																														_bp,
																																																																																																														_bs,
																																																																																																														3);
																																																																																																											}
																																																																																																										}
																																																																																																										new Object() {
																																																																																																											private int ticks = 0;
																																																																																																											private float waitTicks;
																																																																																																											private LevelAccessor world;

																																																																																																											public void start(
																																																																																																													LevelAccessor world,
																																																																																																													int waitTicks) {
																																																																																																												this.waitTicks = waitTicks;
																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																														.register(
																																																																																																																this);
																																																																																																												this.world = world;
																																																																																																											}

																																																																																																											@SubscribeEvent
																																																																																																											public void tick(
																																																																																																													TickEvent.ServerTickEvent event) {
																																																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																																																													this.ticks += 1;
																																																																																																													if (this.ticks >= this.waitTicks)
																																																																																																														run();
																																																																																																												}
																																																																																																											}

																																																																																																											private void run() {
																																																																																																												if (world
																																																																																																														.isEmptyBlock(
																																																																																																																new BlockPos(
																																																																																																																		(int) (x + 9),
																																																																																																																		(int) y,
																																																																																																																		(int) (z + -4))) == true) {
																																																																																																													{
																																																																																																														BlockPos _bp = new BlockPos(
																																																																																																																(int) (x + 9),
																																																																																																																(int) y,
																																																																																																																(int) (z + -4));
																																																																																																														BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																																.defaultBlockState();
																																																																																																														BlockState _bso = world
																																																																																																																.getBlockState(
																																																																																																																		_bp);
																																																																																																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																																.getValues()
																																																																																																																.entrySet()) {
																																																																																																															Property _property = _bs
																																																																																																																	.getBlock()
																																																																																																																	.getStateDefinition()
																																																																																																																	.getProperty(
																																																																																																																			entry.getKey()
																																																																																																																					.getName());
																																																																																																															if (_property != null
																																																																																																																	&& _bs.getValue(
																																																																																																																			_property) != null)
																																																																																																																try {
																																																																																																																	_bs = _bs
																																																																																																																			.setValue(
																																																																																																																					_property,
																																																																																																																					(Comparable) entry
																																																																																																																							.getValue());
																																																																																																																} catch (Exception e) {
																																																																																																																}
																																																																																																														}
																																																																																																														world.setBlock(
																																																																																																																_bp,
																																																																																																																_bs,
																																																																																																																3);
																																																																																																													}
																																																																																																												}
																																																																																																												new Object() {
																																																																																																													private int ticks = 0;
																																																																																																													private float waitTicks;
																																																																																																													private LevelAccessor world;

																																																																																																													public void start(
																																																																																																															LevelAccessor world,
																																																																																																															int waitTicks) {
																																																																																																														this.waitTicks = waitTicks;
																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																.register(
																																																																																																																		this);
																																																																																																														this.world = world;
																																																																																																													}

																																																																																																													@SubscribeEvent
																																																																																																													public void tick(
																																																																																																															TickEvent.ServerTickEvent event) {
																																																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																																																															this.ticks += 1;
																																																																																																															if (this.ticks >= this.waitTicks)
																																																																																																																run();
																																																																																																														}
																																																																																																													}

																																																																																																													private void run() {
																																																																																																														if (world
																																																																																																																.isEmptyBlock(
																																																																																																																		new BlockPos(
																																																																																																																				(int) (x + 10),
																																																																																																																				(int) y,
																																																																																																																				(int) (z + -3))) == true) {
																																																																																																															{
																																																																																																																BlockPos _bp = new BlockPos(
																																																																																																																		(int) (x + 10),
																																																																																																																		(int) y,
																																																																																																																		(int) (z + -3));
																																																																																																																BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																																		.defaultBlockState();
																																																																																																																BlockState _bso = world
																																																																																																																		.getBlockState(
																																																																																																																				_bp);
																																																																																																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																																		.getValues()
																																																																																																																		.entrySet()) {
																																																																																																																	Property _property = _bs
																																																																																																																			.getBlock()
																																																																																																																			.getStateDefinition()
																																																																																																																			.getProperty(
																																																																																																																					entry.getKey()
																																																																																																																							.getName());
																																																																																																																	if (_property != null
																																																																																																																			&& _bs.getValue(
																																																																																																																					_property) != null)
																																																																																																																		try {
																																																																																																																			_bs = _bs
																																																																																																																					.setValue(
																																																																																																																							_property,
																																																																																																																							(Comparable) entry
																																																																																																																									.getValue());
																																																																																																																		} catch (Exception e) {
																																																																																																																		}
																																																																																																																}
																																																																																																																world.setBlock(
																																																																																																																		_bp,
																																																																																																																		_bs,
																																																																																																																		3);
																																																																																																															}
																																																																																																														}
																																																																																																														new Object() {
																																																																																																															private int ticks = 0;
																																																																																																															private float waitTicks;
																																																																																																															private LevelAccessor world;

																																																																																																															public void start(
																																																																																																																	LevelAccessor world,
																																																																																																																	int waitTicks) {
																																																																																																																this.waitTicks = waitTicks;
																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																		.register(
																																																																																																																				this);
																																																																																																																this.world = world;
																																																																																																															}

																																																																																																															@SubscribeEvent
																																																																																																															public void tick(
																																																																																																																	TickEvent.ServerTickEvent event) {
																																																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																																																	this.ticks += 1;
																																																																																																																	if (this.ticks >= this.waitTicks)
																																																																																																																		run();
																																																																																																																}
																																																																																																															}

																																																																																																															private void run() {
																																																																																																																if (world
																																																																																																																		.isEmptyBlock(
																																																																																																																				new BlockPos(
																																																																																																																						(int) (x + 10),
																																																																																																																						(int) y,
																																																																																																																						(int) (z + -2))) == true) {
																																																																																																																	{
																																																																																																																		BlockPos _bp = new BlockPos(
																																																																																																																				(int) (x + 10),
																																																																																																																				(int) y,
																																																																																																																				(int) (z + -2));
																																																																																																																		BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																																				.defaultBlockState();
																																																																																																																		BlockState _bso = world
																																																																																																																				.getBlockState(
																																																																																																																						_bp);
																																																																																																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																																				.getValues()
																																																																																																																				.entrySet()) {
																																																																																																																			Property _property = _bs
																																																																																																																					.getBlock()
																																																																																																																					.getStateDefinition()
																																																																																																																					.getProperty(
																																																																																																																							entry.getKey()
																																																																																																																									.getName());
																																																																																																																			if (_property != null
																																																																																																																					&& _bs.getValue(
																																																																																																																							_property) != null)
																																																																																																																				try {
																																																																																																																					_bs = _bs
																																																																																																																							.setValue(
																																																																																																																									_property,
																																																																																																																									(Comparable) entry
																																																																																																																											.getValue());
																																																																																																																				} catch (Exception e) {
																																																																																																																				}
																																																																																																																		}
																																																																																																																		world.setBlock(
																																																																																																																				_bp,
																																																																																																																				_bs,
																																																																																																																				3);
																																																																																																																	}
																																																																																																																}
																																																																																																																new Object() {
																																																																																																																	private int ticks = 0;
																																																																																																																	private float waitTicks;
																																																																																																																	private LevelAccessor world;

																																																																																																																	public void start(
																																																																																																																			LevelAccessor world,
																																																																																																																			int waitTicks) {
																																																																																																																		this.waitTicks = waitTicks;
																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																				.register(
																																																																																																																						this);
																																																																																																																		this.world = world;
																																																																																																																	}

																																																																																																																	@SubscribeEvent
																																																																																																																	public void tick(
																																																																																																																			TickEvent.ServerTickEvent event) {
																																																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																																																			this.ticks += 1;
																																																																																																																			if (this.ticks >= this.waitTicks)
																																																																																																																				run();
																																																																																																																		}
																																																																																																																	}

																																																																																																																	private void run() {
																																																																																																																		if (world
																																																																																																																				.isEmptyBlock(
																																																																																																																						new BlockPos(
																																																																																																																								(int) (x + 10),
																																																																																																																								(int) y,
																																																																																																																								(int) (z + -1))) == true) {
																																																																																																																			{
																																																																																																																				BlockPos _bp = new BlockPos(
																																																																																																																						(int) (x + 10),
																																																																																																																						(int) y,
																																																																																																																						(int) (z + -1));
																																																																																																																				BlockState _bs = TheLegendeOfLumaModBlocks.FIRE_BLOCK
																																																																																																																						.defaultBlockState();
																																																																																																																				BlockState _bso = world
																																																																																																																						.getBlockState(
																																																																																																																								_bp);
																																																																																																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																																																																																						.getValues()
																																																																																																																						.entrySet()) {
																																																																																																																					Property _property = _bs
																																																																																																																							.getBlock()
																																																																																																																							.getStateDefinition()
																																																																																																																							.getProperty(
																																																																																																																									entry.getKey()
																																																																																																																											.getName());
																																																																																																																					if (_property != null
																																																																																																																							&& _bs.getValue(
																																																																																																																									_property) != null)
																																																																																																																						try {
																																																																																																																							_bs = _bs
																																																																																																																									.setValue(
																																																																																																																											_property,
																																																																																																																											(Comparable) entry
																																																																																																																													.getValue());
																																																																																																																						} catch (Exception e) {
																																																																																																																						}
																																																																																																																				}
																																																																																																																				world.setBlock(
																																																																																																																						_bp,
																																																																																																																						_bs,
																																																																																																																						3);
																																																																																																																			}
																																																																																																																		}
																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																				.unregister(
																																																																																																																						this);
																																																																																																																	}
																																																																																																																}.start(world,
																																																																																																																		1);
																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																		.unregister(
																																																																																																																				this);
																																																																																																															}
																																																																																																														}.start(world,
																																																																																																																1);
																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																.unregister(
																																																																																																																		this);
																																																																																																													}
																																																																																																												}.start(world,
																																																																																																														1);
																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																														.unregister(
																																																																																																																this);
																																																																																																											}
																																																																																																										}.start(world,
																																																																																																												1);
																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																												.unregister(
																																																																																																														this);
																																																																																																									}
																																																																																																								}.start(world,
																																																																																																										1);
																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																										.unregister(
																																																																																																												this);
																																																																																																							}
																																																																																																						}.start(world,
																																																																																																								1);
																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																								.unregister(
																																																																																																										this);
																																																																																																					}
																																																																																																				}.start(world,
																																																																																																						1);
																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																						.unregister(
																																																																																																								this);
																																																																																																			}
																																																																																																		}.start(world,
																																																																																																				1);
																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																				.unregister(
																																																																																																						this);
																																																																																																	}
																																																																																																}.start(world,
																																																																																																		1);
																																																																																																MinecraftForge.EVENT_BUS
																																																																																																		.unregister(
																																																																																																				this);
																																																																																															}
																																																																																														}.start(world,
																																																																																																1);
																																																																																														MinecraftForge.EVENT_BUS
																																																																																																.unregister(
																																																																																																		this);
																																																																																													}
																																																																																												}.start(world,
																																																																																														1);
																																																																																												MinecraftForge.EVENT_BUS
																																																																																														.unregister(
																																																																																																this);
																																																																																											}
																																																																																										}.start(world,
																																																																																												1);
																																																																																										MinecraftForge.EVENT_BUS
																																																																																												.unregister(
																																																																																														this);
																																																																																									}
																																																																																								}.start(world,
																																																																																										1);
																																																																																								MinecraftForge.EVENT_BUS
																																																																																										.unregister(
																																																																																												this);
																																																																																							}
																																																																																						}.start(world,
																																																																																								1);
																																																																																						MinecraftForge.EVENT_BUS
																																																																																								.unregister(
																																																																																										this);
																																																																																					}
																																																																																				}.start(world,
																																																																																						1);
																																																																																				MinecraftForge.EVENT_BUS
																																																																																						.unregister(
																																																																																								this);
																																																																																			}
																																																																																		}.start(world,
																																																																																				1);
																																																																																		MinecraftForge.EVENT_BUS
																																																																																				.unregister(
																																																																																						this);
																																																																																	}
																																																																																}.start(world,
																																																																																		1);
																																																																																MinecraftForge.EVENT_BUS
																																																																																		.unregister(
																																																																																				this);
																																																																															}
																																																																														}.start(world,
																																																																																1);
																																																																														MinecraftForge.EVENT_BUS
																																																																																.unregister(
																																																																																		this);
																																																																													}
																																																																												}.start(world,
																																																																														1);
																																																																												MinecraftForge.EVENT_BUS
																																																																														.unregister(
																																																																																this);
																																																																											}
																																																																										}.start(world,
																																																																												1);
																																																																										MinecraftForge.EVENT_BUS
																																																																												.unregister(
																																																																														this);
																																																																									}
																																																																								}.start(world,
																																																																										1);
																																																																								MinecraftForge.EVENT_BUS
																																																																										.unregister(
																																																																												this);
																																																																							}
																																																																						}.start(world,
																																																																								1);
																																																																						MinecraftForge.EVENT_BUS
																																																																								.unregister(
																																																																										this);
																																																																					}
																																																																				}.start(world,
																																																																						1);
																																																																				MinecraftForge.EVENT_BUS
																																																																						.unregister(
																																																																								this);
																																																																			}
																																																																		}.start(world,
																																																																				1);
																																																																		MinecraftForge.EVENT_BUS
																																																																				.unregister(
																																																																						this);
																																																																	}
																																																																}.start(world,
																																																																		1);
																																																																MinecraftForge.EVENT_BUS
																																																																		.unregister(
																																																																				this);
																																																															}
																																																														}.start(world,
																																																																1);
																																																														MinecraftForge.EVENT_BUS
																																																																.unregister(
																																																																		this);
																																																													}
																																																												}.start(world,
																																																														1);
																																																												MinecraftForge.EVENT_BUS
																																																														.unregister(
																																																																this);
																																																											}
																																																										}.start(world,
																																																												1);
																																																										MinecraftForge.EVENT_BUS
																																																												.unregister(
																																																														this);
																																																									}
																																																								}.start(world,
																																																										1);
																																																								MinecraftForge.EVENT_BUS
																																																										.unregister(
																																																												this);
																																																							}
																																																						}.start(world,
																																																								1);
																																																						MinecraftForge.EVENT_BUS
																																																								.unregister(
																																																										this);
																																																					}
																																																				}.start(world,
																																																						1);
																																																				MinecraftForge.EVENT_BUS
																																																						.unregister(
																																																								this);
																																																			}
																																																		}.start(world,
																																																				1);
																																																		MinecraftForge.EVENT_BUS
																																																				.unregister(
																																																						this);
																																																	}
																																																}.start(world,
																																																		1);
																																																MinecraftForge.EVENT_BUS
																																																		.unregister(
																																																				this);
																																															}
																																														}.start(world,
																																																1);
																																														MinecraftForge.EVENT_BUS
																																																.unregister(
																																																		this);
																																													}
																																												}.start(world,
																																														1);
																																												MinecraftForge.EVENT_BUS
																																														.unregister(
																																																this);
																																											}
																																										}.start(world,
																																												1);
																																										MinecraftForge.EVENT_BUS
																																												.unregister(
																																														this);
																																									}
																																								}.start(world,
																																										1);
																																								MinecraftForge.EVENT_BUS
																																										.unregister(
																																												this);
																																							}
																																						}.start(world,
																																								1);
																																						MinecraftForge.EVENT_BUS
																																								.unregister(
																																										this);
																																					}
																																				}.start(world,
																																						1);
																																				MinecraftForge.EVENT_BUS
																																						.unregister(
																																								this);
																																			}
																																		}.start(world,
																																				1);
																																		MinecraftForge.EVENT_BUS
																																				.unregister(
																																						this);
																																	}
																																}.start(world, 1);
																																MinecraftForge.EVENT_BUS
																																		.unregister(
																																				this);
																															}
																														}.start(world, 1);
																														MinecraftForge.EVENT_BUS
																																.unregister(this);
																													}
																												}.start(world, 1);
																												MinecraftForge.EVENT_BUS
																														.unregister(this);
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
	}
}
