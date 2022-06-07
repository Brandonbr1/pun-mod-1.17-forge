
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.thepunmodremade.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

import io.github.brandonbr1.thepunmodremade.entity.StealknifeEntity;
import io.github.brandonbr1.thepunmodremade.entity.SpearMintEntity;
import io.github.brandonbr1.thepunmodremade.entity.SandWitchEntityProjectile;
import io.github.brandonbr1.thepunmodremade.entity.SandWitchEntity;
import io.github.brandonbr1.thepunmodremade.entity.SandEntity;
import io.github.brandonbr1.thepunmodremade.entity.RainBowEntity;
import io.github.brandonbr1.thepunmodremade.entity.ObsidieanbowEntity;
import io.github.brandonbr1.thepunmodremade.entity.HamMerEntity;
import io.github.brandonbr1.thepunmodremade.entity.FrostBitterEntity;
import io.github.brandonbr1.thepunmodremade.entity.FeatherThrowEntity;
import io.github.brandonbr1.thepunmodremade.entity.EggsterminatorEntity;
import io.github.brandonbr1.thepunmodremade.entity.CrossBowEntity;
import io.github.brandonbr1.thepunmodremade.entity.CanInkEntity;
import io.github.brandonbr1.thepunmodremade.entity.BowINEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThePunModRemadeModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<CrossBowEntity> CROSS_BOW = register("entitybulletcross_bow",
			EntityType.Builder.<CrossBowEntity>of(CrossBowEntity::new, MobCategory.MISC).setCustomClientFactory(CrossBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<EggsterminatorEntity> EGGSTERMINATOR = register("entitybulleteggsterminator",
			EntityType.Builder.<EggsterminatorEntity>of(EggsterminatorEntity::new, MobCategory.MISC).setCustomClientFactory(EggsterminatorEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SpearMintEntity> SPEAR_MINT = register("entitybulletspear_mint",
			EntityType.Builder.<SpearMintEntity>of(SpearMintEntity::new, MobCategory.MISC).setCustomClientFactory(SpearMintEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<StealknifeEntity> STEALKNIFE = register("entitybulletstealknife",
			EntityType.Builder.<StealknifeEntity>of(StealknifeEntity::new, MobCategory.MISC).setCustomClientFactory(StealknifeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<FeatherThrowEntity> FEATHER_THROW = register("entitybulletfeather_throw",
			EntityType.Builder.<FeatherThrowEntity>of(FeatherThrowEntity::new, MobCategory.MISC).setCustomClientFactory(FeatherThrowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ObsidieanbowEntity> OBSIDIEANBOW = register("entitybulletobsidieanbow",
			EntityType.Builder.<ObsidieanbowEntity>of(ObsidieanbowEntity::new, MobCategory.MISC).setCustomClientFactory(ObsidieanbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BowINEntity> BOW_IN = register("entitybulletbow_in",
			EntityType.Builder.<BowINEntity>of(BowINEntity::new, MobCategory.MISC).setCustomClientFactory(BowINEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<HamMerEntity> HAM_MER = register("entitybulletham_mer",
			EntityType.Builder.<HamMerEntity>of(HamMerEntity::new, MobCategory.MISC).setCustomClientFactory(HamMerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<CanInkEntity> CAN_INK = register("entitybulletcan_ink",
			EntityType.Builder.<CanInkEntity>of(CanInkEntity::new, MobCategory.MISC).setCustomClientFactory(CanInkEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RainBowEntity> RAIN_BOW = register("entitybulletrain_bow",
			EntityType.Builder.<RainBowEntity>of(RainBowEntity::new, MobCategory.MISC).setCustomClientFactory(RainBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<FrostBitterEntity> FROST_BITTER = register("frost_bitter",
			EntityType.Builder.<FrostBitterEntity>of(FrostBitterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrostBitterEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<SandWitchEntity> SAND_WITCH = register("sand_witch",
			EntityType.Builder.<SandWitchEntity>of(SandWitchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SandWitchEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<SandWitchEntityProjectile> SAND_WITCH_PROJECTILE = register("entitybulletsand_witch",
			EntityType.Builder.<SandWitchEntityProjectile>of(SandWitchEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(SandWitchEntityProjectile::new).sized(0.5f, 0.5f));
	public static final EntityType<SandEntity> SAND = register("entitybulletsand",
			EntityType.Builder.<SandEntity>of(SandEntity::new, MobCategory.MISC).setCustomClientFactory(SandEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FrostBitterEntity.init();
			SandWitchEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FROST_BITTER, FrostBitterEntity.createAttributes().build());
		event.put(SAND_WITCH, SandWitchEntity.createAttributes().build());
	}
}
