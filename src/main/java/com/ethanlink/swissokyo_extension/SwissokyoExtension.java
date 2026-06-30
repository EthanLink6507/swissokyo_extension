package com.ethanlink.swissokyo_extension;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;

import com.ethanlink.swissokyo_extension.init.ModBlocks;
import com.ethanlink.swissokyo_extension.init.ModCuriosCompat;
import com.ethanlink.swissokyo_extension.init.ModCuriosRenderers;
import com.ethanlink.swissokyo_extension.init.ModItems;
import com.mojang.logging.LogUtils;

import it.unimi.dsi.fastutil.ints.IntObjectImmutablePair;
import it.unimi.dsi.fastutil.ints.IntObjectPair;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.capabilities.EntityCapability;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.items.IItemHandler;

@Mod(SwissokyoExtension.MOD_ID)
public class SwissokyoExtension {
    public static final String MOD_ID = "swissokyo_extension";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SwissokyoExtension(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);
		if (ModList.get().isLoaded("curios")) {
			modEventBus.addListener(ModCuriosCompat::registerCapabilities);
			modEventBus.addListener(ModCuriosRenderers::registerRenderers);
		}
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

	@SubscribeEvent
	public void tick(ServerTickEvent.Post event) {
		int currentTick = event.getServer().getTickCount();
		IntObjectPair<Runnable> work;
		while ((work = workToBeScheduled.poll()) != null) {
			workQueue.add(new TickTask(currentTick + work.leftInt(), work.right()));
		}
		while (!workQueue.isEmpty() && currentTick >= workQueue.peek().getTick()) {
			workQueue.poll().run();
		}
	}

	private static final Queue<IntObjectPair<Runnable>> workToBeScheduled = new ConcurrentLinkedQueue<>();
	private static final PriorityQueue<TickTask> workQueue = new PriorityQueue<>(Comparator.comparingInt(TickTask::getTick));

	public static void queueServerWork(int delay, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workToBeScheduled.add(new IntObjectImmutablePair<>(delay, action));
	}

    public static class CuriosApiHelper {
		private static final EntityCapability<IItemHandler, Void> CURIOS_INVENTORY = EntityCapability.createVoid(ResourceLocation.fromNamespaceAndPath("curios", "item_handler"), IItemHandler.class);

		public static IItemHandler getCuriosInventory(Player player) {
			if (ModList.get().isLoaded("curios")) {
				return player.getCapability(CURIOS_INVENTORY);
			}
			return null;
		}

		public static boolean isCurioItem(ItemStack itemstack) {
			return BuiltInRegistries.ITEM.getTagNames().filter(tagKey -> tagKey.location().getNamespace().equals("curios")).anyMatch(itemstack::is);
		}
	}
}