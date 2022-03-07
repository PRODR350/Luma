package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class BlueBerriesRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DIRT
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.COARSE_DIRT
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.PODZOL) {
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(TheLegendeOfLumaModItems.BLUE_BERRIES);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), TheLegendeOfLumaModBlocks.BLUE_BERRIES_STAGE_0.defaultBlockState(), 3);
		}
	}
}
