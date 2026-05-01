package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

/**
 * 森罗物语：酒馆 - 果盆配方
 */
public interface PressingTubRecipeJS {
    RecipeKey<InputItem> INGREDIENT = ItemComponents.INPUT.key("ingredient"); // 输入
    RecipeKey<String> FLUID = StringComponent.ANY.key("fluid"); // 输出流体
    RecipeKey<Integer> FLUID_AMOUNT = NumberComponent.INT.key("fluid_amount").optional(125); // 输出流体数量(可选)

    // 形参：输出流体、输入、输出流体数量(可选)
    RecipeSchema SCHEMA = new RecipeSchema(FLUID, INGREDIENT, FLUID_AMOUNT);
}
