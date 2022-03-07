package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class CloverPlanteUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z))
				&& world.getMaxLocalRawBrightness(new BlockPos((int) x, (int) y, (int) z)) >= 7
				&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.COARSE_DIRT
						|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.COARSE_DIRT
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.COARSE_DIRT
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.COARSE_DIRT)) {
			if (Math.random() < 0.7) {
				if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) y, (int) z))
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.COARSE_DIRT) {
					world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), TheLegendeOfLumaModBlocks.CLOVER_PLANTE.defaultBlockState(), 3);
				} else {
					if (Math.random() < 0.5 && world.isEmptyBlock(new BlockPos((int) (x - 1), (int) y, (int) z))
							&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.COARSE_DIRT) {
						world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), TheLegendeOfLumaModBlocks.CLOVER_PLANTE.defaultBlockState(), 3);
					} else {
						if (Math.random() < 0.5 && world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)))
								&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.COARSE_DIRT) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), TheLegendeOfLumaModBlocks.CLOVER_PLANTE.defaultBlockState(),
									3);
						} else if (world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)))
								&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.COARSE_DIRT) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), TheLegendeOfLumaModBlocks.CLOVER_PLANTE.defaultBlockState(),
									3);
						}
					}
				}
			} else if (Math.random() < 0.025) {
				if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) y, (int) z))
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.COARSE_DIRT) {
					world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z),
							TheLegendeOfLumaModBlocks.FOUR_LEAF_CLOVER_PLANT.defaultBlockState(), 3);
				} else {
					if (Math.random() < 0.025 && world.isEmptyBlock(new BlockPos((int) (x - 1), (int) y, (int) z))
							&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.COARSE_DIRT) {
						world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z),
								TheLegendeOfLumaModBlocks.FOUR_LEAF_CLOVER_PLANT.defaultBlockState(), 3);
					} else {
						if (Math.random() < 0.0257 && world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)))
								&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.COARSE_DIRT) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)),
									TheLegendeOfLumaModBlocks.FOUR_LEAF_CLOVER_PLANT.defaultBlockState(), 3);
						} else if (Math.random() < 0.025 && world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)))
								&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.COARSE_DIRT) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)),
									TheLegendeOfLumaModBlocks.FOUR_LEAF_CLOVER_PLANT.defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}
