package mythology;

import mythology.mobs.*;
import mythology.hooks.*;
import mythology.modArmor.*;
import mythology.modBlocks.*;
import mythology.modItems.*;
import mythology.world.*;
import mythology.proxy.*;
import mythology.mobs.*;
import mythology.mobs.hostile.EntityCentaur;
import mythology.mobs.hostile.EntityMinotaur;
import mythology.mobs.passive.EntityFairy;
import mythology.mobs.passive.EntityGnome;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
	//armor ids (I looked everywhere, you need ids :/ ) 
	//the syntax is id.material abbreviation.armor part abbreviation
	private static int idBRH = 4;
	private static int idBRC = 4;
	private static int idBRL = 4;
	private static int idBRB = 4;
	private static int idCBH = 4;
	private static int idCBC = 4;
	private static int idCBL = 4;
	private static int idCBB = 4;
	private static int idIGH = 4;
	private static int idIGC = 4;
	private static int idIGL = 4;
	private static int idIGB = 4;
	private static int idSIH = 4;
	private static int idSIC = 4;
	private static int idSIL = 4;
	private static int idSIB = 4;
	private static int idSCH = 4;
	private static int idSCC = 4;
	private static int idSCL = 4;
	private static int idSCB = 4;
	private static int idFurH = 4;
	private static int idFurC = 4;
	private static int idFurL = 4;
	private static int idFurB = 4;
	private static int idMIH = 4;
	private static int idMIC = 4;
	private static int idMIL = 4;
	private static int idMIB = 4;
	
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
	public static Block blockSilverBlock;
	public static Block blockBronzeBlock;
	public static Block blockPlatinumBlock;
	public static Block blockImperialGoldBlock;
	public static Block blockCelestialBronzeBlock;
		
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
		
		//setting new armor materials
		static ArmorMaterial armorBronze = EnumHelper.addArmorMaterial("armorBronze", 15, new int[]{2, 6, 5, 2}, 20);
		static ArmorMaterial armorCelestialBronze = EnumHelper.addArmorMaterial("armorCelestialBronze", 25, new int[]{3, 6, 5, 3}, 9);
		static ArmorMaterial armorImperialGold = EnumHelper.addArmorMaterial("armorImperialGold", 25, new int[]{3, 6, 5, 3}, 9);
		static ArmorMaterial armorSilver = EnumHelper.addArmorMaterial("armorSilver", 20, new int[]{3, 6, 5, 2}, 20);
		static ArmorMaterial armorMithril = EnumHelper.addArmorMaterial("armorMithril", 80, new int[]{3, 8, 6, 3}, 10);
		//mythical armor
		public static Item bronzeHelmet = new BronzeArmor(armorBronze, idBRH, 0).setUnlocalizedName("bronzeHelmet").setTextureName(MythologyMod.modid + ":" + "bronzeHelmet");
		public static Item bronzeChestplate = new BronzeArmor(armorBronze, idBRC, 1).setUnlocalizedName("bronzeChestplate").setTextureName(MythologyMod.modid + ":" + "bronzeChestplate");
		public static Item bronzeLeggings = new BronzeArmor(armorBronze, idBRL, 2).setUnlocalizedName("bronzeLeggings").setTextureName(MythologyMod.modid + ":" + "bronzeLeggings");
		public static Item bronzeBoots = new BronzeArmor(armorBronze, idBRB, 3).setUnlocalizedName("bronzeBoots").setTextureName(MythologyMod.modid + ":" + "bronzeBoots");
		
		// Celestial Bronze Armor
		public static Item celestialBronzeHelmet = new CelestialBronzeArmor(armorCelestialBronze, idCBH, 0).setUnlocalizedName("celestialBronzeHelmet").setTextureName(MythologyMod.modid + ":" + "celestialBronzeHelmet");
		public static Item celestialBronzeChestplate = new CelestialBronzeArmor(armorCelestialBronze, idCBC, 1).setUnlocalizedName("celestialBronzeChestplate").setTextureName(MythologyMod.modid + ":" + "celestialBronzeChestplate");
		public static Item celestialBronzeLeggings = new CelestialBronzeArmor(armorCelestialBronze, idCBL, 2).setUnlocalizedName("celestialBronzeLeggings").setTextureName(MythologyMod.modid + ":" + "celestialBronzeLeggings");
		public static Item celestialBronzeBoots = new CelestialBronzeArmor(armorCelestialBronze, idCBB, 3).setUnlocalizedName("celestialBronzeBoots").setTextureName(MythologyMod.modid + ":" + "celestialBronzeBoots");
		
		public static Item imperialGoldHelmet = new ImperialGoldArmor(armorImperialGold, idIGH, 0).setUnlocalizedName("imperialGoldHelmet").setTextureName(MythologyMod.modid + ":" + "imperialGoldHelmet");
		public static Item imperialGoldChestplate = new ImperialGoldArmor(armorImperialGold, idIGC, 1).setUnlocalizedName("imperialGoldChestplate").setTextureName(MythologyMod.modid + ":" + "imperialGoldChestplate");
		public static Item imperialGoldLeggings = new ImperialGoldArmor(armorImperialGold, idIGL, 2).setUnlocalizedName("imperialGoldLeggings").setTextureName(MythologyMod.modid + ":" + "imperialGoldLeggings");
		public static Item imperialGoldBoots = new ImperialGoldArmor(armorImperialGold, idIGB, 3).setUnlocalizedName("imperialGoldBoots").setTextureName(MythologyMod.modid + ":" + "imperialGoldBoots");
		
		public static Item silverHelmet = new SilverArmor(armorSilver, idSIH, 0).setUnlocalizedName("silverHelmet").setTextureName(MythologyMod.modid + ":" + "silverHelmet");
		public static Item silverChestplate = new SilverArmor(armorSilver, idSIC, 1).setUnlocalizedName("silverChestplate").setTextureName(MythologyMod.modid + ":" + "silverChestplate");
		public static Item silverLeggings = new SilverArmor(armorSilver, idSIL, 2).setUnlocalizedName("silverLeggings").setTextureName(MythologyMod.modid + ":" + "silverLeggings");
		public static Item silverBoots = new SilverArmor(armorSilver, idSIB, 3).setUnlocalizedName("silverBoots").setTextureName(MythologyMod.modid + ":" + "silverBoots");
		
		public static Item mithrilHelmet = new MithrilArmor(armorMithril, idMIH, 0).setUnlocalizedName("mithrilHelmet").setTextureName(MythologyMod.modid + ":" + "mithrilHelmet");
		public static Item mithrilChestplate = new MithrilArmor(armorMithril, idMIC, 1).setUnlocalizedName("mithrilChestplate").setTextureName(MythologyMod.modid + ":" + "mithrilChestplate");
		public static Item mithrilLeggings = new MithrilArmor(armorMithril, idMIL, 2).setUnlocalizedName("mithrilLeggings").setTextureName(MythologyMod.modid + ":" + "mithrilLeggings");
		public static Item mithrilBoots = new MithrilArmor(armorMithril, idMIB, 3).setUnlocalizedName("mithrilBoots").setTextureName(MythologyMod.modid + ":" + "mithrilBoots");
		
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
		//mithril shizzle
		public static Item itemMithrilIngot = new Item().setUnlocalizedName("mithrilIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilIngot");
		public static Item itemMithrilNugget = new Item().setUnlocalizedName("mithrilNugget").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilNugget");
		public static Item itemMithrilChain = new Item().setUnlocalizedName("mithrilChain").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilChain");
		public static Item itemMithrilMail = new Item().setUnlocalizedName("mithrilMail").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilMail");
		
	


	
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
    	GameRegistry.registerItem(bronzeHelmet, "bronzeHelmet");
    	GameRegistry.registerItem(bronzeChestplate, "bronzeChestplate");
    	GameRegistry.registerItem(bronzeLeggings, "bronzeLeggings");
    	GameRegistry.registerItem(bronzeBoots, "bronzeBoots");
    	GameRegistry.registerItem(celestialBronzeHelmet, "celestialBronzeHelmet");
    	GameRegistry.registerItem(celestialBronzeChestplate, "celestialBronzeChestplate");
    	GameRegistry.registerItem(celestialBronzeLeggings, "celestialBronzeLeggings");
    	GameRegistry.registerItem(celestialBronzeBoots, "celestialBronzeBoots");
    	GameRegistry.registerItem(imperialGoldHelmet, "imperialGoldHelmet");
    	GameRegistry.registerItem(imperialGoldChestplate, "imperialGoldChestplate");
    	GameRegistry.registerItem(imperialGoldLeggings, "imperialGoldLeggings");
    	GameRegistry.registerItem(imperialGoldBoots, "imperialGoldBoots");
    	GameRegistry.registerItem(silverHelmet, "silverHelmet");
    	GameRegistry.registerItem(silverChestplate, "silverChestplate");
    	GameRegistry.registerItem(silverLeggings, "silverLeggings");
    	GameRegistry.registerItem(silverBoots, "silverBoots");
    	GameRegistry.registerItem(mithrilHelmet, "mithrilHelmet");
    	GameRegistry.registerItem(mithrilChestplate, "mithrilChestplate");
    	GameRegistry.registerItem(mithrilLeggings, "mithrilLeggings");
    	GameRegistry.registerItem(mithrilBoots, "mithrilBoots");
    	GameRegistry.registerItem(itemMithrilIngot, "itemMithrilIngot");
    	GameRegistry.registerItem(itemMithrilNugget, "itemMithrilNugget");
    	GameRegistry.registerItem(itemMithrilChain, "itemMithrilChain");
    	GameRegistry.registerItem(itemMithrilMail, "itemMithrilMail");

		
		
		//World Generator
		GameRegistry.registerWorldGenerator(new MythicalWorldGen(), 0);
		
		
		//Mob Centaur Registry
		int randomID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityCentaur.class , "mobCentaur", randomID);
        EntityRegistry.registerModEntity(EntityCentaur.class, "mobCentaur", randomID, MythologyMod.m, 64, 1, true);
        EntityRegistry.addSpawn(EntityCentaur.class, 1, 50, 200, EnumCreatureType.creature, BiomeGenBase.plains);
        
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
        EntityRegistry.addSpawn(EntityMinotaur.class, 1, 1, 5, EnumCreatureType.monster, BiomeGenBase.forest);
        
        EntityList.entityEggs.put(Integer.valueOf(randomIDMinotaur), new EntityList.EntityEggInfo(randomIDMinotaur, 0x835C3B, 0xD1D0CE));
        
        //Mob Fairy  *Needs to be Scaled*
        int randomIDFairy = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityFairy.class , "mobFairy", randomIDFairy);
        EntityRegistry.registerModEntity(EntityFairy.class, "mboFairy", randomIDFairy, MythologyMod.m, 64, 1, true);
        
        EntityList.entityEggs.put(Integer.valueOf(randomIDFairy), new EntityList.EntityEggInfo(randomIDFairy, 0x07FA10, 0xE9F5E9));
        //recipes
        MythicalRecipes.addMythicalRecipes();
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
