package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

/**
 * 森罗物语：国味 - 腌菜罐配方
 */
public interface PickleJarRecipeJS {
    RecipeKey<List<Ingredient>> INGREDIENTS = IngredientComponent.INGREDIENT.instance().asList().inputKey("ingredients"); // 输入数组
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.otherKey("result"); // 输出
    RecipeKey<Integer> FERMENT_TIME = NumberComponent.INT.otherKey("fermentTime").optional(3600); // 发酵时间

    // 形参：输出、输入数组、发酵时间
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS, FERMENT_TIME);
}
