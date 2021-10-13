package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TungstenChunk extends Item {

    public TungstenChunk(){
        setRegistryName("tungstenchunk");
        setUnlocalizedName(McContent.MODID + ".tungstenchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
