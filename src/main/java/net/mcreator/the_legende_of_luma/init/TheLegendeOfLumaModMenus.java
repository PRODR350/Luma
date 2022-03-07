
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.the_legende_of_luma.world.inventory.QuickActionMenuMenu;
import net.mcreator.the_legende_of_luma.world.inventory.LumaWandUiMenu;
import net.mcreator.the_legende_of_luma.world.inventory.LumaSensorUIMenu;
import net.mcreator.the_legende_of_luma.world.inventory.LumaChestMeUiMenu;
import net.mcreator.the_legende_of_luma.world.inventory.IronFurnaceGuiMenu;
import net.mcreator.the_legende_of_luma.world.inventory.ClockUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLegendeOfLumaModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<IronFurnaceGuiMenu> IRON_FURNACE_GUI = register("iron_furnace_gui",
			(id, inv, extraData) -> new IronFurnaceGuiMenu(id, inv, extraData));
	public static final MenuType<QuickActionMenuMenu> QUICK_ACTION_MENU = register("quick_action_menu",
			(id, inv, extraData) -> new QuickActionMenuMenu(id, inv, extraData));
	public static final MenuType<LumaSensorUIMenu> LUMA_SENSOR_UI = register("luma_sensor_ui",
			(id, inv, extraData) -> new LumaSensorUIMenu(id, inv, extraData));
	public static final MenuType<LumaChestMeUiMenu> LUMA_CHEST_ME_UI = register("luma_chest_me_ui",
			(id, inv, extraData) -> new LumaChestMeUiMenu(id, inv, extraData));
	public static final MenuType<LumaWandUiMenu> LUMA_WAND_UI = register("luma_wand_ui",
			(id, inv, extraData) -> new LumaWandUiMenu(id, inv, extraData));
	public static final MenuType<ClockUIMenu> CLOCK_UI = register("clock_ui", (id, inv, extraData) -> new ClockUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
