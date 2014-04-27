package mythology.modArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import mythology.MythologyMod;
public class BronzeArmor extends ItemArmor{
	MythologyMod m = new MythologyMod();
	public BronzeArmor(ArmorMaterial material, int id, int armorslot) {
		super(material, id, armorslot);
		this.setCreativeTab(m.tabMythical);
	}
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
		if(armor.getItem() == m.bronzeLeggings) {
			return "mythical:textures/models/armor/Bronze_armor_layer_2.png";
		} else {
			return "mythical:textures/models/armor/Bronze_armor_layer_1.png";
		}
	}
	
	
	
	
	
	
}
