package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class LumamossRghtCklickProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		Player entity = event.getPlayer();
		if (event.getHand() != entity.getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double Count_Time = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
				if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE
								|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMASTONE)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"fill ~3 ~ ~-3 ~-3 ~ ~3 the_legende_of_luma:lumamoss replace the_legende_of_luma:lumastone");
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y + 2), z, 12, 3, 1, 3, 1);
				}
				if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS
								|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS)) {
					if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
								.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
								.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
								.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
								.getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.LUMAZALEAPLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT.defaultBlockState(), 3);
							}
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z),
										TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET.defaultBlockState(), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.GRASS.defaultBlockState(), 3);
							}
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y + 2), z, 12, 3, 1, 3, 1);
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
								if (entityiterator instanceof Player _player) {
									ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
											_player.inventoryMenu.getCraftSlots());
								}
							}
						}
					}
				}
			}
		}
	}
}
