package mythology.modArmor;

import mythology.MythologyMod;
import mythology.model.armor.ModelCelestialBronzeArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CelestialBronzeArmor extends ItemArmor implements ISpecialArmor {
	MythologyMod m = new MythologyMod();

	public CelestialBronzeArmor(ArmorMaterial material, int id, int armorslot) {
		super(material, id, armorslot);
		this.setCreativeTab(m.tabMythical);
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		stack.damageItem(damage * 0, entity);
	}

	@Override
	public int getArmorDisplay(EntityPlayer arg0, ItemStack arg1, int arg2) {
		return 4;
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player,
			ItemStack armor, DamageSource source, double damage, int slot) {
		if (source == source.drown) {
			return new ArmorProperties(1, 1,
					MathHelper.floor_double(damage * 7.5D));
		}
		return new ArmorProperties(0, 0, 0);

	}

	@Override
	public String getArmorTexture(ItemStack armor, Entity entity, int slot,
			String type) {

		return "mythical:textures/models/armor/CelestialBronzeArmor.png";

	}

	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
		return stack.getItem() == m.itemCelestialBronzeIngot;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		ModelBiped armorModel = new ModelBiped();
		
		/*
		int type = ((ItemArmor)itemStack.getItem()).armorType;

        if(type == 1 || type == 3){
                armorModel = mythology.proxy.ClientProxy.getArmorModel(0);
        }else{
                armorModel = mythology.proxy.ClientProxy.getArmorModel(1);
        }
		*/
		if (armorModel != null) {
			armorModel.bipedHead.showModel = armorSlot == 0;
			armorModel.bipedHeadwear.showModel = armorSlot == 0;
			
			armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
			armorModel.bipedRightArm.showModel = armorSlot == 1;
			armorModel.bipedLeftArm.showModel = armorSlot == 1;
			armorModel.bipedRightLeg.showModel = armorSlot == 2|| armorSlot == 3;
			armorModel.bipedLeftLeg.showModel = armorSlot == 2|| armorSlot == 3;
			

			armorModel.isSneak = entityLiving.isSneaking();
			armorModel.isRiding = entityLiving.isRiding();
			armorModel.isChild = entityLiving.isChild();
			// armorModel.heldItemRight = entityLiving.getCurrentItemOrArmor(0)
			// != null ? 1 :0;
			if (entityLiving instanceof EntityPlayer) {
				armorModel.aimedBow = ((EntityPlayer) entityLiving)
						.getItemInUseDuration() > 2;
			}
			return armorModel;
		}
		return null;
	}
}
