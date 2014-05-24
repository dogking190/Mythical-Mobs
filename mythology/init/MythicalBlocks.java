package mythology.init;

import mythology.MythologyMod;
import mythology.modBlocks.BlockBronzeBlock;
import mythology.modBlocks.BlockCelestialBronzeBlock;
import mythology.modBlocks.BlockCelestialBronzeOre;
import mythology.modBlocks.BlockCopperOre;
import mythology.modBlocks.BlockImperialGoldBlock;
import mythology.modBlocks.BlockImperialGoldOre;
import mythology.modBlocks.BlockMithrilOre;
import mythology.modBlocks.BlockMysticDirt;
import mythology.modBlocks.BlockMysticGrass;
import mythology.modBlocks.BlockPlatinumBlock;
import mythology.modBlocks.BlockPlatinumOre;
import mythology.modBlocks.BlockRubyBlock;
import mythology.modBlocks.BlockRubyOre;
import mythology.modBlocks.BlockSapphireBlock;
import mythology.modBlocks.BlockSapphireOre;
import mythology.modBlocks.BlockSilverBlock;
import mythology.modBlocks.BlockSilverOre;
import mythology.modBlocks.BlockTinOre;
import mythology.modBlocks.BlockZincOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalBlocks {
	private static MythologyMod m = new MythologyMod();
	public static void add(){

		m.blockMithrilOre = new BlockMithrilOre("oreMithril", m.tabMythical, Material.rock);
		m.blockZincOre = new BlockZincOre("oreZinc", m.tabMythical, Material.rock);
		m.blockSilverOre = new BlockSilverOre("oreSilver", m.tabMythical, Material.rock);
		m.blockCopperOre = new BlockCopperOre("oreCopper", m.tabMythical, Material.rock);
		m.blockTinOre = new BlockTinOre("oreTin", m.tabMythical, Material.rock);
		m.blockPlatinumOre = new BlockPlatinumOre("orePlatinum", m.tabMythical, Material.rock);
		m.blockRubyOre = new BlockRubyOre("oreRuby", m.tabMythical, Material.rock);
		m.blockSapphireOre = new BlockSapphireOre("oreSapphire" , m.tabMythical, Material.rock);
		m.blockImperialGoldOre = new BlockImperialGoldOre("oreImperialGold", m.tabMythical, Material.rock);
		m.blockCelestialBronzeOre = new BlockCelestialBronzeOre("oreCelestialBronze", m.tabMythical, Material.rock);
		m.blockMysticGrass = new BlockMysticGrass("blockMysticGrass", m.tabMythical, Material.grass);
		m.blockMysticDirt = new BlockMysticDirt("blockMysticDirt", m.tabMythical, Material.ground);
		m.blockSilverBlock = new BlockSilverBlock("silverBlock", m.tabMythical, Material.iron);
		m.blockBronzeBlock = new BlockBronzeBlock("bronzeBlock", m.tabMythical, Material.iron);
		m.blockCopperBlock = new BlockSilverBlock("copperBlock", m.tabMythical, Material.iron);
		m.blockTinBlock = new BlockBronzeBlock("tinBlock", m.tabMythical, Material.iron);
		m.blockPlatinumBlock = new BlockPlatinumBlock("platinumBlock", m.tabMythical, Material.iron);
		m.blockImperialGoldBlock = new BlockImperialGoldBlock("imperialGoldBlock", m.tabMythical, Material.iron);
		m.blockCelestialBronzeBlock = new BlockCelestialBronzeBlock("celestialBronzeBlock", m.tabMythical, Material.iron);
		m.blockRubyBlock = new BlockRubyBlock("rubyBlock", m.tabMythical, Material.iron);
		m.blockSapphireBlock = new BlockSapphireBlock("sapphireBlock", m.tabMythical, Material.iron);
	}
	public static void register(){
		GameRegistry.registerBlock(m.blockZincOre, "oreZinc");
		GameRegistry.registerBlock(m.blockMithrilOre, "oreMithril");
		GameRegistry.registerBlock(m.blockSilverOre, "oreSilver");
		GameRegistry.registerBlock(m.blockCopperOre, "oreCopper");
		GameRegistry.registerBlock(m.blockTinOre, "oreTin");
		GameRegistry.registerBlock(m.blockPlatinumOre, "orePlatinum");
		GameRegistry.registerBlock(m.blockRubyOre, "oreRuby");
		GameRegistry.registerBlock(m.blockSapphireOre, "oreSapphire");
		GameRegistry.registerBlock(m.blockImperialGoldOre, "oreImperialGold");
		GameRegistry.registerBlock(m.blockCelestialBronzeOre, "oreCelestialBronze");
		GameRegistry.registerBlock(m.blockMysticGrass, "blockMysticGrass");
		GameRegistry.registerBlock(m.blockMysticDirt, "blockMysticDirt");
		GameRegistry.registerBlock(m.blockBronzeBlock, "blockBronzeBlock");
		GameRegistry.registerBlock(m.blockCelestialBronzeBlock, "blockCelestialBronzeBlock");
		GameRegistry.registerBlock(m.blockImperialGoldBlock, "blockImperialGoldBlock");
		GameRegistry.registerBlock(m.blockPlatinumBlock, "blockPlatinumBlock");
		GameRegistry.registerBlock(m.blockSilverBlock, "blockSilverBlock");
		GameRegistry.registerBlock(m.blockRubyBlock, "blockRubyBlock");
		GameRegistry.registerBlock(m.blockSapphireBlock, "blockSapphireBlock");
		GameRegistry.registerBlock(m.blockCopperBlock, "blockCopperBlock");
		GameRegistry.registerBlock(m.blockTinBlock, "blockTinBlock");

	}
}
