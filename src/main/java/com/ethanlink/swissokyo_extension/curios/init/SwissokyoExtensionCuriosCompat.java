package com.ethanlink.swissokyo_extension.curios.init;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;

import com.ethanlink.swissokyo_extension.item.procedures.BakenekoMaskCuriosProcedures;
import com.ethanlink.swissokyo_extension.item.procedures.KitsuneMaskCuriosProcedures;

import net.mcreator.swissokyoaddons.init.SwissokyoAddonsModItems;

import net.mcreator.swissokyoaddons.procedures.ShogunArmsTickEventProcedure;
import net.mcreator.swissokyoaddons.procedures.OniHelmetTickEventProcedure;

public class SwissokyoExtensionCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
		}, 
		SwissokyoAddonsModItems.MAKAI_WINGS_CHESTPLATE.get());

		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
		}, 
		SwissokyoAddonsModItems.SKS_ARMOR_HELMET.get());

		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
			@Override
			public void curioTick(SlotContext slotContext) {
				ShogunArmsTickEventProcedure.execute(slotContext.entity());
			}
		},
		SwissokyoAddonsModItems.SKS_ARMOR_LEGGINGS.get());

		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
			@Override
			public void curioTick(SlotContext slotContext) {
				BakenekoMaskCuriosProcedures.execute(slotContext.entity());
			}
		}, 
		SwissokyoAddonsModItems.BNK_HELMET.get());

		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
			@Override
			public void curioTick(SlotContext slotContext) {
				KitsuneMaskCuriosProcedures.execute(slotContext.entity());
			}
		}, 
		SwissokyoAddonsModItems.KDC_HELMET.get());

		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
			@Override
			public void curioTick(SlotContext slotContext) {
				OniHelmetTickEventProcedure.execute(slotContext.entity());
			}
		}, 
		SwissokyoAddonsModItems.ONI_HELMET.get());

		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
			@Override
			public void curioTick(SlotContext slotContext) {
				ShogunArmsTickEventProcedure.execute(slotContext.entity());
			}
		}, 
		SwissokyoAddonsModItems.SHOGUN_SET_LEGGINGS.get());
	}
}