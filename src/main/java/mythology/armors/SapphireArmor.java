package mythology.armors;

import mythology.MythologyMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SapphireArmor extends ItemArmor{

	public SapphireArmor(ArmorMaterial material, int id, int armorslot) {
		super(material, id, armorslot);
		this.setCreativeTab(MythologyMod.tabMythical);
	}
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
		if(armor.getItem() == MythologyMod.sapphireLeggings) {
			return "mythical:textures/models/armor/Sapphire_armor_layer_2.png";
		} else {
			return "mythical:textures/models/armor/Sapphire_armor_layer_1.png";
		}
	}
}
