package net.qinx.lilcobble.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.qinx.lilcobble.LILCobblestone;
import net.qinx.lilcobble.block.ModBlocks;

public class ModItemsGroup {
    public static final ItemGroup LILCOBBLESTONE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LILCobblestone.MOD_ID, "lilcobbblestone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lilcobblestone"))
                    .icon(() -> new ItemStack(ModItems.LILCOBBLESTONEBIT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LILCOBBLESTONEBIT);

                        entries.add(ModBlocks.LILCOBBLESTONE_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        LILCobblestone.LOGGER.info("Registering Item Groups for " + LILCobblestone.MOD_ID);
    }
}
