package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NickelChunk extends Item {

    public NickelChunk(){
        setRegistryName("nickelchunk");
        setUnlocalizedName(McContent.MODID + ".nickelchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
