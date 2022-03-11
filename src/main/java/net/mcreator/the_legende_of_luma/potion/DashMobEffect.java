
package net.mcreator.the_legende_of_luma.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.the_legende_of_luma.procedures.DashEffectTickProcedure;

public class DashMobEffect extends MobEffect {
	public DashMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		setRegistryName("dash");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_legende_of_luma.dash";
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

		DashEffectTickProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
