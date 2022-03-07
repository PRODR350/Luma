
package net.mcreator.the_legende_of_luma.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.levelgen.placement.FrequencyWithExtraChanceDecoratorConfiguration;
import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoiseDependantDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.data.worldgen.Features;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.the_legende_of_luma.world.features.treedecorators.LumaTrunkDecorator;
import net.mcreator.the_legende_of_luma.world.features.treedecorators.LumaLeaveDecorator;
import net.mcreator.the_legende_of_luma.world.features.treedecorators.LumaFruitDecorator;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBiomes;
import net.mcreator.the_legende_of_luma.TheLegendeOfLumaMod;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableList;

public class LumaBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.configured(new SurfaceBuilderBaseConfiguration(Blocks.GRASS_BLOCK.defaultBlockState(),
					TheLegendeOfLumaModBlocks.LUMASTONE.defaultBlockState(), TheLegendeOfLumaModBlocks.LUMASTONE.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-11497548).waterFogColor(-12359773)
				.skyColor(7972607).foliageColorOverride(-15875673).grassColorOverride(-15875673)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("the_legende_of_luma:ambient_wind")))
				.ambientMoodSound(
						new AmbientMoodSettings(new SoundEvent(new ResourceLocation("the_legende_of_luma:additional_luma_sound")), 6000, 8, 2))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("the_legende_of_luma:the_sound_of_luma")), 12000, 24000, true))
				.build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.addStructureStart(StructureFeatures.STRONGHOLD);
		biomeGenerationSettings.addStructureStart(StructureFeatures.MINESHAFT);
		biomeGenerationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
		biomeGenerationSettings.addStructureStart(StructureFeatures.VILLAGE_PLAINS);
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("trees", Feature.TREE
				.configured((new TreeConfiguration.TreeConfigurationBuilder(
						new SimpleStateProvider(TheLegendeOfLumaModBlocks.LUMALOG.defaultBlockState()), new StraightTrunkPlacer(12, 2, 0),
						new SimpleStateProvider(TheLegendeOfLumaModBlocks.LUMALEAVE.defaultBlockState()),
						new SimpleStateProvider(Blocks.OAK_SAPLING.defaultBlockState()),
						new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
								.decorators(ImmutableList.of(LumaLeaveDecorator.INSTANCE, LumaTrunkDecorator.INSTANCE, LumaFruitDecorator.INSTANCE))
								.build())
				.decorated(Features.Decorators.HEIGHTMAP_SQUARE)
				.decorated(FeatureDecorator.COUNT_EXTRA.configured(new FrequencyWithExtraChanceDecoratorConfiguration(5, 0.1F, 1)))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("grass",
						Feature.RANDOM_PATCH.configured(Features.Configs.DEFAULT_GRASS_CONFIG).decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
								.decorated(FeatureDecorator.COUNT_NOISE.configured(new NoiseDependantDecoratorConfiguration(-0.8D, 5, 12)))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("seagrass", Feature.SEAGRASS
				.configured(new ProbabilityFeatureConfiguration(0.3F)).count(14).decorated(Features.Decorators.TOP_SOLID_HEIGHTMAP_SQUARE)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("flower", Feature.FLOWER.configured(Features.Configs.DEFAULT_FLOWER_CONFIG).decorated(Features.Decorators.ADD_32)
						.decorated(Features.Decorators.HEIGHTMAP_SQUARE).count(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("brown_mushroom",
						Feature.RANDOM_PATCH.configured((new RandomPatchConfiguration.GrassConfigurationBuilder(
								new SimpleStateProvider(Blocks.BROWN_MUSHROOM.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1)
										.noProjection().build())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("red_mushroom",
						Feature.RANDOM_PATCH.configured((new RandomPatchConfiguration.GrassConfigurationBuilder(
								new SimpleStateProvider(Blocks.RED_MUSHROOM.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1).noProjection()
										.build())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("disk_sand",
						Feature.DISK
								.configured(new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 4), 2,
										ImmutableList.of(Blocks.GRASS_BLOCK.defaultBlockState(),
												TheLegendeOfLumaModBlocks.LUMASTONE.defaultBlockState())))
								.decorated(Features.Decorators.TOP_SOLID_HEIGHTMAP_SQUARE).count(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("disk_gravel",
						Feature.DISK
								.configured(new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 3), 2,
										ImmutableList.of(Blocks.GRASS_BLOCK.defaultBlockState(),
												TheLegendeOfLumaModBlocks.LUMASTONE.defaultBlockState())))
								.decorated(Features.Decorators.TOP_SOLID_HEIGHTMAP_SQUARE).count(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("patch_sugar_cane",
				Feature.RANDOM_PATCH.configured(Features.Configs.SUGAR_CANE_CONFIG).decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE).count(1)));
		BiomeDefaultFeatures.addDefaultCarvers(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 100, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 1, 5));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 2, 8));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 8, 1, 3));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.MULE, 8, 1, 3));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 2, 8));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 2, 8));
		mobSpawnInfo.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SALMON, 1, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 8, 2, 4));
		mobSpawnInfo.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SQUID, 3, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COD, 1, 1, 1));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).depth(-0.1f).scale(0.125f)
				.temperature(0.5f).downfall(0.7000000000000001f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(TheLegendeOfLumaMod.MODID, "luma"), SURFACE_BUILDER);
		CONFIGURED_FEATURES.forEach((resourceLocation, configuredFeature) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, resourceLocation,
				configuredFeature));
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(TheLegendeOfLumaModBiomes.LUMA)),
				BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.RARE, BiomeDictionary.Type.SPOOKY);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(TheLegendeOfLumaModBiomes.LUMA)), 25));
	}

	private static final Map<ResourceLocation, ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = new HashMap<>();

	private static ConfiguredFeature<?, ?> register(String name, ConfiguredFeature<?, ?> configuredFeature) {
		CONFIGURED_FEATURES.put(new ResourceLocation(TheLegendeOfLumaMod.MODID, name + "_luma"), configuredFeature);
		return configuredFeature;
	}
}
