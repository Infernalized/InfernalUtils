package net.infernalized.infernalutils.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.infernalized.infernalutils.item.ItemIU;
import net.infernalized.infernalutils.item.ItemPaste;
import net.infernalized.infernalutils.reference.Names;

public class ModItems {
    public static final ItemIU paste = new ItemPaste();

    public static void init() {
        GameRegistry.registerItem(paste, Names.Items.PASTE);
    }
}