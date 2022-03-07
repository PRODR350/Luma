package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ExperienceOrb;

public class LumaBossEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Y = 0;
		Y = 0;
		for (int index0 = 0; index0 < (int) (25); index0++) {
			Y = Y + 0.075;
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y + Y), z, 25));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y + Y), z, 25));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y + Y), z, 25));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y + Y), z, 25));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y + Y), z, 25));
		}
	}
}
