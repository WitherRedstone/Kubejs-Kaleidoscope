package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

/**
 * 森罗物语：国味 - 冰箱冷冻配方
 */
public interface FreezingRecipeJS {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input"); // 输入
    RecipeKey<OutputItem> OUTPUT = ItemComponents.OUTPUT.key("output"); // 输出
    RecipeKey<Integer> BASE_TIME = NumberComponent.INT.key("base_time").optional(100); // 时间

    // 形参：输出、输入、时间
    RecipeSchema SCHEMA = new RecipeSchema(OUTPUT, INPUT, BASE_TIME);
}
