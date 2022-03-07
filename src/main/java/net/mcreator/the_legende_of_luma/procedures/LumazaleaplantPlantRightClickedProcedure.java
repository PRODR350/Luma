package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class LumazaleaplantPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			sx = -3;
			found = false;
			for (int index0 = 0; index0 < (int) (6); index0++) {
				sy = -3;
				for (int index1 = 0; index1 < (int) (6); index1++) {
					sz = -3;
					for (int index2 = 0; index2 < (int) (6); index2++) {
						if (world.isEmptyBlock(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("the_legende_of_luma", "lumazalea_tree_0"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
									new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("the_legende_of_luma", "lumazalea_tree_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
										new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("the_legende_of_luma", "lumazalea_tree_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos((int) (x - 3), (int) y, (int) (z - 4)),
											new BlockPos((int) (x - 3), (int) y, (int) (z - 4)),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("the_legende_of_luma", "lumazalea_tree_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
											new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
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
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
											.getGameMode() == GameType.ADVENTURE;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
