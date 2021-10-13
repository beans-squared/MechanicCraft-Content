package net.beansquared.mccontent;

import net.beansquared.mccontent.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = McContent.MODID, name = McContent.NAME, version = McContent.VERSION, dependencies = "required-after:forge@[14.23.5.2854,)", useMetadata = true)
public class McContent {

    public static final String MODID = "mccontent";
    public static final String NAME = "MechanicCraft Content";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "net.beansquared.mccontent.proxy.ClientProxy", serverSide = "net.beansquared.mccontent.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static McContent instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
