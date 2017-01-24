package net.infernalized.infernalutils;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.infernalized.infernalutils.handler.ConfigurationHandler;
import net.infernalized.infernalutils.init.ModItems;
import net.infernalized.infernalutils.reference.Reference;
import net.infernalized.infernalutils.utility.LogHelper;


@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class InfernalUtils
{
    @Mod.Instance(Reference.MOD_NAME)
    public static InfernalUtils instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }
}
