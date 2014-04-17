package com.dogking190.Mythology.modItems;

import com.dogking190.Mythology.MythologyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemFur extends Item {
	
	MythologyMod m = new MythologyMod();
	
	public itemFur(String string, CreativeTabs tabMythical){
		
		this.setUnlocalizedName(string);
		this.setCreativeTab(tabMythical);
		this.setTextureName(m.modid + ":" + string);
		
	}

}
