package com.dogking190.Mythology;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
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
			static ToolMaterial toolBronze = EnumHelper.addToolMaterial("bronze", 2, 341, 5.0F, 2.7F, 14);
			static ToolMaterial toolCelestialBronze = EnumHelper.addToolMaterial("celestialbronze", 2, 453, 6.4F, 3F, 10);
			static ToolMaterial toolImperialGold = EnumHelper.addToolMaterial("imperialgold", 2, 532, 8F, 5F, 10);
			static ToolMaterial toolSilver = EnumHelper.addToolMaterial("silver", 2, 332, 5.8F, 4F, 14);

		//My Tools temporary
		public static Item swordBronze = new ItemSword(toolBronze).setUnlocalizedName("swordBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordBronze");
		public static Item swordCelestialBronze = new ItemSword(toolCelestialBronze).setUnlocalizedName("swordCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordCelestialBronze");
		public static Item swordImperialGold = new ItemSword(toolImperialGold).setUnlocalizedName("swordImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordImperialGold");
		public static Item swordSilver = new ItemSword(toolSilver).setUnlocalizedName("swordSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordSilver");
	 
 
	


	
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
