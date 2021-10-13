package net.beansquared.mccontent.items.ore_chunks;

import net.beansquared.mccontent.McContent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LeadChunk extends Item {

    public LeadChunk(){
        setRegistryName("leadchunk");
        setUnlocalizedName(McContent.MODID + ".leadchunk");
        setCreativeTab(CreativeTabs.MISC);
    }
}
