package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class LumazaleaConditionDeGenerationAdditionnelleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS)) {
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
