package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * 森罗物语：厨房 - 汤锅配方
 */
public interface StockpotRecipeJS {
    RecipeKey<InputItem[]> INGREDIENTS = ItemComponents.INPUT.asArray().key("ingredients"); // 输入列表
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result"); // 输出物品
    RecipeKey<String> SOUP_BASE = StringComponent.ANY.key("soup_base"); // 汤底
    RecipeKey<Integer> TIME = NumberComponent.INT.key("time").optional(400); // 烹饪时间
    RecipeKey<InputItem> CARRIER = ItemComponents.INPUT.key("carrier").optional(InputItem.of(Ingredient.of(new ItemStack(Items.BOWL)))); // 容器
    RecipeKey<String> COOKING_TEXTURE = StringComponent.ANY.key("cooking_texture").optional("kaleidoscope_cookery:stockpot/default_cooking"); // 烹饪时的汤贴图
    RecipeKey<String> FINISHED_TEXTURE = StringComponent.ANY.key("finished_texture").optional("kaleidoscope_cookery:stockpot/default_finished"); // 完成时汤贴图
    RecipeKey<Integer> FINISHED_BUBBLE_COLOR = NumberComponent.INT.min(0).max(Integer.MAX_VALUE).key("finished_bubble_color").optional(16382186); // 完成时泡泡颜色
    RecipeKey<Integer> COOKING_BUBBLE_COLOR = NumberComponent.INT.min(0).max(Integer.MAX_VALUE).key("cooking_bubble_color").optional(16772291); // 烹饪时泡泡颜色

    // 形参：输出、输入列表、汤底、烹饪时间(可选)、容器(可选)、烹饪时汤贴图(可选)、完成时汤贴图(可选)、烹饪时泡泡颜色(可选)、完成时泡泡颜色(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS, SOUP_BASE, TIME, CARRIER, COOKING_TEXTURE, FINISHED_TEXTURE, COOKING_BUBBLE_COLOR, FINISHED_BUBBLE_COLOR);

// minecraft:flower_pot 花盆
// minecraft:cod_bucket 鳕鱼桶
}

