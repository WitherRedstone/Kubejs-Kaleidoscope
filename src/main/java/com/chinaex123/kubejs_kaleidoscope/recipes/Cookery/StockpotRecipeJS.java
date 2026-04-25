package com.chinaex123.kubejs_kaleidoscope.recipes.Cookery;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

/**
 * 森罗物语：厨房 - 汤锅配方
 */
public interface StockpotRecipeJS {
    RecipeKey<List<Ingredient>> INGREDIENTS = IngredientComponent.INGREDIENT.instance().asList().inputKey("ingredients"); // 输入列表
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result"); // 输出物品
    RecipeKey<String> SOUP_BASE = StringComponent.STRING.otherKey("soup_base"); // 汤底
    RecipeKey<Integer> TIME = NumberComponent.INT.otherKey("time").optional(400); // 烹饪时间
    RecipeKey<Ingredient> CARRIER = IngredientComponent.INGREDIENT.otherKey("carrier").optional(Ingredient.of(new ItemStack(Items.BOWL))); // 容器
    RecipeKey<Integer> COOKING_BUBBLE_COLOR = NumberComponent.INT.otherKey("cooking_bubble_color").optional(16772291); // 烹饪时泡泡颜色
    RecipeKey<String> COOKING_TEXTURE = StringComponent.STRING.otherKey("cooking_texture").optional("kaleidoscope_cookery:stockpot/default_cooking"); // 烹饪时的汤贴图
    RecipeKey<Integer> FINISHED_BUBBLE_COLOR = NumberComponent.INT.otherKey("finished_bubble_color").optional(16382186); // 完成时泡泡颜色
    RecipeKey<String> FINISHED_TEXTURE = StringComponent.STRING.otherKey("finished_texture").optional("kaleidoscope_cookery:stockpot/default_finished"); // 完成时汤贴图

    // 形参：输出、输入列表、汤底、容器(可选)、烹饪时间(可选)、烹饪时泡泡颜色(可选)、烹饪时汤贴图(可选)、完成时泡泡颜色(可选)、完成时汤贴图(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS, SOUP_BASE, CARRIER, TIME, COOKING_BUBBLE_COLOR, COOKING_TEXTURE, FINISHED_BUBBLE_COLOR, FINISHED_TEXTURE);

// minecraft:flower_pot 花盆
// minecraft:cod_bucket 鳕鱼桶
}