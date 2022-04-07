
package net.mcreator.the_legende_of_luma.block;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class LilumStage3Block extends DoublePlantBlock {
	public LilumStage3Block() {
		super(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.CLAY).randomTicks().noCollission().sound(SoundType.GRASS).instabreak());
		setRegistryName("lilum_stage_3");
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public BlockBehaviour.OffsetType getOffsetType() {
		return BlockBehaviour.OffsetType.NONE;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public ItemStack getPickBlock(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(TheLegendeOfLumaModItems.LILIUMSEEDS);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CROP;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheLegendeOfLumaModBlocks.LILUM_STAGE_3, renderType -> renderType == RenderType.cutout());
	}
}
