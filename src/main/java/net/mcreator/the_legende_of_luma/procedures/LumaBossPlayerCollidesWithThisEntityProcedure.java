package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LumaBossPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.setDeltaMovement((sourceentity.getDeltaMovement().x() * (-1.8)), (sourceentity.getDeltaMovement().y() * 1.37),
				(sourceentity.getDeltaMovement().z() * (-1.8)));
		for (int index0 = 0; index0 < (int) (1); index0++) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_legende_of_luma:lumaboss_hurt")), SoundSource.HOSTILE, 1,
							1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_legende_of_luma:lumaboss_hurt")),
							SoundSource.HOSTILE, 1, 1, false);
				}
			}
		}
	}
}
