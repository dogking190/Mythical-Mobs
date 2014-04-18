package mythology.modItems;

import mythology.MythologyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemFur extends Item {
	
	public ItemFur(String string, CreativeTabs tabMythical){
		
		MythologyMod m = new MythologyMod();
		this.setUnlocalizedName(string)
		.setCreativeTab(tabMythical)
		.setTextureName(m.modid + ":" + string);
		
	}

}
