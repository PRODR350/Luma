package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;

public class LumaFlowingHatArmorHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(3, new ItemStack(TheLegendeOfLumaModItems.FLOWINGLUMA_HAT));
			else
				_entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TheLegendeOfLumaModItems.FLOWINGLUMA_HAT));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
	}
}
