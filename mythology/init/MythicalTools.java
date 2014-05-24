package mythology.init;

import mythology.MythologyMod;
import mythology.modItems.ItemAxe;
import mythology.modItems.ItemHoe;
import mythology.modItems.ItemHoeIG;
import mythology.modItems.ItemPickaxe;
import mythology.modItems.ItemShovel;
import mythology.modItems.ItemSwordCB;
import mythology.modItems.ItemSwordIG;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalTools {
	private static MythologyMod m = new MythologyMod();
	public static void add(){
		ToolMaterial toolBronze = EnumHelper.addToolMaterial("BRONZE", 2, 341, 5.0F, 2F, 14);
		ToolMaterial toolCelestialBronze = EnumHelper.addToolMaterial("CELESTIALBRONZE", 2, 453, 6.4F, 3F, 10);
		ToolMaterial toolImperialGold = EnumHelper.addToolMaterial("IMPERIALGOLD", 2, 532, 8F, 5F, 10);
		ToolMaterial toolSilver = EnumHelper.addToolMaterial("SILVER", 2, 332, 5.8F, 4F, 14);
		ToolMaterial toolRuby = EnumHelper.addToolMaterial("RUBY", 2, 330, 5.0F, 2F, 14);
		ToolMaterial toolSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 2, 330, 5.0F, 2F, 14);
		m.swordBronze = new ItemSword(toolBronze).setUnlocalizedName("swordBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "swordBronze");
		m.swordCelestialBronze = new ItemSwordCB(toolCelestialBronze).setUnlocalizedName("swordCelestialBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "swordCelestialBronze");
		m.swordImperialGold = new ItemSwordIG(toolImperialGold).setUnlocalizedName("swordImperialGold").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "swordImperialGold");
		m.swordSilver = new ItemSword(toolSilver).setUnlocalizedName("swordSilver").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "swordSilver");
		m.swordRuby = new ItemSword(toolRuby).setUnlocalizedName("swordRuby").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "swordRuby");
		m.swordSapphire = new ItemSword(toolSapphire).setUnlocalizedName("swordSapphire").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "swordSapphire");
		
		m.pickaxeBronze = new ItemPickaxe(toolBronze).setUnlocalizedName("pickaxeBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeBronze");
		m.pickaxeCelestialBronze = new ItemPickaxe(toolCelestialBronze).setUnlocalizedName("pickaxeCelestialBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeCelestialBronze");
		m.pickaxeImperialGold = new ItemPickaxe(toolImperialGold).setUnlocalizedName("pickaxeImperialGold").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeImperialGold");
		m.pickaxeSilver = new ItemPickaxe(toolSilver).setUnlocalizedName("pickaxeSilver").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeSilver");
		m.pickaxeRuby = new ItemPickaxe(toolRuby).setUnlocalizedName("pickaxeRuby").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeRuby");
		m.pickaxeSapphire = new ItemPickaxe(toolSapphire).setUnlocalizedName("pickaxeSapphire").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeSapphire");
		
		m.shovelBronze = new ItemShovel(toolBronze).setUnlocalizedName("shovelBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelBronze");
		m.shovelCelestialBronze = new ItemShovel(toolCelestialBronze).setUnlocalizedName("shovelCelestialBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelCelestialBronze");
		m.shovelImperialGold = new ItemShovel(toolImperialGold).setUnlocalizedName("shovelImperialGold").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelImperialGold");
		m.shovelSilver = new ItemShovel(toolSilver).setUnlocalizedName("shovelSilver").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelSilver");
		m.shovelRuby = new ItemShovel(toolRuby).setUnlocalizedName("shovelRuby").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelRuby");
		m.shovelSapphire = new ItemShovel(toolSapphire).setUnlocalizedName("shovelSapphire").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelSapphire");
		
		m.axeBronze = new ItemAxe(toolBronze).setUnlocalizedName("axeBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "axeBronze");
		m.axeCelestialBronze = new ItemAxe(toolCelestialBronze).setUnlocalizedName("axeCelestialBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "axeCelestialBronze");
		m.axeImperialGold = new ItemAxe(toolImperialGold).setUnlocalizedName("axeImperialGold").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "axeImperialGold");
		m.axeSilver = new ItemAxe(toolSilver).setUnlocalizedName("axeSilver").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "axeSilver");
		m.axeRuby = new ItemAxe(toolRuby).setUnlocalizedName("axeRuby").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "axeRuby");
		m.axeSapphire = new ItemAxe(toolSapphire).setUnlocalizedName("axeSapphire").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "axeSapphire");
		
		m.hoeBronze = new ItemHoe(toolBronze).setUnlocalizedName("hoeBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeBronze");
		m.hoeCelestialBronze = new ItemHoe(toolCelestialBronze).setUnlocalizedName("hoeCelestialBronze").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeCelestialBronze");
		m.hoeImperialGold = new ItemHoeIG(toolImperialGold).setUnlocalizedName("hoeImperialGold").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeImperialGold");
		m.hoeSilver = new ItemHoe(toolSilver).setUnlocalizedName("hoeSilver").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeSilver");
		m.hoeRuby = new ItemHoe(toolRuby).setUnlocalizedName("hoeRuby").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeRuby");
		m.hoeSapphire = new ItemHoe(toolSapphire).setUnlocalizedName("hoeSapphire").setCreativeTab(m.tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeSapphire");
		
	}
	public static void register(){
		GameRegistry.registerItem(m.swordBronze, "swordBronze"); 
    	GameRegistry.registerItem(m.swordCelestialBronze, "swordCelestialBronze"); 
    	GameRegistry.registerItem(m.swordImperialGold, "swordImperialGold"); 
    	GameRegistry.registerItem(m.swordSilver, "swordSilver"); 
    	GameRegistry.registerItem(m.swordRuby, "swordRuby");
    	GameRegistry.registerItem(m.swordSapphire, "swordSapphire");
    	GameRegistry.registerItem(m.pickaxeBronze, "pickaxeBronze"); 
    	GameRegistry.registerItem(m.pickaxeCelestialBronze, "CelestialBronze"); 
    	GameRegistry.registerItem(m.pickaxeImperialGold, "pickaxeImperialGold"); 
    	GameRegistry.registerItem(m.pickaxeSilver, "pickaxeSilver"); 
    	GameRegistry.registerItem(m.pickaxeRuby, "pickaxeRuby");
    	GameRegistry.registerItem(m.pickaxeSapphire, "pickaxeSapphire");
    	GameRegistry.registerItem(m.shovelBronze, "shovelBronze"); 
    	GameRegistry.registerItem(m.shovelCelestialBronze, "shovelCelestialBronze"); 
    	GameRegistry.registerItem(m.shovelImperialGold, "shovelImperialGold"); 
    	GameRegistry.registerItem(m.shovelSilver, "shovelSilver"); 
    	GameRegistry.registerItem(m.shovelRuby, "shovelRuby");
    	GameRegistry.registerItem(m.shovelSapphire, "shovelSapphire");
    	GameRegistry.registerItem(m.axeBronze, "axeBronze"); 
    	GameRegistry.registerItem(m.axeCelestialBronze, "axeCelestialBronze"); 
    	GameRegistry.registerItem(m.axeImperialGold, "axeImperialGold"); 
    	GameRegistry.registerItem(m.axeSilver, "axeSilver"); 
    	GameRegistry.registerItem(m.axeRuby, "axeRuby");
    	GameRegistry.registerItem(m.axeSapphire, "axeSapphire");
    	GameRegistry.registerItem(m.hoeBronze, "hoeBronze"); 
    	GameRegistry.registerItem(m.hoeCelestialBronze, "hoeCelestialBronze"); 
    	GameRegistry.registerItem(m.hoeImperialGold, "hoeImperialGold"); 
    	GameRegistry.registerItem(m.hoeSilver, "hoeSilver"); 
    	GameRegistry.registerItem(m.hoeRuby, "hoeRuby");
    	GameRegistry.registerItem(m.hoeSapphire, "hoeSapphire");
    	
	}
}
