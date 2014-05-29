package mythology.rendering.hostile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mythology.mobs.hostile.EntityBasilisk;
import mythology.mobs.hostile.EntityCentaur;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
@SideOnly(Side.CLIENT)
public class BasiliskRender extends RenderLiving{
	private static final ResourceLocation cowTextures = new ResourceLocation("mythical:textures/entity/Basilisk.png");
    private static final String __OBFID = "CL_00000984";

	public BasiliskRender(ModelBase arg0, float arg1) {
		super(arg0, arg1);
		
	}
	protected ResourceLocation getEntityTexture(EntityBasilisk par1EntityCow) {
		return cowTextures;
	}
	protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityBasilisk)par1Entity);
    }
}
