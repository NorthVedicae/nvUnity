package com.vedicae.nvunity.world.biome;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenLunasta extends BiomeGenBase {

    public BiomeGenLunasta(int par1)
    {
        super(par1);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();

    }
    @SideOnly(Side.CLIENT)

    /**
     * takes temperature, returns color
     */
    public int getSkyColorByTemp(float par1)
    {
        return 0;  //How do you control the color with this number?
    }
}
