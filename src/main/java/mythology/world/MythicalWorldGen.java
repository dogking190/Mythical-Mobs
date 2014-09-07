package mythology.world;

import java.util.Random;

import mythology.MythologyMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;


public class MythicalWorldGen implements IWorldGenerator {

	private static final int CHUNK_SIZE = 16;
	private static final int NETHER_ID = -1;
	private static final int SURFACE_ID = 0;
	private static final int END_ID = 1;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case NETHER_ID:
			generateNether(random, chunkX * CHUNK_SIZE, chunkZ * CHUNK_SIZE, world);
			break;
		case SURFACE_ID:
			generateSurface(random, chunkX * CHUNK_SIZE, chunkZ * CHUNK_SIZE, world);
			break;
		case END_ID:
			generateEnd(random, chunkX * CHUNK_SIZE, chunkZ * CHUNK_SIZE, world);
			break;
		default:
			;
		}

	}

	private void generateNether(Random random, int posX, int posY, World world) {}

	private void generateEnd(Random random, int posX, int posY, World world) {}

	private void generateSurface(Random random, int posX, int posY, World world) {
		
		addOre(MythologyMod.blockMithrilOre, Blocks.stone, random, world, posX, posY, 1, 15, 1, 4, 5);
        addOre(MythologyMod.blockCopperOre, Blocks.stone, random, world, posX, posY, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockZincOre, Blocks.stone, random, world, posX, posY, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockTinOre, Blocks.stone, random, world, posX, posY, 5, 60, 5, 7, 20);
        addOceanOre(MythologyMod.blockCelestialBronzeOre, Blocks.gravel, random, world, posX, posY, 5, 64, 3, 5, 10);
        addDesertOre(MythologyMod.blockImperialGoldOre, Blocks.stone, random, world, posX, posY, 5, 100, 5, 7, 10);
        addOceanOre(MythologyMod.blockCelestialBronzeOre, Blocks.stone, random, world, posX, posY, 5, 64, 3, 5, 10);
        addOre(MythologyMod.blockPlatinumOre, Blocks.stone, random, world, posX, posY, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockRubyOre, Blocks.stone, random, world, posX, posY, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockSapphireOre, Blocks.stone, random, world, posX, posY, 5, 60, 5, 7, 20);
        addOre(MythologyMod.blockSilverOre, Blocks.stone, random, world, posX, posY, 5, 60, 5, 7, 20);

		BiomeGenBase biome = world.getBiomeGenForCoords(posX, posY);
		if(biome.biomeID == 1){
			
			if(random.nextInt(5) == 1){
				
				for(int a =0; a < 1; a++){
					int RandPosX = posX + random.nextInt(16);
					int RandPosY = random.nextInt(150);
					int RandPosZ = posY + random.nextInt(16);
					(new GnomeVillage()).generate(world, random, RandPosX, RandPosY, RandPosZ);
				}
			
			}
		}

	}

	/**
	 * Adds a ore with one spawn block.
	 * @param ore The ore which should generate.
	 * @param spawnBlock The block in which the ore will spawn.
	 * @param random A instance of random.
	 * @param world A instance of the current world.
	 * @param posX The X position in which the ore should generate.
	 * @param posZ The Z position in which the ore should generate.
	 * @param minY The minimum Y position the ore can generate.
	 * @param maxY The maximum Y position the ore can generate.
	 * @param minVeinSize The minimum vein size.
	 * @param maxVeinSize The maximum vein size.
	 * @param spawnChance The chance of the block spawning.
	 * */
	private void addOre(Block ore, Block spawnBlock, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for (int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;

			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);

			new WorldGenMinable(ore,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), spawnBlock).generate(world, random, xPos, yPos, zPos);
		}
	
	}

	/**
	 * Adds a ore with one spawn block.
	 * @param ore The ore which should generate.
	 * @param spawnBlock The block in which the ore will spawn.
	 * @param random A instance of random.
	 * @param world A instance of the current world.
	 * @param posX The X position in which the ore should generate.
	 * @param posZ The Z position in which the ore should generate.
	 * @param minY The minimum Y position the ore can generate.
	 * @param maxY The maximum Y position the ore can generate.
	 * @param minVeinSize The minimum vein size.
	 * @param maxVeinSize The maximum vein size.
	 * @param spawnChance The chance of the block spawning.
	 * */
	private void addOceanOre(Block ore, Block spawnBlock, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(posX ,posZ);
		if(biome instanceof BiomeGenOcean){
			for (int i = 0; i < spawnChance; i++) {
				int defaultChunkSize = 16;
				int xPos = posX + random.nextInt(defaultChunkSize);
				int yPos = minY + random.nextInt(maxY - minY);
				int zPos = posZ + random.nextInt(defaultChunkSize);

				new WorldGenMinable(ore,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), spawnBlock).generate(world, random, xPos, yPos, zPos);
			}
		}
		
		
	
	}

	/**
	 * Adds a ore with one spawn block.
	 * @param ore The ore which should generate.
	 * @param spawnBlock The block in which the ore will spawn.
	 * @param random A instance of random.
	 * @param world A instance of the current world.
	 * @param posX The X position in which the ore should generate.
	 * @param posZ The Z position in which the ore should generate.
	 * @param minY The minimum Y position the ore can generate.
	 * @param maxY The maximum Y position the ore can generate.
	 * @param minVeinSize The minimum vein size.
	 * @param maxVeinSize The maximum vein size.
	 * @param spawnChance The chance of the block spawning.
	 * */
	private void addDesertOre(Block ore, Block spawnBlock, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(posX ,posZ);
		if(biome instanceof BiomeGenDesert){
			for (int i = 0; i < spawnChance; i++) {
				int defaultChunkSize = 16;
				int xPos = posX + random.nextInt(defaultChunkSize);
				int yPos = minY + random.nextInt(maxY - minY);
				int zPos = posZ + random.nextInt(defaultChunkSize);

				new WorldGenMinable(ore,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), spawnBlock).generate(world, random, xPos, yPos, zPos);
			}
		}
	}
}
