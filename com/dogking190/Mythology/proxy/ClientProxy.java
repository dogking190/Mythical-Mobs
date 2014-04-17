package com.dogking190.Mythology.proxy;

import net.minecraft.client.model.ModelCow;

import com.dogking190.Mythology.mobs.entityCentaurs;
import com.dogking190.Mythology.mobs.EntityCentaur;
import com.dogking190.Mythology.model.ModelCentaur;
import com.dogking190.Mythology.rendering.CentaurRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

    public void RenderEntity(){

        RenderingRegistry.registerEntityRenderingHandler(entityCentaurs.class , new CentaurRender(new ModelCow(), 0F));

        RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class , new CentaurRender(new ModelCentaur(), 1.0F));
    }

}
