
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.the_legende_of_luma.procedures.BlueBerriesRightClickedOnBlockProcedure;

public class BlueBerriesItem extends Item {
	public BlueBerriesItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.6f)

						.build()));
		setRegistryName("blue_berries");
	}

	@Override
	public InteractionResult onItemUseFirst(ItemStack itemstack, UseOnContext context) {
		BlueBerriesRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.PASS;
	}
}
