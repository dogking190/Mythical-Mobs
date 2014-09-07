package mythology.items;

import mythology.MythologyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemScale extends Item {
	
	public ItemScale(String string, CreativeTabs tab){
		
		MythologyMod m = new MythologyMod();
		this.setCreativeTab(tab)
		.setTextureName(m.MODID + ":" + string)
		.setUnlocalizedName(string);
		
	}

}
