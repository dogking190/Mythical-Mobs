package mythology.mobs.passive;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityFairy extends EntityAnimal{

	public EntityFairy(World par1World) {
		super(par1World);
		this.setSize(0.5F, 0.5F);
		this.yOffset *= 6.0F;
		
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
	public EntityAgeable createChild(EntityAgeable var1) {
		
		return new EntityFairy(worldObj);
	}

}
