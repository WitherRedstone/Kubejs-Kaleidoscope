package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

/**
 * 森罗物语：厨房 - 炒锅配方
 */
public interface PotRecipeJS {
    RecipeKey<List<Ingredient>> INGREDIENTS = IngredientComponent.INGREDIENT.instance().asList().inputKey("ingredients"); // 输入列表
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result"); // 输出物品
    RecipeKey<Integer> COOKING_TIME = NumberComponent.INT.otherKey("cooking_time"); // 翻炒次数
    RecipeKey<Ingredient> CARRIER = IngredientComponent.INGREDIENT.otherKey("carrier").optional(Ingredient.of(new ItemStack(Items.BOWL))); // 容器(可选)
    RecipeKey<Integer> TIME = NumberComponent.INT.otherKey("time").optional(200); // 烹饪时间(可选)
    RecipeKey<Float> EXPERIENCE = NumberComponent.FLOAT.otherKey("experience").optional(0.35f); // 经验(可选)

    // 形参：输出、输入列表、翻炒次数、容器(可选)、烹饪时间(可选)、经验(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS, COOKING_TIME, CARRIER, TIME, EXPERIENCE);
}