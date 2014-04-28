package mythology.proxy;

import mythology.mobs.hostile.EntityCentaur;
import mythology.mobs.hostile.EntityMinotaur;
import mythology.mobs.passive.EntityFairy;
import mythology.mobs.passive.EntityGnome;
import mythology.model.armor.ModelCelestialBronzeArmor;
import mythology.model.hostile.ModelCentaur;
import mythology.model.hostile.ModelMinotaur;
import mythology.model.passive.ModelFairy;
import mythology.model.passive.ModelGnome;
import mythology.rendering.hostile.CentaurRender;
import mythology.rendering.hostile.MinotaurRender;
import mythology.rendering.passive.FairyRender;
import mythology.rendering.passive.GnomeRender;
import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	private static final ModelCelestialBronzeArmor tutChest = new ModelCelestialBronzeArmor();
	private static final ModelCelestialBronzeArmor tutLegs = new ModelCelestialBronzeArmor();

    public void RenderEntity(){

        RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class , new CentaurRender(new ModelCentaur(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGnome.class, new GnomeRender(new ModelGnome(), 0.3F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new MinotaurRender(new ModelMinotaur(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new FairyRender(new ModelFairy(), 0.2F));

        
    }
    
    //public static ModelBiped getArmorModel(int id){
	
    	/*
    	switch (id) {
	    case 0:
	    	return tutChest;	
	    case 1:
	    	return tutLegs;
		default:
	    	break;
    	}
    	*/
    	
		//return tutChest;
	//}

}
