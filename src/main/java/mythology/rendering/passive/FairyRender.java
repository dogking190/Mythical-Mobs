package mythology.rendering.passive;

import mythology.MythologyMod;
import mythology.mobs.passive.EntityFairy;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@SideOnly(Side.CLIENT)
public class FairyRender extends RenderLiving 
{

	private static final ResourceLocation TEXTURES = new ResourceLocation(MythologyMod.MODID, "textures/entity/Fairy.png");

    public FairyRender(ModelBase model, float f)
    {
        super(model, f);
    }

	private ResourceLocation getEntityTexture(EntityFairy entity)
    {
        return TEXTURES;
    }

	protected ResourceLocation getEntityTexture(Entity entity)
	{
		if(entity instanceof EntityFairy){
			return this.getEntityTexture((EntityFairy)entity);
		}
		return null;
	}

}
