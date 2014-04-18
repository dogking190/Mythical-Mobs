package mythology.modBlocks;

import java.util.Random;

import mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMysticGrass extends Block {

	MythologyMod m = new MythologyMod();
	
	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon iconBottom;
	@SideOnly(Side.CLIENT)
	protected IIcon iconTop;

	public BlockMysticGrass(String string, CreativeTabs tabMythical, Material grass) {
		super(grass);
		this.setBlockName(string);
		this.setCreativeTab(tabMythical);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.6F);
		this.setStepSound(soundTypeGrass);
        this.setTickRandomly(true);

	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		
		this.blockIcon = iconRegister.registerIcon(m.modid + ":" + "blockMysticGrass_side");
		this.iconTop = iconRegister.registerIcon(m.modid + ":" + "blockMysticGrass_top"); 
		
	}

	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        return side == 1 ? this.iconTop : (side == 0 ? m.blockMysticDirt.getBlockTextureFromSide(side) : this.blockIcon);
    }
	
	 
	 public Item getItemDropped(int i, Random k, int l)
	    {
	        return m.blockMysticDirt.getItemDropped(0, k, l);
	    }

	


}
