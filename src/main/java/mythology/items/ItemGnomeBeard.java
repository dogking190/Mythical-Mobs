package mythology.items;

import mythology.MythologyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemGnomeBeard extends Item {
	
	public ItemGnomeBeard(String string, CreativeTabs tabMythical){
		
		MythologyMod m = new MythologyMod();
		this.setUnlocalizedName(string)
		.setCreativeTab(tabMythical)
		.setTextureName(m.MODID + ":" + string);
		
	}

}
