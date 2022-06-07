
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.thepunmodremade.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import java.util.List;
import java.util.ArrayList;

import io.github.brandonbr1.thepunmodremade.item.TheUltimateBlockItem;
import io.github.brandonbr1.thepunmodremade.item.TheStoneOfMiteItem;
import io.github.brandonbr1.thepunmodremade.item.ThePainMakerItem;
import io.github.brandonbr1.thepunmodremade.item.SyemondPickaxeItem;
import io.github.brandonbr1.thepunmodremade.item.StealknifeItem;
import io.github.brandonbr1.thepunmodremade.item.SpearMintItem;
import io.github.brandonbr1.thepunmodremade.item.SandItem;
import io.github.brandonbr1.thepunmodremade.item.RainBowItem;
import io.github.brandonbr1.thepunmodremade.item.PorkChopperItem;
import io.github.brandonbr1.thepunmodremade.item.PieceMakerItem;
import io.github.brandonbr1.thepunmodremade.item.ObsidieanbowItem;
import io.github.brandonbr1.thepunmodremade.item.MorningStarItem;
import io.github.brandonbr1.thepunmodremade.item.MintserItem;
import io.github.brandonbr1.thepunmodremade.item.IcecickleItem;
import io.github.brandonbr1.thepunmodremade.item.IceDimensionItem;
import io.github.brandonbr1.thepunmodremade.item.HollySwordItem;
import io.github.brandonbr1.thepunmodremade.item.HardBoiledEggsItem;
import io.github.brandonbr1.thepunmodremade.item.HamMerItem;
import io.github.brandonbr1.thepunmodremade.item.GreaterSwordItem;
import io.github.brandonbr1.thepunmodremade.item.FrenchFriceItem;
import io.github.brandonbr1.thepunmodremade.item.FlyingPanItem;
import io.github.brandonbr1.thepunmodremade.item.FleeBagItem;
import io.github.brandonbr1.thepunmodremade.item.FlameThwoolerItem;
import io.github.brandonbr1.thepunmodremade.item.FeatherThrowItem;
import io.github.brandonbr1.thepunmodremade.item.EndDyemondItem;
import io.github.brandonbr1.thepunmodremade.item.EggsterminatorItem;
import io.github.brandonbr1.thepunmodremade.item.DyemondSwordItem;
import io.github.brandonbr1.thepunmodremade.item.DyemondItem;
import io.github.brandonbr1.thepunmodremade.item.DyemondArmorItem;
import io.github.brandonbr1.thepunmodremade.item.DyeMondShovelItem;
import io.github.brandonbr1.thepunmodremade.item.DyeMondAxeItem;
import io.github.brandonbr1.thepunmodremade.item.CrossBowItem;
import io.github.brandonbr1.thepunmodremade.item.CanInkItem;
import io.github.brandonbr1.thepunmodremade.item.BreakFastItem;
import io.github.brandonbr1.thepunmodremade.item.BowINItem;
import io.github.brandonbr1.thepunmodremade.item.BedderSwordItem;
import io.github.brandonbr1.thepunmodremade.item.BattleIronItem;
import io.github.brandonbr1.thepunmodremade.item.BatleItem;
import io.github.brandonbr1.thepunmodremade.item.BatFurItem;
import io.github.brandonbr1.thepunmodremade.item.ArctcutItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThePunModRemadeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item GREATER_SWORD = register(new GreaterSwordItem());
	public static final Item MORNING_STAR = register(new MorningStarItem());
	public static final Item CROSS_BOW = register(new CrossBowItem());
	public static final Item HARD_BOILED_EGGS = register(new HardBoiledEggsItem());
	public static final Item EGGSTERMINATOR = register(new EggsterminatorItem());
	public static final Item FLEE_BAG = register(new FleeBagItem());
	public static final Item HOLLY_SWORD = register(new HollySwordItem());
	public static final Item THE_ULTIMATE_BLOCK = register(new TheUltimateBlockItem());
	public static final Item THE_STONE_OF_MITE = register(new TheStoneOfMiteItem());
	public static final Item BREAK_FAST = register(new BreakFastItem());
	public static final Item SPEAR_MINT = register(new SpearMintItem());
	public static final Item STEALKNIFE = register(new StealknifeItem());
	public static final Item MINTSER = register(new MintserItem());
	public static final Item FLYING_PAN = register(new FlyingPanItem());
	public static final Item THE_PAIN_MAKER = register(new ThePainMakerItem());
	public static final Item FEATHER_THROW = register(new FeatherThrowItem());
	public static final Item PIECE_MAKER = register(new PieceMakerItem());
	public static final Item BAT_FUR = register(new BatFurItem());
	public static final Item DYEMOND = register(new DyemondItem());
	public static final Item DYEMOND_ARMOR_HELMET = register(new DyemondArmorItem.Helmet());
	public static final Item DYEMOND_ARMOR_CHESTPLATE = register(new DyemondArmorItem.Chestplate());
	public static final Item DYEMOND_ARMOR_LEGGINGS = register(new DyemondArmorItem.Leggings());
	public static final Item DYEMOND_ARMOR_BOOTS = register(new DyemondArmorItem.Boots());
	public static final Item DYEMOND_SWORD = register(new DyemondSwordItem());
	public static final Item DYE_MOND_AXE = register(new DyeMondAxeItem());
	public static final Item SYEMOND_PICKAXE = register(new SyemondPickaxeItem());
	public static final Item DYE_MOND_SHOVEL = register(new DyeMondShovelItem());
	public static final Item FLAME_THWOOLER = register(new FlameThwoolerItem());
	public static final Item BATLE_HELMET = register(new BatleItem.Helmet());
	public static final Item BATLE_CHESTPLATE = register(new BatleItem.Chestplate());
	public static final Item BATLE_LEGGINGS = register(new BatleItem.Leggings());
	public static final Item BATLE_BOOTS = register(new BatleItem.Boots());
	public static final Item BATTLE_IRON = register(new BattleIronItem());
	public static final Item OBSIDIEANBOW = register(new ObsidieanbowItem());
	public static final Item BOW_IN = register(new BowINItem());
	public static final Item END_DYEMOND_HELMET = register(new EndDyemondItem.Helmet());
	public static final Item END_DYEMOND_CHESTPLATE = register(new EndDyemondItem.Chestplate());
	public static final Item END_DYEMOND_LEGGINGS = register(new EndDyemondItem.Leggings());
	public static final Item END_DYEMOND_BOOTS = register(new EndDyemondItem.Boots());
	public static final Item HAM_MER = register(new HamMerItem());
	public static final Item CAN_INK = register(new CanInkItem());
	public static final Item RAIN_BOW = register(new RainBowItem());
	public static final Item ICE_DIMENSION = register(new IceDimensionItem());
	public static final Item ICECICKLE = register(new IcecickleItem());
	public static final Item ARCTCUT = register(new ArctcutItem());
	public static final Item PORK_CHOPPER = register(new PorkChopperItem());
	public static final Item BEDDER_SWORD = register(new BedderSwordItem());
	public static final Item FROST_BITTER = register(
			new SpawnEggItem(ThePunModRemadeModEntities.FROST_BITTER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("frost_bitter_spawn_egg"));
	public static final Item FRENCH_FRICE = register(new FrenchFriceItem());
	public static final Item SAND_WITCH = register(
			new SpawnEggItem(ThePunModRemadeModEntities.SAND_WITCH, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("sand_witch_spawn_egg"));
	public static final Item SAND = register(new SandItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
