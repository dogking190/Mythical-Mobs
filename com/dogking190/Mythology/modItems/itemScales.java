package com.dogking190.Mythology.modItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.dogking190.Mythology.MythologyMod;

public class itemScales extends Item {
	
	MythologyMod m = new MythologyMod();
	
	public itemScales(String string, CreativeTabs tab){
		
		this.setCreativeTab(tab);
		this.setTextureName(m.modid + ":" + string);
		this.setUnlocalizedName(string);
		
	}

}
