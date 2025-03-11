package opileos.additions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import opileos.additions.OpileosAdditions;


public class ModItems {

    public static final Item DIAMOND_DUST = registerItem("diamond_dust", new Item(new FabricItemSettings().food(ModFoodComponents.DIAMOND_DUST)));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", new Item(new FabricItemSettings()));
    public static final Item SHARD_BOWL = registerItem("shard_bowl", new Item(new FabricItemSettings().maxCount(16).food(ModFoodComponents.SHARD_BOWL)));
    public static final Item CAVE_CARROT = registerItem("cave_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.CAVE_CARROT)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DIAMOND_DUST);
        entries.add(DIAMOND_SHARD);
    }

    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DIAMOND_DUST);
        entries.add(CAVE_CARROT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OpileosAdditions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OpileosAdditions.LOGGER.info("Registering Mod Items for " + OpileosAdditions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
    }
}