package com.ethanlink.swissokyo_extension.init;

import java.lang.reflect.Field;
import java.util.ArrayList;
import net.minecraft.advancements.critereon.FishingHookPredicate;
import net.minecraft.advancements.critereon.EntityPredicate.Builder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootContext.EntityTarget;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;

@EventBusSubscriber(
   modid = "swissokyo_extention"
)
public class SwissokyoExtensionLootModifier {
   public static final ResourceKey<LootTable> FISH = register("gameplay/fishing/fish");
   public static final ResourceKey<LootTable> TREASURE = register("gameplay/fishing/treasure");

   public SwissokyoExtensionLootModifier() {
   }

   private static ResourceKey<LootTable> register(String path) {
      return BuiltInLootTables.register(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("swissokyo_extention", path)));
   }

   @SubscribeEvent
   public static void onLootTableLoad(LootTableLoadEvent event) {
      ResourceLocation name = event.getName();
      if (name != null && name.equals(BuiltInLootTables.FISHING.location())) {
         LootPool pool = event.getTable().getPool("main");
         if (pool != null) {
            addEntry(pool, getInjectEntry(FISH, 85, -1));
            addEntry(pool, getInjectEntry(TREASURE, 10, -2));
         }
      }

   }

   private static LootPoolEntryContainer getInjectEntry(ResourceKey<LootTable> resourceKey, int weight, int quality) {
      return NestedLootTable.lootTableReference(resourceKey).setWeight(weight).setQuality(quality).build();
   }
}
