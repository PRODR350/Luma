package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

public class UseBoneMeelInLiliumProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LILUM_STAGE_1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y + 2), z, 12, 3, 1, 3, 1);
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"setblock ~ ~ ~ the_legende_of_luma:lilum_stage_2[half=lower]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"setblock ~ ~ ~ the_legende_of_luma:lilum_stage_2[half=upper]");
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LILUM_STAGE_2) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y + 2), z, 12, 3, 1, 3, 1);
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"setblock ~ ~ ~ the_legende_of_luma:lilum_stage_3[half=lower]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"setblock ~ ~ ~ the_legende_of_luma:lilum_stage_3[half=upper]");
		}
	}
}
