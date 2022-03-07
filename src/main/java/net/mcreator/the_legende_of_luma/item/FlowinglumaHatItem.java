
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class FlowinglumaHatItem extends Item {
	public FlowinglumaHatItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("flowingluma_hat");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
