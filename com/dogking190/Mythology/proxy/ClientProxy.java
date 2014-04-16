package com.dogking190.Mythology.proxy;

import com.dogking190.Mythology.mobs.EntityCentaur;
import com.dogking190.Mythology.model.ModelCentaur;
import com.dogking190.Mythology.rendering.CentaurRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

    public void RenderEntity(){

        RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class , new CentaurRender(new ModelCentaur(), 0.5F));

    }

}
