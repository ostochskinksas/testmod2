package ostochskinksas.testmod2;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testmod2 implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "testmod2";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	//public static final Item MODDED_ITEM = new Item(new Item.Settings());

	public static final Item CUSTOM_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "custom_item"), new Item(new Item.Settings()));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");


		//Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "modded_item"), MODDED_ITEM);
	}
}