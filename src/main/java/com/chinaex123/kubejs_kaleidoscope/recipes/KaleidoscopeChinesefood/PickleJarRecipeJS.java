package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

/**
 * 森罗物语：国味 - 腌菜罐配方
 */
public interface PickleJarRecipeJS {
    RecipeKey<InputItem[]> INGREDIENTS = ItemComponents.INPUT.asArray().key("ingredients"); // 输入数组
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result"); // 输出
    RecipeKey<Integer> FERMENT_TIME = NumberComponent.INT.key("fermentTime").optional(3600); // 发酵时间

    // 形参：输出、输入数组、发酵时间
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS, FERMENT_TIME);
}
