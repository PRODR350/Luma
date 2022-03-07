
package net.mcreator.the_legende_of_luma.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

import java.util.Set;
import java.util.Random;

public class LumaBrowMushroomLogFeature extends OreFeature {
	public static final LumaBrowMushroomLogFeature FEATURE = (LumaBrowMushroomLogFeature) new LumaBrowMushroomLogFeature()
			.setRegistryName("the_legende_of_luma:luma_brow_mushroom_log");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(LumaBrowMushroomLogFeatureRuleTest.INSTANCE,
					TheLegendeOfLumaModBlocks.LUMA_BROW_MUSHROOM_LOG.defaultBlockState(), 64))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)))).squared().count(32);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("the_legende_of_luma:luma"));

	public LumaBrowMushroomLogFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class LumaBrowMushroomLogFeatureRuleTest extends RuleTest {
		static final LumaBrowMushroomLogFeatureRuleTest INSTANCE = new LumaBrowMushroomLogFeatureRuleTest();
		static final com.mojang.serialization.Codec<LumaBrowMushroomLogFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<LumaBrowMushroomLogFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("the_legende_of_luma:luma_brow_mushroom_log_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == TheLegendeOfLumaModBlocks.LUMALOG)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
