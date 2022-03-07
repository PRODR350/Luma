
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.the_legende_of_luma.block.VerticalScultLumaBrickBlock;
import net.mcreator.the_legende_of_luma.block.TesteeBlock;
import net.mcreator.the_legende_of_luma.block.TestBlock;
import net.mcreator.the_legende_of_luma.block.StrippedLumaRedMushroomLogBlock;
import net.mcreator.the_legende_of_luma.block.StrippedLumaBrownMushroomLogBlock;
import net.mcreator.the_legende_of_luma.block.StrippedLumaBlockBlock;
import net.mcreator.the_legende_of_luma.block.StandeBolckBlock;
import net.mcreator.the_legende_of_luma.block.SmoothScultLmaStoneBlock;
import net.mcreator.the_legende_of_luma.block.ScultLumastoneBrickBlock;
import net.mcreator.the_legende_of_luma.block.ProximitySensorBlock;
import net.mcreator.the_legende_of_luma.block.MossyCobblestoneBlock;
import net.mcreator.the_legende_of_luma.block.LumazaleaplantBlock;
import net.mcreator.the_legende_of_luma.block.LumastoneWallsBlock;
import net.mcreator.the_legende_of_luma.block.LumastoneSlabBlock;
import net.mcreator.the_legende_of_luma.block.LumastoneSataireBlock;
import net.mcreator.the_legende_of_luma.block.LumastoneFenceBlock;
import net.mcreator.the_legende_of_luma.block.LumastoneBlock;
import net.mcreator.the_legende_of_luma.block.LumaplankBlock;
import net.mcreator.the_legende_of_luma.block.LumaniteBlock;
import net.mcreator.the_legende_of_luma.block.LumanitLampBlock;
import net.mcreator.the_legende_of_luma.block.LumamossCarpetBlock;
import net.mcreator.the_legende_of_luma.block.LumamossBlock;
import net.mcreator.the_legende_of_luma.block.LumalogBlock;
import net.mcreator.the_legende_of_luma.block.LumaleaveBlock;
import net.mcreator.the_legende_of_luma.block.LumacoblestoneWallsBlock;
import net.mcreator.the_legende_of_luma.block.LumacoblestoneStaireBlock;
import net.mcreator.the_legende_of_luma.block.LumacoblestoneSlabBlock;
import net.mcreator.the_legende_of_luma.block.LumacobblestoneFenceBlock;
import net.mcreator.the_legende_of_luma.block.LumacobblestoneBlock;
import net.mcreator.the_legende_of_luma.block.LumabrickWallBlock;
import net.mcreator.the_legende_of_luma.block.LumabrickStairBlock;
import net.mcreator.the_legende_of_luma.block.LumabrickSlabBlock;
import net.mcreator.the_legende_of_luma.block.LumabrickFenceBlock;
import net.mcreator.the_legende_of_luma.block.LumabrickBlock;
import net.mcreator.the_legende_of_luma.block.LumaVineTopBlock;
import net.mcreator.the_legende_of_luma.block.LumaVinePlantBlock;
import net.mcreator.the_legende_of_luma.block.LumaRedMushroomLogBlock;
import net.mcreator.the_legende_of_luma.block.LumaPlankTrapDoorBlock;
import net.mcreator.the_legende_of_luma.block.LumaPlankStairBlock;
import net.mcreator.the_legende_of_luma.block.LumaPlankSlabBlock;
import net.mcreator.the_legende_of_luma.block.LumaPlankFencegateBlock;
import net.mcreator.the_legende_of_luma.block.LumaPlankFenceBlock;
import net.mcreator.the_legende_of_luma.block.LumaPlankDoorBlock;
import net.mcreator.the_legende_of_luma.block.LumaBrowMushroomLogBlock;
import net.mcreator.the_legende_of_luma.block.LilumplantBlock;
import net.mcreator.the_legende_of_luma.block.LiliumStage2Block;
import net.mcreator.the_legende_of_luma.block.LiliumStage1Block;
import net.mcreator.the_legende_of_luma.block.LiliumStage01Block;
import net.mcreator.the_legende_of_luma.block.LiliumStag0Block;
import net.mcreator.the_legende_of_luma.block.IronFurnaceBlock;
import net.mcreator.the_legende_of_luma.block.InverScultLumaStoneBlock;
import net.mcreator.the_legende_of_luma.block.GeneratDungeonDirectionBlock;
import net.mcreator.the_legende_of_luma.block.FourLeafCloverPlantBlock;
import net.mcreator.the_legende_of_luma.block.FlowinglumazaleaPlantBlock;
import net.mcreator.the_legende_of_luma.block.FlowingLumazaleaLeaveBlock;
import net.mcreator.the_legende_of_luma.block.FireBlockBlock;
import net.mcreator.the_legende_of_luma.block.ExpOreBlock;
import net.mcreator.the_legende_of_luma.block.CloverPlanteBlock;
import net.mcreator.the_legende_of_luma.block.ClockBlockPoweredBlock;
import net.mcreator.the_legende_of_luma.block.ClockBlockBlock;
import net.mcreator.the_legende_of_luma.block.ChiseledLumastoneBrickBlock;
import net.mcreator.the_legende_of_luma.block.BlueBerriesStage3Block;
import net.mcreator.the_legende_of_luma.block.BlueBerriesStage2Block;
import net.mcreator.the_legende_of_luma.block.BlueBerriesStage1Block;
import net.mcreator.the_legende_of_luma.block.BlueBerriesStage0Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLegendeOfLumaModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block LUMANITE = register(new LumaniteBlock());
	public static final Block LUMASTONE = register(new LumastoneBlock());
	public static final Block LUMACOBBLESTONE = register(new LumacobblestoneBlock());
	public static final Block LUMASTONE_STAIRE = register(new LumastoneSataireBlock());
	public static final Block LUMASTONE_SLAB = register(new LumastoneSlabBlock());
	public static final Block LUMASTONE_WALLS = register(new LumastoneWallsBlock());
	public static final Block LUMACOBLESTONE_STAIRE = register(new LumacoblestoneStaireBlock());
	public static final Block LUMACOBLESTONE_SLAB = register(new LumacoblestoneSlabBlock());
	public static final Block LUMACOBLESTONE_WALLS = register(new LumacoblestoneWallsBlock());
	public static final Block LUMAMOSS = register(new LumamossBlock());
	public static final Block CHISELED_LUMASTONE_BRICK = register(new ChiseledLumastoneBrickBlock());
	public static final Block LUMASTONE_FENCE = register(new LumastoneFenceBlock());
	public static final Block LUMACOBBLESTONE_FENCE = register(new LumacobblestoneFenceBlock());
	public static final Block LUMABRICK = register(new LumabrickBlock());
	public static final Block LUMANIT_LAMP = register(new LumanitLampBlock());
	public static final Block LUMAMOSS_CARPET = register(new LumamossCarpetBlock());
	public static final Block IRON_FURNACE = register(new IronFurnaceBlock());
	public static final Block PROXIMITY_SENSOR = register(new ProximitySensorBlock());
	public static final Block LUMABRICK_STAIR = register(new LumabrickStairBlock());
	public static final Block LUMABRICK_SLAB = register(new LumabrickSlabBlock());
	public static final Block LUMABRICK_WALL = register(new LumabrickWallBlock());
	public static final Block LUMABRICK_FENCE = register(new LumabrickFenceBlock());
	public static final Block LUMALOG = register(new LumalogBlock());
	public static final Block LUMALEAVE = register(new LumaleaveBlock());
	public static final Block SCULT_LUMASTONE_BRICK = register(new ScultLumastoneBrickBlock());
	public static final Block MOSSY_COBBLESTONE = register(new MossyCobblestoneBlock());
	public static final Block LUMAPLANK = register(new LumaplankBlock());
	public static final Block LUMA_PLANK_STAIR = register(new LumaPlankStairBlock());
	public static final Block LUMA_PLANK_SLAB = register(new LumaPlankSlabBlock());
	public static final Block LUMA_PLANK_FENCE = register(new LumaPlankFenceBlock());
	public static final Block LUMA_PLANK_TRAP_DOOR = register(new LumaPlankTrapDoorBlock());
	public static final Block LUMA_PLANK_FENCEGATE = register(new LumaPlankFencegateBlock());
	public static final Block LUMA_PLANK_DOOR = register(new LumaPlankDoorBlock());
	public static final Block LILUMPLANT = register(new LilumplantBlock());
	public static final Block LUMAZALEAPLANT = register(new LumazaleaplantBlock());
	public static final Block FLOWINGLUMAZALEA_PLANT = register(new FlowinglumazaleaPlantBlock());
	public static final Block BLUE_BERRIES_STAGE_0 = register(new BlueBerriesStage0Block());
	public static final Block BLUE_BERRIES_STAGE_1 = register(new BlueBerriesStage1Block());
	public static final Block BLUE_BERRIES_STAGE_2 = register(new BlueBerriesStage2Block());
	public static final Block BLUE_BERRIES_STAGE_3 = register(new BlueBerriesStage3Block());
	public static final Block EXP_ORE = register(new ExpOreBlock());
	public static final Block VERTICAL_SCULT_LUMA_BRICK = register(new VerticalScultLumaBrickBlock());
	public static final Block INVER_SCULT_LUMA_STONE = register(new InverScultLumaStoneBlock());
	public static final Block SMOOTH_SCULT_LMA_STONE = register(new SmoothScultLmaStoneBlock());
	public static final Block STANDE_BOLCK = register(new StandeBolckBlock());
	public static final Block GENERAT_DUNGEON_DIRECTION = register(new GeneratDungeonDirectionBlock());
	public static final Block CLOVER_PLANTE = register(new CloverPlanteBlock());
	public static final Block LUMA_VINE_PLANT = register(new LumaVinePlantBlock());
	public static final Block LUMA_VINE_TOP = register(new LumaVineTopBlock());
	public static final Block FLOWING_LUMAZALEA_LEAVE = register(new FlowingLumazaleaLeaveBlock());
	public static final Block TEST = register(new TestBlock());
	public static final Block TESTEE = register(new TesteeBlock());
	public static final Block FOUR_LEAF_CLOVER_PLANT = register(new FourLeafCloverPlantBlock());
	public static final Block CLOCK_BLOCK_POWERED = register(new ClockBlockPoweredBlock());
	public static final Block CLOCK_BLOCK = register(new ClockBlockBlock());
	public static final Block LUMA_BROW_MUSHROOM_LOG = register(new LumaBrowMushroomLogBlock());
	public static final Block LUMA_RED_MUSHROOM_LOG = register(new LumaRedMushroomLogBlock());
	public static final Block STRIPPED_LUMA_BLOCK = register(new StrippedLumaBlockBlock());
	public static final Block STRIPPED_LUMA_BROWN_MUSHROOM_LOG = register(new StrippedLumaBrownMushroomLogBlock());
	public static final Block STRIPPED_LUMA_RED_MUSHROOM_LOG = register(new StrippedLumaRedMushroomLogBlock());
	public static final Block LILIUM_STAG_0 = register(new LiliumStag0Block());
	public static final Block LILIUM_STAGE_1 = register(new LiliumStage1Block());
	public static final Block LILIUM_STAGE_2 = register(new LiliumStage2Block());
	public static final Block LILIUM_STAGE_01 = register(new LiliumStage01Block());
	public static final Block FIRE_BLOCK = register(new FireBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			LumamossCarpetBlock.registerRenderLayer();
			ProximitySensorBlock.registerRenderLayer();
			LilumplantBlock.registerRenderLayer();
			LumazaleaplantBlock.registerRenderLayer();
			FlowinglumazaleaPlantBlock.registerRenderLayer();
			BlueBerriesStage0Block.registerRenderLayer();
			BlueBerriesStage1Block.registerRenderLayer();
			BlueBerriesStage2Block.registerRenderLayer();
			BlueBerriesStage3Block.registerRenderLayer();
			StandeBolckBlock.registerRenderLayer();
			CloverPlanteBlock.registerRenderLayer();
			LumaVinePlantBlock.registerRenderLayer();
			LumaVineTopBlock.registerRenderLayer();
			TesteeBlock.registerRenderLayer();
			FourLeafCloverPlantBlock.registerRenderLayer();
			LumaBrowMushroomLogBlock.registerRenderLayer();
			LumaRedMushroomLogBlock.registerRenderLayer();
			StrippedLumaBrownMushroomLogBlock.registerRenderLayer();
			StrippedLumaRedMushroomLogBlock.registerRenderLayer();
			LiliumStag0Block.registerRenderLayer();
			LiliumStage1Block.registerRenderLayer();
			LiliumStage2Block.registerRenderLayer();
			LiliumStage01Block.registerRenderLayer();
			FireBlockBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			CloverPlanteBlock.blockColorLoad(event);
			FourLeafCloverPlantBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			CloverPlanteBlock.itemColorLoad(event);
			FourLeafCloverPlantBlock.itemColorLoad(event);
		}
	}
}
