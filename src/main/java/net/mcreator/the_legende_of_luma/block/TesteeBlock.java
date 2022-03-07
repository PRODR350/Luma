
package net.mcreator.the_legende_of_luma.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

import java.util.List;
import java.util.Collections;

public class TesteeBlock extends StoneButtonBlock {
	public TesteeBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("the_legende_of_luma:test")),
						() -> new SoundEvent(new ResourceLocation("the_legende_of_luma:test")),
						() -> new SoundEvent(new ResourceLocation("the_legende_of_luma:test")),
						() -> new SoundEvent(new ResourceLocation("the_legende_of_luma:test")),
						() -> new SoundEvent(new ResourceLocation("the_legende_of_luma:test"))))
				.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("testee");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheLegendeOfLumaModBlocks.TESTEE, renderType -> renderType == RenderType.cutout());
	}
}
