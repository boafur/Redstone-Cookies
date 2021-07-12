package me.rubberboa.redstonecookies.registry;

import me.rubberboa.redstonecookies.RedstoneCookies;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item REDSTONE_COOKIE = new GlintItem(new Item.Settings().group(RedstoneCookies.ITEM_GROUP).fireproof().rarity(Rarity.EPIC).food(
            new FoodComponent.Builder()
                    .hunger(20)
                    .saturationModifier(40.0f)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*600, 0, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*600, 1, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*120, 2, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20*1000000, 2, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*1000000, 1, true, false), 1)
                    .build()
    ));

    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(RedstoneCookies.MOD_ID, "redstone_cookie"), REDSTONE_COOKIE);
    }
}
