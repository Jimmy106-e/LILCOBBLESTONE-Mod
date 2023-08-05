package net.qinx.lilcobble;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.qinx.lilcobble.block.ModBlocks;

public class LILCobblestoneClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LILCOBBLESTONE_BLOCK, RenderLayer.getCutout());
    }
}
