package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;

public class LumazaleaplantMobplayerCollidesWithPlantProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsDomage == true
				&& TheLegendeOfLumaModVariables.MapVariables.get(world).IsFalls == true) {
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsDomage == true) {
				entity.setDeltaMovement(0, (entity.getDeltaMovement().y() + 0.025), 0);
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 4));
				TheLegendeOfLumaModVariables.MapVariables.get(world).IsFalls = false;
				TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
				TheLegendeOfLumaModVariables.MapVariables.get(world).IsDomage = false;
				TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
