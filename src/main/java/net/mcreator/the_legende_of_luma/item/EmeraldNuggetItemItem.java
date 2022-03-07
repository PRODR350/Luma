
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;

public class EmeraldNuggetItemItem extends Item {
	public EmeraldNuggetItemItem() {
		super(new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("emerald_nugget_item");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
