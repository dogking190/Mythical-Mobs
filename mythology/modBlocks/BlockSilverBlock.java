package mythology.modBlocks;

import mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSilverBlock extends Block {
	MythologyMod m = new MythologyMod();
	public BlockSilverBlock(String string, CreativeTabs tabMythical, Material material) {
		super(material);
		this.setBlockName(string);
		this.setBlockTextureName(m.modid + ":" + string);
		this.setCreativeTab(tabMythical);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
		this.setResistance(10.0F);
	}

}
