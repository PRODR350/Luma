package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class ClockBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double tick = 0;
		double ticktick = 0;
		if ((world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos((int) x, (int) y, (int) z)) : false) == true) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.CLOCK_BLOCK_POWERED.defaultBlockState(), 3);
		}
	}
}
