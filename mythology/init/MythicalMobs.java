package mythology.init;

import mythology.MythologyMod;
import mythology.mobs.hostile.*;
import mythology.mobs.passive.*;
import mythology.mobs.hostile.EntityMinotaur;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class MythicalMobs {
	public static void addMob(Class entityClass, String name, EnumCreatureType typeMob, int primColor, int secColor, BiomeGenBase biome, int arg1, int arg2, int arg3){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, MythologyMod.m, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, arg1, arg2, arg3, typeMob, biome);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primColor, secColor));
	}
	public static void register(){
		MythicalMobs.addMob(EntityGnome.class, "mobGnome", EnumCreatureType.creature, 0xFC0A16, 0xFCFCFC, BiomeGenBase.roofedForest, 200, 200, 200);
		MythicalMobs.addMob(EntityCentaur.class, "mobCentaur", EnumCreatureType.monster, 0x1A33D6, 0x1AD63F, BiomeGenBase.megaTaiga, 200, 200, 200);
		MythicalMobs.addMob(EntityFairy.class, "mobFairy", EnumCreatureType.creature, 0x07FA10, 0xE9F5E9, BiomeGenBase.forest, 200, 200, 200);
		MythicalMobs.addMob(EntityMinotaur.class, "mobMinotaur", EnumCreatureType.monster, 0x835C3B, 0xD1D0CE, BiomeGenBase.extremeHillsPlus, 200, 200, 200);
	
	}
}
