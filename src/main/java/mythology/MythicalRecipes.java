package mythology;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.	GameRegistry;
import static mythology.MythologyMod.*;
public class MythicalRecipes {

	public static void addMythicalRecipes(){

		//Smelting recipes
		GameRegistry.addSmelting(blockCopperOre, new ItemStack(itemCopperIngot, 1), 0.7F);
		GameRegistry.addSmelting(blockTinOre, new ItemStack(itemTinIngot, 1), 0.7F);
		GameRegistry.addSmelting(blockCelestialBronzeOre, new ItemStack(itemCelestialBronzeIngot, 1), 1.0F);
		GameRegistry.addSmelting(blockImperialGoldOre, new ItemStack(itemImperialGoldIngot, 1), 1.0F);
		GameRegistry.addSmelting(blockSilverOre, new ItemStack(itemSilverIngot, 1), 0.9F);
		GameRegistry.addSmelting(rawBehemothMeat, new ItemStack(cookBehemothMeat, 1), 1.0F);
		GameRegistry.addSmelting(blockMithrilOre, new ItemStack(itemMithrilIngot, 1), 3.0F);
		GameRegistry.addSmelting(blockPlatinumOre, new ItemStack(itemPlatinumIngot, 1), 0.9F);
		GameRegistry.addSmelting(blockRubyOre, new ItemStack(itemRuby, 2), 0.7F);
		GameRegistry.addSmelting(blockSapphireOre, new ItemStack(itemSapphire, 2), 0.7F);

		//Crafting recipes
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(swordBronze, 1), "I", "I", "S", 'I', "ingotBronze", 'S', Items.stick));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(pickaxeBronze, 1), "III", " S ", " S ", 'I', "ingotBronze", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(axeBronze, 1), "II", "IS", " S", 'I', "ingotBronze", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(hoeBronze, 1), "II", " S", " S", 'I', "ingotBronze", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(shovelBronze, 1), "I", "S", "S", 'I', "ingotBronze", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(swordCelestialBronze, 1), "I", "I", "S", 'I', "ingotCelestialBronze", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(pickaxeCelestialBronze, 1), "III", " S ", " S ", 'I', "ingotCelestialBronze", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(axeCelestialBronze, 1), "II", "IS", " S", 'I', "ingotCelestialBronze", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(hoeCelestialBronze, 1), "II", " S", " S", 'I', "ingotCelestialBronze", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(shovelCelestialBronze, 1), "I", "S", "S", 'I', "ingotCelestialBronze", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(swordImperialGold, 1), "I", "I", "S", 'I', "ingotImperialGold", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(pickaxeImperialGold, 1), "III", " S ", " S ", 'I', "ingotImperialGold", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(axeImperialGold, 1), "II", "IS", " S", 'I', "ingotImperialGold", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(hoeImperialGold, 1), "II", " S", " S", 'I', "ingotImperialGold", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(shovelImperialGold, 1), "I", "S", "S", 'I', "ingotImperialGold", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(swordSilver, 1), "I", "I", "S", 'I', "ingotSilver", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(pickaxeSilver, 1), "III", " S ", " S ", 'I', "ingotSilver", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(axeSilver, 1), "II", "IS", " S", 'I', "ingotSilver", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(hoeSilver, 1), "II", " S", " S", 'I', "ingotSilver", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(shovelSilver, 1), "I", "S", "S", 'I', "ingotSilver", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(bronzeHelmet, 1), "III", "I I", 'I', "ingotBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(bronzeChestplate, 1), "I I", "III", "III", 'I', "ingotBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(bronzeLeggings, 1), "III", "I I", "I I", 'I', "ingotBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(bronzeBoots, 1), "I I", "I I", 'I', "ingotBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(celestialBronzeHelmet, 1), "III", "I I", 'I', "ingotCelestialBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(celestialBronzeChestplate, 1), "I I", "III", "III", 'I', "ingotCelestialBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(celestialBronzeLeggings, 1), "III", "I I", "I I", 'I', "ingotCelestialBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(celestialBronzeBoots, 1), "I I", "I I", 'I', "ingotCelestialBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(imperialGoldHelmet, 1), "III", "I I", 'I', "ingotImperialGold")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(imperialGoldChestplate, 1), "I I", "III", "III", 'I', "ingotImperialGold")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(imperialGoldLeggings, 1), "III", "I I", "I I", 'I', "ingotImperialGold")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(imperialGoldBoots, 1), "I I", "I I", 'I', "ingotImperialGold")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(silverHelmet, 1), "III", "I I", 'I', "ingotSilver")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(silverChestplate, 1), "I I", "III", "III", 'I', "ingotSilver")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(silverLeggings, 1), "III", "I I", "I I", 'I', "ingotSilver")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(silverBoots, 1), "I I", "I I", 'I', "ingotSilver")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(mithrilHelmet, 1), "III", "I I", 'I', "materialMythrilMail")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(mithrilChestplate, 1), "I I", "III", "III", 'I', "materialMythrilMail")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(mithrilLeggings, 1), "III", "I I", "I I", 'I', "materialMythrilMail")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(mithrilBoots, 1), "I I", "I I", 'I', "materialMythrilMail")));
		GameRegistry.addRecipe((new ShapelessOreRecipe(new ItemStack(itemMithrilNugget, 9), "ingotMythril")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(itemMithrilChain, 3), " I ", "I I", " I ", 'I', "nuggetMythril")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(itemMithrilMail, 1), "III", "III", "III", 'I', "materialMithrilChain")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(blockBronzeBlock, 1), "III", "III", "III", 'I', "ingotBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(blockCelestialBronzeBlock, 1), "III", "III", "III", 'I', "ingotCelestialBronze")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(blockImperialGoldBlock, 1), "III", "III", "III", 'I', "ingotImperialGold")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(blockPlatinumBlock, 1), "III", "III", "III", 'I', "ingotPlatinum")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(blockSilverBlock, 1), "III", "III", "III", 'I', "ingotSilver")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(blockRubyBlock, 1), "III", "III", "III", 'I', "gemRuby")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(blockSapphireBlock, 1), "III", "III", "III", 'I', "gemSapphire")));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(swordRuby, 1), "I", "I", "S", 'I', "gemRuby", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(pickaxeRuby, 1), "III", " S ", " S ", 'I', "gemRuby", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(axeRuby, 1), "II", "IS", " S", 'I', "gemRuby", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(hoeRuby, 1), "II", " S", " S", 'I', "gemRuby", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(shovelRuby, 1), "I", "S", "S", 'I', "gemRuby", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(swordSapphire, 1), "I", "I", "S", 'I', "gemSapphire", 'S', Items.stick)));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(pickaxeSapphire, 1), "III", " S ", " S ", 'I', "gemSapphire", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(axeSapphire, 1), "II", "IS", " S", 'I', "gemSapphire", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(hoeSapphire, 1), "II", " S", " S", 'I', "gemSapphire", 'S', Items.stick )));
		GameRegistry.addRecipe((new ShapedOreRecipe(new ItemStack(shovelSapphire, 1), "I", "S", "S", 'I', "gemSapphire", 'S', Items.stick)));
	}

}
