package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;

public class StepBackEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDirection()) == Direction.NORTH) {
			entity.setDeltaMovement(0, 0.2, 0.37);
		}
		if ((entity.getDirection()) == Direction.SOUTH) {
			entity.setDeltaMovement(0, 0.2, (-0.37));
		}
		if ((entity.getDirection()) == Direction.WEST) {
			entity.setDeltaMovement(0.37, 0.2, 0);
		}
		if ((entity.getDirection()) == Direction.EAST) {
			entity.setDeltaMovement((-0.37), 0.2, 0);
		}
	}
}
