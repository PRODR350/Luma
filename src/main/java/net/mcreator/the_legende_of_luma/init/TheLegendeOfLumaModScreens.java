
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.the_legende_of_luma.client.gui.QuickActionMenuScreen;
import net.mcreator.the_legende_of_luma.client.gui.LumaWandUiScreen;
import net.mcreator.the_legende_of_luma.client.gui.LumaSensorUIScreen;
import net.mcreator.the_legende_of_luma.client.gui.LumaChestMeUiScreen;
import net.mcreator.the_legende_of_luma.client.gui.IronFurnaceGuiScreen;
import net.mcreator.the_legende_of_luma.client.gui.ClockUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheLegendeOfLumaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TheLegendeOfLumaModMenus.IRON_FURNACE_GUI, IronFurnaceGuiScreen::new);
			MenuScreens.register(TheLegendeOfLumaModMenus.QUICK_ACTION_MENU, QuickActionMenuScreen::new);
			MenuScreens.register(TheLegendeOfLumaModMenus.LUMA_SENSOR_UI, LumaSensorUIScreen::new);
			MenuScreens.register(TheLegendeOfLumaModMenus.LUMA_CHEST_ME_UI, LumaChestMeUiScreen::new);
			MenuScreens.register(TheLegendeOfLumaModMenus.LUMA_WAND_UI, LumaWandUiScreen::new);
			MenuScreens.register(TheLegendeOfLumaModMenus.CLOCK_UI, ClockUIScreen::new);
		});
	}
}
