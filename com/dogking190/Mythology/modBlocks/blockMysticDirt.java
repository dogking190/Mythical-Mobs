package com.dogking190.Mythology.modBlocks;

import java.util.Random;

import com.dogking190.Mythology.MythologyMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class blockMysticDirt extends Block {
	
	MythologyMod m = new MythologyMod();

	public blockMysticDirt(String string, CreativeTabs tabMythical, Material rock) {
		super(rock);
		this.setBlockName(string);
		this.setBlockTextureName(m.modid + ":" + string);
		this.setCreativeTab(tabMythical);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.6F);
		this.setStepSound(soundTypeGravel);
	}


	
}
