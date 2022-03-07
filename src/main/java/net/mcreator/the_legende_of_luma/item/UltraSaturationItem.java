
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class UltraSaturationItem extends Item {
	public UltraSaturationItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(500).saturationMod(503.40000000000003f).alwaysEat().meat().build()));
		setRegistryName("ultra_saturation");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 7;
	}
}
