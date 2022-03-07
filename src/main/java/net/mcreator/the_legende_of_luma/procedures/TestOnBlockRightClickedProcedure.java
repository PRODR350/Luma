package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;

public class TestOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TheLegendeOfLumaModVariables.MapVariables.get(world).ItemAdd = TheLegendeOfLumaModVariables.MapVariables.get(world).ItemAdd + 1;
		TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
		{
			ItemStack _setval = new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM);
			entity.getCapability(TheLegendeOfLumaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SaveItem = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
