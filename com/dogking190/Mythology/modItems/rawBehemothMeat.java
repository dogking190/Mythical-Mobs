package com.dogking190.Mythology.modItems;

import com.dogking190.Mythology.MythologyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class rawBehemothMeat extends ItemFood {

	public rawBehemothMeat(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_ , String s, CreativeTabs tab) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		
		MythologyMod m = new MythologyMod();
		this.setTextureName(m.modid + ":" + s)
		.setCreativeTab(tab)
		.setUnlocalizedName(s);
	}

}
