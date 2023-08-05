package net.qinx.lilcobble;

import net.fabricmc.api.ModInitializer;

import net.qinx.lilcobble.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LILCobblestone implements ModInitializer {
	public static final String MOD_ID = "lilcobble";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}