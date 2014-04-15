package com.dogking190.Mythology.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

import com.dogking190.Mythology.MythologyMod;

import cpw.mods.fml.common.registry.EntityRegistry;

public class entityCentaurs extends EntityAnimal{

    public entityCentaurs(World par1World) {
        super(par1World);
        this.setSize(0.9F, 1.3F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
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
