// Date: 2014-04-15 21:35:36
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package mythology.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCentaur extends ModelBase
{
  //fields
    ModelRenderer front;
    ModelRenderer middle;
    ModelRenderer body;
    ModelRenderer right_leg;
    ModelRenderer left_leg;
    ModelRenderer left_leg_2;
    ModelRenderer right_leg_2;
    ModelRenderer back;
    ModelRenderer tail;
    ModelRenderer torso;
    ModelRenderer left_arm;
    ModelRenderer right_arm;
    ModelRenderer head;
  
  public ModelCentaur()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      front = new ModelRenderer(this, 0, 44);
      front.addBox(0F, 0F, 0F, 8, 9, 11);
      front.setRotationPoint(-4F, 3F, -12F);
      front.setTextureSize(128, 64);
      front.mirror = true;
      setRotation(front, 0F, 0F, 0F);
      front.mirror = false;
      middle = new ModelRenderer(this, 0, 25);
      middle.addBox(0F, 0F, 0F, 8, 7, 12);
      middle.setRotationPoint(-4F, 3F, -1F);
      middle.setTextureSize(128, 64);
      middle.mirror = true;
      setRotation(middle, 0F, 0F, 0F);
      middle.mirror = false;
      body = new ModelRenderer(this, 55, 17);
      body.addBox(0F, 0F, 0F, 8, 5, 3);
      body.setRotationPoint(-4F, 9F, -5F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0.9397927F, 0F, 0F);
      body.mirror = false;
      right_leg = new ModelRenderer(this, 58, 40);
      right_leg.addBox(0F, 0F, 0F, 4, 20, 4);
      right_leg.setRotationPoint(-5F, 4F, -11F);
      right_leg.setTextureSize(128, 64);
      right_leg.mirror = true;
      setRotation(right_leg, 0F, 0F, 0F);
      right_leg.mirror = false;
      left_leg = new ModelRenderer(this, 58, 40);
      left_leg.addBox(0F, 0F, 0F, 4, 20, 4);
      left_leg.setRotationPoint(1F, 4F, -11F);
      left_leg.setTextureSize(128, 64);
      left_leg.mirror = true;
      setRotation(left_leg, 0F, 0F, 0F);
      left_leg.mirror = false;
      left_leg_2 = new ModelRenderer(this, 58, 40);
      left_leg_2.addBox(0F, 0F, 0F, 4, 20, 4);
      left_leg_2.setRotationPoint(1F, 4F, 7F);
      left_leg_2.setTextureSize(128, 64);
      left_leg_2.mirror = true;
      setRotation(left_leg_2, 0F, 0F, 0F);
      left_leg_2.mirror = false;
      right_leg_2 = new ModelRenderer(this, 58, 40);
      right_leg_2.addBox(0F, 0F, 0F, 4, 20, 4);
      right_leg_2.setRotationPoint(-5F, 4F, 7F);
      right_leg_2.setTextureSize(128, 64);
      right_leg_2.mirror = true;
      setRotation(right_leg_2, 0F, 0F, 0F);
      right_leg_2.mirror = false;
      back = new ModelRenderer(this, 51, 25);
      back.addBox(2F, 0F, 0F, 8, 8, 6);
      back.setRotationPoint(-6F, 2F, 5F);
      back.setTextureSize(128, 64);
      back.mirror = true;
      setRotation(back, 0F, 0F, 0F);
      back.mirror = false;
      tail = new ModelRenderer(this, 74, 43);
      tail.addBox(0F, 0F, 0F, 4, 19, 2);
      tail.setRotationPoint(-2F, 3F, 10F);
      tail.setTextureSize(128, 64);
      tail.mirror = true;
      setRotation(tail, 0.4833219F, 0F, 0F);
      tail.mirror = false;
      torso = new ModelRenderer(this, 88, 16);
      torso.addBox(0F, 0F, 0F, 8, 12, 4);
      torso.setRotationPoint(-4F, -9F, -12F);
      torso.setTextureSize(128, 64);
      torso.mirror = true;
      setRotation(torso, 0F, 0F, 0F);
      left_arm = new ModelRenderer(this, 88, 32);
      left_arm.addBox(0F, 0F, 0F, 4, 12, 4);
      left_arm.setRotationPoint(4F, -9F, -12F);
      left_arm.setTextureSize(128, 64);
      left_arm.mirror = true;
      setRotation(left_arm, 0F, 0F, 0F);
      right_arm = new ModelRenderer(this, 104, 32);
      right_arm.addBox(0F, 0F, 0F, 4, 12, 4);
      right_arm.setRotationPoint(-8F, -9F, -12F);
      right_arm.setTextureSize(128, 64);
      right_arm.mirror = true;
      setRotation(right_arm, 0F, 0F, 0F);
      head = new ModelRenderer(this, 88, 0);
      head.addBox(0F, 0F, 0F, 8, 8, 8);
      head.setRotationPoint(-4F, -17F, -14F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    front.render(f5);
    middle.render(f5);
    body.render(f5);
    right_leg.render(f5);
    left_leg.render(f5);
    left_leg_2.render(f5);
    right_leg_2.render(f5);
    back.render(f5);
    tail.render(f5);
    torso.render(f5);
    left_arm.render(f5);
    right_arm.render(f5);
    head.render(f5);
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
    
    this.right_leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.left_leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.left_leg_2.rotateAngleX= MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.right_leg_2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }

}
