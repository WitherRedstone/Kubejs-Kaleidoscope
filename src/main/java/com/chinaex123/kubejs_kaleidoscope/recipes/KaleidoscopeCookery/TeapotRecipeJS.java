package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * 森罗物语：厨房 - 茶壶配方
 */
public interface TeapotRecipeJS {
    RecipeKey<Ingredient> INGREDIENT = IngredientComponent.INGREDIENT.inputKey("ingredient"); // 输入
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result"); // 输出
    RecipeKey<String> TEA_FLUID = StringComponent.STRING.otherKey("tea_fluid"); // 流体
    RecipeKey<Integer> INGREDIENT_COUNT = NumberComponent.INT.otherKey("ingredient_count").optional(12); // 输入数量
    RecipeKey<Integer> TIME = NumberComponent.INT.otherKey("time").optional(240); // 烹饪时间

    // 形参：输出、输入、茶流体、输入数量、时间(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENT, TEA_FLUID, INGREDIENT_COUNT, TIME);
}