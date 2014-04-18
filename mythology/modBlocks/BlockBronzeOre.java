package mythology.modBlocks;

import mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockBronzeOre extends Block {
	
	MythologyMod m = new MythologyMod();

	public BlockBronzeOre(String string, CreativeTabs tabMythical, Material rock) {
		super(rock);
		this.setBlockName(string);
		this.setBlockTextureName(m.modid + ":" + string);
		this.setCreativeTab(tabMythical);
		this.setHarvestLevel("Iron", 2);
		this.setHardness(3.0F);
		this.setStepSound(soundTypeStone);
	}

}
