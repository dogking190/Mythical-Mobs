package mythology.mobs.passive;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityGnome extends EntityAnimal{

	public EntityGnome(World world) {
		super(world);
		
		this.setSize(0.6F, 1.5F);
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
	public EntityAgeable createChild(EntityAgeable ageable) {
		
		return new EntityGnome(worldObj);
	}

}
