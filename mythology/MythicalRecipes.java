package mythology;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import mythology.MythologyMod;
public class MythicalRecipes {
	
	public static void addMythicalRecipes(){
		MythologyMod m = new MythologyMod();
		//Smelting recipes
		GameRegistry.addSmelting(m.blockBronzeOre, new ItemStack(m.itemBronzeIngot, 1), 0.7F);
		GameRegistry.addSmelting(m.blockCelestialBronzeOre, new ItemStack(m.itemCelestialBronzeIngot, 1), 1.0F);
		GameRegistry.addSmelting(m.blockImperialGoldOre, new ItemStack(m.itemImperialGoldIngot, 1), 1.0F);
		GameRegistry.addSmelting(m.blockSilverOre, new ItemStack(m.itemSilverIngot, 1), 0.9F);
		GameRegistry.addSmelting(m.rawBehemothMeat, new ItemStack(m.cookBehemothMeat, 1), 1.0F);
		GameRegistry.addSmelting(m.blockMithrilOre, new ItemStack(m.itemMithrilIngot, 1), 3.0F);
				
		//Crafting recipes
		GameRegistry.addShapedRecipe(new ItemStack(m.swordBronze, 1), new Object[] { "I", "I", "S", 'I', m.itemBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.pickaxeBronze, 1), new Object[] { "III", " S ", " S ", 'I', m.itemBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.axeBronze, 1), new Object[] { "II", "IS", " S", 'I', m.itemBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.hoeBronze, 1), new Object[] { "II", " S", " S", 'I', m.itemBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.shovelBronze, 1), new Object[] { "I", "S", "S", 'I', m.itemBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.swordCelestialBronze, 1), new Object[] { "I", "I", "S", 'I', m.itemCelestialBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.pickaxeCelestialBronze, 1), new Object[] { "III", " S ", " S ", 'I', m.itemCelestialBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.axeCelestialBronze, 1), new Object[] { "II", "IS", " S", 'I', m.itemCelestialBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.hoeCelestialBronze, 1), new Object[] { "II", " S", " S", 'I', m.itemCelestialBronzeIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.shovelCelestialBronze, 1), new Object[] { "I", "S", "S", 'I', m.itemCelestialBronzeIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.swordImperialGold, 1), new Object[] { "I", "I", "S", 'I', m.itemImperialGoldIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.pickaxeImperialGold, 1), new Object[] { "III", " S ", " S ", 'I', m.itemImperialGoldIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.axeImperialGold, 1), new Object[] { "II", "IS", " S", 'I', m.itemImperialGoldIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.hoeImperialGold, 1), new Object[] { "II", " S", " S", 'I', m.itemImperialGoldIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.shovelImperialGold, 1), new Object[] { "I", "S", "S", 'I', m.itemImperialGoldIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.swordSilver, 1), new Object[] { "I", "I", "S", 'I', m.itemSilverIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.pickaxeSilver, 1), new Object[] { "III", " S ", " S ", 'I', m.itemSilverIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.axeSilver, 1), new Object[] { "II", "IS", " S", 'I', m.itemSilverIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.hoeSilver, 1), new Object[] { "II", " S", " S", 'I', m.itemSilverIngot, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(m.shovelSilver, 1), new Object[] { "I", "S", "S", 'I', m.itemSilverIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(m.bronzeHelmet, 1), new Object[] { "III", "I I", 'I', m.itemBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.bronzeChestplate, 1), new Object[] { "I I", "III", "III", 'I', m.itemBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.bronzeLeggings, 1), new Object[] { "III", "I I", "I I", 'I', m.itemBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.bronzeBoots, 1), new Object[] { "I I", "I I", 'I', m.itemBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.celestialBronzeHelmet, 1), new Object[] { "III", "I I", 'I', m.itemCelestialBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.celestialBronzeChestplate, 1), new Object[] { "I I", "III", "III", 'I', m.itemCelestialBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.celestialBronzeLeggings, 1), new Object[] { "III", "I I", "I I", 'I', m.itemCelestialBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.celestialBronzeBoots, 1), new Object[] { "I I", "I I", 'I', m.itemCelestialBronzeIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.imperialGoldHelmet, 1), new Object[] { "III", "I I", 'I', m.itemImperialGoldIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.imperialGoldChestplate, 1), new Object[] { "I I", "III", "III", 'I', m.itemImperialGoldIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.imperialGoldLeggings, 1), new Object[] { "III", "I I", "I I", 'I', m.itemImperialGoldIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.imperialGoldBoots, 1), new Object[] { "I I", "I I", 'I', m.itemImperialGoldIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.silverHelmet, 1), new Object[] { "III", "I I", 'I', m.itemSilverIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.silverChestplate, 1), new Object[] { "I I", "III", "III", 'I', m.itemSilverIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.silverLeggings, 1), new Object[] { "III", "I I", "I I", 'I', m.itemSilverIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.silverBoots, 1), new Object[] { "I I", "I I", 'I', m.itemSilverIngot});
		GameRegistry.addShapedRecipe(new ItemStack(m.mithrilHelmet, 1), new Object[] { "III", "I I", 'I', m.itemMithrilMail});
		GameRegistry.addShapedRecipe(new ItemStack(m.mithrilChestplate, 1), new Object[] { "I I", "III", "III", 'I', m.itemMithrilMail});
		GameRegistry.addShapedRecipe(new ItemStack(m.mithrilLeggings, 1), new Object[] { "III", "I I", "I I", 'I', m.itemMithrilMail});
		GameRegistry.addShapedRecipe(new ItemStack(m.mithrilBoots, 1), new Object[] { "I I", "I I", 'I', m.itemMithrilMail});
		GameRegistry.addShapelessRecipe(new ItemStack(m.itemMithrilNugget, 9), new Object[]{new ItemStack(m.itemMithrilIngot)});
		GameRegistry.addShapedRecipe(new ItemStack(m.itemMithrilChain, 3), new Object[] { " I ", "I I", " I ", 'I', m.itemMithrilNugget});
		GameRegistry.addShapedRecipe(new ItemStack(m.itemMithrilMail, 1), new Object[] { "III", "III", "III", 'I', m.itemMithrilChain});
		
	}
}
