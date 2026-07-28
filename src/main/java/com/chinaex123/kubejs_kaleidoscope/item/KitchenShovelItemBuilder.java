package com.chinaex123.kubejs_kaleidoscope.item;

import com.github.ysbbbbbb.kaleidoscopecookery.init.tag.TagMod;
import com.github.ysbbbbbb.kaleidoscopecookery.item.KitchenKnifeItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

/**
 * 森罗物语：厨房 - 注册锅铲
 */
public class KitchenShovelItemBuilder extends HandheldItemBuilder {

    public KitchenShovelItemBuilder(ResourceLocation id) {
        super(id, 0.0f, -2.0f);
        this.tag(TagMod.KITCHEN_SHOVEL.location());
    }

    @Override
    public Item createObject() {
        return new KitchenKnifeItem(this.toolTier, createItemProperties());
    }
}
