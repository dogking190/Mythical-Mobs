package com.dogking190.Mythology.proxy;

import com.dogking190.Mythology.mobs.entityCentaurs;
import com.dogking190.Mythology.rendering.CentaurRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

    public void RenderEntity(){

        RenderingRegistry.registerEntityRenderingHandler(entityCentaurs.class , new CentaurRender());

    }

}
