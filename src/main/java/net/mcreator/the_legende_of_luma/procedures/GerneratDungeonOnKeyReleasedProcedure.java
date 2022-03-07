package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;

public class GerneratDungeonOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world) {
		if (TheLegendeOfLumaModVariables.MapVariables.get(world).DungeonIsGenated == false) {
			TheLegendeOfLumaModVariables.MapVariables.get(world).R1 = 0.8;
			TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
			TheLegendeOfLumaModVariables.MapVariables.get(world).NombrePieceDungeon = 50;
			TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
			TheLegendeOfLumaModVariables.MapVariables.get(world).DungeonIsGenated = true;
			TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
		} else if (TheLegendeOfLumaModVariables.MapVariables.get(world).DungeonIsGenated == true) {
			TheLegendeOfLumaModVariables.MapVariables.get(world).DungeonIsGenated = false;
			TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
