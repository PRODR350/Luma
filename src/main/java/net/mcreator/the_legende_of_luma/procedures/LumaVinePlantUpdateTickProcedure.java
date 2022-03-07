package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class LumaVinePlantUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z)) == true) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
						_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		} else if (world.isEmptyBlock(new BlockPos((int) x, (int) (y - 1), (int) z)) == true) {
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), TheLegendeOfLumaModBlocks.LUMA_VINE_PLANT.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 2), (int) z), TheLegendeOfLumaModBlocks.LUMA_VINE_TOP.defaultBlockState(), 3);
		}
	}
}
