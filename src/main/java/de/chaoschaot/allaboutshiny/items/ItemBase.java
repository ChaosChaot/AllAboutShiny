package de.chaoschaot.allaboutshiny.items;

import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
