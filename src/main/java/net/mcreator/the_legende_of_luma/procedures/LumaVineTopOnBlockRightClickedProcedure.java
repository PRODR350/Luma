package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class LumaVineTopOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == TheLegendeOfLumaModItems.POWDER_LUMA_CHARD_ITEM) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.LUMA_VINE_PLANT.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), TheLegendeOfLumaModBlocks.LUMA_VINE_TOP.defaultBlockState(), 3);
		}
	}
}
