
package mythology.model.passive;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFairy extends ModelBase
{
  //fields
    ModelRenderer Head_1;
    ModelRenderer Body_1;
    ModelRenderer Right_leg_1;
    ModelRenderer Left_leg_1;
    ModelRenderer Right_leg_2;
    ModelRenderer Left_leg_2;
    ModelRenderer Right_leg_3;
    ModelRenderer Left_leg_3;
    ModelRenderer Left_wing_1;
    ModelRenderer Right_wing_1;
    ModelRenderer Right_arm_1;
    ModelRenderer Left_arm_1;
    ModelRenderer Right_arm_2;
    ModelRenderer Left_arm_2;
    ModelRenderer Right_ear_1;
    ModelRenderer Left_ear_1;
    ModelRenderer Neck_1;
  
  public ModelFairy()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head_1 = new ModelRenderer(this, 0, 22);
      Head_1.addBox(0F, 0F, 0F, 4, 4, 4);
      Head_1.setRotationPoint(-0.5F, -0.8F, -0.5F);
      Head_1.setTextureSize(64, 32);
      Head_1.mirror = true;
      setRotation(Head_1, 0.0523599F, 0F, 0F);
      Body_1 = new ModelRenderer(this, 54, 25);
      Body_1.addBox(0F, 0F, 0F, 3, 5, 2);
      Body_1.setRotationPoint(0F, 4F, 0.5F);
      Body_1.setTextureSize(64, 32);
      Body_1.mirror = true;
      setRotation(Body_1, 0.1047198F, 0F, 0F);
      Right_leg_1 = new ModelRenderer(this, 60, 0);
      Right_leg_1.addBox(0F, 0F, 0F, 1, 3, 1);
      Right_leg_1.setRotationPoint(0.1F, 8F, 1F);
      Right_leg_1.setTextureSize(64, 32);
      Right_leg_1.mirror = true;
      setRotation(Right_leg_1, 0.296706F, 0F, 0F);
      Left_leg_1 = new ModelRenderer(this, 60, 0);
      Left_leg_1.addBox(0F, 0F, 0F, 1, 3, 1);
      Left_leg_1.setRotationPoint(1.9F, 8F, 1F);
      Left_leg_1.setTextureSize(64, 32);
      Left_leg_1.mirror = true;
      setRotation(Left_leg_1, 0.296706F, 0F, 0F);
      Right_leg_2 = new ModelRenderer(this, 60, 3);
      Right_leg_2.addBox(0F, 0F, 0F, 1, 2, 1);
      Right_leg_2.setRotationPoint(0.1F, 10.9F, 1.9F);
      Right_leg_2.setTextureSize(64, 32);
      Right_leg_2.mirror = true;
      setRotation(Right_leg_2, 0.6806784F, 0F, 0F);
      Left_leg_2 = new ModelRenderer(this, 60, 3);
      Left_leg_2.addBox(0F, 0F, 0F, 1, 2, 1);
      Left_leg_2.setRotationPoint(1.9F, 10.9F, 1.9F);
      Left_leg_2.setTextureSize(64, 32);
      Left_leg_2.mirror = true;
      setRotation(Left_leg_2, 0.6806784F, 0F, 0F);
      Right_leg_3 = new ModelRenderer(this, 52, 0);
      Right_leg_3.addBox(0F, 0F, 0F, 1, 2, 1);
      Right_leg_3.setRotationPoint(0.1F, 11.9F, 2.9F);
      Right_leg_3.setTextureSize(64, 32);
      Right_leg_3.mirror = true;
      setRotation(Right_leg_3, 0.0698132F, 0F, 0F);
      Left_leg_3 = new ModelRenderer(this, 52, 0);
      Left_leg_3.addBox(0F, 0F, 0F, 1, 2, 1);
      Left_leg_3.setRotationPoint(1.9F, 11.9F, 2.9F);
      Left_leg_3.setTextureSize(64, 32);
      Left_leg_3.mirror = true;
      setRotation(Left_leg_3, 0.0698132F, 0F, 0F);
      Left_wing_1 = new ModelRenderer(this, 0, 0);
      Left_wing_1.addBox(0F, 0F, 0F, 4, 6, 0);
      Left_wing_1.setRotationPoint(1.9F, 3F, 2.4F);
      Left_wing_1.setTextureSize(64, 32);
      Left_wing_1.mirror = true;
      setRotation(Left_wing_1, 0.1047198F, -0.6283185F, 0F);
      Right_wing_1 = new ModelRenderer(this, 4, 0);
      Right_wing_1.addBox(0F, 0F, 0F, 4, 6, 0);
      Right_wing_1.setRotationPoint(-2.1F, 3F, 4.7F);
      Right_wing_1.setTextureSize(64, 32);
      Right_wing_1.mirror = true;
      setRotation(Right_wing_1, 0.1047198F, 0.6283185F, 0F);
      Right_arm_1 = new ModelRenderer(this, 14, 0);
      Right_arm_1.addBox(0F, 0F, 0F, 1, 2, 1);
      Right_arm_1.setRotationPoint(-0.8F, 3.8F, 1.2F);
      Right_arm_1.setTextureSize(64, 32);
      Right_arm_1.mirror = true;
      setRotation(Right_arm_1, -0.1745329F, 0F, 0.1745329F);
      Left_arm_1 = new ModelRenderer(this, 14, 0);
      Left_arm_1.addBox(0F, 0F, 0F, 1, 2, 1);
      Left_arm_1.setRotationPoint(2.8F, 4F, 1.2F);
      Left_arm_1.setTextureSize(64, 32);
      Left_arm_1.mirror = true;
      setRotation(Left_arm_1, -0.1745329F, 0F, -0.1745329F);
      Right_arm_2 = new ModelRenderer(this, 15, 5);
      Right_arm_2.addBox(0F, 0F, 0F, 1, 2, 1);
      Right_arm_2.setRotationPoint(-1F, 5F, 1.5F);
      Right_arm_2.setTextureSize(64, 32);
      Right_arm_2.mirror = true;
      setRotation(Right_arm_2, -1.291544F, 0F, 0.1745329F);
      Left_arm_2 = new ModelRenderer(this, 15, 5);
      Left_arm_2.addBox(0F, 0F, 0F, 1, 2, 1);
      Left_arm_2.setRotationPoint(3F, 5.2F, 1.5F);
      Left_arm_2.setTextureSize(64, 32);
      Left_arm_2.mirror = true;
      setRotation(Left_arm_2, -1.291544F, 0F, -0.1745329F);
      Right_ear_1 = new ModelRenderer(this, 20, 0);
      Right_ear_1.addBox(0F, 0F, 0F, 1, 2, 1);
      Right_ear_1.setRotationPoint(-1F, 0F, 1F);
      Right_ear_1.setTextureSize(64, 32);
      Right_ear_1.mirror = true;
      setRotation(Right_ear_1, 0.0523599F, 0F, -0.2268928F);
      Left_ear_1 = new ModelRenderer(this, 20, 0);
      Left_ear_1.addBox(0F, 0F, 0F, 1, 2, 1);
      Left_ear_1.setRotationPoint(3F, 0F, 1F);
      Left_ear_1.setTextureSize(64, 32);
      Left_ear_1.mirror = true;
      setRotation(Left_ear_1, 0.0523599F, 0F, 0.2268928F);
      Neck_1 = new ModelRenderer(this, 28, 0);
      Neck_1.addBox(0F, 0F, 0F, 1, 1, 1);
      Neck_1.setRotationPoint(1F, 3F, 1F);
      Neck_1.setTextureSize(64, 32);
      Neck_1.mirror = true;
      setRotation(Neck_1, 0.0523599F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head_1.render(f5);
    Body_1.render(f5);
    Right_leg_1.render(f5);
    Left_leg_1.render(f5);
    Right_leg_2.render(f5);
    Left_leg_2.render(f5);
    Right_leg_3.render(f5);
    Left_leg_3.render(f5);
    Left_wing_1.render(f5);
    Right_wing_1.render(f5);
    Right_arm_1.render(f5);
    Left_arm_1.render(f5);
    Right_arm_2.render(f5);
    Left_arm_2.render(f5);
    Right_ear_1.render(f5);
    Left_ear_1.render(f5);
    Neck_1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
