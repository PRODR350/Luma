package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class LiliumStag0PlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
						_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) x, (int) (y + 1), (int) z),
						_level.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock());
		}
	}
}
