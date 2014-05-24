package mythology.init;

import mythology.MythologyMod;
import mythology.modArmor.BronzeArmor;
import mythology.modArmor.CelestialBronzeArmor;
import mythology.modArmor.ImperialGoldArmor;
import mythology.modArmor.MithrilArmor;
import mythology.modArmor.RubyArmor;
import mythology.modArmor.SapphireArmor;
import mythology.modArmor.SilverArmor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalArmor {
	private static MythologyMod m = new MythologyMod();
	public static void add(){
		ArmorMaterial armorBronze = EnumHelper.addArmorMaterial("BRONZE", 15, new int[]{2, 6, 5, 2}, 15);
		ArmorMaterial armorCelestialBronze = EnumHelper.addArmorMaterial("CELESTIALBRONZE", 25, new int[]{3, 6, 5, 3}, 9);
		ArmorMaterial armorImperialGold = EnumHelper.addArmorMaterial("IMPERIALGOLD", 25, new int[]{3, 6, 5, 3}, 9);
		ArmorMaterial armorSilver = EnumHelper.addArmorMaterial("SILVER", 20, new int[]{3, 6, 5, 2}, 20);
		ArmorMaterial armorMithril = EnumHelper.addArmorMaterial("MITHRIL", 100, new int[]{3, 8, 6, 3}, 10);
		ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY", 15, new int[]{2, 6, 5, 2}, 20);
		ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 15, new int[]{2, 6, 5, 2}, 20);
		
		m.bronzeHelmet = new BronzeArmor(armorBronze, 4, 0).setUnlocalizedName("bronzeHelmet").setTextureName(MythologyMod.modid + ":" + "bronzeHelmet");
		m.bronzeChestplate = new BronzeArmor(armorBronze, 4, 1).setUnlocalizedName("bronzeChestplate").setTextureName(MythologyMod.modid + ":" + "bronzeChestplate");
		m.bronzeLeggings = new BronzeArmor(armorBronze, 4, 2).setUnlocalizedName("bronzeLeggings").setTextureName(MythologyMod.modid + ":" + "bronzeLeggings");
		m.bronzeBoots = new BronzeArmor(armorBronze, 4, 3).setUnlocalizedName("bronzeBoots").setTextureName(MythologyMod.modid + ":" + "bronzeBoots");
		m.celestialBronzeHelmet = new CelestialBronzeArmor(armorCelestialBronze, 4, 0).setUnlocalizedName("celestialBronzeHelmet").setTextureName(MythologyMod.modid + ":" + "celestialBronzeHelmet");
		m.celestialBronzeChestplate = new CelestialBronzeArmor(armorCelestialBronze, 4, 1).setUnlocalizedName("celestialBronzeChestplate").setTextureName(MythologyMod.modid + ":" + "celestialBronzeChestplate");
		m.celestialBronzeLeggings = new CelestialBronzeArmor(armorCelestialBronze, 4, 2).setUnlocalizedName("celestialBronzeLeggings").setTextureName(MythologyMod.modid + ":" + "celestialBronzeLeggings");
		m.celestialBronzeBoots = new CelestialBronzeArmor(armorCelestialBronze, 4, 3).setUnlocalizedName("celestialBronzeBoots").setTextureName(MythologyMod.modid + ":" + "celestialBronzeBoots");
		m.imperialGoldHelmet = new ImperialGoldArmor(armorImperialGold, 4, 0).setUnlocalizedName("imperialGoldHelmet").setTextureName(MythologyMod.modid + ":" + "imperialGoldHelmet");
		m.imperialGoldChestplate = new ImperialGoldArmor(armorImperialGold, 4, 1).setUnlocalizedName("imperialGoldChestplate").setTextureName(MythologyMod.modid + ":" + "imperialGoldChestplate");
		m.imperialGoldLeggings = new ImperialGoldArmor(armorImperialGold, 4, 2).setUnlocalizedName("imperialGoldLeggings").setTextureName(MythologyMod.modid + ":" + "imperialGoldLeggings");
		m.imperialGoldBoots = new ImperialGoldArmor(armorImperialGold, 4, 3).setUnlocalizedName("imperialGoldBoots").setTextureName(MythologyMod.modid + ":" + "imperialGoldBoots");
		m.silverHelmet = new SilverArmor(armorSilver, 4, 0).setUnlocalizedName("silverHelmet").setTextureName(MythologyMod.modid + ":" + "silverHelmet");
		m.silverChestplate = new SilverArmor(armorSilver, 4, 1).setUnlocalizedName("silverChestplate").setTextureName(MythologyMod.modid + ":" + "silverChestplate");
		m.silverLeggings = new SilverArmor(armorSilver, 4, 2).setUnlocalizedName("silverLeggings").setTextureName(MythologyMod.modid + ":" + "silverLeggings");
		m.silverBoots = new SilverArmor(armorSilver, 4, 3).setUnlocalizedName("silverBoots").setTextureName(MythologyMod.modid + ":" + "silverBoots");
		m.mithrilHelmet = new MithrilArmor(armorMithril, 4, 0).setUnlocalizedName("mithrilHelmet").setTextureName(MythologyMod.modid + ":" + "mithrilHelmet");
		m.mithrilChestplate = new MithrilArmor(armorMithril, 4, 1).setUnlocalizedName("mithrilChestplate").setTextureName(MythologyMod.modid + ":" + "mithrilChestplate");
		m.mithrilLeggings = new MithrilArmor(armorMithril, 4, 2).setUnlocalizedName("mithrilLeggings").setTextureName(MythologyMod.modid + ":" + "mithrilLeggings");
		m.mithrilBoots = new MithrilArmor(armorMithril, 4, 3).setUnlocalizedName("mithrilBoots").setTextureName(MythologyMod.modid + ":" + "mithrilBoots");
		m.rubyHelmet = new RubyArmor(armorRuby, 4, 0).setUnlocalizedName("rubyHelmet").setTextureName(MythologyMod.modid + ":" + "rubyHelmet");
		m.rubyChestplate = new RubyArmor(armorRuby, 4, 1).setUnlocalizedName("rubyChestplate").setTextureName(MythologyMod.modid + ":" + "rubyChestplate");
		m.rubyLeggings = new RubyArmor(armorRuby, 4, 2).setUnlocalizedName("rubyLeggings").setTextureName(MythologyMod.modid + ":" + "rubyLeggings");
		m.rubyBoots = new RubyArmor(armorRuby, 4, 3).setUnlocalizedName("rubyBoots").setTextureName(MythologyMod.modid + ":" + "rubyBoots");
		m.sapphireHelmet = new SapphireArmor(armorSapphire, 4, 0).setUnlocalizedName("sapphireHelmet").setTextureName(MythologyMod.modid + ":" + "sapphireHelmet");
		m.sapphireChestplate = new SapphireArmor(armorSapphire, 4, 1).setUnlocalizedName("sapphireChestplate").setTextureName(MythologyMod.modid + ":" + "sapphireChestplate");
		m.sapphireLeggings = new SapphireArmor(armorSapphire, 4, 2).setUnlocalizedName("sapphireLeggings").setTextureName(MythologyMod.modid + ":" + "sapphireLeggings");
		m.sapphireBoots = new SapphireArmor(armorSapphire, 4, 3).setUnlocalizedName("sapphireBoots").setTextureName(MythologyMod.modid + ":" + "sapphireBoots");
		
	}
	public static void register(){
		GameRegistry.registerItem(m.bronzeHelmet, "bronzeHelmet");
    	GameRegistry.registerItem(m.bronzeChestplate, "bronzeChestplate");
    	GameRegistry.registerItem(m.bronzeLeggings, "bronzeLeggings");
    	GameRegistry.registerItem(m.bronzeBoots, "bronzeBoots");
    	GameRegistry.registerItem(m.celestialBronzeHelmet, "celestialBronzeHelmet");
    	GameRegistry.registerItem(m.celestialBronzeChestplate, "celestialBronzeChestplate");
    	GameRegistry.registerItem(m.celestialBronzeLeggings, "celestialBronzeLeggings");
    	GameRegistry.registerItem(m.celestialBronzeBoots, "celestialBronzeBoots");
    	GameRegistry.registerItem(m.imperialGoldHelmet, "imperialGoldHelmet");
    	GameRegistry.registerItem(m.imperialGoldChestplate, "imperialGoldChestplate");
    	GameRegistry.registerItem(m.imperialGoldLeggings, "imperialGoldLeggings");
    	GameRegistry.registerItem(m.imperialGoldBoots, "imperialGoldBoots");
    	GameRegistry.registerItem(m.silverHelmet, "silverHelmet");
    	GameRegistry.registerItem(m.silverChestplate, "silverChestplate");
    	GameRegistry.registerItem(m.silverLeggings, "silverLeggings");
    	GameRegistry.registerItem(m.silverBoots, "silverBoots");
    	GameRegistry.registerItem(m.mithrilHelmet, "mithrilHelmet");
    	GameRegistry.registerItem(m.mithrilChestplate, "mithrilChestplate");
    	GameRegistry.registerItem(m.mithrilLeggings, "mithrilLeggings");
    	GameRegistry.registerItem(m.mithrilBoots, "mithrilBoots");
    	GameRegistry.registerItem(m.rubyHelmet, "rubyHelmet");
    	GameRegistry.registerItem(m.rubyChestplate, "rubyChestplate");
    	GameRegistry.registerItem(m.rubyLeggings, "rubyLeggings");
    	GameRegistry.registerItem(m.rubyBoots, "rubyBoots");
    	GameRegistry.registerItem(m.sapphireHelmet, "sapphireHelmet");
    	GameRegistry.registerItem(m.sapphireChestplate, "sapphireChestplate");
    	GameRegistry.registerItem(m.sapphireLeggings, "sapphireLeggings");
    	GameRegistry.registerItem(m.sapphireBoots, "sapphireBoots");
    	
	}
}
