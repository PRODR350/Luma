package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;

public class LumanitGuardianItIsStruckByLightningProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(TheLegendeOfLumaModItems.LUMA_SPECTRE);
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
	}
}
