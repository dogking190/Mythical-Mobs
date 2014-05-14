package mythology;

import net.minecraftforge.oredict.OreDictionary;

public class MythicalDictionary {

    public static void oreRegistration()
    {
    	MythologyMod m = new MythologyMod();

    	//OreDictionaryBlocks
    	OreDictionary.registerOre("oreZinc", m.blockZincOre);
    	OreDictionary.registerOre("oreMythril", m.blockMithrilOre);
    	OreDictionary.registerOre("oreMithril", m.blockMithrilOre);
    	OreDictionary.registerOre("oreCopper", m.blockCopperOre);
    	OreDictionary.registerOre("oreTin", m.blockTinOre);
    	OreDictionary.registerOre("oreSilver", m.blockSilverOre);
    	OreDictionary.registerOre("orePlatinum", m.blockPlatinumOre);
    	OreDictionary.registerOre("oreRuby", m.blockRubyOre);
    	OreDictionary.registerOre("oreSapphire", m.blockSapphireOre);
    	OreDictionary.registerOre("oreCelestialBronze", m.blockCelestialBronzeOre);
    	OreDictionary.registerOre("oreImperialGold", m.blockImperialGoldOre);



    	//OreDictionaryItems
    	OreDictionary.registerOre("ingotCopper", m.itemCopperIngot);
    	OreDictionary.registerOre("ingotTin", m.itemTinIngot);
    	OreDictionary.registerOre("ingotBronze", m.itemBronzeIngot);
    	OreDictionary.registerOre("ingotCelestialBronze", m.itemCelestialBronzeIngot);
    	OreDictionary.registerOre("ingotImperialGold", m.itemImperialGoldIngot);
    	OreDictionary.registerOre("ingotPlatinum", m.itemPlatinumIngot);
    	OreDictionary.registerOre("ingotMythril", m.itemMithrilIngot);
    	OreDictionary.registerOre("ingotMithril", m.itemMithrilIngot);
    	OreDictionary.registerOre("gemRuby", m.itemRuby);
    	OreDictionary.registerOre("gemSapphire", m.itemSapphire);
    	OreDictionary.registerOre("nuggetMythril", m.itemMithrilNugget);
    	OreDictionary.registerOre("nuggetMithril", m.itemMithrilNugget);
    	OreDictionary.registerOre("materialMithrilChain", m.itemMithrilChain);
    	OreDictionary.registerOre("materialMythrilChain", m.itemMithrilChain);
    	OreDictionary.registerOre("materialMithrilMail", m.itemMithrilMail);
    	OreDictionary.registerOre("materialMythrilMail", m.itemMithrilMail);
    	

    }

}
