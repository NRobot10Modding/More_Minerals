package net.nrobot10.moreminerals;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moreminerals implements ModInitializer {
	public static final String MOD_ID = "more_minerals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Starting More Minerals Version: 1.0");
	}
}