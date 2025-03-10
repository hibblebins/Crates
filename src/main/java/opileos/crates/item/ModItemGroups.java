package opileos.crates.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import opileos.crates.OpileosCratesMod;
import opileos.crates.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CRATES_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(OpileosCratesMod.MOD_ID, "crates"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crates"))
                    .icon(() -> new ItemStack(ModItems.DIAMOND_DUST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DIAMOND_DUST);
                        entries.add(ModItems.DIAMOND_SHARD);
                        entries.add(ModItems.SHARD_BOWL);
                        entries.add(ModBlocks.CRATE);
                    }).build());

    public static void registerItemGroups() {
        OpileosCratesMod.LOGGER.info("Registering Item Groups for " + OpileosCratesMod.MOD_ID);
    }
}
