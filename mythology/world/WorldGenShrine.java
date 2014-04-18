package mythology.world;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenShrine extends WorldGenerator{
	
	public boolean generate(World world, Random rand, int x, int y, int z)
	   {
	      if(world.getBlock(x, y, z)!= Blocks.grass)
	      {
	         return false;
	      }
	                Block block = Blocks.glowstone;
	                       
	                world.setBlock(x, y + 1, z, block);
	                world.setBlock(x, y + 2, z, block);
	                world.setBlock(x, y + 3, z, block);
	                world.setBlock(x, y + 4, z, block);
	                world.setBlock(x, y + 5, z, block);
	                world.setBlock(x, y + 6, z, block);
	                world.setBlock(x, y + 6, z + 1, block);
	                world.setBlock(x, y + 6, z + 2, block);
	                world.setBlock(x, y + 6, z + 3, block);
	                world.setBlock(x, y + 6, z + 4, block);
	                world.setBlock(x, y + 6, z + 5, block);
	                world.setBlock(x, y + 6, z + 6, block);
	                world.setBlock(x + 1, y + 6, z, block);
	                world.setBlock(x + 2, y + 6, z , block);
	                world.setBlock(x + 3, y + 6, z  , block);            
	                world.setBlock(x + 4, y + 6, z , block);
	                world.setBlock(x + 5, y + 6, z , block);
	                world.setBlock(x + 6, y + 6, z  ,block);
	                world.setBlock(x + 7, y + 6, z , block);
	                world.setBlock(x + 8, y + 6, z  ,block);
	                world.setBlock(x + 9, y + 6, z , block);
	                world.setBlock(x + 9, y + 1, z + 6, block);
	                world.setBlock(x + 9, y + 2, z + 6, block);
	                world.setBlock(x + 9, y + 3, z + 6, block);
	                world.setBlock(x + 9, y + 4, z + 6, block);
	                world.setBlock(x + 9, y + 5, z + 6, block);
	                world.setBlock(x + 9, y + 6, z + 6, block);
	                world.setBlock(x + 1, y + 0, z, block);
	                world.setBlock(x + 2, y + 0, z, block);
	                world.setBlock(x + 3, y + 0, z, block);
	                world.setBlock(x + 4, y + 0, z, block);
	                world.setBlock(x + 5, y + 0, z, block);
	                world.setBlock(x + 6, y + 0, z, block);
	                world.setBlock(x + 7, y + 0, z, block);
	                world.setBlock(x + 8, y + 0, z, block);
	                world.setBlock(x + 9, y + 0, z, block);
	                world.setBlock(x + 9, y + 1, z, block);
	                world.setBlock(x +9, y + 2, z, block);
	                world.setBlock(x + 9, y + 3, z, block);
	                world.setBlock(x + 9, y + 4, z, block);
	                world.setBlock(x + 9, y + 5, z, block);
	                world.setBlock(x + 9, y + 6, z, block);
	                world.setBlock(x + 9, y + 0, z + 1, block);
	                world.setBlock(x + 9, y + 0, z + 2, block);
	                world.setBlock(x + 9, y + 0, z + 3, block);
	                world.setBlock(x + 9, y + 0, z + 4, block);
	                world.setBlock(x + 9, y + 0, z + 5, block);
	                world.setBlock(x + 9, y + 0, z + 6, block);
	                world.setBlock(x + 8, y + 0, z + 6, block);
	                world.setBlock(x + 7, y + 0, z + 6, block);
	                world.setBlock(x + 6, y + 0, z + 6, block);
	                world.setBlock(x + 5, y + 0, z + 6, block);
	                world.setBlock(x + 4, y + 0, z + 6, block);
	                world.setBlock(x + 3 , y + 0, z + 6, block);
	                world.setBlock(x + 2 , y + 0, z + 6, block);
	                world.setBlock(x , y + 0, z + 6, block);
	                world.setBlock(x , y + 0, z + 6, block);
	                world.setBlock(x , y + 1, z + 6, block);
	                world.setBlock(x , y + 2, z + 6, block);
	                world.setBlock(x , y + 3, z + 6, block);
	                world.setBlock(x , y + 4, z + 6, block);
	                world.setBlock(x , y + 5, z + 6, block);
	                world.setBlock(x , y + 6, z + 6, block);
	                world.setBlock(x , y + 0, z + 5, block);
	                world.setBlock(x , y + 0, z + 4, block);
	                world.setBlock(x , y + 0, z + 3, block);
	                world.setBlock(x , y + 0, z + 2, block);
	                world .setBlock (x + 9, y + 1, z + 6, block);
	                world .setBlock (x + 9 , y + 2, z + 6, block);       
	                world .setBlock (x + 9 , y + 3, z  + 6, block);
	                world .setBlock (x + 9 , y + 4, z + 6, block);
	                world .setBlock (x + 9, y + 5, z + 6, block);
	                world .setBlock (x + 9 , y + 6, z + 6, block);   
	                
	                /**************************************************/
	                world.notifyBlockChange(x, y + 1, z, block);
	                world.notifyBlockChange(x, y + 2, z, block);
	                world.notifyBlockChange(x, y + 3, z, block);
	                world.notifyBlockChange(x, y + 4, z, block);
	                world.notifyBlockChange(x, y + 5, z, block);
	                world.notifyBlockChange(x, y + 6, z, block);
	                world.notifyBlockChange(x, y + 6, z + 1, block);
	                world.notifyBlockChange(x, y + 6, z + 2, block);
	                world.notifyBlockChange(x, y + 6, z + 3, block);
	                world.notifyBlockChange(x, y + 6, z + 4, block);
	                world.notifyBlockChange(x, y + 6, z + 5, block);
	                world.notifyBlockChange(x, y + 6, z + 6, block);
	                world.notifyBlockChange(x + 1, y + 6, z, block);
	                world.notifyBlockChange(x + 2, y + 6, z , block);
	                world.notifyBlockChange(x + 3, y + 6, z  , block);            
	                world.notifyBlockChange(x + 4, y + 6, z , block);
	                world.notifyBlockChange(x + 5, y + 6, z , block);
	                world.notifyBlockChange(x + 6, y + 6, z  ,block);
	                world.notifyBlockChange(x + 7, y + 6, z , block);
	                world.notifyBlockChange(x + 8, y + 6, z  ,block);
	                world.notifyBlockChange(x + 9, y + 6, z , block);
	                world.notifyBlockChange(x + 9, y + 1, z + 6, block);
	                world.notifyBlockChange(x + 9, y + 2, z + 6, block);
	                world.notifyBlockChange(x + 9, y + 3, z + 6, block);
	                world.notifyBlockChange(x + 9, y + 4, z + 6, block);
	                world.notifyBlockChange(x + 9, y + 5, z + 6, block);
	                world.notifyBlockChange(x + 9, y + 6, z + 6, block);
	                world.notifyBlockChange(x + 1, y + 0, z, block);
	                world.notifyBlockChange(x + 2, y + 0, z, block);
	                world.notifyBlockChange(x + 3, y + 0, z, block);
	                world.notifyBlockChange(x + 4, y + 0, z, block);
	                world.notifyBlockChange(x + 5, y + 0, z, block);
	                world.notifyBlockChange(x + 6, y + 0, z, block);
	                world.notifyBlockChange(x + 7, y + 0, z, block);
	                world.notifyBlockChange(x + 8, y + 0, z, block);
	                world.notifyBlockChange(x + 9, y + 0, z, block);
	                world.notifyBlockChange(x + 9, y + 1, z, block);
	                world.notifyBlockChange(x +9, y + 2, z, block);
	                world.notifyBlockChange(x + 9, y + 3, z, block);
	                world.notifyBlockChange(x + 9, y + 4, z, block);
	                world.notifyBlockChange(x + 9, y + 5, z, block);
	                world.notifyBlockChange(x + 9, y + 6, z, block);
	                world.notifyBlockChange(x + 9, y + 0, z + 1, block);
	                world.notifyBlockChange(x + 9, y + 0, z + 2, block);
	                world.notifyBlockChange(x + 9, y + 0, z + 3, block);
	                world.notifyBlockChange(x + 9, y + 0, z + 4, block);
	                world.notifyBlockChange(x + 9, y + 0, z + 5, block);
	                world.notifyBlockChange(x + 9, y + 0, z + 6, block);
	                world.notifyBlockChange(x + 8, y + 0, z + 6, block);
	                world.notifyBlockChange(x + 7, y + 0, z + 6, block);
	                world.notifyBlockChange(x + 6, y + 0, z + 6, block);
	                world.notifyBlockChange(x + 5, y + 0, z + 6, block);
	                world.notifyBlockChange(x + 4, y + 0, z + 6, block);
	                world.notifyBlockChange(x + 3 , y + 0, z + 6, block);
	                world.notifyBlockChange(x + 2 , y + 0, z + 6, block);
	                world.notifyBlockChange(x , y + 0, z + 6, block);
	                world.notifyBlockChange(x , y + 0, z + 6, block);
	                world.notifyBlockChange(x , y + 1, z + 6, block);
	                world.notifyBlockChange(x , y + 2, z + 6, block);
	                world.notifyBlockChange(x , y + 3, z + 6, block);
	                world.notifyBlockChange(x , y + 4, z + 6, block);
	                world.notifyBlockChange(x , y + 5, z + 6, block);
	                world.notifyBlockChange(x , y + 6, z + 6, block);
	                world.notifyBlockChange(x , y + 0, z + 5, block);
	                world.notifyBlockChange(x , y + 0, z + 4, block);
	                world.notifyBlockChange(x , y + 0, z + 3, block);
	                world.notifyBlockChange(x , y + 0, z + 2, block);
	                world .notifyBlockChange (x + 9, y + 1, z + 6, block);
	                world .notifyBlockChange (x + 9 , y + 2, z + 6, block);       
	                world .notifyBlockChange (x + 9 , y + 3, z  + 6, block);
	                world .notifyBlockChange (x + 9 , y + 4, z + 6, block);
	                world .notifyBlockChange (x + 9, y + 5, z + 6, block);
	                world .notifyBlockChange (x + 9 , y + 6, z + 6, block);   
	               
	                return true;
	   }  

}
