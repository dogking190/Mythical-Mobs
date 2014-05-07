package mythology.modBlocks;

import mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPlatinumBlock extends Block {
	MythologyMod m = new MythologyMod();
	public BlockPlatinumBlock(String string, CreativeTabs tabMythical, Material material) {
		super(material);
		this.setBlockName(string);
		this.setBlockTextureName(m.modid + ":" + string);
		this.setCreativeTab(tabMythical);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeMetal);
		this.setResistance(10.0F);
	}
}
