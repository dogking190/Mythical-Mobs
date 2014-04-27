package mythology.modArmor;

import mythology.MythologyMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SilverArmor extends ItemArmor{
	MythologyMod m = new MythologyMod();
	public SilverArmor(ArmorMaterial material, int id, int armorslot) {
		super(material, id, armorslot);
		this.setCreativeTab(m.tabMythical);
	}
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
		if(armor.getItem() == m.silverLeggings) {
			return "mythical:textures/models/armor/Silver_armor_layer_2.png";
		} else {
			return "mythical:textures/models/armor/Silver_armor_layer_1.png";
		}
	}
}
