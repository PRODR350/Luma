
package net.mcreator.the_legende_of_luma.world.features.plants;

import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HeightmapConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DefaultFlowerFeature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

import java.util.Set;

public class FourLeafCloverPlantFeature extends DefaultFlowerFeature {
	public static final FourLeafCloverPlantFeature FEATURE = (FourLeafCloverPlantFeature) new FourLeafCloverPlantFeature()
			.setRegistryName("the_legende_of_luma:four_leaf_clover_plant");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(TheLegendeOfLumaModBlocks.FOUR_LEAF_CLOVER_PLANT.defaultBlockState()), SimpleBlockPlacer.INSTANCE)
							.tries(1)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(25);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"),
			new ResourceLocation("plains"), new ResourceLocation("the_legende_of_luma:luma"));

	public FourLeafCloverPlantFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}
}