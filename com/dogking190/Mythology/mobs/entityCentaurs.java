package com.dogking190.Mythology.mobs;

import com.dogking190.Mythology.MythologyMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class entityCentaurs extends EntityAnimal{

    public entityCentaurs(World par1World) {
        super(par1World);
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
    public EntityAgeable createChild(EntityAgeable var1) {
        return new entityCentaurs(worldObj);
    }


    // Registering Mob
    public static void MainReg(){
		
		EntityRegistry();
		
	}
	
	public static void EntityRegistry(){
		
		createEntity(entityCentaurs.class, "mobCentaur", 0xAAAD44, 0x44A8AD);
		
	}
	
	public static void createEntity(Class entityCLass, String entityName, int solidColor, int spotColor){
		
        int randomID = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityCLass , entityName, randomID);
        EntityRegistry.registerModEntity(entityCLass, entityName, randomID, MythologyMod.m, 64, 1, true);

        createEgg(randomID, solidColor, spotColor);


    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {

        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));

    }

}
