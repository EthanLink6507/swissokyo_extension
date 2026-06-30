package com.ethanlink.swissokyo_extension;

import org.slf4j.Logger;

import com.ethanlink.swissokyo_extension.init.ModBlocks;
import com.ethanlink.swissokyo_extension.init.ModItems;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(SwissokyoExtension.MOD_ID)
public class SwissokyoExtension {
    public static final String MOD_ID = "swissokyo_extension";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SwissokyoExtension(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::addCreative);
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.BISMUTH_KNIFE);
            event.accept(ModItems.CORE_KNIFE);
            event.accept(ModItems.GARN_KNIFE);
            event.accept(ModItems.JAAJ_KNIFE);
            event.accept(ModItems.MAKAI_KNIFE);
            event.accept(ModItems.MALACH_KNIFE);
            event.accept(ModItems.REPTILE_KNIFE);
            event.accept(ModItems.ROYALE_KNIFE);
            event.accept(ModItems.SAPHIRE_KNIFE);
            event.accept(ModItems.SWISS_KNIFE);
            event.accept(ModItems.TOUR_KNIFE);
            event.accept(ModItems.TRUE_KNIFE);
            event.accept(ModItems.ZIRCON_KNIFE);
            event.accept(ModItems.COIN);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.SCAREMAKAI);
            event.accept(ModBlocks.DONATION_BOX);
        }
    }
}