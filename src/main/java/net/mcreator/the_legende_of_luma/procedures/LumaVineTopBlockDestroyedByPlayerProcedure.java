package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class LumaVineTopBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos((int) x, (int) (y - 1), (int) z),
					_level.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock());
	}
}
