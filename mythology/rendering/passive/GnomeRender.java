package mythology.rendering.passive;

import org.lwjgl.opengl.GL11;

import mythology.mobs.passive.EntityGnome;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@SideOnly(Side.CLIENT)
public class GnomeRender extends RenderLiving 
{
	public static float scale = 1.5F;

	private static final ResourceLocation cowTextures = new ResourceLocation("mythical:textures/entity/Gnome.png");
    private static final String __OBFID = "CL_00000984";

    public GnomeRender(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
    
    protected void preRenderScale(EntityGnome entity, float f)
    {
            GL11.glScalef(0.5F, 0.5F, 0.5F);
    }

    protected void preRenderCallback(EntityLiving entityliving, float f)
    {
            preRenderScale((EntityGnome)entityliving, f);
    }
    
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityGnome par1EntityCow)
    {
        return cowTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityGnome)par1Entity);
    }

}
