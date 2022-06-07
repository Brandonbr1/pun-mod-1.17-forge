package io.github.brandonbr1.thepunmodremade.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;

public class SandProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			FallingBlockEntity blockToSpawn = new FallingBlockEntity(_level, x, y, z, Blocks.SAND.defaultBlockState());
			blockToSpawn.time = 1;
			_level.addFreshEntity(blockToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			FallingBlockEntity blockToSpawn = new FallingBlockEntity(_level, x, y, z, Blocks.SAND.defaultBlockState());
			blockToSpawn.time = 1;
			_level.addFreshEntity(blockToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			FallingBlockEntity blockToSpawn = new FallingBlockEntity(_level, x, y, z, Blocks.SAND.defaultBlockState());
			blockToSpawn.time = 1;
			_level.addFreshEntity(blockToSpawn);
		}
	}
}
