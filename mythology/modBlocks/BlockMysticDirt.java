package mythology.modBlocks;

import mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockMysticDirt extends Block {
	
	MythologyMod m = new MythologyMod();

	public BlockMysticDirt(String string, CreativeTabs tabMythical, Material rock) {
		super(rock);
		this.setBlockName(string);
		this.setBlockTextureName(m.modid + ":" + string);
		this.setCreativeTab(tabMythical);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.6F);
		this.setStepSound(soundTypeGravel);
	}


	
}
