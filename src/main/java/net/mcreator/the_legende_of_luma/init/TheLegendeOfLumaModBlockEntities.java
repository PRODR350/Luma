
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.the_legende_of_luma.block.entity.LilumplantBlockEntity;
import net.mcreator.the_legende_of_luma.block.entity.IronFurnaceBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLegendeOfLumaModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> IRON_FURNACE = register("the_legende_of_luma:iron_furnace", TheLegendeOfLumaModBlocks.IRON_FURNACE,
			IronFurnaceBlockEntity::new);
	public static final BlockEntityType<?> LILUMPLANT = register("the_legende_of_luma:lilumplant", TheLegendeOfLumaModBlocks.LILUMPLANT,
			LilumplantBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
