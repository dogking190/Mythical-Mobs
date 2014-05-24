package mythology.init;

import mythology.MythologyMod;
import mythology.modItems.CookBehemothMeat;
import mythology.modItems.ItemFur;
import mythology.modItems.ItemGnomeBeard;
import mythology.modItems.ItemScales;
import mythology.modItems.RawBehemothMeat;
import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalItems {
	private static MythologyMod m = new MythologyMod();
	public static void add(){
		//My ingots
		m.itemCopperIngot = new Item().setUnlocalizedName("copperIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemCopperIngot");
		m.itemTinIngot = new Item().setUnlocalizedName("tinIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemTinIngot");
		m.itemBronzeIngot = new Item().setUnlocalizedName("bronzeIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemBronzeIngot");
		m.itemCelestialBronzeIngot = new Item().setUnlocalizedName("celestialBronzeIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemCelestialBronzeIngot");
		m.itemImperialGoldIngot = new Item().setUnlocalizedName("imperialGoldIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemImperialGoldIngot");
		m.itemSilverIngot = new Item().setUnlocalizedName("silverIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemSilverIngot");
		m.itemPlatinumIngot = new Item().setUnlocalizedName("platinumIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemPlatinumIngot");
		m.itemRuby = new Item().setUnlocalizedName("ruby").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "ruby");
		m.itemSapphire = new Item().setUnlocalizedName("sapphire").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "sapphire");
		//mithril shizzle
		m.itemMithrilIngot = new Item().setUnlocalizedName("mithrilIngot").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemMithrilIngot");
		m.itemMithrilNugget = new Item().setUnlocalizedName("mithrilNugget").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemMithrilNugget");
		m.itemMithrilChain = new Item().setUnlocalizedName("mithrilChain").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemMithrilChain");
		m.itemMithrilMail = new Item().setUnlocalizedName("mithrilMail").setCreativeTab(m.tabMythical).setTextureName("mythical" + ":" + "itemMithrilMail");
		m.itemFur = new ItemFur("itemFur", m.tabMythical);
		m.itemScales = new ItemScales("itemScales", m.tabMythical);
		m.rawBehemothMeat = new RawBehemothMeat(4,0.4F,true, "rawBehemothMeat", m.tabMythical);
		m.cookBehemothMeat = new CookBehemothMeat(8, 0.8F, true, "cookBehemothMeat", m.tabMythical);
		m.itemGnomeBeard = new ItemGnomeBeard("itemGnomeBeard", m.tabMythical);
				
	}
	public static void register(){
		GameRegistry.registerItem(m.itemCopperIngot, "copperIngot");
    	GameRegistry.registerItem(m.itemTinIngot, "tinIngot");
    	GameRegistry.registerItem(m.itemBronzeIngot, "bronzeIngot"); 
    	GameRegistry.registerItem(m.itemCelestialBronzeIngot, "celestialBronzeIngot"); 
    	GameRegistry.registerItem(m.itemImperialGoldIngot, "imperialGoldIngot"); 
    	GameRegistry.registerItem(m.itemSilverIngot, "silverIngot");
    	GameRegistry.registerItem(m.itemGnomeBeard, "itemGnomeBeard");
    	GameRegistry.registerItem(m.itemFur, "itemFur");
    	GameRegistry.registerItem(m.rawBehemothMeat, "rawBehemothMeat");
    	GameRegistry.registerItem(m.cookBehemothMeat, "cookBehemothMeat");
    	GameRegistry.registerItem(m.itemScales, "itemScales");
    	GameRegistry.registerItem(m.itemMithrilIngot, "itemMithrilIngot");
    	GameRegistry.registerItem(m.itemMithrilNugget, "itemMithrilNugget");
    	GameRegistry.registerItem(m.itemMithrilChain, "itemMithrilChain");
    	GameRegistry.registerItem(m.itemMithrilMail, "itemMithrilMail");
    	GameRegistry.registerItem(m.itemPlatinumIngot, "itemPlatinumIngot");
		GameRegistry.registerItem(m.itemRuby, "itemRuby");
		GameRegistry.registerItem(m.itemSapphire, "itemSapphire");
		
	}
}
