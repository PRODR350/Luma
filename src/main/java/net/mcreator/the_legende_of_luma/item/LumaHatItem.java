
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class LumaHatItem extends Item {
	public LumaHatItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("luma_hat");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
