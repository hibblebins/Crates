package opileos.additions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import opileos.additions.OpileosAdditions;
import opileos.additions.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ADDITIONS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(OpileosAdditions.MOD_ID, "additions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.additions"))
                    .icon(() -> new ItemStack(ModItems.DIAMOND_DUST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DIAMOND_DUST);
                        entries.add(ModItems.DIAMOND_SHARD);
                        entries.add(ModItems.SHARD_BOWL);
                        entries.add(ModItems.CAVE_CARROT);

                        entries.add(ModBlocks.CRATE);
                    }).build());

    public static void registerItemGroups() {
        OpileosAdditions.LOGGER.info("Registering Item Groups for " + OpileosAdditions.MOD_ID);
    }
}
