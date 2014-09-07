package mythology.items;

import com.google.common.collect.Sets;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

public class ItemShovel extends ItemTool
{
    private static final Set hashSet = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
    private static final String string = "CL_00000063";

    public ItemShovel(Item.ToolMaterial tm)
    {
        super(1.0F, tm, hashSet);
    }

    public boolean func_150897_b(Block b)
    {
        return b == Blocks.snow_layer ? true : b == Blocks.snow;
    }
}