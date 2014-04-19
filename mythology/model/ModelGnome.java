// Date: 17/04/2014 11:53:52
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package mythology.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGnome extends ModelBase
{
  //fields
    ModelRenderer Head_1;
    ModelRenderer Body_1;
    ModelRenderer Body_2;
    ModelRenderer Body_3;
    ModelRenderer Right_arm_1;
    ModelRenderer Right_hand_1;
    ModelRenderer Left_arm_1;
    ModelRenderer Left_hand_1;
    ModelRenderer Right_leg_1;
    ModelRenderer Right_foot_1;
    ModelRenderer Left_leg_1;
    ModelRenderer Left_foot_1;
    ModelRenderer Hat_1;
    ModelRenderer Hat_2;
    ModelRenderer Hat_3;
    ModelRenderer Hat_4;
    ModelRenderer Hat_5;
    ModelRenderer Hat_6;
    ModelRenderer Hat_7;
    ModelRenderer Cheek_1;
    ModelRenderer Cheek_2;
    ModelRenderer Nose;
    //ModelRenderer Cheek_1;
    //ModelRenderer Cheek_1;
  
  public ModelGnome()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Head_1 = new ModelRenderer(this, 24, 0);
      Head_1.addBox(0F, 0F, 0F, 6, 6, 6);
      Head_1.setRotationPoint(0F, 5F, 0F);
      Head_1.setTextureSize(128, 64);
      Head_1.mirror = true;
      setRotation(Head_1, 0F, 0F, 0F);
      Body_1 = new ModelRenderer(this, 30, 41);
      Body_1.addBox(0F, 0F, 0F, 7, 9, 5);
      Body_1.setRotationPoint(-0.5F, 10.5F, 0.5F);
      Body_1.setTextureSize(128, 64);
      Body_1.mirror = true;
      setRotation(Body_1, 0F, 0F, 0F);
      Body_2 = new ModelRenderer(this, 0, 39);
      Body_2.addBox(0F, 0F, 0F, 5, 9, 7);
      Body_2.setRotationPoint(0.5F, 10.5F, -0.5F);
      Body_2.setTextureSize(128, 64);
      Body_2.mirror = true;
      setRotation(Body_2, 0F, 0F, 0F);
      Body_3 = new ModelRenderer(this, 65, 41);
      Body_3.addBox(0F, 0F, 0F, 6, 9, 6);
      Body_3.setRotationPoint(0F, 11F, 0F);
      Body_3.setTextureSize(128, 64);
      Body_3.mirror = true;
      setRotation(Body_3, 0F, 0F, 0F);
      Right_arm_1 = new ModelRenderer(this, 0, 54);
      Right_arm_1.addBox(0F, 0F, 0F, 2, 5, 2);
      Right_arm_1.setRotationPoint(-2F, 10.2F, 2F);
      Right_arm_1.setTextureSize(128, 64);
      Right_arm_1.mirror = true;
      setRotation(Right_arm_1, 0F, 0F, 0.1745329F);
      Right_hand_1 = new ModelRenderer(this, 0, 0);
      Right_hand_1.addBox(0F, 0F, 0F, 2, 3, 2);
      Right_hand_1.setRotationPoint(-2.8F, 14.8F, 2F);
      Right_hand_1.setTextureSize(128, 64);
      Right_hand_1.mirror = true;
      setRotation(Right_hand_1, -0.1047198F, 0F, 0.1745329F);
      Left_arm_1 = new ModelRenderer(this, 0, 54);
      Left_arm_1.addBox(0F, 0F, 0F, 2, 5, 2);
      Left_arm_1.setRotationPoint(6F, 10.5F, 2F);
      Left_arm_1.setTextureSize(128, 64);
      Left_arm_1.mirror = true;
      setRotation(Left_arm_1, 0F, 0F, -0.1745329F);
      Left_hand_1 = new ModelRenderer(this, 0, 0);
      Left_hand_1.addBox(0F, 0F, 0F, 2, 3, 2);
      Left_hand_1.setRotationPoint(6.8F, 15.2F, 2F);
      Left_hand_1.setTextureSize(128, 64);
      Left_hand_1.mirror = true;
      setRotation(Left_hand_1, -0.1047198F, 0F, -0.1745329F);
      Right_leg_1 = new ModelRenderer(this, 83, 0);
      Right_leg_1.addBox(0F, 0F, 0F, 3, 4, 3);
      Right_leg_1.setRotationPoint(-0.1F, 19F, 1.5F);
      Right_leg_1.setTextureSize(128, 64);
      Right_leg_1.mirror = true;
      setRotation(Right_leg_1, 0F, 0F, 0.0174533F);
      Right_foot_1 = new ModelRenderer(this, 83, 24);
      Right_foot_1.addBox(0F, 0F, 0F, 3, 2, 5);
      Right_foot_1.setRotationPoint(-0.1F, 22F, -0.5F);
      Right_foot_1.setTextureSize(128, 64);
      Right_foot_1.mirror = true;
      setRotation(Right_foot_1, 0F, 0F, 0.0174533F);
      Left_leg_1 = new ModelRenderer(this, 83, 0);
      Left_leg_1.addBox(0F, 0F, 0F, 3, 4, 3);
      Left_leg_1.setRotationPoint(3.1F, 19F, 1.5F);
      Left_leg_1.setTextureSize(128, 64);
      Left_leg_1.mirror = true;
      setRotation(Left_leg_1, 0F, 0F, -0.0174533F);
      Left_foot_1 = new ModelRenderer(this, 83, 24);
      Left_foot_1.addBox(0F, 0F, 0F, 3, 2, 5);
      Left_foot_1.setRotationPoint(3.1F, 22F, -0.5F);
      Left_foot_1.setTextureSize(128, 64);
      Left_foot_1.mirror = true;
      setRotation(Left_foot_1, 0F, 0F, -0.0174533F);
      Hat_1 = new ModelRenderer(this, 0, 24);
      Hat_1.addBox(0F, 0F, 0F, 7, 1, 7);
      Hat_1.setRotationPoint(-0.5F, 4F, -0.5F);
      Hat_1.setTextureSize(128, 64);
      Hat_1.mirror = true;
      setRotation(Hat_1, 0F, 0F, 0F);
      Hat_2 = new ModelRenderer(this, 0, 24);
      Hat_2.addBox(0F, 0F, 0F, 6, 1, 6);
      Hat_2.setRotationPoint(0.2F, 3F, 0F);
      Hat_2.setTextureSize(128, 64);
      Hat_2.mirror = true;
      setRotation(Hat_2, 0F, 0F, 0F);
      Hat_3 = new ModelRenderer(this, 0, 24);
      Hat_3.addBox(0F, 0F, 0F, 5, 1, 5);
      Hat_3.setRotationPoint(0.8F, 2F, 0.5F);
      Hat_3.setTextureSize(128, 64);
      Hat_3.mirror = true;
      setRotation(Hat_3, 0F, 0F, 0F);
      Hat_4 = new ModelRenderer(this, 0, 24);
      Hat_4.addBox(0F, 0F, 0F, 4, 1, 4);
      Hat_4.setRotationPoint(1.3F, 1F, 1F);
      Hat_4.setTextureSize(128, 64);
      Hat_4.mirror = true;
      setRotation(Hat_4, 0F, 0F, 0F);
      Hat_5 = new ModelRenderer(this, 0, 24);
      Hat_5.addBox(0F, 0F, 0F, 3, 1, 3);
      Hat_5.setRotationPoint(2F, 0F, 1.5F);
      Hat_5.setTextureSize(128, 64);
      Hat_5.mirror = true;
      setRotation(Hat_5, 0F, 0F, 0F);
      Hat_6 = new ModelRenderer(this, 0, 24);
      Hat_6.addBox(0F, 0F, 0F, 2, 1, 2);
      Hat_6.setRotationPoint(2.9F, -1F, 2F);
      Hat_6.setTextureSize(128, 64);
      Hat_6.mirror = true;
      setRotation(Hat_6, 0F, 0F, 0F);
      Hat_7 = new ModelRenderer(this, 0, 24);
      Hat_7.addBox(0F, 0F, 0F, 1, 1, 1);
      Hat_7.setRotationPoint(3.8F, -2F, 2.5F);
      Hat_7.setTextureSize(128, 64);
      Hat_7.mirror = true;
      setRotation(Hat_7, 0F, 0F, 0F);
      Cheek_1 = new ModelRenderer(this, 1, 17);
      Cheek_1.addBox(0F, 0F, 0F, 2, 2, 1);
      Cheek_1.setRotationPoint(-0.1F, 9F, -0.1F);
      Cheek_1.setTextureSize(128, 64);
      Cheek_1.mirror = true;
      setRotation(Cheek_1, 0F, 0F, 0F);
      Cheek_2 = new ModelRenderer(this, 1, 17);
      Cheek_2.addBox(0F, 0F, 0F, 2, 2, 1);
      Cheek_2.setRotationPoint(4.1F, 9F, -0.1F);
      Cheek_2.setTextureSize(128, 64);
      Cheek_2.mirror = true;
      setRotation(Cheek_2, 0F, 0F, 0F);
      Cheek_2.mirror = false;
      Nose = new ModelRenderer(this, 9, 17);
      Nose.addBox(0F, 0F, 0F, 1, 1, 1);
      Nose.setRotationPoint(2.5F, 7.5F, -0.5F);
      Nose.setTextureSize(128, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Cheek_1 = new ModelRenderer(this, 9, 14);
      Cheek_1.addBox(0F, 0F, 0F, 2, 2, 1);
      Cheek_1.setRotationPoint(-1F, 7F, 2F);
      Cheek_1.setTextureSize(128, 64);
      Cheek_1.mirror = true;
      setRotation(Cheek_1, 0F, 0F, 0.1047198F);
      Cheek_1 = new ModelRenderer(this, 9, 14);
      Cheek_1.addBox(0F, 0F, 0F, 2, 2, 1);
      Cheek_1.setRotationPoint(5F, 7F, 2F);
      Cheek_1.setTextureSize(128, 64);
      Cheek_1.mirror = true;
      setRotation(Cheek_1, 0F, 0F, -0.1047198F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head_1.render(f5);
    Body_1.render(f5);
    Body_2.render(f5);
    Body_3.render(f5);
    Right_arm_1.render(f5);
    Right_hand_1.render(f5);
    Left_arm_1.render(f5);
    Left_hand_1.render(f5);
    Right_leg_1.render(f5);
    Right_foot_1.render(f5);
    Left_leg_1.render(f5);
    Left_foot_1.render(f5);
    Hat_1.render(f5);
    Hat_2.render(f5);
    Hat_3.render(f5);
    Hat_4.render(f5);
    Hat_5.render(f5);
    Hat_6.render(f5);
    Hat_7.render(f5);
    Cheek_1.render(f5);
    Cheek_2.render(f5);
    Nose.render(f5);
    Cheek_1.render(f5);
    Cheek_1.render(f5);
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