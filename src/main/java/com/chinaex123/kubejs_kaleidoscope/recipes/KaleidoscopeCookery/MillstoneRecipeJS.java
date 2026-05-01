package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

/**
 * 森罗物语：厨房 - 石磨配方
 */
public interface MillstoneRecipeJS {
    RecipeKey<InputItem> INGREDIENT = ItemComponents.INPUT.key("ingredient"); // 输入
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result"); // 输出

    // 形参：输出、输入
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENT);
}