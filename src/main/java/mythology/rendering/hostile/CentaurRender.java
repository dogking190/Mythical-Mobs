package mythology.rendering.hostile;

import mythology.MythologyMod;
import mythology.mobs.hostile.EntityCentaur;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@SideOnly(Side.CLIENT)
public class CentaurRender extends RenderLiving 
{

	private static final ResourceLocation TEXTURES = new ResourceLocation(MythologyMod.MODID, "textures/entity/Centaur.png");

    public CentaurRender(ModelBase model, float f)
    {
        super(model, f);
    }

    private ResourceLocation getEntityTexture(EntityCentaur entity)
    {
        return TEXTURES;
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
	    if(entity instanceof EntityCentaur){
		    return this.getEntityTexture((EntityCentaur)entity);
	    }
	    return null;
    }

}
