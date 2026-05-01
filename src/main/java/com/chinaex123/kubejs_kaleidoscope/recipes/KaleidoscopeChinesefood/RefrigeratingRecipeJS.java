package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * 森罗物语：国味 - 冰箱冷藏配方
 */
public interface RefrigeratingRecipeJS {
    RecipeKey<Ingredient> INPUT = IngredientComponent.INGREDIENT.otherKey("input"); // 输入
    RecipeKey<ItemStack> OUTPUT = ItemStackComponent.ITEM_STACK.otherKey("output"); // 输出
    RecipeKey<Integer> BASE_TIME = NumberComponent.INT.otherKey("base_time").optional(2400); // 时间

    // 形参：输出、输入、基础时间
    RecipeSchema SCHEMA = new RecipeSchema(OUTPUT, INPUT, BASE_TIME);
}