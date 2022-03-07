package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class ClockBlockPoweredUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.CLOCK_BLOCK.defaultBlockState(), 3);
	}
}
