package io.github.brandonbr1.thepunmodremade.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import io.github.brandonbr1.thepunmodremade.entity.FeatherThrowEntity;

public class PieceMakerRightClickedInAirProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			FeatherThrowEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 3, 5);
		}
	}
}
