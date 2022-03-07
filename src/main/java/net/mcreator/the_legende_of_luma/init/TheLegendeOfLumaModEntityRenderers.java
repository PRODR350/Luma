
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.the_legende_of_luma.client.renderer.LumaGuardinRenderer;
import net.mcreator.the_legende_of_luma.client.renderer.LumaChickenRenderer;
import net.mcreator.the_legende_of_luma.client.renderer.LumaBossRenderer;
import net.mcreator.the_legende_of_luma.client.renderer.BosstestRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheLegendeOfLumaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.LUMA_SPECTRE, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.LUMA_GUARDIN, LumaGuardinRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.LUMA_CHICKEN, LumaChickenRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.LUMA_BOSS, LumaBossRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.IRON_SNOWBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.GOLDEN_SNOWBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.EMERALD_SNOWBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.DIAMOND_SNOWBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.NETHERITE_SNOWBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheLegendeOfLumaModEntities.BOSSTEST, BosstestRenderer::new);
	}
}
