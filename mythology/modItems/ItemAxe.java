package mythology.modItems;

import com.google.common.collect.Sets;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemAxe extends ItemTool
{
    private static final Set hashSet = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
    private static final String string = "CL_00001770";

    public ItemAxe(Item.ToolMaterial tm)
    {
        super(3.0F, tm, hashSet);
    }

    public float func_150893_a(ItemStack itemstack, Block b)
    {
        return b.getMaterial() != Material.wood && b.getMaterial() != Material.plants && b.getMaterial() != Material.vine ? super.func_150893_a(itemstack, b) : this.efficiencyOnProperMaterial;
    }
}
