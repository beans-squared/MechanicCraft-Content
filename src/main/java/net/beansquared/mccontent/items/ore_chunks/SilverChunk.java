package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SilverChunk extends Item {

    public SilverChunk(){
        setRegistryName("silverchunk");
        setUnlocalizedName(McContent.MODID + ".silverchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
