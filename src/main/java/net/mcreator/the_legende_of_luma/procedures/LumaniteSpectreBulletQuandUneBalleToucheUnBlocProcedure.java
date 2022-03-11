package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;

public class LumaniteSpectreBulletQuandUneBalleToucheUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.7) {
			LumaBossAttack2Procedure.execute(world, x, y, z);
		} else {
			LumaBossAttackProcedure.execute(world, x, y, z);
		}
		if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
