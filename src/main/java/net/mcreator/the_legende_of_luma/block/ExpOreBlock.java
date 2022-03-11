
package net.mcreator.the_legende_of_luma.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.procedures.ExpOreBlockDestroyedByPlayerProcedure;

public class ExpOreBlock extends Block {
	public ExpOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(4f).requiresCorrectToolForDrops());
		setRegistryName("exp_ore");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public boolean removedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.removedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		ExpOreBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
