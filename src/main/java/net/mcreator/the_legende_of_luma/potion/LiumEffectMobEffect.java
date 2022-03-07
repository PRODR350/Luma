
package net.mcreator.the_legende_of_luma.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.the_legende_of_luma.procedures.LiumpotionEnTickActifDeLaPotionProcedure;

public class LiumEffectMobEffect extends MobEffect {
	public LiumEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52);
		setRegistryName("lium_effect");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_legende_of_luma.lium_effect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LiumpotionEnTickActifDeLaPotionProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
