package com.dogking190.Mythology.modBlocks;

import scala.concurrent.BlockContext;

import com.dogking190.Mythology.MythologyMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class blockMysticGrass extends Block {

	MythologyMod m = new MythologyMod();
	
	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon iconBottom;
	@SideOnly(Side.CLIENT)
	protected IIcon iconTop;

	public blockMysticGrass(String string, CreativeTabs tabMythical, Material grass) {
		super(grass);
		this.setBlockName(string);
		this.setCreativeTab(tabMythical);
		this.setHarvestLevel("spade", 0);
		this.setHardness(0.6F);
		this.setStepSound(soundTypeGrass);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		
		this.blockIcon = iconRegister.registerIcon(m.modid + ":" + "blockMysticGrass_side");
		this.iconBottom = iconRegister.registerIcon(m.modid + ":" + "blockMysticDirt");
		this.iconTop = iconRegister.registerIcon(m.modid + ":" + "blockMysticGrass_top"); 
		
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata){

			return side == 1 ? this.iconTop : (side == 0 ? this.iconBottom : side != metadata ? this.blockIcon : this.blockIcon);
			
	}
	


}
