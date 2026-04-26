package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * 森罗物语：厨房 - 菜板配方
 */
public interface ChoppingBoardRecipeJS {
    RecipeKey<Ingredient> INGREDIENT = IngredientComponent.INGREDIENT.inputKey("ingredient"); // 输入
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result"); // 输出
    RecipeKey<String> MODEL_ID = StringComponent.STRING.otherKey("model_id"); // 模型 ID
    RecipeKey<Integer> CUT_COUNT = NumberComponent.INT.otherKey("cut_count").optional(4); // 需要切的刀数

    // 形参：输出、输入、模型ID(需要模型)、需要切的刀数(可选)
    RecipeSchema SCHEMA = new RecipeSchema(INGREDIENT, RESULT, MODEL_ID, CUT_COUNT);
}