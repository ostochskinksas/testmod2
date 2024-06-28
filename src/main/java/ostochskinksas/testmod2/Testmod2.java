package ostochskinksas.testmod2;

import net.fabricmc.api.ModInitializer;
import ostochskinksas.testmod2.item.ModdedItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testmod2 implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "testmod2";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	// //public static final Item MODDED_ITEM = new Item(new Item.Settings());
	//
	// //public static final Item CUSTOM_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "custom_item"), new Item(new Item.Settings()));
	//
	// // public static final CustomItem CUSTOM_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "custom_item"), 
	// // 	new CustomItem(new Item.Settings().maxCount(16))
	// // );
	//
	// // public static final Item AMOGUS_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "amogus_item"), 
	// // 	new Item(new Item.Settings().maxCount(1))
	// // );
	//
	// // private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
	// // 	.icon(() -> new ItemStack(CUSTOM_ITEM))
	// // 	.displayName(Text.translatable("itemGroup.testmod2.test_group"))
    // //     .entries((context, entries) -> {
	// // 		entries.add(CUSTOM_ITEM);
	// // 		entries.add(AMOGUS_ITEM);
	// // 	})
	// // 	.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ModdedItems.registerModdedItems();


		// //Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "modded_item"), MODDED_ITEM);
		//
		// // FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300);
		// // CompostingChanceRegistry.INSTANCE.add(CUSTOM_ITEM, 1.0F);
		//
		//
		// // ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
		// // 	content.addAfter(Items.GHAST_TEAR, CUSTOM_ITEM);
		// // 	content.addAfter(Items.GHAST_TEAR, AMOGUS_ITEM);
		// // });
		//
		// // Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, "test_group"), ITEM_GROUP);
	}
}