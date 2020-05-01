package de.chaoschaot.allaboutshiny.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    public BlockBase(Material materialIn, String name) {
        super(materialIn);

        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
