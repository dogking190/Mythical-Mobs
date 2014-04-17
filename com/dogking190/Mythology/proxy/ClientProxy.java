package com.dogking190.Mythology.proxy;

import com.dogking190.Mythology.mobs.EntityCentaur;
import com.dogking190.Mythology.mobs.EntityGnome;
import com.dogking190.Mythology.model.ModelCentaur;
import com.dogking190.Mythology.model.ModelGnome;
import com.dogking190.Mythology.rendering.CentaurRender;
import com.dogking190.Mythology.rendering.GnomeRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

    public void RenderEntity(){

        RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class , new CentaurRender(new ModelCentaur(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGnome.class, new GnomeRender(new ModelGnome(), 0.3F));
        
    }

}
