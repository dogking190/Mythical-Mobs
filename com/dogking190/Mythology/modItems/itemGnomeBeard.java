package com.dogking190.Mythology.modItems;

import com.dogking190.Mythology.MythologyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemGnomeBeard extends Item {
	
	MythologyMod m = new MythologyMod();
	
	public itemGnomeBeard(String string, CreativeTabs tab){
		
		this.setUnlocalizedName(string);
		this.setCreativeTab(tab);
		this.setTextureName(m.modid + ":" + string);
		
	}

}
