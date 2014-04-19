package mythology;

import mythology.mobs.EntityCentaur;
import mythology.mobs.EntityFairy;
import mythology.mobs.EntityGnome;
import mythology.mobs.EntityMinotaur;
import mythology.modBlocks.BlockBronzeOre;
import mythology.modBlocks.BlockCelestialBronzeOre;
import mythology.modBlocks.BlockImperialGoldOre;
import mythology.modBlocks.BlockMithrilOre;
import mythology.modBlocks.BlockMysticDirt;
import mythology.modBlocks.BlockMysticGrass;
import mythology.modBlocks.BlockPlatinumOre;
import mythology.modBlocks.BlockRubyOre;
import mythology.modBlocks.BlockSapphireOre;
import mythology.modBlocks.BlockSilverOre;
import mythology.modItems.*;
import mythology.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;


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

	@SidedProxy(clientSide = "mythology.proxy.ClientProxy", serverSide = "mythology.proxy.CommonProxy")
	public static CommonProxy proxy;

	//Mod Info
	public static final String modid = "mythical";
	public static final String version = "1.0.0";
	public static final String name = "Mythical Creatures";
	
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
	public static Item itemGnomeBeard;


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
		public static Item pickaxeBronze = new ItemPickaxe(toolBronze).setUnlocalizedName("pickaxeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeBronze");
		public static Item pickaxeCelestialBronze = new ItemPickaxe(toolCelestialBronze).setUnlocalizedName("pickaxeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeCelestialBronze");
		public static Item pickaxeImperialGold = new ItemPickaxe(toolImperialGold).setUnlocalizedName("pickaxeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeImperialGold");
		public static Item pickaxeSilver = new ItemPickaxe(toolSilver).setUnlocalizedName("pickaxeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeSilver");
		public static Item shovelBronze = new ItemShovel(toolBronze).setUnlocalizedName("shovelBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelBronze");
		public static Item shovelCelestialBronze = new ItemShovel(toolCelestialBronze).setUnlocalizedName("shovelCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelCelestialBronze");
		public static Item shovelImperialGold = new ItemShovel(toolImperialGold).setUnlocalizedName("shovelImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelImperialGold");
		public static Item shovelSilver = new ItemShovel(toolSilver).setUnlocalizedName("shovelSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelSilver");
		public static Item axeBronze = new ItemAxe(toolBronze).setUnlocalizedName("axeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeBronze");
		public static Item axeCelestialBronze = new ItemAxe(toolCelestialBronze).setUnlocalizedName("axeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeCelestialBronze");
		public static Item axeImperialGold = new ItemAxe(toolImperialGold).setUnlocalizedName("axeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeImperialGold");
		public static Item axeSilver = new ItemAxe(toolSilver).setUnlocalizedName("axeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeSilver");
		public static Item hoeBronze = new ItemHoe(toolBronze).setUnlocalizedName("hoeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeBronze");
		public static Item hoeCelestialBronze = new ItemHoe(toolCelestialBronze).setUnlocalizedName("hoeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeCelestialBronze");
		public static Item hoeImperialGold = new ItemHoeIG(toolImperialGold).setUnlocalizedName("hoeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeImperialGold");
		public static Item hoeSilver = new ItemHoe(toolSilver).setUnlocalizedName("hoeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeSilver");
		//My ingots
		public static Item itemBronzeIngot = new Item().setUnlocalizedName("bronzeIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemBronzeIngot");
		public static Item itemCelestialBronzeIngot = new Item().setUnlocalizedName("celestialBronzeIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemCelestialBronzeIngot");
		public static Item itemImperialGoldIngot = new Item().setUnlocalizedName("imperialGoldIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemImperialGoldIngot");
		public static Item itemSilverIngot = new Item().setUnlocalizedName("silverIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemSilverIngot");


 
	


	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event) {
		
		//Defines The Blocks in Minecraft
		blockMithrilOre = new BlockMithrilOre("oreMithril", tabMythical, Material.rock);
		blockSilverOre = new BlockSilverOre("oreSilver", tabMythical, Material.rock);
		blockBronzeOre = new BlockBronzeOre("oreBronze", tabMythical, Material.rock);
		blockPlatinumOre = new BlockPlatinumOre("orePlatinum", tabMythical, Material.rock);
		blockRubyOre = new BlockRubyOre("oreRuby", tabMythical, Material.rock);
		blockSapphireOre = new BlockSapphireOre("oreSapphire" , tabMythical, Material.rock);
		blockImperialGoldOre = new BlockImperialGoldOre("oreImperialGold", tabMythical, Material.rock);
		blockCelestialBronzeOre = new BlockCelestialBronzeOre("oreCelestialBronze", tabMythical, Material.rock);
		blockMysticGrass = new BlockMysticGrass("blockMysticGrass", tabMythical, Material.grass);
		blockMysticDirt = new BlockMysticDirt("blockMysticDirt", tabMythical, Material.ground);


		//Defines The Items in Minecraft
		itemFur = new ItemFur("itemFur", tabMythical);
		itemScales = new ItemScales("itemScales", tabMythical);
		rawBehemothMeat = new RawBehemothMeat(4,0.4F,true, "rawBehemothMeat", tabMythical);
		cookBehemothMeat = new CookBehemothMeat(8, 0.8F, true, "cookBehemothMeat", tabMythical);
		itemGnomeBeard = new ItemGnomeBeard("itemGnomeBeard", tabMythical);
		
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
    	GameRegistry.registerItem(itemBronzeIngot, "bronzeIngot"); 
    	GameRegistry.registerItem(itemCelestialBronzeIngot, "celestialBronzeIngot"); 
    	GameRegistry.registerItem(itemImperialGoldIngot, "imperialGoldIngot"); 
    	GameRegistry.registerItem(itemSilverIngot, "silverIngot");
    	GameRegistry.registerItem(itemGnomeBeard, "itemGnomeBeard");
    	GameRegistry.registerItem(itemFur, "itemFur");
    	GameRegistry.registerItem(rawBehemothMeat, "rawBehemothMeat");
    	GameRegistry.registerItem(cookBehemothMeat, "cookBehemothMeat");
    	GameRegistry.registerItem(itemScales, "itemScales");



    	
    	//Smelting recipes
		GameRegistry.addSmelting(blockBronzeOre, new ItemStack(itemBronzeIngot, 1), 0.7F);
		GameRegistry.addSmelting(blockCelestialBronzeOre, new ItemStack(itemCelestialBronzeIngot, 1), 1.0F);
		GameRegistry.addSmelting(blockImperialGoldOre, new ItemStack(itemImperialGoldIngot, 1), 1.0F);
		GameRegistry.addSmelting(blockSilverOre, new ItemStack(itemSilverIngot, 1), 0.9F);
		
		//Crafting recipes
		GameRegistry.addShapedRecipe(new ItemStack(swordBronze, 1), new Object[] { "I", "I", "S", 'I', itemBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(pickaxeBronze, 1), new Object[] { "III", " S ", " S ", 'I', itemBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(axeBronze, 1), new Object[] { "II", "IS", " S", 'I', itemBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(hoeBronze, 1), new Object[] { "II", " S", " S", 'I', itemBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(shovelBronze, 1), new Object[] { "I", "S", "S", 'I', itemBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(swordCelestialBronze, 1), new Object[] { "I", "I", "S", 'I', itemCelestialBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(pickaxeCelestialBronze, 1), new Object[] { "III", " S ", " S ", 'I', itemCelestialBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(axeCelestialBronze, 1), new Object[] { "II", "IS", " S", 'I', itemCelestialBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(hoeCelestialBronze, 1), new Object[] { "II", " S", " S", 'I', itemCelestialBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(shovelCelestialBronze, 1), new Object[] { "I", "S", "S", 'I', itemCelestialBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(swordImperialGold, 1), new Object[] { "I", "I", "S", 'I', itemImperialGoldIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(pickaxeImperialGold, 1), new Object[] { "III", " S ", " S ", 'I', itemImperialGoldIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(axeImperialGold, 1), new Object[] { "II", "IS", " S", 'I', itemImperialGoldIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(hoeImperialGold, 1), new Object[] { "II", " S", " S", 'I', itemImperialGoldIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(shovelImperialGold, 1), new Object[] { "I", "S", "S", 'I', itemImperialGoldIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(swordSilver, 1), new Object[] { "I", "I", "S", 'I', itemSilverIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(pickaxeSilver, 1), new Object[] { "III", " S ", " S ", 'I', itemSilverIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(axeSilver, 1), new Object[] { "II", "IS", " S", 'I', itemSilverIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(hoeSilver, 1), new Object[] { "II", " S", " S", 'I', itemSilverIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(shovelSilver, 1), new Object[] { "I", "S", "S", 'I', itemSilverIngot, 'S', Items.stick});
		


		
		
		//World Generator
		GameRegistry.registerWorldGenerator(new MythicalWorldGen(), 0);
		
		
		//Mob Centaur Registry
		int randomID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityCentaur.class , "mobCentaur", randomID);
        EntityRegistry.registerModEntity(EntityCentaur.class, "mobCentaur", randomID, MythologyMod.m, 64, 1, true);
        EntityRegistry.addSpawn(EntityCentaur.class, 1, 50, 200, EnumCreatureType.ambient, BiomeGenBase.plains);
        
        EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, 0x1A33D6, 0x1AD63F));
        
        //Mob Gnome :) Registry *Needs to be Scaled*
        int randomIDGnome = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityGnome.class , "mobGnome", randomIDGnome);
        EntityRegistry.registerModEntity(EntityGnome.class, "mobGnome", randomIDGnome, MythologyMod.m, 64, 1, true);
        
        EntityList.entityEggs.put(Integer.valueOf(randomIDGnome), new EntityList.EntityEggInfo(randomIDGnome, 0xFC0A16, 0xFCFCFC));
        
		//Mob Minotaur Registry
		int randomIDMinotaur = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityMinotaur.class , "mobMinotaur", randomIDMinotaur);
        EntityRegistry.registerModEntity(EntityMinotaur.class, "mobMinotaur", randomIDMinotaur, MythologyMod.m, 64, 1, true);
        
        EntityList.entityEggs.put(Integer.valueOf(randomIDMinotaur), new EntityList.EntityEggInfo(randomIDMinotaur, 0x835C3B, 0xD1D0CE));
        
        //Mob Fairy  *Needs to be Scaled*
        int randomIDFairy = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityFairy.class , "mobFairy", randomIDFairy);
        EntityRegistry.registerModEntity(EntityFairy.class, "mboFairy", randomIDFairy, MythologyMod.m, 64, 1, true);
        
        EntityList.entityEggs.put(Integer.valueOf(randomIDFairy), new EntityList.EntityEggInfo(randomIDFairy, 0x07FA10, 0xE9F5E9));
        
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
