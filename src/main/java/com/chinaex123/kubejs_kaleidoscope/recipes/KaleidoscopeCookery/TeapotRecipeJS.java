package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

/**
 * 森罗物语：厨房 - 茶壶配方
 */
public interface TeapotRecipeJS {
    RecipeKey<InputItem> INGREDIENT = ItemComponents.INPUT.key("ingredient"); // 输入
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result"); // 输出
    RecipeKey<String> TEA_FLUID = StringComponent.ANY.key("tea_fluid"); // 流体
    RecipeKey<Integer> INGREDIENT_COUNT = NumberComponent.INT.key("ingredient_count").optional(12); // 输入数量
    RecipeKey<Integer> TIME = NumberComponent.INT.key("time").optional(240); // 烹饪时间

    // 形参：输出、输入、茶流体、输入数量、时间(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENT, TEA_FLUID, INGREDIENT_COUNT, TIME);
}
