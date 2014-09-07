package mythology.init;

import mythology.MythologyMod;
import mythology.items.ItemAxe;
import mythology.items.ItemHoe;
import mythology.items.ItemHoeIG;
import mythology.items.ItemPickaxe;
import mythology.items.ItemShovel;
import mythology.items.ItemSwordCB;
import mythology.items.ItemSwordIG;
import static mythology.MythologyMod.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalTools {
	private static MythologyMod m = new MythologyMod();
	public static void add(){
		Item.ToolMaterial toolBronze = EnumHelper.addToolMaterial("BRONZE", 2, 341, 5.0F, 2F, 14);
		Item.ToolMaterial toolCelestialBronze = EnumHelper.addToolMaterial("CELESTIALBRONZE", 2, 453, 6.4F, 3F, 10);
		Item.ToolMaterial toolImperialGold = EnumHelper.addToolMaterial("IMPERIALGOLD", 2, 532, 8F, 5F, 10);
		Item.ToolMaterial toolSilver = EnumHelper.addToolMaterial("SILVER", 2, 332, 5.8F, 4F, 14);
		Item.ToolMaterial toolRuby = EnumHelper.addToolMaterial("RUBY", 2, 330, 5.0F, 2F, 14);
		Item.ToolMaterial toolSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 2, 330, 5.0F, 2F, 14);
		swordBronze = new ItemSword(toolBronze).setUnlocalizedName("swordBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "swordBronze");
		swordCelestialBronze = new ItemSwordCB(toolCelestialBronze).setUnlocalizedName("swordCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "swordCelestialBronze");
		swordImperialGold = new ItemSwordIG(toolImperialGold).setUnlocalizedName("swordImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "swordImperialGold");
		swordSilver = new ItemSword(toolSilver).setUnlocalizedName("swordSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "swordSilver");
		swordRuby = new ItemSword(toolRuby).setUnlocalizedName("swordRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "swordRuby");
		swordSapphire = new ItemSword(toolSapphire).setUnlocalizedName("swordSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "swordSapphire");

		pickaxeBronze = new ItemPickaxe(toolBronze).setUnlocalizedName("pickaxeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "pickaxeBronze");
		pickaxeCelestialBronze = new ItemPickaxe(toolCelestialBronze).setUnlocalizedName("pickaxeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "pickaxeCelestialBronze");
		pickaxeImperialGold = new ItemPickaxe(toolImperialGold).setUnlocalizedName("pickaxeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "pickaxeImperialGold");
		pickaxeSilver = new ItemPickaxe(toolSilver).setUnlocalizedName("pickaxeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "pickaxeSilver");
		pickaxeRuby = new ItemPickaxe(toolRuby).setUnlocalizedName("pickaxeRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "pickaxeRuby");
		pickaxeSapphire = new ItemPickaxe(toolSapphire).setUnlocalizedName("pickaxeSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "pickaxeSapphire");

		shovelBronze = new ItemShovel(toolBronze).setUnlocalizedName("shovelBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "shovelBronze");
		shovelCelestialBronze = new ItemShovel(toolCelestialBronze).setUnlocalizedName("shovelCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "shovelCelestialBronze");
		shovelImperialGold = new ItemShovel(toolImperialGold).setUnlocalizedName("shovelImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "shovelImperialGold");
		shovelSilver = new ItemShovel(toolSilver).setUnlocalizedName("shovelSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "shovelSilver");
		shovelRuby = new ItemShovel(toolRuby).setUnlocalizedName("shovelRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "shovelRuby");
		shovelSapphire = new ItemShovel(toolSapphire).setUnlocalizedName("shovelSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "shovelSapphire");

		axeBronze = new ItemAxe(toolBronze).setUnlocalizedName("axeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "axeBronze");
		axeCelestialBronze = new ItemAxe(toolCelestialBronze).setUnlocalizedName("axeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "axeCelestialBronze");
		axeImperialGold = new ItemAxe(toolImperialGold).setUnlocalizedName("axeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "axeImperialGold");
		axeSilver = new ItemAxe(toolSilver).setUnlocalizedName("axeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "axeSilver");
		axeRuby = new ItemAxe(toolRuby).setUnlocalizedName("axeRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "axeRuby");
		axeSapphire = new ItemAxe(toolSapphire).setUnlocalizedName("axeSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "axeSapphire");

		hoeBronze = new ItemHoe(toolBronze).setUnlocalizedName("hoeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "hoeBronze");
		hoeCelestialBronze = new ItemHoe(toolCelestialBronze).setUnlocalizedName("hoeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "hoeCelestialBronze");
		hoeImperialGold = new ItemHoeIG(toolImperialGold).setUnlocalizedName("hoeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "hoeImperialGold");
		hoeSilver = new ItemHoe(toolSilver).setUnlocalizedName("hoeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "hoeSilver");
		hoeRuby = new ItemHoe(toolRuby).setUnlocalizedName("hoeRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "hoeRuby");
		hoeSapphire = new ItemHoe(toolSapphire).setUnlocalizedName("hoeSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.MODID + ":" + "hoeSapphire");

	}
	public static void register(){
		GameRegistry.registerItem(swordBronze, "swordBronze");
		GameRegistry.registerItem(swordCelestialBronze, "swordCelestialBronze");
		GameRegistry.registerItem(swordImperialGold, "swordImperialGold");
		GameRegistry.registerItem(swordSilver, "swordSilver");
		GameRegistry.registerItem(swordRuby, "swordRuby");
		GameRegistry.registerItem(swordSapphire, "swordSapphire");
		GameRegistry.registerItem(pickaxeBronze, "pickaxeBronze");
		GameRegistry.registerItem(pickaxeCelestialBronze, "CelestialBronze");
		GameRegistry.registerItem(pickaxeImperialGold, "pickaxeImperialGold");
		GameRegistry.registerItem(pickaxeSilver, "pickaxeSilver");
		GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
		GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");
		GameRegistry.registerItem(shovelBronze, "shovelBronze");
		GameRegistry.registerItem(shovelCelestialBronze, "shovelCelestialBronze");
		GameRegistry.registerItem(shovelImperialGold, "shovelImperialGold");
		GameRegistry.registerItem(shovelSilver, "shovelSilver");
		GameRegistry.registerItem(shovelRuby, "shovelRuby");
		GameRegistry.registerItem(shovelSapphire, "shovelSapphire");
		GameRegistry.registerItem(axeBronze, "axeBronze");
		GameRegistry.registerItem(axeCelestialBronze, "axeCelestialBronze");
		GameRegistry.registerItem(axeImperialGold, "axeImperialGold");
		GameRegistry.registerItem(axeSilver, "axeSilver");
		GameRegistry.registerItem(axeRuby, "axeRuby");
		GameRegistry.registerItem(axeSapphire, "axeSapphire");
		GameRegistry.registerItem(hoeBronze, "hoeBronze");
		GameRegistry.registerItem(hoeCelestialBronze, "hoeCelestialBronze");
		GameRegistry.registerItem(hoeImperialGold, "hoeImperialGold");
		GameRegistry.registerItem(hoeSilver, "hoeSilver");
		GameRegistry.registerItem(hoeRuby, "hoeRuby");
		GameRegistry.registerItem(hoeSapphire, "hoeSapphire");

	}
}
