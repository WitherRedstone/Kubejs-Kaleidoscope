package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
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
    RecipeKey<InputItem[]> INGREDIENTS = ItemComponents.INPUT.asArray().key("ingredients"); // 输入列表
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result"); // 输出
    RecipeKey<Integer> COOKING_TIME = NumberComponent.INT.key("cooking_time"); // 翻炒次数
    RecipeKey<Integer> TIME = NumberComponent.INT.key("time"); // 烹饪时间
    RecipeKey<InputItem> CARRIER = ItemComponents.INPUT.key("carrier").optional(InputItem.EMPTY).allowEmpty(); // 容器(可选)

    // 形参：输出、输入列表、翻炒次数、烹饪时间、容器(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS, COOKING_TIME, TIME, CARRIER);
}