
package net.mcreator.the_legende_of_luma.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class LumaleaveBlock extends LeavesBlock {
	public LumaleaveBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).strength(0.2f, 1.5f).requiresCorrectToolForDrops().noOcclusion()
				.randomTicks());
		setRegistryName("lumaleave");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.PLANT;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}
}
