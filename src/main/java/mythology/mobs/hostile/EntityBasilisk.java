package mythology.mobs.hostile;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityBasilisk extends EntityMob{

	public EntityBasilisk(World arg0) {
		super(arg0);
		this.setSize(2.0F, 5.0F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.4));
		
	}
	public boolean isAIEnabled(){
		return true;
	}
	protected void applyEntityAttributes(){

        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.00);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4);

    }
}
