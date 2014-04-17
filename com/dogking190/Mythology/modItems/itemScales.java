package com.dogking190.Mythology.modItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.dogking190.Mythology.MythologyMod;

public class itemScales extends Item {
	
	public itemScales(String string, CreativeTabs tab){
		
		MythologyMod m = new MythologyMod();
		this.setCreativeTab(tab)
		.setTextureName(m.modid + ":" + string)
		.setUnlocalizedName(string);
		
	}

}
