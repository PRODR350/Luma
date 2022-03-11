package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModParticles;

public class LumaSpectreWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(TheLegendeOfLumaModParticles.LUMANITEPARTICLE, x, y, z, 2, 0, 0, 0, 0.1);
	}
}
