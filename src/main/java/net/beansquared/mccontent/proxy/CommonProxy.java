package net.beansquared.mccontent.proxy;

import net.beansquared.mccontent.items.ore_chunks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){

        // Ore chunks
        event.getRegistry().register(new AluminiumChunk());
        event.getRegistry().register(new ArditeChunk());
        event.getRegistry().register(new CobaltChunk());
        event.getRegistry().register(new CopperChunk());
        event.getRegistry().register(new IronChunk());
        event.getRegistry().register(new LeadChunk());
        event.getRegistry().register(new NickelChunk());
        event.getRegistry().register(new SilverChunk());
        event.getRegistry().register(new SulfurChunk());
        event.getRegistry().register(new TungstenChunk());
        event.getRegistry().register(new UraniumChunk());
    }
}
