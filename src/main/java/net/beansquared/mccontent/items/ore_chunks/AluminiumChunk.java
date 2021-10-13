package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AluminiumChunk extends Item {

    public AluminiumChunk(){
        setRegistryName("aluminiumchunk");
        setUnlocalizedName(McContent.MODID + ".aluminiumchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
