package mythology.blocks;

import java.util.Random;

import mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class BlockSapphireOre extends Block {

	public BlockSapphireOre(String string, CreativeTabs tabMythical, Material rock) {
		super(rock);
		this.setBlockName(string);
		this.setBlockTextureName(MythologyMod.MODID + ":" + string);
		this.setCreativeTab(tabMythical);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setStepSound(soundTypeStone);
	}
	@Override
	public Item getItemDropped(int par1, Random par2, int par3)
	{
		return MythologyMod.itemSapphire;
		
	}
	
}
