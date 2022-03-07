package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerFallProcedure {
	@SubscribeEvent
	public static void onEntityFall(LivingFallEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity.level, entity);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsFalls == false) {
				TheLegendeOfLumaModVariables.MapVariables.get(world).IsFalls = true;
				TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
