package mythology.init;

import static mythology.MythologyMod.*;
import mythology.armors.BronzeArmor;
import mythology.armors.CelestialBronzeArmor;
import mythology.armors.ImperialGoldArmor;
import mythology.armors.MithrilArmor;
import mythology.armors.RubyArmor;
import mythology.armors.SapphireArmor;
import mythology.armors.SilverArmor;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythicalArmor {

	public static void add(){
		ItemArmor.ArmorMaterial armorBronze = EnumHelper.addArmorMaterial("BRONZE", 15, new int[]{2, 6, 5, 2}, 15);
		ItemArmor.ArmorMaterial armorCelestialBronze = EnumHelper.addArmorMaterial("CELESTIALBRONZE", 25, new int[]{3, 6, 5, 3}, 9);
		ItemArmor.ArmorMaterial armorImperialGold = EnumHelper.addArmorMaterial("IMPERIALGOLD", 25, new int[]{3, 6, 5, 3}, 9);
		ItemArmor.ArmorMaterial armorSilver = EnumHelper.addArmorMaterial("SILVER", 20, new int[]{3, 6, 5, 2}, 20);
		ItemArmor.ArmorMaterial armorMithril = EnumHelper.addArmorMaterial("MITHRIL", 100, new int[]{3, 8, 6, 3}, 10);
		ItemArmor.ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY", 15, new int[]{2, 6, 5, 2}, 20);
		ItemArmor.ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 15, new int[]{2, 6, 5, 2}, 20);

		bronzeHelmet = new BronzeArmor(armorBronze, 4, 0).setUnlocalizedName("bronzeHelmet").setTextureName(MODID + ":" + "bronzeHelmet");
		bronzeChestplate = new BronzeArmor(armorBronze, 4, 1).setUnlocalizedName("bronzeChestplate").setTextureName(MODID + ":" + "bronzeChestplate");
		bronzeLeggings = new BronzeArmor(armorBronze, 4, 2).setUnlocalizedName("bronzeLeggings").setTextureName(MODID + ":" + "bronzeLeggings");
		bronzeBoots = new BronzeArmor(armorBronze, 4, 3).setUnlocalizedName("bronzeBoots").setTextureName(MODID + ":" + "bronzeBoots");
		celestialBronzeHelmet = new CelestialBronzeArmor(armorCelestialBronze, 4, 0).setUnlocalizedName("celestialBronzeHelmet").setTextureName(MODID + ":" + "celestialBronzeHelmet");
		celestialBronzeChestplate = new CelestialBronzeArmor(armorCelestialBronze, 4, 1).setUnlocalizedName("celestialBronzeChestplate").setTextureName(MODID + ":" + "celestialBronzeChestplate");
		celestialBronzeLeggings = new CelestialBronzeArmor(armorCelestialBronze, 4, 2).setUnlocalizedName("celestialBronzeLeggings").setTextureName(MODID + ":" + "celestialBronzeLeggings");
		celestialBronzeBoots = new CelestialBronzeArmor(armorCelestialBronze, 4, 3).setUnlocalizedName("celestialBronzeBoots").setTextureName(MODID + ":" + "celestialBronzeBoots");
		imperialGoldHelmet = new ImperialGoldArmor(armorImperialGold, 4, 0).setUnlocalizedName("imperialGoldHelmet").setTextureName(MODID + ":" + "imperialGoldHelmet");
		imperialGoldChestplate = new ImperialGoldArmor(armorImperialGold, 4, 1).setUnlocalizedName("imperialGoldChestplate").setTextureName(MODID + ":" + "imperialGoldChestplate");
		imperialGoldLeggings = new ImperialGoldArmor(armorImperialGold, 4, 2).setUnlocalizedName("imperialGoldLeggings").setTextureName(MODID + ":" + "imperialGoldLeggings");
		imperialGoldBoots = new ImperialGoldArmor(armorImperialGold, 4, 3).setUnlocalizedName("imperialGoldBoots").setTextureName(MODID + ":" + "imperialGoldBoots");
		silverHelmet = new SilverArmor(armorSilver, 4, 0).setUnlocalizedName("silverHelmet").setTextureName(MODID + ":" + "silverHelmet");
		silverChestplate = new SilverArmor(armorSilver, 4, 1).setUnlocalizedName("silverChestplate").setTextureName(MODID + ":" + "silverChestplate");
		silverLeggings = new SilverArmor(armorSilver, 4, 2).setUnlocalizedName("silverLeggings").setTextureName(MODID + ":" + "silverLeggings");
		silverBoots = new SilverArmor(armorSilver, 4, 3).setUnlocalizedName("silverBoots").setTextureName(MODID + ":" + "silverBoots");
		mithrilHelmet = new MithrilArmor(armorMithril, 4, 0).setUnlocalizedName("mithrilHelmet").setTextureName(MODID + ":" + "mithrilHelmet");
		mithrilChestplate = new MithrilArmor(armorMithril, 4, 1).setUnlocalizedName("mithrilChestplate").setTextureName(MODID + ":" + "mithrilChestplate");
		mithrilLeggings = new MithrilArmor(armorMithril, 4, 2).setUnlocalizedName("mithrilLeggings").setTextureName(MODID + ":" + "mithrilLeggings");
		mithrilBoots = new MithrilArmor(armorMithril, 4, 3).setUnlocalizedName("mithrilBoots").setTextureName(MODID + ":" + "mithrilBoots");
		rubyHelmet = new RubyArmor(armorRuby, 4, 0).setUnlocalizedName("rubyHelmet").setTextureName(MODID + ":" + "rubyHelmet");
		rubyChestplate = new RubyArmor(armorRuby, 4, 1).setUnlocalizedName("rubyChestplate").setTextureName(MODID + ":" + "rubyChestplate");
		rubyLeggings = new RubyArmor(armorRuby, 4, 2).setUnlocalizedName("rubyLeggings").setTextureName(MODID + ":" + "rubyLeggings");
		rubyBoots = new RubyArmor(armorRuby, 4, 3).setUnlocalizedName("rubyBoots").setTextureName(MODID + ":" + "rubyBoots");
		sapphireHelmet = new SapphireArmor(armorSapphire, 4, 0).setUnlocalizedName("sapphireHelmet").setTextureName(MODID + ":" + "sapphireHelmet");
		sapphireChestplate = new SapphireArmor(armorSapphire, 4, 1).setUnlocalizedName("sapphireChestplate").setTextureName(MODID + ":" + "sapphireChestplate");
		sapphireLeggings = new SapphireArmor(armorSapphire, 4, 2).setUnlocalizedName("sapphireLeggings").setTextureName(MODID + ":" + "sapphireLeggings");
		sapphireBoots = new SapphireArmor(armorSapphire, 4, 3).setUnlocalizedName("sapphireBoots").setTextureName(MODID + ":" + "sapphireBoots");

	}
	public static void register(){
		GameRegistry.registerItem(bronzeHelmet, "bronzeHelmet");
		GameRegistry.registerItem(bronzeChestplate, "bronzeChestplate");
		GameRegistry.registerItem(bronzeLeggings, "bronzeLeggings");
		GameRegistry.registerItem(bronzeBoots, "bronzeBoots");
		GameRegistry.registerItem(celestialBronzeHelmet, "celestialBronzeHelmet");
		GameRegistry.registerItem(celestialBronzeChestplate, "celestialBronzeChestplate");
		GameRegistry.registerItem(celestialBronzeLeggings, "celestialBronzeLeggings");
		GameRegistry.registerItem(celestialBronzeBoots, "celestialBronzeBoots");
		GameRegistry.registerItem(imperialGoldHelmet, "imperialGoldHelmet");
		GameRegistry.registerItem(imperialGoldChestplate, "imperialGoldChestplate");
		GameRegistry.registerItem(imperialGoldLeggings, "imperialGoldLeggings");
		GameRegistry.registerItem(imperialGoldBoots, "imperialGoldBoots");
		GameRegistry.registerItem(silverHelmet, "silverHelmet");
		GameRegistry.registerItem(silverChestplate, "silverChestplate");
		GameRegistry.registerItem(silverLeggings, "silverLeggings");
		GameRegistry.registerItem(silverBoots, "silverBoots");
		GameRegistry.registerItem(mithrilHelmet, "mithrilHelmet");
		GameRegistry.registerItem(mithrilChestplate, "mithrilChestplate");
		GameRegistry.registerItem(mithrilLeggings, "mithrilLeggings");
		GameRegistry.registerItem(mithrilBoots, "mithrilBoots");
		GameRegistry.registerItem(rubyHelmet, "rubyHelmet");
		GameRegistry.registerItem(rubyChestplate, "rubyChestplate");
		GameRegistry.registerItem(rubyLeggings, "rubyLeggings");
		GameRegistry.registerItem(rubyBoots, "rubyBoots");
		GameRegistry.registerItem(sapphireHelmet, "sapphireHelmet");
		GameRegistry.registerItem(sapphireChestplate, "sapphireChestplate");
		GameRegistry.registerItem(sapphireLeggings, "sapphireLeggings");
		GameRegistry.registerItem(sapphireBoots, "sapphireBoots");

	}
}
