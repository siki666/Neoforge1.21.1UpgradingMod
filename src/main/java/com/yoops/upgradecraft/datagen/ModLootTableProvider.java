package com.yoops.upgradecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class ModLootTableProvider extends BlockLootSubProvider {
    private final HolderLookup.Provider registries;

    public ModLootTableProvider(HolderLookup.Provider registries){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(),registries);
        this.registries = registries;
    }

    @Override
    protected void generate() {

    }
}
