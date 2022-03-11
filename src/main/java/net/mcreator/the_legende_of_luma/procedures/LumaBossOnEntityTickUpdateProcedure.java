package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LumaBossOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
					if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 301) {
							if (Math.random() < 0.002) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:levitation 1 5 true");
							} else {
								if (Math.random() < 0.003) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
														new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:blindness 6 255 false");
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 201) {
							if (Math.random() < 0.002) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:levitation 1 6 true");
							} else {
								if (Math.random() < 0.004) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
														new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:blindness 6 255 false");
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 151) {
							if (Math.random() < 0.003) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:levitation 1 7 true");
							} else {
								if (Math.random() < 0.004) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
														new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:blindness 6 255 false");
								} else {
									if (Math.random() < 0.005) {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
															new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
													"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:slowness 5 1 false");
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 76) {
							if (Math.random() < 0.003) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:levitation 1 8 true");
							} else {
								if (Math.random() < 0.005) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
														new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:blindness 6 255 false");
								} else {
									if (Math.random() < 0.006) {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
															new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
													"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:slowness 5 1 false");
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 5) {
							if (Math.random() < 0.004) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:levitation 1 9 true");
							} else {
								if (Math.random() < 0.005) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
														new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:blindness 6 255 false");
								} else {
									if (Math.random() < 0.007) {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
															new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
													"execute as @e[type=minecraft:player,distance=..12] unless block ~ ~-1 ~ minecraft:air run effect give @s minecraft:slowness 5 1 false");
									}
								}
							}
						}
						if (Math.random() < 0.0075) {
							if (Math.random() < 0.6) {
								LumaBossAttackProcedure.execute(world, x, y, z);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_legende_of_luma:lumaboss_living")),
												SoundSource.HOSTILE, 1, 1);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_legende_of_luma:lumaboss_living")),
												SoundSource.HOSTILE, 1, 1, false);
									}
								}
							} else {
								LumaBossAttack2Procedure.execute(world, x, y, z);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_legende_of_luma:lumaboss_living")),
												SoundSource.HOSTILE, 1, 1);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_legende_of_luma:lumaboss_living")),
												SoundSource.HOSTILE, 1, 1, false);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
