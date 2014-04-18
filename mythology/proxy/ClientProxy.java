package mythology.proxy;

import mythology.mobs.EntityCentaur;
import mythology.mobs.EntityGnome;
import mythology.model.ModelCentaur;
import mythology.model.ModelGnome;
import mythology.rendering.CentaurRender;
import mythology.rendering.GnomeRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

    public void RenderEntity(){

        RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class , new CentaurRender(new ModelCentaur(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGnome.class, new GnomeRender(new ModelGnome(), 0.3F));
        
    }

}
