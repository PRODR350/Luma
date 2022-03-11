package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModMobEffects;

public class LumaniteSpectreBulletQuandUneBalleToucheUnJoueurProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(TheLegendeOfLumaModMobEffects.STEP_BACK, 1, 1, (false), (false)));
	}
}
