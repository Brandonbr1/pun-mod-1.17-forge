package io.github.brandonbr1.thepunmodremade.procedures;

import net.minecraft.world.entity.Entity;

public class FlyingPanRightClickedInAirProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(0, 10, 0);
	}
}
