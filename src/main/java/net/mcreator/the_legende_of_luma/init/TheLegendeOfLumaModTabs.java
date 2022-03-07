
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheLegendeOfLumaModTabs {
	public static CreativeModeTab TAB_MOD_30_BLOCK;

	public static void load() {
		TAB_MOD_30_BLOCK = new CreativeModeTab("tabmod_30_block") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TheLegendeOfLumaModItems.LUMANIT_CRISTAL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
