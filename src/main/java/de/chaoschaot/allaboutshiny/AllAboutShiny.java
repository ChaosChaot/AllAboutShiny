package de.chaoschaot.allaboutshiny;

import de.chaoschaot.allaboutshiny.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AllAboutShiny.MODID, name = AllAboutShiny.NAME, version = AllAboutShiny.VERSION, useMetadata = true)
public class AllAboutShiny
{
    public static final String MODID = "allaboutshiny";
    public static final String NAME = "All About Shiny";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "de.chaoschaot.allaboutshiny.proxy.ClientProxy", serverSide = "de.chaoschaot.allaboutshiny.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Instance
    public static AllAboutShiny instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
