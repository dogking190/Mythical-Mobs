package mythology.armors;

import mythology.MythologyMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyArmor extends ItemArmor{

	public RubyArmor(ArmorMaterial material, int id, int armorslot) {
		super(material, id, armorslot);
		this.setCreativeTab(MythologyMod.tabMythical);
	}

	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
		if(armor.getItem() == MythologyMod.rubyLeggings) {
			return "mythical:textures/models/armor/Ruby_armor_layer_2.png";
		} else {
			return "mythical:textures/models/armor/Ruby_armor_layer_1.png";
		}
	}
}
