package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CopperChunk extends Item {

    public CopperChunk(){
        setRegistryName("copperchunk");
        setUnlocalizedName(McContent.MODID + ".copperchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
