package com.yoops.upgradecraft.item;

import com.yoops.upgradecraft.UpgradeCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UpgradeCraft.MOD_ID);

    public static final DeferredItem<Item> BARK = ITEMS.register("bark", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
