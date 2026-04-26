package com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

/**
 * 森罗物语：酒馆 - 酒桶配方
 */
public interface BarrelRecipeJS {
    RecipeKey<List<Ingredient>> INGREDIENTS = IngredientComponent.INGREDIENT.instance().asList().inputKey("ingredients").optional(List.of()); // 输入(可选)
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result"); // 输出物品
    RecipeKey<String> FLUID = StringComponent.STRING.otherKey("fluid"); // 输入流体
    RecipeKey<Integer> UNIT_TIME = NumberComponent.INT.otherKey("unit_time").optional(2400); // 单位时间(可选)
    RecipeKey<Ingredient> CARRIER = IngredientComponent.INGREDIENT.otherKey("carrier")
            .optional(Ingredient.of(new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.parse("kaleidoscope_tavern:empty_bottle"))))); // 容器(可选)

    // 形参：输出、输入流体、容器(可选)、单位时间(可选)、输入(可选)
    RecipeSchema SCHEMA = new RecipeSchema(RESULT, FLUID, CARRIER, UNIT_TIME, INGREDIENTS);
}