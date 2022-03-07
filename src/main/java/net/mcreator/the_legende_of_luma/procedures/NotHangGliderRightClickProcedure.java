package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;

public class NotHangGliderRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == TheLegendeOfLumaModItems.HANG_GLIDER) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 0.23), (int) z))).getBlock() == Blocks.AIR) {
				entity.setDeltaMovement((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.37), (entity.getDeltaMovement().z()));
				TheLegendeOfLumaModVariables.MapVariables.get(world).GalderIsUsed = TheLegendeOfLumaModVariables.MapVariables.get(world).GalderIsUsed
						- 1;
				TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
				(itemstack).setDamageValue((int) TheLegendeOfLumaModVariables.MapVariables.get(world).GalderIsUsed);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(TheLegendeOfLumaModItems.HANG_GLIDER_USED);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
			} else {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(TheLegendeOfLumaModItems.HANG_GLIDER);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
			}
		}
	}
}
