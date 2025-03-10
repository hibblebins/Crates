package opileos.crates.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import opileos.crates.OpileosCratesMod;

public class ModItems {

    public static final Item DIAMOND_DUST = registerItem("diamond_dust", new Item(new FabricItemSettings().food(ModFoodComponents.DIAMOND_DUST)));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", new Item(new FabricItemSettings()));
    public static final Item SHARD_BOWL = registerItem("shard_bowl", new Item(new FabricItemSettings().maxCount(16).food(ModFoodComponents.SHARD_BOWL)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DIAMOND_DUST);
        entries.add(DIAMOND_SHARD);
    }

    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DIAMOND_DUST);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OpileosCratesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OpileosCratesMod.LOGGER.info("Registering Mod Items for " + OpileosCratesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
    }
}