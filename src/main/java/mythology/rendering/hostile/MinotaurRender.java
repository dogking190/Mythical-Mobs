package mythology.rendering.hostile;

import mythology.MythologyMod;
import mythology.mobs.hostile.EntityMinotaur;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@SideOnly(Side.CLIENT)
public class MinotaurRender extends RenderLiving 
{

	private static final ResourceLocation TEXTURES = new ResourceLocation(MythologyMod.MODID, "textures/entity/Minotaur.png");

    public MinotaurRender(ModelBase model, float f)
    {
        super(model, f);
    }

	private ResourceLocation getEntityTexture(EntityMinotaur entity)
    {
        return TEXTURES;
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
	    if(entity instanceof EntityMinotaur){
            return this.getEntityTexture((EntityMinotaur)entity);
	    }
	    return null;
    }

}