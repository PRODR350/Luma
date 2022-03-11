package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class CloveritemRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.GRASS
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.DIRT) {
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), TheLegendeOfLumaModBlocks.CLOVER_PLANTE.defaultBlockState(), 3);
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(TheLegendeOfLumaModItems.CLOVERITEM);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
