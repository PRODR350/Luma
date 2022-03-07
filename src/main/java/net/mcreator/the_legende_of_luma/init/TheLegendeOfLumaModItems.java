
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.the_legende_of_luma.item.WandItem;
import net.mcreator.the_legende_of_luma.item.UltraSaturationItem;
import net.mcreator.the_legende_of_luma.item.TheLumaItem;
import net.mcreator.the_legende_of_luma.item.RedstoneCoreItem;
import net.mcreator.the_legende_of_luma.item.PowderLumaChardItemItem;
import net.mcreator.the_legende_of_luma.item.NetheriteSnowballItem;
import net.mcreator.the_legende_of_luma.item.NetheriteNuggetItemItem;
import net.mcreator.the_legende_of_luma.item.NetheriteCoreItem;
import net.mcreator.the_legende_of_luma.item.LumazalehatArmorItem;
import net.mcreator.the_legende_of_luma.item.LumazaleaitemItem;
import net.mcreator.the_legende_of_luma.item.LumaniteSwordItem;
import net.mcreator.the_legende_of_luma.item.LumanitCristalItem;
import net.mcreator.the_legende_of_luma.item.LumaVinesItemItem;
import net.mcreator.the_legende_of_luma.item.LumaSpectreItem;
import net.mcreator.the_legende_of_luma.item.LumaHatItem;
import net.mcreator.the_legende_of_luma.item.LumaFlowingHatArmorItem;
import net.mcreator.the_legende_of_luma.item.LumaChardItemItem;
import net.mcreator.the_legende_of_luma.item.LumaBeatItem;
import net.mcreator.the_legende_of_luma.item.LiliumseedsItem;
import net.mcreator.the_legende_of_luma.item.LiliumfruitItem;
import net.mcreator.the_legende_of_luma.item.IronSnowballItem;
import net.mcreator.the_legende_of_luma.item.IronCoreItem;
import net.mcreator.the_legende_of_luma.item.HangGliderUsedItem;
import net.mcreator.the_legende_of_luma.item.HangGliderItem;
import net.mcreator.the_legende_of_luma.item.GoldenSnowballItem;
import net.mcreator.the_legende_of_luma.item.GoldCoreItem;
import net.mcreator.the_legende_of_luma.item.FourLeafCloverItemItem;
import net.mcreator.the_legende_of_luma.item.FlowinglumaHatItem;
import net.mcreator.the_legende_of_luma.item.FlowingLumazaleaItemItem;
import net.mcreator.the_legende_of_luma.item.EmeraldSnowballItem;
import net.mcreator.the_legende_of_luma.item.EmeraldNuggetItemItem;
import net.mcreator.the_legende_of_luma.item.EmeraldCoreItem;
import net.mcreator.the_legende_of_luma.item.DiamondSnowballItem;
import net.mcreator.the_legende_of_luma.item.DiamondNuggetItemItem;
import net.mcreator.the_legende_of_luma.item.DiamondCoreItem;
import net.mcreator.the_legende_of_luma.item.CoruptedItem;
import net.mcreator.the_legende_of_luma.item.CookedCarrotItem;
import net.mcreator.the_legende_of_luma.item.CoalPowderItemItem;
import net.mcreator.the_legende_of_luma.item.CloveritemItem;
import net.mcreator.the_legende_of_luma.item.BlueBerriesItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLegendeOfLumaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item LUMANITE = register(TheLegendeOfLumaModBlocks.LUMANITE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMASTONE = register(TheLegendeOfLumaModBlocks.LUMASTONE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMACOBBLESTONE = register(TheLegendeOfLumaModBlocks.LUMACOBBLESTONE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMASTONE_STAIRE = register(TheLegendeOfLumaModBlocks.LUMASTONE_STAIRE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMASTONE_SLAB = register(TheLegendeOfLumaModBlocks.LUMASTONE_SLAB, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMASTONE_WALLS = register(TheLegendeOfLumaModBlocks.LUMASTONE_WALLS, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMACOBLESTONE_STAIRE = register(TheLegendeOfLumaModBlocks.LUMACOBLESTONE_STAIRE,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMACOBLESTONE_SLAB = register(TheLegendeOfLumaModBlocks.LUMACOBLESTONE_SLAB, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMACOBLESTONE_WALLS = register(TheLegendeOfLumaModBlocks.LUMACOBLESTONE_WALLS,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMAMOSS = register(TheLegendeOfLumaModBlocks.LUMAMOSS, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item CHISELED_LUMASTONE_BRICK = register(TheLegendeOfLumaModBlocks.CHISELED_LUMASTONE_BRICK,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMASTONE_FENCE = register(TheLegendeOfLumaModBlocks.LUMASTONE_FENCE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMACOBBLESTONE_FENCE = register(TheLegendeOfLumaModBlocks.LUMACOBBLESTONE_FENCE,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMABRICK = register(TheLegendeOfLumaModBlocks.LUMABRICK, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMANIT_LAMP = register(TheLegendeOfLumaModBlocks.LUMANIT_LAMP, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMANITE_SWORD = register(new LumaniteSwordItem());
	public static final Item LUMAMOSS_CARPET = register(TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item IRON_FURNACE = register(TheLegendeOfLumaModBlocks.IRON_FURNACE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMANIT_CRISTAL = register(new LumanitCristalItem());
	public static final Item PROXIMITY_SENSOR = register(TheLegendeOfLumaModBlocks.PROXIMITY_SENSOR, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMABRICK_STAIR = register(TheLegendeOfLumaModBlocks.LUMABRICK_STAIR, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMABRICK_SLAB = register(TheLegendeOfLumaModBlocks.LUMABRICK_SLAB, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMABRICK_WALL = register(TheLegendeOfLumaModBlocks.LUMABRICK_WALL, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMABRICK_FENCE = register(TheLegendeOfLumaModBlocks.LUMABRICK_FENCE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMALOG = register(TheLegendeOfLumaModBlocks.LUMALOG, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMALEAVE = register(TheLegendeOfLumaModBlocks.LUMALEAVE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item SCULT_LUMASTONE_BRICK = register(TheLegendeOfLumaModBlocks.SCULT_LUMASTONE_BRICK,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item MOSSY_COBBLESTONE = register(TheLegendeOfLumaModBlocks.MOSSY_COBBLESTONE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMAPLANK = register(TheLegendeOfLumaModBlocks.LUMAPLANK, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMA_PLANK_STAIR = register(TheLegendeOfLumaModBlocks.LUMA_PLANK_STAIR, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMA_PLANK_SLAB = register(TheLegendeOfLumaModBlocks.LUMA_PLANK_SLAB, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMA_PLANK_FENCE = register(TheLegendeOfLumaModBlocks.LUMA_PLANK_FENCE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMA_PLANK_TRAP_DOOR = register(TheLegendeOfLumaModBlocks.LUMA_PLANK_TRAP_DOOR,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMA_PLANK_FENCEGATE = register(TheLegendeOfLumaModBlocks.LUMA_PLANK_FENCEGATE,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMA_PLANK_DOOR = register(TheLegendeOfLumaModBlocks.LUMA_PLANK_DOOR, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item THE_LUMA = register(new TheLumaItem());
	public static final Item LILUMPLANT = register(TheLegendeOfLumaModBlocks.LILUMPLANT, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMAZALEAPLANT = register(TheLegendeOfLumaModBlocks.LUMAZALEAPLANT, null);
	public static final Item FLOWINGLUMAZALEA_PLANT = register(TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT, null);
	public static final Item LUMAZALEAITEM = register(new LumazaleaitemItem());
	public static final Item LILIUMFRUIT = register(new LiliumfruitItem());
	public static final Item LILIUMSEEDS = register(new LiliumseedsItem());
	public static final Item HANG_GLIDER = register(new HangGliderItem());
	public static final Item COOKED_CARROT = register(new CookedCarrotItem());
	public static final Item BLUE_BERRIES = register(new BlueBerriesItem());
	public static final Item BLUE_BERRIES_STAGE_0 = register(TheLegendeOfLumaModBlocks.BLUE_BERRIES_STAGE_0, null);
	public static final Item BLUE_BERRIES_STAGE_1 = register(TheLegendeOfLumaModBlocks.BLUE_BERRIES_STAGE_1, null);
	public static final Item BLUE_BERRIES_STAGE_2 = register(TheLegendeOfLumaModBlocks.BLUE_BERRIES_STAGE_2, null);
	public static final Item BLUE_BERRIES_STAGE_3 = register(TheLegendeOfLumaModBlocks.BLUE_BERRIES_STAGE_3, null);
	public static final Item EXP_ORE = register(TheLegendeOfLumaModBlocks.EXP_ORE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item COAL_POWDER_ITEM = register(new CoalPowderItemItem());
	public static final Item EMERALD_NUGGET_ITEM = register(new EmeraldNuggetItemItem());
	public static final Item DIAMOND_NUGGET_ITEM = register(new DiamondNuggetItemItem());
	public static final Item NETHERITE_NUGGET_ITEM = register(new NetheriteNuggetItemItem());
	public static final Item LUMA_CHARD_ITEM = register(new LumaChardItemItem());
	public static final Item POWDER_LUMA_CHARD_ITEM = register(new PowderLumaChardItemItem());
	public static final Item VERTICAL_SCULT_LUMA_BRICK = register(TheLegendeOfLumaModBlocks.VERTICAL_SCULT_LUMA_BRICK,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item INVER_SCULT_LUMA_STONE = register(TheLegendeOfLumaModBlocks.INVER_SCULT_LUMA_STONE,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item SMOOTH_SCULT_LMA_STONE = register(TheLegendeOfLumaModBlocks.SMOOTH_SCULT_LMA_STONE,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item STANDE_BOLCK = register(TheLegendeOfLumaModBlocks.STANDE_BOLCK, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item GENERAT_DUNGEON_DIRECTION = register(TheLegendeOfLumaModBlocks.GENERAT_DUNGEON_DIRECTION,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item CLOVER_PLANTE = register(TheLegendeOfLumaModBlocks.CLOVER_PLANTE, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item LUMA_VINE_PLANT = register(TheLegendeOfLumaModBlocks.LUMA_VINE_PLANT, null);
	public static final Item LUMA_VINE_TOP = register(TheLegendeOfLumaModBlocks.LUMA_VINE_TOP, null);
	public static final Item LUMA_VINES_ITEM = register(new LumaVinesItemItem());
	public static final Item FLOWING_LUMAZALEA_ITEM = register(new FlowingLumazaleaItemItem());
	public static final Item FLOWING_LUMAZALEA_LEAVE = register(TheLegendeOfLumaModBlocks.FLOWING_LUMAZALEA_LEAVE,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item ULTRA_SATURATION = register(new UltraSaturationItem());
	public static final Item TEST = register(TheLegendeOfLumaModBlocks.TEST, null);
	public static final Item WAND = register(new WandItem());
	public static final Item LUMA_SPECTRE = register(new LumaSpectreItem());
	public static final Item LUMA_GUARDIN = register(new SpawnEggItem(TheLegendeOfLumaModEntities.LUMA_GUARDIN, -16764109, -16777165,
			new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK)).setRegistryName("luma_guardin_spawn_egg"));
	public static final Item LUMA_CHICKEN = register(new SpawnEggItem(TheLegendeOfLumaModEntities.LUMA_CHICKEN, -16777165, -16764109,
			new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK)).setRegistryName("luma_chicken_spawn_egg"));
	public static final Item LUMA_BOSS = register(new SpawnEggItem(TheLegendeOfLumaModEntities.LUMA_BOSS, -65485, -16764007,
			new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK)).setRegistryName("luma_boss_spawn_egg"));
	public static final Item TESTEE = register(TheLegendeOfLumaModBlocks.TESTEE, null);
	public static final Item LUMA_BEAT = register(new LumaBeatItem());
	public static final Item CLOVERITEM = register(new CloveritemItem());
	public static final Item FOUR_LEAF_CLOVER_ITEM = register(new FourLeafCloverItemItem());
	public static final Item FOUR_LEAF_CLOVER_PLANT = register(TheLegendeOfLumaModBlocks.FOUR_LEAF_CLOVER_PLANT,
			TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item CLOCK_BLOCK_POWERED = register(TheLegendeOfLumaModBlocks.CLOCK_BLOCK_POWERED, null);
	public static final Item CLOCK_BLOCK = register(TheLegendeOfLumaModBlocks.CLOCK_BLOCK, null);
	public static final Item IRON_CORE = register(new IronCoreItem());
	public static final Item GOLD_CORE = register(new GoldCoreItem());
	public static final Item EMERALD_CORE = register(new EmeraldCoreItem());
	public static final Item DIAMOND_CORE = register(new DiamondCoreItem());
	public static final Item REDSTONE_CORE = register(new RedstoneCoreItem());
	public static final Item NETHERITE_CORE = register(new NetheriteCoreItem());
	public static final Item CORUPTED = register(new CoruptedItem());
	public static final Item IRON_SNOWBALL = register(new IronSnowballItem());
	public static final Item GOLDEN_SNOWBALL = register(new GoldenSnowballItem());
	public static final Item EMERALD_SNOWBALL = register(new EmeraldSnowballItem());
	public static final Item DIAMOND_SNOWBALL = register(new DiamondSnowballItem());
	public static final Item NETHERITE_SNOWBALL = register(new NetheriteSnowballItem());
	public static final Item HANG_GLIDER_USED = register(new HangGliderUsedItem());
	public static final Item LUMA_BROW_MUSHROOM_LOG = register(TheLegendeOfLumaModBlocks.LUMA_BROW_MUSHROOM_LOG, null);
	public static final Item LUMA_RED_MUSHROOM_LOG = register(TheLegendeOfLumaModBlocks.LUMA_RED_MUSHROOM_LOG, null);
	public static final Item STRIPPED_LUMA_BLOCK = register(TheLegendeOfLumaModBlocks.STRIPPED_LUMA_BLOCK, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item STRIPPED_LUMA_BROWN_MUSHROOM_LOG = register(TheLegendeOfLumaModBlocks.STRIPPED_LUMA_BROWN_MUSHROOM_LOG, null);
	public static final Item STRIPPED_LUMA_RED_MUSHROOM_LOG = register(TheLegendeOfLumaModBlocks.STRIPPED_LUMA_RED_MUSHROOM_LOG, null);
	public static final Item LUMAZALEHAT_ARMOR_HELMET = register(new LumazalehatArmorItem.Helmet());
	public static final Item LUMA_FLOWING_HAT_ARMOR_HELMET = register(new LumaFlowingHatArmorItem.Helmet());
	public static final Item LUMA_HAT = register(new LumaHatItem());
	public static final Item FLOWINGLUMA_HAT = register(new FlowinglumaHatItem());
	public static final Item LILIUM_STAG_0 = register(TheLegendeOfLumaModBlocks.LILIUM_STAG_0, null);
	public static final Item LILIUM_STAGE_1 = register(TheLegendeOfLumaModBlocks.LILIUM_STAGE_1, null);
	public static final Item LILIUM_STAGE_2 = register(TheLegendeOfLumaModBlocks.LILIUM_STAGE_2, null);
	public static final Item LILIUM_STAGE_01 = register(TheLegendeOfLumaModBlocks.LILIUM_STAGE_01, null);
	public static final Item FIRE_BLOCK = register(TheLegendeOfLumaModBlocks.FIRE_BLOCK, TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK);
	public static final Item BOSSTEST = register(
			new SpawnEggItem(TheLegendeOfLumaModEntities.BOSSTEST, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("bosstest_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
