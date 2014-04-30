package mythology.modArmor;

import mythology.MythologyMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.ISpecialArmor;

public class CelestialBronzeArmor extends ItemArmor implements ISpecialArmor{
	MythologyMod m = new MythologyMod();
	public CelestialBronzeArmor(ArmorMaterial material, int id, int armorslot) {
		super(material, id, armorslot);
		this.setCreativeTab(m.tabMythical);
	}
	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
		stack.damageItem(damage * 0, entity);
	}
	@Override
	public int getArmorDisplay(EntityPlayer arg0, ItemStack arg1, int arg2) {
		return 4;
	}
	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
		if(source == source.drown) { 
			return new ArmorProperties(1, 1, MathHelper.floor_double(damage * 7.5D));
		}
		return new ArmorProperties(0, 0, 0);

	}
	@Override
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
		if(armor.getItem() == m.celestialBronzeLeggings) {
			return "mythical:textures/models/armor/CelestialBronze_armor_layer_2.png";
		} else {
			return "mythical:textures/models/armor/CelestialBronze_armor_layer_1.png";
		}
	}
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	  return stack.getItem() == m.itemCelestialBronzeIngot;
	}
}
