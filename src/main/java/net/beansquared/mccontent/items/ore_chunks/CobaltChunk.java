package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CobaltChunk extends Item {

    public CobaltChunk(){
        setRegistryName("cobaltchunk");
        setUnlocalizedName(McContent.MODID + ".cobaltchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
