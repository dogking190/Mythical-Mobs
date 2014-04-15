package com.dogking190.Mythology.rendering;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class CentaurRender extends RenderLiving {

	
	private static final ResourceLocation cowTextures = new ResourceLocation("textures/entity/cow/cow.png");
    private static final String __OBFID = "CL_00000984";

    public CentaurRender(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityCow par1EntityCow)
    {
        return cowTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture1(Entity par1Entity)
    {
        return this.getEntityTexture((EntityCow)par1Entity);
    }

	@Override
	public void doRender(Entity var1, double var2, double var4, double var6,
			float var8, float var9) {
		// TODO Auto-generated method stub

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		// TODO Auto-generated method stub
		return null;
	}

}
