package com.dogking190.Mythology;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import com.dogking190.Mythology.mobs.entityCentaurs;
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
import com.dogking190.Mythology.modItems.itemFur;
import com.dogking190.Mythology.modItems.itemScales;
import com.dogking190.Mythology.modItems.rawBehemothMeat;
import com.dogking190.Mythology.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
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
	
	//Our Mod Blocks
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
	
	//Our Mod Items
	public static Item itemFur;
	public static Item itemScales;
	public static ItemFood rawBehemothMeat;
	public static ItemFood cookBehemothMeat;



	// Creative Tabs
	public static CreativeTabs tabMythical = new CreativeTabs("tabMythical") {
		@Override
		public Item getTabIconItem() {
			
			return Item.getItemFromBlock(blockRubyOre);

		}
	};

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

		
		//Adds Block into Minecraft
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

		//Defines The Items in Minecraft
		itemFur = new itemFur("itemFur", tabMythical);
		itemScales = new itemScales("itemScales", tabMythical);
		rawBehemothMeat = new rawBehemothMeat(4,0.4F,true, "rawBehemothMeat", tabMythical);
		cookBehemothMeat = new cookBehemothMeat(8, 0.8F, true, "cookBehemothMeat", tabMythicl);
		
		//World Generator
		GameRegistry.registerWorldGenerator(new MythicalWorldGen(), 0);
		
		//Mob Registry
		entityCentaurs.MainReg();

	}

	@EventHandler
	public void Load(FMLInitializationEvent event) {

	}

	@EventHandler
	public void PostLoad(FMLPostInitializationEvent event) {

	}

}
