
package net.mcreator.the_legende_of_luma.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModSounds;

public class TheLumaItem extends RecordItem {
	public TheLumaItem() {
		super(0, TheLegendeOfLumaModSounds.REGISTRY.get(new ResourceLocation("the_legende_of_luma:the_sound_of_luma")),
				new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("the_luma");
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
