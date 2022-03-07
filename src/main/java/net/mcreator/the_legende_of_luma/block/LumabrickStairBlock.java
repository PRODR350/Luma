
package net.mcreator.the_legende_of_luma.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class LumabrickStairBlock extends StairBlock {
	public LumabrickStairBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.nether_bricks.break")),
						() -> new SoundEvent(new ResourceLocation("block.nether_bricks.step")),
						() -> new SoundEvent(new ResourceLocation("block.nether_bricks.place")),
						() -> new SoundEvent(new ResourceLocation("block.nether_bricks.hit")),
						() -> new SoundEvent(new ResourceLocation("block.nether_bricks.fall"))))
				.strength(1.9999999999999998f, 12f).requiresCorrectToolForDrops().dynamicShape()).defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE)
						.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.nether_bricks.break")),
								() -> new SoundEvent(new ResourceLocation("block.nether_bricks.step")),
								() -> new SoundEvent(new ResourceLocation("block.nether_bricks.place")),
								() -> new SoundEvent(new ResourceLocation("block.nether_bricks.hit")),
								() -> new SoundEvent(new ResourceLocation("block.nether_bricks.fall"))))
						.strength(1.9999999999999998f, 12f).requiresCorrectToolForDrops().dynamicShape());
		setRegistryName("lumabrick_stair");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.STONE;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}