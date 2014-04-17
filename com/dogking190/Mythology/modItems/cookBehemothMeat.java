package com.dogking190.Mythology.modItems;

import com.dogking190.Mythology.MythologyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class cookBehemothMeat extends ItemFood {

	MythologyMod m = new MythologyMod();
	
	public cookBehemothMeat(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_, String s, CreativeTabs tab) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		
		this.setUnlocalizedName(s);
		this.setTextureName(m.modid + ":" + s);
		this.setCreativeTab(tab);
	}

}
