package com.vedicae.nvunity;

import com.vedicae.nvunity.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER )
public class NVUnity {
    
    //PreInit lets you load things before your mod is turned on.  Translations, config, version check, etc.  Blocks and items need to be here.
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    //Init is the code that runs when your mod is turned on.  Registered forge events and crafting recipes.
    @Init
    public void init(FMLInitializationEvent event) {
        
    }
    
    //PostInit is for after all mods are loaded.  Buildcraft energy API and such go here.
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
