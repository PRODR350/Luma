package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
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
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(TheLegendeOfLumaModItems.CORUPTED);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
