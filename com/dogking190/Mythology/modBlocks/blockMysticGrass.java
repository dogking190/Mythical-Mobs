package com.dogking190.Mythology.modBlocks;

import com.dogking190.Mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockMysticGrass extends Block {

	public blockMysticGrass(String string, CreativeTabs tabMythical, Material grass) {
		super(grass);
		MythologyMod m = new MythologyMod();
		this.setBlockName(string);
		this.setBlockTextureName(m.modid + ":" + string);
		this.setCreativeTab(tabMythical);
		this.setHarvestLevel("spade", 0);
		this.setHardness(0.6F);
		this.setStepSound(soundTypeGrass);
	}

}
