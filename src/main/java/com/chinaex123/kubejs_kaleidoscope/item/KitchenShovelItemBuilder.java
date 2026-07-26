package com.chinaex123.kubejs_kaleidoscope.item;

import com.github.ysbbbbbb.kaleidoscopecookery.init.tag.TagMod;
import com.github.ysbbbbbb.kaleidoscopecookery.item.KitchenKnifeItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

/**
 * 森罗物语：厨房 - 注册菜刀
 */
public class KitchenShovelItemBuilder extends HandheldItemBuilder {
    public static final ResourceLocation[] SHOVEL_TAGS = {
            TagMod.KITCHEN_SHOVEL.location()
    };

    public static final ResourceLocation SHOVEL_MODEL = ResourceLocation.fromNamespaceAndPath("kaleidoscope_cookery", "item/kitchen_shovel");

    public KitchenShovelItemBuilder(ResourceLocation id) {
        super(id, 0.0f, -2.0f);
        parentModel = SHOVEL_MODEL;
        tag(SHOVEL_TAGS); // 菜刀tag
    }

    @Override
    public Item createObject() {
        itemAttributeModifiers = KitchenKnifeItem.createAttributes(toolTier, attackDamageBaseline, speedBaseline);
        return new KitchenKnifeItem(toolTier, createItemProperties());
    }
}
