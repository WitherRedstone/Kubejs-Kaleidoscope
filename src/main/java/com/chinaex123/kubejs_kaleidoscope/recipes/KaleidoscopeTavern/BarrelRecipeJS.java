package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * 森罗物语：酒馆 - 酒桶配方
 */
public interface BarrelRecipeJS {
    RecipeKey<InputItem[]> INGREDIENTS = ItemComponents.INPUT.asArray().key("ingredients").optional(new InputItem[0]); // 输入(可选)
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result"); // 输出物品
    RecipeKey<String> FLUID = StringComponent.ANY.key("fluid"); // 输入流体
    RecipeKey<Integer> UNIT_TIME = NumberComponent.INT.key("unit_time").optional(2400); // 单位时间(可选)
    RecipeKey<InputItem> CARRIER = ItemComponents.INPUT.key("carrier")
            .optional(InputItem.of(Ingredient.of(new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.parse("kaleidoscope_tavern:empty_bottle")))))); // 容器(可选)

    // 形参：输出、输入流体、容器(可选)、单位时间(可选)、输入(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, FLUID, CARRIER, UNIT_TIME, INGREDIENTS);
}
