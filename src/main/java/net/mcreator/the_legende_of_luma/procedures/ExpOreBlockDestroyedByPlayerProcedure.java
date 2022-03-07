package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

public class ExpOreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player && (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 3));
			if (Math.random() < 0.7) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 6));
			}
			if (Math.random() < 0.6) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 9));
			}
			if (Math.random() < 0.5) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 12));
			}
			if (Math.random() < 0.4) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
			}
			if (Math.random() < 0.3) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 18));
			}
			if (Math.random() < 0.2) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 21));
			}
			if (Math.random() < 0.1) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 24));
			}
		}
	}
}
