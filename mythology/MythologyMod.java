package mythology;

import mythology.mobs.*;
import mythology.hooks.*;
import mythology.init.*;
import mythology.modArmor.*;
import mythology.modBlocks.*;
import mythology.modItems.*;
import mythology.world.*;
import mythology.proxy.*;
import mythology.mobs.*;
import mythology.mobs.hostile.*;
import mythology.mobs.passive.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;

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
	public static Item itemTinIngot;
	public static Item itemCopperIngot;
	public static Item itemBronzeIngot;
	public static Item itemCelestialBronzeIngot;
	public static Item itemImperialGoldIngot;
	public static Item itemSilverIngot;
	public static Item itemPlatinumIngot;
	public static Item itemRuby;
	public static Item itemSapphire;
	public static Item itemMithrilIngot;
	public static Item itemMithrilNugget;
	public static Item itemMithrilChain;
	public static Item itemMithrilMail;
	
	//armor
	public static Item bronzeHelmet;
	public static Item bronzeChestplate;
	public static Item bronzeLeggings;
	public static Item bronzeBoots;
	public static Item celestialBronzeHelmet;
	public static Item celestialBronzeChestplate;
	public static Item celestialBronzeLeggings;
	public static Item celestialBronzeBoots;
	public static Item imperialGoldHelmet;
	public static Item imperialGoldChestplate;
	public static Item imperialGoldLeggings;
	public static Item imperialGoldBoots;
	public static Item silverHelmet;
	public static Item silverChestplate;
	public static Item silverLeggings;
	public static Item silverBoots;
	public static Item mithrilHelmet;
	public static Item mithrilChestplate;
	public static Item mithrilLeggings;
	public static Item mithrilBoots;
	public static Item rubyHelmet;
	public static Item rubyChestplate;
	public static Item rubyLeggings;
	public static Item rubyBoots;
	public static Item sapphireHelmet;
	public static Item sapphireChestplate;
	public static Item sapphireLeggings;
	public static Item sapphireBoots;
	//tools
	public static Item swordBronze;
	public static Item swordCelestialBronze;
	public static Item swordImperialGold;
	public static Item swordSilver;
	public static Item swordRuby;
	public static Item swordSapphire;
	
	public static Item pickaxeBronze;
	public static Item pickaxeCelestialBronze;
	public static Item pickaxeImperialGold;
	public static Item pickaxeSilver;
	public static Item pickaxeRuby;
	public static Item pickaxeSapphire;
	
	public static Item shovelBronze;
	public static Item shovelCelestialBronze;
	public static Item shovelImperialGold;
	public static Item shovelSilver;
	public static Item shovelRuby;
	public static Item shovelSapphire;
	
	public static Item axeBronze;
	public static Item axeCelestialBronze;
	public static Item axeImperialGold;
	public static Item axeSilver;
	public static Item axeRuby;
	public static Item axeSapphire;
	
	public static Item hoeBronze;
	public static Item hoeCelestialBronze;
	public static Item hoeImperialGold;
	public static Item hoeSilver;
	public static Item hoeRuby;
	public static Item hoeSapphire;
	
	// Creative Tabs
	public static CreativeTabs tabMythical = new CreativeTabs("tabMythical") {
		@Override
		public Item getTabIconItem() {
			return MythologyMod.swordImperialGold;
		}
	};
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event) {
		MythicalBlocks.add();
		MythicalBlocks.register();
		
		MythicalItems.add();
		MythicalItems.register();
		
		MythicalArmor.add();
		MythicalArmor.register();
		
		MythicalTools.add();
		MythicalTools.register();
		
		MythicalMobs.register();
		
		MythicalDictionary.oreRegistration();
		
		GameRegistry.registerWorldGenerator(new MythicalWorldGen(), 0);
		
		MythicalRecipes.addMythicalRecipes();
		
		proxy.RenderEntity();
	}

	@EventHandler
	public void Load(FMLInitializationEvent event) {

	}

	@EventHandler
	public void PostLoad(FMLPostInitializationEvent event) {

	}
}