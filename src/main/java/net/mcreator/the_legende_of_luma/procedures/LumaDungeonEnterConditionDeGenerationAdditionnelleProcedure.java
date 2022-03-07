package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LumaDungeonEnterConditionDeGenerationAdditionnelleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		found = false;
		for (int index0 = 0; index0 < (int) (12); index0++) {
			sy = -6;
			for (int index1 = 0; index1 < (int) (12); index1++) {
				sz = -6;
				for (int index2 = 0; index2 < (int) (12); index2++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.JIGSAW) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("the_legende_of_luma", "luma_gungeon_line"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		sx = -6;
		found = false;
		for (int index3 = 0; index3 < (int) (12); index3++) {
			sy = -6;
			for (int index4 = 0; index4 < (int) (12); index4++) {
				sz = -6;
				for (int index5 = 0; index5 < (int) (12); index5++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.JIGSAW) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("the_legende_of_luma", "luma_gungeon_corner"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
