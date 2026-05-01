package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

/**
 * 森罗物语：国味 - 冰箱冷藏配方
 */
public interface RefrigeratingRecipeJS {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input"); // 输入
    RecipeKey<OutputItem> OUTPUT = ItemComponents.OUTPUT.key("output"); // 输出
    RecipeKey<Integer> BASE_TIME = NumberComponent.INT.key("base_time").optional(2400); // 时间

    // 形参：输出、输入、基础时间
    RecipeSchema SCHEMA = new RecipeSchema(OUTPUT, INPUT, BASE_TIME);
}