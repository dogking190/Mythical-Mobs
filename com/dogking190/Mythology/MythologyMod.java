package com.dogking190.Mythology;

import com.dogking190.Mythology.mobs.entityCentaurs;
import com.dogking190.Mythology.modBlocks.*;
import com.dogking190.Mythology.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

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


	// Creative Tabs
	public static CreativeTabs tabMythical = new CreativeTabs("tabMythical") {
		@Override
		public Item getTabIconItem() {
			
			return Items.apple;
		}
	};

	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event) {
		
		//Defines The Blocks in Minecraft
		blockMithrilOre = new blockMithrilOre("blockMithrilOre", tabMythical, Material.rock);
		blockSilverOre = new blockSilverOre("blockSilverOre", tabMythical, Material.rock);
		blockBronzeOre = new blockBronzeOre("blockBronzeOre", tabMythical, Material.rock);
		blockPlatinumOre = new blockPlatinumOre("blockPlatinumOre", tabMythical, Material.rock);
		blockRubyOre = new blockRubyOre("blockRubyOre", tabMythical, Material.rock);
		blockSapphireOre = new blockSapphireOre("blockSapphireOre" , tabMythical, Material.rock);
		blockImperialGoldOre = new blockImperialGoldOre("blockImperialGoldOre", tabMythical, Material.rock);
		blockCelestialBronzeOre = new blockCelestialBronzeOre("blockCelestialBronzeOre", tabMythical, Material.rock);
		blockMysticGrass = new blockMysticGrass("blockMysticGrass", tabMythical, Material.grass);
		
		//Adds Block into Minecraft
		GameRegistry.registerBlock(blockMithrilOre, "blockMithrilOre");
		GameRegistry.registerBlock(blockSilverOre, "blockSilverOre");
		GameRegistry.registerBlock(blockBronzeOre, "blockBronzeOre");
		GameRegistry.registerBlock(blockPlatinumOre, "blockPlatinumOre");
		GameRegistry.registerBlock(blockRubyOre, "blockRubyOre");
		GameRegistry.registerBlock(blockSapphireOre, "blockSapphireOre");
		GameRegistry.registerBlock(blockImperialGoldOre, "blockImperialGoldOre");
		GameRegistry.registerBlock(blockCelestialBronzeOre, "blockCelestialBronzeOre");
		GameRegistry.registerBlock(blockMysticGrass, "blockMysticGrass");
		
		//World Generator
		GameRegistry.registerWorldGenerator(new MythicalWorldGen(), 1);
		
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
