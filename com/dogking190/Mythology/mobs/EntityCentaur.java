package com.dogking190.Mythology.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityCentaur extends EntityAnimal
{
	
    public EntityCentaur(World par1World) {
        super(par1World);
        this.setSize(1.0F, 1.0F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.4));
    }

    public boolean isAIEnabled(){


        return  true;

    }

    protected void applyEntityAttributes(){

        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.00);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4);

    }

	@Override
	public EntityAgeable createChild(EntityAgeable var1) 
	{
		
		return new EntityCentaur(worldObj);
	}
	
	

}
