package mythology.rendering.passive;

import mythology.MythologyMod;
import org.lwjgl.opengl.GL11;

import mythology.mobs.passive.EntityGnome;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@SideOnly(Side.CLIENT)
public class GnomeRender extends RenderLiving 
{
	public static final float SCALE = 1.5F;

	private static final ResourceLocation TEXTURES = new ResourceLocation(MythologyMod.MODID, "textures/entity/Gnome.png");

    public GnomeRender(ModelBase model, float f)
    {
        super(model, f);
    }

	private void preRenderScale(EntityGnome entity, float f)
    {
            GL11.glScalef(0.5F, 0.5F, 0.5F);
    }

	private void preRenderCallback(EntityLiving entity, float f)
    {
            preRenderScale((EntityGnome)entity, f);
    }

	private ResourceLocation getEntityTexture(EntityGnome entity)
    {
        return TEXTURES;
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
	    if(entity instanceof EntityGnome) {
		    return this.getEntityTexture((EntityGnome) entity);
	    }
	    return null;
    }

}
