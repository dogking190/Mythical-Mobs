package mythology.init;

import mythology.MythologyMod;
import mythology.mobs.hostile.*;
import mythology.mobs.passive.*;
import mythology.mobs.hostile.EntityMinotaur;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class MythicalMobs {

	@SuppressWarnings("unchecked")
	public static void addMob(Class entityClass, String name, EnumCreatureType creatureType, int primColor, int secColor, BiomeGenBase biome, int weightedProb, int min, int max){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, MythologyMod.m, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, weightedProb, min, max, creatureType, biome);
        EntityList.entityEggs.put(entityID, new EntityList.EntityEggInfo(entityID, primColor, secColor));
	}

	public static void register(){
		addMob(EntityGnome.class, "mobGnome", EnumCreatureType.creature, 0xFC0A16, 0xFCFCFC, BiomeGenBase.roofedForest, 200, 200, 200);
		addMob(EntityCentaur.class, "mobCentaur", EnumCreatureType.monster, 0x1A33D6, 0x1AD63F, BiomeGenBase.megaTaiga, 200, 200, 200);
		addMob(EntityFairy.class, "mobFairy", EnumCreatureType.creature, 0x07FA10, 0xE9F5E9, BiomeGenBase.forest, 200, 200, 200);
		addMob(EntityMinotaur.class, "mobMinotaur", EnumCreatureType.monster, 0x835C3B, 0xD1D0CE, BiomeGenBase.extremeHillsPlus, 200, 200, 200);
		addMob(EntityBasilisk.class, "mobBasilisk", EnumCreatureType.monster, 0xF0F5BC, 0xFF9100, BiomeGenBase.desertHills, 200, 200, 200);
	}
}
