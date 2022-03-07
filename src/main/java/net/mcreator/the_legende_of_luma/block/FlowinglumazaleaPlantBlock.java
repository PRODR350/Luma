
package net.mcreator.the_legende_of_luma.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.the_legende_of_luma.procedures.LumazaleaplantMobplayerCollidesWithPlantProcedure;
import net.mcreator.the_legende_of_luma.procedures.FlowingLumazaleaplantPlantRightClickedProcedure;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

import java.util.List;
import java.util.Collections;

public class FlowinglumazaleaPlantBlock extends FlowerBlock {
	public FlowinglumazaleaPlantBlock() {
		super(MobEffects.SATURATION, 0, BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS).strength(0.3f, 0.5f));
		setRegistryName("flowinglumazalea_plant");
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return box(0, 0, 0, 16, 16, 16);
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
		return useContext.getItemInHand().getItem() != this.asItem();
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
		return new ItemStack(TheLegendeOfLumaModItems.FLOWING_LUMAZALEA_ITEM);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheLegendeOfLumaModItems.FLOWING_LUMAZALEA_ITEM));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(TheLegendeOfLumaModBlocks.LUMAMOSS) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT)
				|| groundState.is(Blocks.COARSE_DIRT) || groundState.is(Blocks.PODZOL)

		;
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LumazaleaplantMobplayerCollidesWithPlantProcedure.execute(world, entity);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		FlowingLumazaleaplantPlantRightClickedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return InteractionResult.SUCCESS;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheLegendeOfLumaModBlocks.FLOWINGLUMAZALEA_PLANT, renderType -> renderType == RenderType.cutout());
	}
}
