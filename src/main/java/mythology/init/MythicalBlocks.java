package mythology.init;

import static mythology.MythologyMod.*;
import mythology.blocks.BlockBronzeBlock;
import mythology.blocks.BlockCelestialBronzeBlock;
import mythology.blocks.BlockCelestialBronzeOre;
import mythology.blocks.BlockCopperOre;
import mythology.blocks.BlockImperialGoldBlock;
import mythology.blocks.BlockImperialGoldOre;
import mythology.blocks.BlockMithrilOre;
import mythology.blocks.BlockMysticDirt;
import mythology.blocks.BlockMysticGrass;
import mythology.blocks.BlockPlatinumBlock;
import mythology.blocks.BlockPlatinumOre;
import mythology.blocks.BlockRubyBlock;
import mythology.blocks.BlockRubyOre;
import mythology.blocks.BlockSapphireBlock;
import mythology.blocks.BlockSapphireOre;
import mythology.blocks.BlockSilverBlock;
import mythology.blocks.BlockSilverOre;
import mythology.blocks.BlockTinOre;
import mythology.blocks.BlockZincOre;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalBlocks {

	public static void add(){

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
	}
	public static void register(){
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

	}
}
