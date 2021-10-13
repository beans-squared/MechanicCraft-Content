package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SulfurChunk extends Item {

    public SulfurChunk(){
        setRegistryName("sulfurchunk");
        setUnlocalizedName(McContent.MODID + ".sulfurchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
