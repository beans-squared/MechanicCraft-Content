package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronChunk extends Item {

    public IronChunk(){
        setRegistryName("ironchunk");
        setUnlocalizedName(McContent.MODID + ".ironchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
