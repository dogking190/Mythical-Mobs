package mythology.init;

import static mythology.MythologyMod.*;
import mythology.items.*;
import mythology.items.ItemCookedBehemothMeat;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalItems {

	public static void add(){
		//My ingots
		itemCopperIngot = new Item().setUnlocalizedName("copperIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemCopperIngot");
		itemTinIngot = new Item().setUnlocalizedName("tinIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemTinIngot");
		itemBronzeIngot = new Item().setUnlocalizedName("bronzeIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemBronzeIngot");
		itemCelestialBronzeIngot = new Item().setUnlocalizedName("celestialBronzeIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemCelestialBronzeIngot");
		itemImperialGoldIngot = new Item().setUnlocalizedName("imperialGoldIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemImperialGoldIngot");
		itemSilverIngot = new Item().setUnlocalizedName("silverIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemSilverIngot");
		itemPlatinumIngot = new Item().setUnlocalizedName("platinumIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemPlatinumIngot");
		itemRuby = new Item().setUnlocalizedName("ruby").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "ruby");
		itemSapphire = new Item().setUnlocalizedName("sapphire").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "sapphire");

		//mithril shizzle
		itemMithrilIngot = new Item().setUnlocalizedName("mithrilIngot").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemMithrilIngot");
		itemMithrilNugget = new Item().setUnlocalizedName("mithrilNugget").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemMithrilNugget");
		itemMithrilChain = new Item().setUnlocalizedName("mithrilChain").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemMithrilChain");
		itemMithrilMail = new Item().setUnlocalizedName("mithrilMail").setCreativeTab(tabMythical).setTextureName(MODID + ":" + "itemMithrilMail");
		itemFur = new ItemFur("itemFur", tabMythical);
		itemScales = new ItemScale("itemScales", tabMythical);
		rawBehemothMeat = new RawBehemothMeat(4,0.4F,true, "rawBehemothMeat", tabMythical);
		cookBehemothMeat = new ItemCookedBehemothMeat(8, 0.8F, true, "cookBehemothMeat", tabMythical);
		itemGnomeBeard = new ItemGnomeBeard("itemGnomeBeard", tabMythical);

	}
	public static void register(){
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
		GameRegistry.registerItem(itemMithrilIngot, "itemMithrilIngot");
		GameRegistry.registerItem(itemMithrilNugget, "itemMithrilNugget");
		GameRegistry.registerItem(itemMithrilChain, "itemMithrilChain");
		GameRegistry.registerItem(itemMithrilMail, "itemMithrilMail");
		GameRegistry.registerItem(itemPlatinumIngot, "itemPlatinumIngot");
		GameRegistry.registerItem(itemRuby, "itemRuby");
		GameRegistry.registerItem(itemSapphire, "itemSapphire");

	}
}
