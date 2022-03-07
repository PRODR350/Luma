
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;

public class PowderLumaChardItemItem extends Item {
	public PowderLumaChardItemItem() {
		super(new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("powder_luma_chard_item");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
