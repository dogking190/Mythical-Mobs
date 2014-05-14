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
	
	//Mod Info
	public static final String modid = "mythical";
	public static final String version = "1.0.0";
	public static final String name = "Mythical Creatures";
	
	//Our Mod Blocks
	public static Block blockZincOre;
	public static Block blockMithrilOre;
	public static Block blockSilverOre;
	public static Block blockCopperOre;
	public static Block blockTinOre;
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
	public static Block blockRubyBlock;
	public static Block blockSapphireBlock;
	public static Block blockCopperBlock;
	public static Block blockTinBlock;

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
			
			return MythologyMod.swordImperialGold;

		}
	};
	
		//Setting new toolmaterials
		static ToolMaterial toolBronze = EnumHelper.addToolMaterial("BRONZE", 2, 341, 5.0F, 2F, 14);
		static ToolMaterial toolCelestialBronze = EnumHelper.addToolMaterial("CELESTIALBRONZE", 2, 453, 6.4F, 3F, 10);
		static ToolMaterial toolImperialGold = EnumHelper.addToolMaterial("IMPERIALGOLD", 2, 532, 8F, 5F, 10);
		static ToolMaterial toolSilver = EnumHelper.addToolMaterial("SILVER", 2, 332, 5.8F, 4F, 14);
		static ToolMaterial toolRuby = EnumHelper.addToolMaterial("RUBY", 2, 330, 5.0F, 2F, 14);
		static ToolMaterial toolSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 2, 330, 5.0F, 2F, 14);
		
		//setting new armor materials
		static ArmorMaterial armorBronze = EnumHelper.addArmorMaterial("BRONZE", 15, new int[]{2, 6, 5, 2}, 15);
		static ArmorMaterial armorCelestialBronze = EnumHelper.addArmorMaterial("CELESTIALBRONZE", 25, new int[]{3, 6, 5, 3}, 9);
		static ArmorMaterial armorImperialGold = EnumHelper.addArmorMaterial("IMPERIALGOLD", 25, new int[]{3, 6, 5, 3}, 9);
		static ArmorMaterial armorSilver = EnumHelper.addArmorMaterial("SILVER", 20, new int[]{3, 6, 5, 2}, 20);
		static ArmorMaterial armorMithril = EnumHelper.addArmorMaterial("MITHRIL", 100, new int[]{3, 8, 6, 3}, 10);
		static ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY", 15, new int[]{2, 6, 5, 2}, 20);
		static ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 15, new int[]{2, 6, 5, 2}, 20);
		
		
		//mythical armor
		public static Item bronzeHelmet = new BronzeArmor(armorBronze, 4, 0).setUnlocalizedName("bronzeHelmet").setTextureName(MythologyMod.modid + ":" + "bronzeHelmet");
		public static Item bronzeChestplate = new BronzeArmor(armorBronze, 4, 1).setUnlocalizedName("bronzeChestplate").setTextureName(MythologyMod.modid + ":" + "bronzeChestplate");
		public static Item bronzeLeggings = new BronzeArmor(armorBronze, 4, 2).setUnlocalizedName("bronzeLeggings").setTextureName(MythologyMod.modid + ":" + "bronzeLeggings");
		public static Item bronzeBoots = new BronzeArmor(armorBronze, 4, 3).setUnlocalizedName("bronzeBoots").setTextureName(MythologyMod.modid + ":" + "bronzeBoots");
		public static Item celestialBronzeHelmet = new CelestialBronzeArmor(armorCelestialBronze, 4, 0).setUnlocalizedName("celestialBronzeHelmet").setTextureName(MythologyMod.modid + ":" + "celestialBronzeHelmet");
		public static Item celestialBronzeChestplate = new CelestialBronzeArmor(armorCelestialBronze, 4, 1).setUnlocalizedName("celestialBronzeChestplate").setTextureName(MythologyMod.modid + ":" + "celestialBronzeChestplate");
		public static Item celestialBronzeLeggings = new CelestialBronzeArmor(armorCelestialBronze, 4, 2).setUnlocalizedName("celestialBronzeLeggings").setTextureName(MythologyMod.modid + ":" + "celestialBronzeLeggings");
		public static Item celestialBronzeBoots = new CelestialBronzeArmor(armorCelestialBronze, 4, 3).setUnlocalizedName("celestialBronzeBoots").setTextureName(MythologyMod.modid + ":" + "celestialBronzeBoots");
		public static Item imperialGoldHelmet = new ImperialGoldArmor(armorImperialGold, 4, 0).setUnlocalizedName("imperialGoldHelmet").setTextureName(MythologyMod.modid + ":" + "imperialGoldHelmet");
		public static Item imperialGoldChestplate = new ImperialGoldArmor(armorImperialGold, 4, 1).setUnlocalizedName("imperialGoldChestplate").setTextureName(MythologyMod.modid + ":" + "imperialGoldChestplate");
		public static Item imperialGoldLeggings = new ImperialGoldArmor(armorImperialGold, 4, 2).setUnlocalizedName("imperialGoldLeggings").setTextureName(MythologyMod.modid + ":" + "imperialGoldLeggings");
		public static Item imperialGoldBoots = new ImperialGoldArmor(armorImperialGold, 4, 3).setUnlocalizedName("imperialGoldBoots").setTextureName(MythologyMod.modid + ":" + "imperialGoldBoots");
		public static Item silverHelmet = new SilverArmor(armorSilver, 4, 0).setUnlocalizedName("silverHelmet").setTextureName(MythologyMod.modid + ":" + "silverHelmet");
		public static Item silverChestplate = new SilverArmor(armorSilver, 4, 1).setUnlocalizedName("silverChestplate").setTextureName(MythologyMod.modid + ":" + "silverChestplate");
		public static Item silverLeggings = new SilverArmor(armorSilver, 4, 2).setUnlocalizedName("silverLeggings").setTextureName(MythologyMod.modid + ":" + "silverLeggings");
		public static Item silverBoots = new SilverArmor(armorSilver, 4, 3).setUnlocalizedName("silverBoots").setTextureName(MythologyMod.modid + ":" + "silverBoots");
		public static Item mithrilHelmet = new MithrilArmor(armorMithril, 4, 0).setUnlocalizedName("mithrilHelmet").setTextureName(MythologyMod.modid + ":" + "mithrilHelmet");
		public static Item mithrilChestplate = new MithrilArmor(armorMithril, 4, 1).setUnlocalizedName("mithrilChestplate").setTextureName(MythologyMod.modid + ":" + "mithrilChestplate");
		public static Item mithrilLeggings = new MithrilArmor(armorMithril, 4, 2).setUnlocalizedName("mithrilLeggings").setTextureName(MythologyMod.modid + ":" + "mithrilLeggings");
		public static Item mithrilBoots = new MithrilArmor(armorMithril, 4, 3).setUnlocalizedName("mithrilBoots").setTextureName(MythologyMod.modid + ":" + "mithrilBoots");
		public static Item rubyHelmet = new RubyArmor(armorRuby, 4, 0).setUnlocalizedName("rubyHelmet").setTextureName(MythologyMod.modid + ":" + "rubyHelmet");
		public static Item rubyChestplate = new RubyArmor(armorRuby, 4, 1).setUnlocalizedName("rubyChestplate").setTextureName(MythologyMod.modid + ":" + "rubyChestplate");
		public static Item rubyLeggings = new RubyArmor(armorRuby, 4, 2).setUnlocalizedName("rubyLeggings").setTextureName(MythologyMod.modid + ":" + "rubyLeggings");
		public static Item rubyBoots = new RubyArmor(armorRuby, 4, 3).setUnlocalizedName("rubyBoots").setTextureName(MythologyMod.modid + ":" + "rubyBoots");
		public static Item sapphireHelmet = new SapphireArmor(armorSapphire, 4, 0).setUnlocalizedName("sapphireHelmet").setTextureName(MythologyMod.modid + ":" + "sapphireHelmet");
		public static Item sapphireChestplate = new SapphireArmor(armorSapphire, 4, 1).setUnlocalizedName("sapphireChestplate").setTextureName(MythologyMod.modid + ":" + "sapphireChestplate");
		public static Item sapphireLeggings = new SapphireArmor(armorSapphire, 4, 2).setUnlocalizedName("sapphireLeggings").setTextureName(MythologyMod.modid + ":" + "sapphireLeggings");
		public static Item sapphireBoots = new SapphireArmor(armorSapphire, 4, 3).setUnlocalizedName("sapphireBoots").setTextureName(MythologyMod.modid + ":" + "sapphireBoots");
		
		//My Tools temporary
		public static Item swordBronze = new ItemSword(toolBronze).setUnlocalizedName("swordBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordBronze");
		public static Item swordCelestialBronze = new ItemSwordCB(toolCelestialBronze).setUnlocalizedName("swordCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordCelestialBronze");
		public static Item swordImperialGold = new ItemSwordIG(toolImperialGold).setUnlocalizedName("swordImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordImperialGold");
		public static Item swordSilver = new ItemSword(toolSilver).setUnlocalizedName("swordSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordSilver");
		public static Item swordRuby = new ItemSword(toolRuby).setUnlocalizedName("swordRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordRuby");
		public static Item swordSapphire = new ItemSword(toolSapphire).setUnlocalizedName("swordSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "swordSapphire");
		
		public static Item pickaxeBronze = new ItemPickaxe(toolBronze).setUnlocalizedName("pickaxeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeBronze");
		public static Item pickaxeCelestialBronze = new ItemPickaxe(toolCelestialBronze).setUnlocalizedName("pickaxeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeCelestialBronze");
		public static Item pickaxeImperialGold = new ItemPickaxe(toolImperialGold).setUnlocalizedName("pickaxeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeImperialGold");
		public static Item pickaxeSilver = new ItemPickaxe(toolSilver).setUnlocalizedName("pickaxeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeSilver");
		public static Item pickaxeRuby = new ItemPickaxe(toolRuby).setUnlocalizedName("pickaxeRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeRuby");
		public static Item pickaxeSapphire = new ItemPickaxe(toolSapphire).setUnlocalizedName("pickaxeSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "pickaxeSapphire");
		
		public static Item shovelBronze = new ItemShovel(toolBronze).setUnlocalizedName("shovelBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelBronze");
		public static Item shovelCelestialBronze = new ItemShovel(toolCelestialBronze).setUnlocalizedName("shovelCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelCelestialBronze");
		public static Item shovelImperialGold = new ItemShovel(toolImperialGold).setUnlocalizedName("shovelImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelImperialGold");
		public static Item shovelSilver = new ItemShovel(toolSilver).setUnlocalizedName("shovelSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelSilver");
		public static Item shovelRuby = new ItemShovel(toolRuby).setUnlocalizedName("shovelRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelRuby");
		public static Item shovelSapphire = new ItemShovel(toolSapphire).setUnlocalizedName("shovelSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "shovelSapphire");
		
		public static Item axeBronze = new ItemAxe(toolBronze).setUnlocalizedName("axeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeBronze");
		public static Item axeCelestialBronze = new ItemAxe(toolCelestialBronze).setUnlocalizedName("axeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeCelestialBronze");
		public static Item axeImperialGold = new ItemAxe(toolImperialGold).setUnlocalizedName("axeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeImperialGold");
		public static Item axeSilver = new ItemAxe(toolSilver).setUnlocalizedName("axeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeSilver");
		public static Item axeRuby = new ItemAxe(toolRuby).setUnlocalizedName("axeRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeRuby");
		public static Item axeSapphire = new ItemAxe(toolSapphire).setUnlocalizedName("axeSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "axeSapphire");
		
		public static Item hoeBronze = new ItemHoe(toolBronze).setUnlocalizedName("hoeBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeBronze");
		public static Item hoeCelestialBronze = new ItemHoe(toolCelestialBronze).setUnlocalizedName("hoeCelestialBronze").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeCelestialBronze");
		public static Item hoeImperialGold = new ItemHoeIG(toolImperialGold).setUnlocalizedName("hoeImperialGold").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeImperialGold");
		public static Item hoeSilver = new ItemHoe(toolSilver).setUnlocalizedName("hoeSilver").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeSilver");
		public static Item hoeRuby = new ItemHoe(toolRuby).setUnlocalizedName("hoeRuby").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeRuby");
		public static Item hoeSapphire = new ItemHoe(toolSapphire).setUnlocalizedName("hoeSapphire").setCreativeTab(tabMythical).setTextureName(MythologyMod.modid + ":" + "hoeSapphire");
		
		//My ingots
		public static Item itemCopperIngot = new Item().setUnlocalizedName("copperIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemCopperIngot");
		public static Item itemTinIngot = new Item().setUnlocalizedName("tinIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemTinIngot");
		public static Item itemBronzeIngot = new Item().setUnlocalizedName("bronzeIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemBronzeIngot");
		public static Item itemCelestialBronzeIngot = new Item().setUnlocalizedName("celestialBronzeIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemCelestialBronzeIngot");
		public static Item itemImperialGoldIngot = new Item().setUnlocalizedName("imperialGoldIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemImperialGoldIngot");
		public static Item itemSilverIngot = new Item().setUnlocalizedName("silverIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemSilverIngot");
		public static Item itemPlatinumIngot = new Item().setUnlocalizedName("platinumIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemPlatinumIngot");
		public static Item itemRuby = new Item().setUnlocalizedName("ruby").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "ruby");
		public static Item itemSapphire = new Item().setUnlocalizedName("sapphire").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "sapphire");
		//mithril shizzle
		public static Item itemMithrilIngot = new Item().setUnlocalizedName("mithrilIngot").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilIngot");
		public static Item itemMithrilNugget = new Item().setUnlocalizedName("mithrilNugget").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilNugget");
		public static Item itemMithrilChain = new Item().setUnlocalizedName("mithrilChain").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilChain");
		public static Item itemMithrilMail = new Item().setUnlocalizedName("mithrilMail").setCreativeTab(tabMythical).setTextureName("mythical" + ":" + "itemMithrilMail");
		
	


	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event) {
		
		//Defines The Blocks in Minecraft
		blockMithrilOre = new BlockMithrilOre("oreMithril", tabMythical, Material.rock);
		blockZincOre = new BlockZincOre("oreZinc", tabMythical, Material.rock);
		blockSilverOre = new BlockSilverOre("oreSilver", tabMythical, Material.rock);
		blockCopperOre = new BlockCopperOre("oreCopper", tabMythical, Material.rock);
		blockTinOre = new BlockTinOre("oreTin", tabMythical, Material.rock);
		blockPlatinumOre = new BlockPlatinumOre("orePlatinum", tabMythical, Material.rock);
		blockRubyOre = new BlockRubyOre("oreRuby", tabMythical, Material.rock);
		blockSapphireOre = new BlockSapphireOre("oreSapphire" , tabMythical, Material.rock);
		blockImperialGoldOre = new BlockImperialGoldOre("oreImperialGold", tabMythical, Material.rock);
		blockCelestialBronzeOre = new BlockCelestialBronzeOre("oreCelestialBronze", tabMythical, Material.rock);
		blockMysticGrass = new BlockMysticGrass("blockMysticGrass", tabMythical, Material.grass);
		blockMysticDirt = new BlockMysticDirt("blockMysticDirt", tabMythical, Material.ground);
		blockSilverBlock = new BlockSilverBlock("silverBlock", tabMythical, Material.iron);
		blockBronzeBlock = new BlockBronzeBlock("bronzeBlock", tabMythical, Material.iron);
		blockCopperBlock = new BlockSilverBlock("copperBlock", tabMythical, Material.iron);
		blockTinBlock = new BlockBronzeBlock("tinBlock", tabMythical, Material.iron);
		blockPlatinumBlock = new BlockPlatinumBlock("platinumBlock", tabMythical, Material.iron);
		blockImperialGoldBlock = new BlockImperialGoldBlock("imperialGoldBlock", tabMythical, Material.iron);
		blockCelestialBronzeBlock = new BlockCelestialBronzeBlock("celestialBronzeBlock", tabMythical, Material.iron);
		blockRubyBlock = new BlockRubyBlock("rubyBlock", tabMythical, Material.iron);
		blockSapphireBlock = new BlockSapphireBlock("sapphireBlock", tabMythical, Material.iron);

		//Defines The Items in Minecraft
		itemFur = new ItemFur("itemFur", tabMythical);
		itemScales = new ItemScales("itemScales", tabMythical);
		rawBehemothMeat = new RawBehemothMeat(4,0.4F,true, "rawBehemothMeat", tabMythical);
		cookBehemothMeat = new CookBehemothMeat(8, 0.8F, true, "cookBehemothMeat", tabMythical);
		itemGnomeBeard = new ItemGnomeBeard("itemGnomeBeard", tabMythical);
		 
		//Adds Blocks into Minecraft
		MythicalDictionary.oreRegistration();
		
		GameRegistry.registerBlock(blockZincOre, "oreZinc");
		GameRegistry.registerBlock(blockMithrilOre, "oreMithril");
		GameRegistry.registerBlock(blockSilverOre, "oreSilver");
		GameRegistry.registerBlock(blockCopperOre, "oreCopper");
		GameRegistry.registerBlock(blockTinOre, "oreTin");
		GameRegistry.registerBlock(blockPlatinumOre, "orePlatinum");
		GameRegistry.registerBlock(blockRubyOre, "oreRuby");
		GameRegistry.registerBlock(blockSapphireOre, "oreSapphire");
		GameRegistry.registerBlock(blockImperialGoldOre, "oreImperialGold");
		GameRegistry.registerBlock(blockCelestialBronzeOre, "oreCelestialBronze");
		GameRegistry.registerBlock(blockMysticGrass, "blockMysticGrass");
		GameRegistry.registerBlock(blockMysticDirt, "blockMysticDirt");
		GameRegistry.registerBlock(blockBronzeBlock, "blockBronzeBlock");
		GameRegistry.registerBlock(blockCelestialBronzeBlock, "blockCelestialBronzeBlock");
		GameRegistry.registerBlock(blockImperialGoldBlock, "blockImperialGoldBlock");
		GameRegistry.registerBlock(blockPlatinumBlock, "blockPlatinumBlock");
		GameRegistry.registerBlock(blockSilverBlock, "blockSilverBlock");
		GameRegistry.registerBlock(blockRubyBlock, "blockRubyBlock");
		GameRegistry.registerBlock(blockSapphireBlock, "blockSapphireBlock");
		GameRegistry.registerBlock(blockCopperBlock, "blockCopperBlock");
		GameRegistry.registerBlock(blockTinBlock, "blockTinBlock");

		//Adds Items into Minecraft
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
    	GameRegistry.registerItem(itemCopperIngot, "copperIngot");
    	GameRegistry.registerItem(itemTinIngot, "tinIngot");
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
    	GameRegistry.registerItem(itemPlatinumIngot, "itemPlatinumIngot");
		GameRegistry.registerItem(itemRuby, "itemRuby");
		GameRegistry.registerItem(itemSapphire, "itemSapphire");
		GameRegistry.registerItem(rubyHelmet, "rubyHelmet");
    	GameRegistry.registerItem(rubyChestplate, "rubyChestplate");
    	GameRegistry.registerItem(rubyLeggings, "rubyLeggings");
    	GameRegistry.registerItem(rubyBoots, "rubyBoots");
    	GameRegistry.registerItem(sapphireHelmet, "sapphireHelmet");
    	GameRegistry.registerItem(sapphireChestplate, "sapphireChestplate");
    	GameRegistry.registerItem(sapphireLeggings, "sapphireLeggings");
    	GameRegistry.registerItem(sapphireBoots, "sapphireBoots");
    	
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
