package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

public class ClockAddTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Tick = 0;
		Tick = Tick + 1;
		world.getBlockTicks().scheduleTick(new BlockPos((int) x, (int) y, (int) z),
				world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock(), (int) Tick);
		if (!world.isClientSide()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().broadcastMessage(new TextComponent((Tick + "tick")), ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
