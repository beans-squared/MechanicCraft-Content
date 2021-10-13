package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ArditeChunk extends Item {

    public ArditeChunk(){
        setRegistryName("arditechunk");
        setUnlocalizedName(McContent.MODID + ".arditechunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
