package mythology.proxy;

import mythology.mobs.EntityCentaur;
import mythology.mobs.EntityGnome;
import mythology.mobs.EntityMinotaur;
import mythology.model.ModelCentaur;
import mythology.model.ModelGnome;
import mythology.model.ModelMinotaur;
import mythology.rendering.CentaurRender;
import mythology.rendering.GnomeRender;
import mythology.rendering.MinotaurRender;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

    public void RenderEntity(){

        RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class , new CentaurRender(new ModelCentaur(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGnome.class, new GnomeRender(new ModelGnome(), 0.3F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new MinotaurRender(new ModelMinotaur(), 0.5F));

        
    }

}
