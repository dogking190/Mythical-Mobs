package mythology;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import mythology.MythologyMod;
public class MythicalRecipes {
	
	public static void addMythicalRecipes(){
		MythologyMod m = new MythologyMod();
		//Smelting recipes
		GameRegistry.addSmelting(m.blockCopperOre, new ItemStack(m.itemCopperIngot, 1), 0.7F);
		GameRegistry.addSmelting(m.blockTinOre, new ItemStack(m.itemTinIngot, 1), 0.7F);
		GameRegistry.addSmelting(m.blockCelestialBronzeOre, new ItemStack(m.itemCelestialBronzeIngot, 1), 1.0F);
		GameRegistry.addSmelting(m.blockImperialGoldOre, new ItemStack(m.itemImperialGoldIngot, 1), 1.0F);
		GameRegistry.addSmelting(m.blockSilverOre, new ItemStack(m.itemSilverIngot, 1), 0.9F);
		GameRegistry.addSmelting(m.rawBehemothMeat, new ItemStack(m.cookBehemothMeat, 1), 1.0F);
		GameRegistry.addSmelting(m.blockMithrilOre, new ItemStack(m.itemMithrilIngot, 1), 3.0F);
		GameRegistry.addSmelting(m.blockPlatinumOre, new ItemStack(m.itemPlatinumIngot, 1), 0.9F);
		GameRegistry.addSmelting(m.blockRubyOre, new ItemStack(m.itemRuby, 2), 0.7F);
		GameRegistry.addSmelting(m.blockSapphireOre, new ItemStack(m.itemSapphire, 2), 0.7F);
		
		//Crafting recipes
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.swordBronze, 1), new Object[] { "I", "I", "S", 'I', "ingotBronze", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.pickaxeBronze, 1), new Object[] { "III", " S ", " S ", 'I', "ingotBronze", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.axeBronze, 1), new Object[] { "II", "IS", " S", 'I', "ingotBronze", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.hoeBronze, 1), new Object[] { "II", " S", " S", 'I', "ingotBronze", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.shovelBronze, 1), new Object[] { "I", "S", "S", 'I', "ingotBronze", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.swordCelestialBronze, 1), new Object[] { "I", "I", "S", 'I', "ingotCelestialBronze", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.pickaxeCelestialBronze, 1), new Object[] { "III", " S ", " S ", 'I', "ingotCelestialBronze", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.axeCelestialBronze, 1), new Object[] { "II", "IS", " S", 'I', "ingotCelestialBronze", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.hoeCelestialBronze, 1), new Object[] { "II", " S", " S", 'I', "ingotCelestialBronze", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.shovelCelestialBronze, 1), new Object[] { "I", "S", "S", 'I', "ingotCelestialBronze", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.swordImperialGold, 1), new Object[] { "I", "I", "S", 'I', "ingotImperialGold", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.pickaxeImperialGold, 1), new Object[] { "III", " S ", " S ", 'I', "ingotImperialGold", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.axeImperialGold, 1), new Object[] { "II", "IS", " S", 'I', "ingotImperialGold", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.hoeImperialGold, 1), new Object[] { "II", " S", " S", 'I', "ingotImperialGold", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.shovelImperialGold, 1), new Object[] { "I", "S", "S", 'I', "ingotImperialGold", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.swordSilver, 1), new Object[] { "I", "I", "S", 'I', "ingotSilver", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.pickaxeSilver, 1), new Object[] { "III", " S ", " S ", 'I', "ingotSilver", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.axeSilver, 1), new Object[] { "II", "IS", " S", 'I', "ingotSilver", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.hoeSilver, 1), new Object[] { "II", " S", " S", 'I', "ingotSilver", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.shovelSilver, 1), new Object[] { "I", "S", "S", 'I', "ingotSilver", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.bronzeHelmet, 1), new Object[] { "III", "I I", 'I', "ingotBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.bronzeChestplate, 1), new Object[] { "I I", "III", "III", 'I', "ingotBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.bronzeLeggings, 1), new Object[] { "III", "I I", "I I", 'I', "ingotBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.bronzeBoots, 1), new Object[] { "I I", "I I", 'I', "ingotBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.celestialBronzeHelmet, 1), new Object[] { "III", "I I", 'I', "ingotCelestialBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.celestialBronzeChestplate, 1), new Object[] { "I I", "III", "III", 'I', "ingotCelestialBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.celestialBronzeLeggings, 1), new Object[] { "III", "I I", "I I", 'I', "ingotCelestialBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.celestialBronzeBoots, 1), new Object[] { "I I", "I I", 'I', "ingotCelestialBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.imperialGoldHelmet, 1), new Object[] { "III", "I I", 'I', "ingotImperialGold"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.imperialGoldChestplate, 1), new Object[] { "I I", "III", "III", 'I', "ingotImperialGold"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.imperialGoldLeggings, 1), new Object[] { "III", "I I", "I I", 'I', "ingotImperialGold"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.imperialGoldBoots, 1), new Object[] { "I I", "I I", 'I', "ingotImperialGold"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.silverHelmet, 1), new Object[] { "III", "I I", 'I', "ingotSilver"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.silverChestplate, 1), new Object[] { "I I", "III", "III", 'I', "ingotSilver"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.silverLeggings, 1), new Object[] { "III", "I I", "I I", 'I', "ingotSilver"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.silverBoots, 1), new Object[] { "I I", "I I", 'I', "ingotSilver"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.mithrilHelmet, 1), new Object[] { "III", "I I", 'I', "materialMythrilMail"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.mithrilChestplate, 1), new Object[] { "I I", "III", "III", 'I', "materialMythrilMail"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.mithrilLeggings, 1), new Object[] { "III", "I I", "I I", 'I', "materialMythrilMail"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.mithrilBoots, 1), new Object[] { "I I", "I I", 'I', "materialMythrilMail"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(m.itemMithrilNugget, 9), new Object[]{"ingotMythril"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.itemMithrilChain, 3), new Object[] { " I ", "I I", " I ", 'I', "nuggetMythril"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.itemMithrilMail, 1), new Object[] { "III", "III", "III", 'I', "materialMithrilChain"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.blockBronzeBlock, 1), new Object[] { "III", "III", "III", 'I', "ingotBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.blockCelestialBronzeBlock, 1), new Object[] { "III", "III", "III", 'I', "ingotCelestialBronze"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.blockImperialGoldBlock, 1), new Object[] { "III", "III", "III", 'I', "ingotImperialGold"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.blockPlatinumBlock, 1), new Object[] { "III", "III", "III", 'I', "ingotPlatinum"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.blockSilverBlock, 1), new Object[] { "III", "III", "III", 'I', "ingotSilver"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.blockRubyBlock, 1), new Object[] { "III", "III", "III", 'I', "gemRuby"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.blockSapphireBlock, 1), new Object[] { "III", "III", "III", 'I', "gemSapphire"}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.swordRuby, 1), new Object[] { "I", "I", "S", 'I', "gemRuby", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.pickaxeRuby, 1), new Object[] { "III", " S ", " S ", 'I', "gemRuby", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.axeRuby, 1), new Object[] { "II", "IS", " S", 'I', "gemRuby", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.hoeRuby, 1), new Object[] { "II", " S", " S", 'I', "gemRuby", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.shovelRuby, 1), new Object[] { "I", "S", "S", 'I', "gemRuby", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.swordSapphire, 1), new Object[] { "I", "I", "S", 'I', "gemSapphire", 'S', Items.stick}));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.pickaxeSapphire, 1), new Object[] { "III", " S ", " S ", 'I', "gemSapphire", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.axeSapphire, 1), new Object[] { "II", "IS", " S", 'I', "gemSapphire", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.hoeSapphire, 1), new Object[] { "II", " S", " S", 'I', "gemSapphire", 'S', Items.stick }));
				CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(m.shovelSapphire, 1), new Object[] { "I", "S", "S", 'I', "gemSapphire", 'S', Items.stick}));
		
	}
}
