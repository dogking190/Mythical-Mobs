package com.dogking190.Mythology;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

import com.dogking190.Mythology.world.WorldGenShrine;

public class MythicalWorldGen implements IWorldGenerator {
	
	int spawn;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		default:
			;
		}

	}

	private void generateNether(Random random, int i, int j, World world) {

		addOre(MythologyMod.blockMithrilOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockBronzeOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockCelestialBronzeOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockImperialGoldOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockPlatinumOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockRubyOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockSapphireOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockSilverOre, Blocks.stone, random, world, i, j, 5, 60, 5, 7, 20);


		
		
		for(int a = 0; a < 90; a++)
        {
           int RandPosX = i + random.nextInt(16);
           int RandPosY = random.nextInt(150);
           int RandPosZ = j + random.nextInt(16);
           (new WorldGenShrine()).generate(world, random, RandPosX, RandPosY, RandPosZ);
        }
        

	}

	private void generateEnd(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub

	}

	private void generateSurface(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub

	}

	private void addOre(Block block, Block blockSpawn, Random random,
			World world, int posX, int posZ, int minY, int maxY,
			int minVeinSize, int maxVeinSize, int spawnChance) {
		for (int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;

			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);

			new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}
}
