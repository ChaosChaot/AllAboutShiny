package de.chaoschaot.allaboutshiny.proxy;

import de.chaoschaot.allaboutshiny.ModBlocks;
import de.chaoschaot.allaboutshiny.blocks.BlockBase;
import de.chaoschaot.allaboutshiny.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockBase(Material.ROCK, "firstblock"));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // Blocks
        event.getRegistry().register(ModBlocks.firstBlock.createItemBlock());

        // Items
        event.getRegistry().register(new ItemBase("firstitem"));
    }

}
