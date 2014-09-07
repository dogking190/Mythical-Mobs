package mythology;

import net.minecraftforge.oredict.OreDictionary;
import static mythology.MythologyMod.*;

public class MythicalDictionary {

	public static void oreRegistration()
	{

		//OreDictionaryBlocks
		OreDictionary.registerOre("oreZinc", blockZincOre);
		OreDictionary.registerOre("oreMythril", blockMithrilOre);
		OreDictionary.registerOre("oreMithril", blockMithrilOre);
		OreDictionary.registerOre("oreCopper", blockCopperOre);
		OreDictionary.registerOre("oreTin", blockTinOre);
		OreDictionary.registerOre("oreSilver", blockSilverOre);
		OreDictionary.registerOre("orePlatinum", blockPlatinumOre);
		OreDictionary.registerOre("oreRuby", blockRubyOre);
		OreDictionary.registerOre("oreSapphire", blockSapphireOre);
		OreDictionary.registerOre("oreCelestialBronze", blockCelestialBronzeOre);
		OreDictionary.registerOre("oreImperialGold", blockImperialGoldOre);



		//OreDictionaryItems
		OreDictionary.registerOre("ingotCopper", itemCopperIngot);
		OreDictionary.registerOre("ingotTin", itemTinIngot);
		OreDictionary.registerOre("ingotBronze", itemBronzeIngot);
		OreDictionary.registerOre("ingotCelestialBronze", itemCelestialBronzeIngot);
		OreDictionary.registerOre("ingotImperialGold", itemImperialGoldIngot);
		OreDictionary.registerOre("ingotPlatinum", itemPlatinumIngot);
		OreDictionary.registerOre("ingotMythril", itemMithrilIngot);
		OreDictionary.registerOre("ingotMithril", itemMithrilIngot);
		OreDictionary.registerOre("gemRuby", itemRuby);
		OreDictionary.registerOre("gemSapphire", itemSapphire);
		OreDictionary.registerOre("nuggetMythril", itemMithrilNugget);
		OreDictionary.registerOre("nuggetMithril", itemMithrilNugget);
		OreDictionary.registerOre("materialMithrilChain", itemMithrilChain);
		OreDictionary.registerOre("materialMythrilChain", itemMithrilChain);
		OreDictionary.registerOre("materialMithrilMail", itemMithrilMail);
		OreDictionary.registerOre("materialMythrilMail", itemMithrilMail);


	}

}
