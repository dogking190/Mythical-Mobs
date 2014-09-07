package mythology.rendering.hostile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mythology.MythologyMod;
import mythology.mobs.hostile.EntityBasilisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
@SideOnly(Side.CLIENT)
public class BasiliskRender extends RenderLiving{

	private static final ResourceLocation TEXTURES = new ResourceLocation(MythologyMod.MODID, "mythical:textures/entity/Basilisk.png");

	public BasiliskRender(ModelBase model, float f) {
		super(model, f);
		
	}
	protected ResourceLocation getEntityTexture(EntityBasilisk entity) {
		return TEXTURES;
	}

	protected ResourceLocation getEntityTexture(Entity entity)
    {
	    if(entity instanceof EntityBasilisk){
            return this.getEntityTexture((EntityBasilisk)entity);
	    }
	    return null;
    }
}
