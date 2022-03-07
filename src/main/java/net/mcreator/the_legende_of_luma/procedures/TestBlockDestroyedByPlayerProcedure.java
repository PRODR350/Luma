package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;

public class TestBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (TheLegendeOfLumaModVariables.MapVariables.get(world).ItemAdd); index0++) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
						((entity.getCapability(TheLegendeOfLumaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new TheLegendeOfLumaModVariables.PlayerVariables())).SaveItem));
				entityToSpawn.setPickUpDelay(5);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
