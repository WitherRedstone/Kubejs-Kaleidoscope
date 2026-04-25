package com.chinaex123.kubejs_kaleidoscope.item;

import com.github.ysbbbbbb.kaleidoscopecookery.item.SickleItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;

/**
 * 森罗物语：厨房 - 注册镰刀
 */
public class SickleItemBuilder extends HandheldItemBuilder {
    public SickleItemBuilder(ResourceLocation id) {
        super(id, 1.0f, -2.5f);
        this.tag(new ResourceLocation[] { Tags.Items.TOOLS.location() });
    }

    @Override
    public Item createObject() {
        return new SickleItem(this.toolTier, createItemProperties());
    }
}
