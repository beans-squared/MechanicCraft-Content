package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UraniumChunk extends Item {

    public UraniumChunk(){
        setRegistryName("uraniumchunk");
        setUnlocalizedName(McContent.MODID + ".uraniumchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
