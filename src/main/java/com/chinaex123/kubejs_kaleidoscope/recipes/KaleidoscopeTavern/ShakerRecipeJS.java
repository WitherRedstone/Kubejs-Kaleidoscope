package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

/**
 * 森罗物语：酒馆 - 雪克杯配方
 */
public interface ShakerRecipeJS {
    RecipeKey<InputItem[]> INGREDIENTS = ItemComponents.INPUT.asArray().key("ingredients").optional(new InputItem[0]); // 输入(可选)
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result"); // 输出物品

    // 形参：输出、输入(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS);
}
