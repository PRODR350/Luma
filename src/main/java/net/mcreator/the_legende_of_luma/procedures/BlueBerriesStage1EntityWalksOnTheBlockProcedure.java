package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;

public class BlueBerriesStage1EntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.SWEET_BERRY_BUSH, 1);
		if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsDomage == true) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_sweet_berry_bush")), SoundSource.NEUTRAL,
							1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_sweet_berry_bush")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
