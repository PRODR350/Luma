package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class LiliumseedsLorsDunClickDroitSurUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CAVE_AIR
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.AIR
								|| (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.VOID_AIR
								|| (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.CAVE_AIR))
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == TheLegendeOfLumaModItems.LILIUMSEEDS) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FARMLAND
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS) {
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), TheLegendeOfLumaModBlocks.LILUM_STAGE_1.defaultBlockState(), 3);
				if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(TheLegendeOfLumaModItems.LILIUMSEEDS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
