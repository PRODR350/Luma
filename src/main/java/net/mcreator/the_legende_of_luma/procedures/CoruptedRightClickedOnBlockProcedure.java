package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;
import net.minecraft.Util;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModEntities;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;
import net.mcreator.the_legende_of_luma.entity.LumaBossEntity;

public class CoruptedRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMANIT_LAMP
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getBlock() == TheLegendeOfLumaModBlocks.CHISELED_LUMASTONE_BRICK
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMAMOSS_CARPET
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMABRICK
				&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMABRICK
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMABRICK
						|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == TheLegendeOfLumaModBlocks.LUMABRICK
								&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
										.getBlock() == TheLegendeOfLumaModBlocks.LUMABRICK)) {
			if (!world.isClientSide()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().broadcastMessage(new TextComponent("Message"), ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "fill ~-1 ~-1 ~-1 ~1 ~2 ~1 air");
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LumaBossEntity(TheLegendeOfLumaModEntities.LUMA_BOSS, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (entity instanceof Player && (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
					}
					return false;
				}
			}.checkGamemode(entity) || new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(TheLegendeOfLumaModItems.CORUPTED);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
