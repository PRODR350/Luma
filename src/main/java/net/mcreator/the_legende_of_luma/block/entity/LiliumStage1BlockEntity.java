package net.mcreator.the_legende_of_luma.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.network.Connection;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlockEntities;

public class LiliumStage1BlockEntity extends BlockEntity {
	public LiliumStage1BlockEntity(BlockPos pos, BlockState state) {
		super(TheLegendeOfLumaModBlockEntities.LILIUM_STAGE_1, pos, state);
	}

	@Override
	public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
		this.load(pkt.getTag());
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return new ClientboundBlockEntityDataPacket(this.worldPosition, 0, this.getUpdateTag());
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.save(new CompoundTag());
	}
}
