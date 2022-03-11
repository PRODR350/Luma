package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ClockAddTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Tick = 0;
		Tick = Tick + 1;
		world.getBlockTicks().scheduleTick(new BlockPos((int) x, (int) y, (int) z),
				world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock(), (int) Tick);
	}
}
