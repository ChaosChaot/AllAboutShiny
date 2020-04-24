package de.chaoschaot.allaboutshiny.config;

import de.chaoschaot.allaboutshiny.AllAboutShiny;
import de.chaoschaot.allaboutshiny.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class GeneralConfig {
    private static final String CATEGORY_GENERAL = "general";

    public static boolean activateFancyThings = true;

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e) {

            AllAboutShiny.logger.log(Level.WARN, "Can't load config file!", e);
        } finally {
            if(cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        activateFancyThings = cfg.getBoolean("activateFancyThings", CATEGORY_GENERAL, activateFancyThings, "Set to false if you don't want fancy things");
    }
}
