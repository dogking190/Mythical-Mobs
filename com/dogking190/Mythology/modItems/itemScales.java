package com.dogking190.Mythology.modItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemScales extends Item {
	
	public itemScales(String string, CreativeTabs tab){
		
		this.setCreativeTab(tab)
		.setTextureName(m.modid + ":" + string)
		.setUnlocalizedName(string);
		
	}

}
