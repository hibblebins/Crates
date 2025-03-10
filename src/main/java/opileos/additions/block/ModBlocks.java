package opileos.additions.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import opileos.additions.OpileosAdditions;

public class ModBlocks {

    public static final Block CRATE = registerBlock("crate",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL).burnable()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OpileosAdditions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OpileosAdditions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
       OpileosAdditions.LOGGER.info("Registering ModBlocks for " + OpileosAdditions.MOD_ID);
    }
}