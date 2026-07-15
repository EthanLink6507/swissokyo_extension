package com.ethanlink.swissokyo_extension.init;

import java.util.function.Supplier;

import com.ethanlink.swissokyo_extension.SwissokyoExtension;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SwissokyoExtensionCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SwissokyoExtension.MOD_ID);

    public static final Supplier<CreativeModeTab> SWISSOKYO_KNIVES = CREATIVE_MODE_TAB.register("knives_items_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(SwissokyoExtensionItems.BISMUTH_KNIFE.get()))
                .title(Component.translatable("creativetab.swissokyo_extension.knives_items"))
                .displayItems((ItemDisplayParameters, output) -> {
                    output.accept(SwissokyoExtensionItems.BISMUTH_KNIFE);
                    output.accept(SwissokyoExtensionItems.CORE_KNIFE);
                    output.accept(SwissokyoExtensionItems.GARN_KNIFE);
                    output.accept(SwissokyoExtensionItems.JAAJ_KNIFE);
                    output.accept(SwissokyoExtensionItems.MAKAI_KNIFE);
                    output.accept(SwissokyoExtensionItems.MALACH_KNIFE);
                    output.accept(SwissokyoExtensionItems.REPTILE_KNIFE);
                    output.accept(SwissokyoExtensionItems.ROYALE_KNIFE);
                    output.accept(SwissokyoExtensionItems.SAPHIRE_KNIFE);
                    output.accept(SwissokyoExtensionItems.SWISS_KNIFE);
                    output.accept(SwissokyoExtensionItems.TOUR_KNIFE);
                    output.accept(SwissokyoExtensionItems.TRUE_KNIFE);
                    output.accept(SwissokyoExtensionItems.ZIRCON_KNIFE);
                })
                .build());

        public static void register(IEventBus eventBus){
            CREATIVE_MODE_TAB.register(eventBus);
        }

}
