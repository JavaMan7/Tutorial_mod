package com.tutorial_mod;



import com.javaman.tutorial_mod.WorldGen.ModWorldGenerator;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = TutorialMod.MODID, version = TutorialMod.VERSION)
public class TutorialMod
{
    public static final String MODID = "tutorial_mod";
    public static final String VERSION = "1.0";
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 0);  
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
}
