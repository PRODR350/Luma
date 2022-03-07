package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;

public class HangGliderRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == TheLegendeOfLumaModItems.HANG_GLIDER_USED) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 0.23), (int) z))).getBlock() == Blocks.AIR) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.SLOW_FALLING);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.LEVITATION);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
									new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"stopsound @p minecraft:item.elytra.flying");
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(TheLegendeOfLumaModItems.HANG_GLIDER);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.SLOW_FALLING);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.LEVITATION);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
									new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"stopsound @p minecraft:item.elytra.flying");
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
