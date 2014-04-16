package com.dogking190.Mythology;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

import com.dogking190.Mythology.mobs.EntityCentaur;
import com.dogking190.Mythology.modBlocks.blockBronzeOre;
import com.dogking190.Mythology.modBlocks.blockCelestialBronzeOre;
import com.dogking190.Mythology.modBlocks.blockImperialGoldOre;
import com.dogking190.Mythology.modBlocks.blockMithrilOre;
import com.dogking190.Mythology.modBlocks.blockMysticDirt;
import com.dogking190.Mythology.modBlocks.blockMysticGrass;
import com.dogking190.Mythology.modBlocks.blockPlatinumOre;
import com.dogking190.Mythology.modBlocks.blockRubyOre;
import com.dogking190.Mythology.modBlocks.blockSapphireOre;
import com.dogking190.Mythology.modBlocks.blockSilverOre;
import com.dogking190.Mythology.modItems.itemAxe;
import com.dogking190.Mythology.modItems.itemHoe;
import com.dogking190.Mythology.modItems.itemHoeIG;
import com.dogking190.Mythology.modItems.itemPickaxe;
import com.dogking190.Mythology.modItems.itemShovel;
import com.dogking190.Mythology.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MythologyMod.modid, name = MythologyMod.name, version = MythologyMod.version)
public class MythologyMod {
	@Instance("mythical")
	public static MythologyMod m;

	@SidedProxy(clientSide = "com.dogking190.Mythology.proxy.ClientProxy", serverSide = "com.dogking190.Mythology.proxy.CommonProxy")
	public static CommonProxy proxy;

	//Mod Info
	public static final String modid = "mythical";
	public static final String version = "1.0.0";
	public static final String name = "Fantasies and Mythical";
	
	//My Mod Blocks
	public static Block blockMithrilOre;
	public static Block blockSilverOre;
	public static Block blockBronzeOre;
	public static Block blockPlatinumOre;
	public static Block blockRubyOre;
	public static Block blockSapphireOre;
	public static Block blockImperialGoldOre;
	public static Block blockCelestialBronzeOre;
	public static Block blockMysticGrass;
	public static Block blockMysticDirt;
	


	// Creative Tabs
	public static CreativeTabs tabMythical = new CreativeTabs("tabMythical") {
		@Override
		public Item getTabIconItem() {
			
			return Item.getItemFromBlock(blockRubyOre);

		}
	};

	
		//Setting new toolmaterials
			static ToolMaterial toolBronze = EnumHelper.addToolMaterial("bronze", 2, 341, 5.0F, 2F, 14);
			static ToolMaterial toolCelestialBronze = EnumHelper.addToolMaterial("celestialbronze", 2, 453, 6.4F, 3F, 10);
			static ToolMaterial toolImperialGold = EnumHelper.addToolMaterial("imperialgold", 2, 532, 8F, 5F, 10);
			static ToolMaterial toolSilver = EnumHelper.addToolMaterial("silver", 2, 332, 5.8F, 4F, 14);

		//My Tools temporary
		public static Item swordBronze = new ItemSword(toolBronze).setUnlocalizedName("swordBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordBronze");
		public static Item swordCelestialBronze = new ItemSword(toolCelestialBronze).setUnlocalizedName("swordCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordCelestialBronze");
		public static Item swordImperialGold = new ItemSword(toolImperialGold).setUnlocalizedName("swordImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordImperialGold");
		public static Item swordSilver = new ItemSword(toolSilver).setUnlocalizedName("swordSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordSilver");
		public static Item pickaxeBronze = new itemPickaxe(toolBronze).setUnlocalizedName("pickaxeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeBronze");
		public static Item pickaxeCelestialBronze = new itemPickaxe(toolCelestialBronze).setUnlocalizedName("pickaxeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeCelestialBronze");
		public static Item pickaxeImperialGold = new itemPickaxe(toolImperialGold).setUnlocalizedName("pickaxeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeImperialGold");
		public static Item pickaxeSilver = new itemPickaxe(toolSilver).setUnlocalizedName("pickaxeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeSilver");
		public static Item shovelBronze = new itemShovel(toolBronze).setUnlocalizedName("shovelBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelBronze");
		public static Item shovelCelestialBronze = new itemShovel(toolCelestialBronze).setUnlocalizedName("shovelCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelCelestialBronze");
		public static Item shovelImperialGold = new itemShovel(toolImperialGold).setUnlocalizedName("shovelImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelImperialGold");
		public static Item shovelSilver = new itemShovel(toolSilver).setUnlocalizedName("shovelSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelSilver");
		public static Item axeBronze = new itemAxe(toolBronze).setUnlocalizedName("axeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeBronze");
		public static Item axeCelestialBronze = new itemAxe(toolCelestialBronze).setUnlocalizedName("axeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeCelestialBronze");
		public static Item axeImperialGold = new itemAxe(toolImperialGold).setUnlocalizedName("axeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeImperialGold");
		public static Item axeSilver = new itemAxe(toolSilver).setUnlocalizedName("axeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeSilver");
		public static Item hoeBronze = new itemHoe(toolBronze).setUnlocalizedName("hoeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeBronze");
		public static Item hoeCelestialBronze = new itemHoe(toolCelestialBronze).setUnlocalizedName("hoeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeCelestialBronze");
		public static Item hoeImperialGold = new itemHoeIG(toolImperialGold).setUnlocalizedName("hoeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeImperialGold");
		public static Item hoeSilver = new itemHoe(toolSilver).setUnlocalizedName("hoeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeSilver");
 
	


	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event) {
		
		//Defines The Blocks in Minecraft
		blockMithrilOre = new blockMithrilOre("oreMithril", tabMythical, Material.rock);
		blockSilverOre = new blockSilverOre("oreSilver", tabMythical, Material.rock);
		blockBronzeOre = new blockBronzeOre("oreBronze", tabMythical, Material.rock);
		blockPlatinumOre = new blockPlatinumOre("orePlatinum", tabMythical, Material.rock);
		blockRubyOre = new blockRubyOre("oreRuby", tabMythical, Material.rock);
		blockSapphireOre = new blockSapphireOre("oreSapphire" , tabMythical, Material.rock);
		blockImperialGoldOre = new blockImperialGoldOre("oreImperialGold", tabMythical, Material.rock);
		blockCelestialBronzeOre = new blockCelestialBronzeOre("oreCelestialBronze", tabMythical, Material.rock);
		blockMysticGrass = new blockMysticGrass("blockMysticGrass", tabMythical, Material.grass);
		blockMysticDirt = new blockMysticDirt("blockMysticDirt", tabMythical, Material.ground);

		
		//Adds Blocks into Minecraft
		GameRegistry.registerBlock(blockMithrilOre, "oreMithril");
		GameRegistry.registerBlock(blockSilverOre, "oreSilver");
		GameRegistry.registerBlock(blockBronzeOre, "oreBronze");
		GameRegistry.registerBlock(blockPlatinumOre, "orePlatinum");
		GameRegistry.registerBlock(blockRubyOre, "oreRuby");
		GameRegistry.registerBlock(blockSapphireOre, "oreSapphire");
		GameRegistry.registerBlock(blockImperialGoldOre, "oreImperialGold");
		GameRegistry.registerBlock(blockCelestialBronzeOre, "oreCelestialBronze");
		GameRegistry.registerBlock(blockMysticGrass, "blockMysticGrass");
		GameRegistry.registerBlock(blockMysticDirt, "blockMysticDirt");
		
		//Adds Items into Minecraft
    	GameRegistry.registerItem(swordBronze, "swordBronze"); 
    	GameRegistry.registerItem(swordCelestialBronze, "swordCelestialBronze"); 
    	GameRegistry.registerItem(swordImperialGold, "swordImperialGold"); 
    	GameRegistry.registerItem(swordSilver, "swordSilver"); 
    	GameRegistry.registerItem(pickaxeBronze, "pickaxeBronze"); 
    	GameRegistry.registerItem(pickaxeCelestialBronze, "CelestialBronze"); 
    	GameRegistry.registerItem(pickaxeImperialGold, "pickaxeImperialGold"); 
    	GameRegistry.registerItem(pickaxeSilver, "pickaxeSilver"); 
    	GameRegistry.registerItem(shovelBronze, "shovelBronze"); 
    	GameRegistry.registerItem(shovelCelestialBronze, "shovelCelestialBronze"); 
    	GameRegistry.registerItem(shovelImperialGold, "shovelImperialGold"); 
    	GameRegistry.registerItem(shovelSilver, "shovelSilver"); 
    	GameRegistry.registerItem(axeBronze, "axeBronze"); 
    	GameRegistry.registerItem(axeCelestialBronze, "axeCelestialBronze"); 
    	GameRegistry.registerItem(axeImperialGold, "axeImperialGold"); 
    	GameRegistry.registerItem(axeSilver, "axeSilver"); 
    	GameRegistry.registerItem(hoeBronze, "hoeBronze"); 
    	GameRegistry.registerItem(hoeCelestialBronze, "hoeCelestialBronze"); 
    	GameRegistry.registerItem(hoeImperialGold, "hoeImperialGold"); 
    	GameRegistry.registerItem(hoeSilver, "hoeSilver"); 


		
		//World Generator
		GameRegistry.registerWorldGenerator(new MythicalWorldGen(), 0);
		
		//Mob Registry
		int randomID = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(EntityCentaur.class , "mobCentaur", randomID);
        EntityRegistry.registerModEntity(EntityCentaur.class, "mobCentaur", randomID, MythologyMod.m, 64, 1, true);
        
        EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, 0x1A33D6, 0x1AD63F));
        
        //Proxy
        proxy.RenderEntity();

	}

	@EventHandler
	public void Load(FMLInitializationEvent event) {

	}

	@EventHandler
	public void PostLoad(FMLPostInitializationEvent event) {

	}

}
