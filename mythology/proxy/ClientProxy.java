package mythology.proxy;

import mythology.mobs.hostile.*;
import mythology.mobs.passive.*;
import mythology.model.armor.ModelCelestialBronzeArmor;
import mythology.model.hostile.*;
import mythology.model.passive.*;
import mythology.rendering.hostile.*;
import mythology.rendering.passive.*;
import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void RenderEntity() {

		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class,new CentaurRender(new ModelCentaur(), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGnome.class,new GnomeRender(new ModelGnome(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class,new MinotaurRender(new ModelMinotaur(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class,new FairyRender(new ModelFairy(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBasilisk.class,new BasiliskRender(new ModelBasilisk(), 1.0F));

	}

	public static ModelBiped getArmorModel(int i) {

		final ModelCelestialBronzeArmor tutChest = new ModelCelestialBronzeArmor(1.0f);
		final ModelCelestialBronzeArmor tutLegs = new ModelCelestialBronzeArmor(0.5f);

		switch (i) {
		case 0:
			return tutChest;
		case 1:
			return tutLegs;
		default:
			break;
		}
		return tutChest; // default, if whenever you should have passed on a
							// wrong id
	}
}
