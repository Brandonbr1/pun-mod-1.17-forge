
package io.github.brandonbr1.thepunmodremade.entity;

import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import io.github.brandonbr1.thepunmodremade.init.ThePunModRemadeModItems;
import io.github.brandonbr1.thepunmodremade.init.ThePunModRemadeModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class SandWitchEntityProjectile extends AbstractArrow implements ItemSupplier {
	public SandWitchEntityProjectile(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(ThePunModRemadeModEntities.SAND_WITCH_PROJECTILE, world);
	}

	public SandWitchEntityProjectile(EntityType<? extends SandWitchEntityProjectile> type, Level world) {
		super(type, world);
	}

	public SandWitchEntityProjectile(EntityType<? extends SandWitchEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public SandWitchEntityProjectile(EntityType<? extends SandWitchEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(ThePunModRemadeModItems.SAND);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(ThePunModRemadeModItems.SAND);
	}
}
