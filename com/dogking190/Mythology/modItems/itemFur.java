package com.dogking190.Mythology.modItems;

import com.dogking190.Mythology.MythologyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemFur extends Item {
	
	public itemFur(String string, CreativeTabs tabMythical){
		
		MythologyMod m = new MythologyMod();
		this.setUnlocalizedName(string)
		.setCreativeTab(tabMythical)
		.setTextureName(m.modid + ":" + string);
		
	}

}
