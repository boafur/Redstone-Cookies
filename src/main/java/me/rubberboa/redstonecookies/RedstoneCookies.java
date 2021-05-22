package me.rubberboa.redstonecookies;

import me.rubberboa.redstonecookies.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RedstoneCookies implements ModInitializer {

	public static final String MOD_ID = "redstonecookies";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "general"))
			.icon(() -> new ItemStack(ModItems.REDSTONE_COOKIE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.REDSTONE_COOKIE));
			})
			.build();

	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}
