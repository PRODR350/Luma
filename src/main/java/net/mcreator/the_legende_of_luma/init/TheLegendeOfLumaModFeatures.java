
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.the_legende_of_luma.world.features.plants.LumazaleaplantFeature;
import net.mcreator.the_legende_of_luma.world.features.plants.LilumplantFeature;
import net.mcreator.the_legende_of_luma.world.features.plants.FourLeafCloverPlantFeature;
import net.mcreator.the_legende_of_luma.world.features.plants.FlowinglumazaleaPlantFeature;
import net.mcreator.the_legende_of_luma.world.features.plants.CloverPlanteFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.LumastoneFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.LumaniteFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.LumamossFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.LumamossCarpetFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.LumaRedMushroomLogFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.LumaBrowMushroomLogFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.FlowingLumazaleaLeaveFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.ExpOreFeature;
import net.mcreator.the_legende_of_luma.world.features.ores.BlueBerriesStage1Feature;
import net.mcreator.the_legende_of_luma.world.features.ores.BlueBerriesStage0Feature;
import net.mcreator.the_legende_of_luma.world.features.LumaTowerFeature;
import net.mcreator.the_legende_of_luma.world.features.LumaStructtempleVideFeature;
import net.mcreator.the_legende_of_luma.world.features.LumaDungeonEnterFeature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorMossPathFeature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorLumamossycobblestone3Feature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorLumamossycobblestone2Feature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorLumamossycobblestone1Feature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorLumaleavePathFeature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorLitelMontaineFeature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorFallLog2Feature;
import net.mcreator.the_legende_of_luma.world.features.LumaDecorFallLog1Feature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLegendeOfLumaModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(LumaniteFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LumaniteFeature.GENERATE_BIOMES,
				LumaniteFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumastoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LumastoneFeature.GENERATE_BIOMES,
				LumastoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumamossFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LumamossFeature.GENERATE_BIOMES,
				LumamossFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumamossCarpetFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				LumamossCarpetFeature.GENERATE_BIOMES, LumamossCarpetFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorLitelMontaineFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorLitelMontaineFeature.GENERATE_BIOMES, LumaDecorLitelMontaineFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorMossPathFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorMossPathFeature.GENERATE_BIOMES, LumaDecorMossPathFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorFallLog1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorFallLog1Feature.GENERATE_BIOMES, LumaDecorFallLog1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorFallLog2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorFallLog2Feature.GENERATE_BIOMES, LumaDecorFallLog2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorLumamossycobblestone1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorLumamossycobblestone1Feature.GENERATE_BIOMES, LumaDecorLumamossycobblestone1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorLumamossycobblestone2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorLumamossycobblestone2Feature.GENERATE_BIOMES, LumaDecorLumamossycobblestone2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorLumamossycobblestone3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorLumamossycobblestone3Feature.GENERATE_BIOMES, LumaDecorLumamossycobblestone3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDecorLumaleavePathFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDecorLumaleavePathFeature.GENERATE_BIOMES, LumaDecorLumaleavePathFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaStructtempleVideFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaStructtempleVideFeature.GENERATE_BIOMES, LumaStructtempleVideFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaDungeonEnterFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LumaDungeonEnterFeature.GENERATE_BIOMES, LumaDungeonEnterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LilumplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				LilumplantFeature.GENERATE_BIOMES, LilumplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumazaleaplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				LumazaleaplantFeature.GENERATE_BIOMES, LumazaleaplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FlowinglumazaleaPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				FlowinglumazaleaPlantFeature.GENERATE_BIOMES, FlowinglumazaleaPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaTowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LumaTowerFeature.GENERATE_BIOMES,
				LumaTowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueBerriesStage0Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BlueBerriesStage0Feature.GENERATE_BIOMES, BlueBerriesStage0Feature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueBerriesStage1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BlueBerriesStage1Feature.GENERATE_BIOMES, BlueBerriesStage1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(ExpOreFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ExpOreFeature.GENERATE_BIOMES, ExpOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CloverPlanteFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				CloverPlanteFeature.GENERATE_BIOMES, CloverPlanteFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FlowingLumazaleaLeaveFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				FlowingLumazaleaLeaveFeature.GENERATE_BIOMES, FlowingLumazaleaLeaveFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FourLeafCloverPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				FourLeafCloverPlantFeature.GENERATE_BIOMES, FourLeafCloverPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaBrowMushroomLogFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				LumaBrowMushroomLogFeature.GENERATE_BIOMES, LumaBrowMushroomLogFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumaRedMushroomLogFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				LumaRedMushroomLogFeature.GENERATE_BIOMES, LumaRedMushroomLogFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
