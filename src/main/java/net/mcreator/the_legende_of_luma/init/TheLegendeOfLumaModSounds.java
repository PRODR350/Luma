
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLegendeOfLumaModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "luambrick_step"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "luambrick_step")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "lumabrick_break"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "lumabrick_break")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "additional_luma_sound"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "additional_luma_sound")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "ambient_wind"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "ambient_wind")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "test"), new SoundEvent(new ResourceLocation("the_legende_of_luma", "test")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "lumaboss_hurt"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "lumaboss_hurt")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "lumaboss_living"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "lumaboss_living")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "lumaboss_death"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "lumaboss_death")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "luma_sensor_activat"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "luma_sensor_activat")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "the_luma_beat"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "the_luma_beat")));
		REGISTRY.put(new ResourceLocation("the_legende_of_luma", "the_sound_of_luma"),
				new SoundEvent(new ResourceLocation("the_legende_of_luma", "the_sound_of_luma")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
