package ostochskinksas.testmod2.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ostochskinksas.testmod2.CustomItem;
import ostochskinksas.testmod2.Testmod2;

public class ModdedItems {

    public static final CustomItem CUSTOM_ITEM = registerItem("custom_item", new CustomItem(new Item.Settings().maxCount(16)));
    public static final Item AMOGUS_ITEM = registerItem("amogus_item", new Item(new Item.Settings().maxCount(1)));


    private static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(Registries.ITEM, Identifier.of(Testmod2.MOD_ID, name), item);
    }


    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(CUSTOM_ITEM))
		.displayName(Text.translatable("itemGroup.testmod2.test_group"))
        .entries((context, entries) -> {
			entries.add(CUSTOM_ITEM);
			entries.add(AMOGUS_ITEM);
		})
		.build();


    public static void registerModdedItems() {
        Testmod2.LOGGER.info("Registering Mod Items from " + Testmod2.MOD_ID);

        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300);
		CompostingChanceRegistry.INSTANCE.add(CUSTOM_ITEM, 1.0F);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
			content.addAfter(Items.GHAST_TEAR, CUSTOM_ITEM);
			content.addAfter(Items.GHAST_TEAR, AMOGUS_ITEM);
		});

        Registry.register(Registries.ITEM_GROUP, Identifier.of(Testmod2.MOD_ID, "test_group"), ITEM_GROUP);

    }
}
