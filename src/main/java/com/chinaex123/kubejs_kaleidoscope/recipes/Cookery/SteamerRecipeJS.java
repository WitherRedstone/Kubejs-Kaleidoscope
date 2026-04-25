package com.chinaex123.kubejs_kaleidoscope.recipes.Cookery;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * 森罗物语：厨房 - 蒸笼配方
 */
public interface SteamerRecipeJS {
    RecipeKey<Ingredient> INGREDIENT = IngredientComponent.INGREDIENT.inputKey("ingredient"); // 输入
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result"); // 输出

    // 形参：输出、输入
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENT);
}