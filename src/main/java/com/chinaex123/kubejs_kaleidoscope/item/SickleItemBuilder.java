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
    public static final ResourceLocation[] SICKLE_TAGS = {
            Tags.Items.TOOLS.location()
    };

    public static final ResourceLocation SICKLE_MODEL = ResourceLocation.fromNamespaceAndPath("kaleidoscope_cookery", "item/kitchen_sickle");

    public SickleItemBuilder(ResourceLocation id) {
        super(id, 1.0f, -2.5f);
        parentModel = SICKLE_MODEL;
        tag(SICKLE_TAGS);
    }

    @Override
    public Item createObject() {
        itemAttributeModifiers = SickleItem.createAttributes(toolTier, attackDamageBaseline, speedBaseline);
        return new SickleItem(this.toolTier, createItemProperties());
    }
}
