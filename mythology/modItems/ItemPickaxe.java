package mythology.modItems;

import com.google.common.collect.Sets;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;



public class ItemPickaxe extends ItemTool
{
    public static final Set hashSet = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail});
    private static final String string = "CL_00000053";

    public ItemPickaxe(Item.ToolMaterial tm)
    {
        super(2.0F, tm, hashSet);
    }

    public boolean func_150897_b(Block b)
    {
        return b == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (b != Blocks.diamond_block && b != Blocks.diamond_ore ? (b != Blocks.emerald_ore && b != Blocks.emerald_block ? (b != Blocks.gold_block && b != Blocks.gold_ore ? (b != Blocks.iron_block && b != Blocks.iron_ore ? (b != Blocks.lapis_block && b != Blocks.lapis_ore ? (b != Blocks.redstone_ore && b != Blocks.lit_redstone_ore ? (b.getMaterial() == Material.rock ? true : (b.getMaterial() == Material.iron ? true : b.getMaterial() == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
    }

    public float func_150893_a(ItemStack itemstack, Block b)
    {
        return b.getMaterial() != Material.iron && b.getMaterial() != Material.anvil && b.getMaterial() != Material.rock ? super.func_150893_a(itemstack, b) : this.efficiencyOnProperMaterial;
    }
}