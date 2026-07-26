package com.chinaex123.kubejs_kaleidoscope;

import com.chinaex123.kubejs_kaleidoscope.item.KnifeItemBuilder;
import com.chinaex123.kubejs_kaleidoscope.item.SickleItemBuilder;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood.FreezingRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood.PickleJarRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood.RefrigeratingRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeCookery.*;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern.BarrelRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern.PressingTubRecipeJS;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchemaRegistry;
import dev.latvian.mods.kubejs.registry.BuilderTypeRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.ModList;

public class KubejsKaleidoscopePlugin implements KubeJSPlugin {

    @Override
    public void registerBuilderTypes(BuilderTypeRegistry registry) {
        registry.of(Registries.ITEM, reg -> {
            reg.add(ResourceLocation.parse("kaleidoscope_cookery:knife"), KnifeItemBuilder.class, KnifeItemBuilder::new);
            reg.add(ResourceLocation.parse("kaleidoscope_cookery:sickle"), SickleItemBuilder.class, SickleItemBuilder::new);
        });
    }

    @Override
    public void registerRecipeSchemas(RecipeSchemaRegistry registry) {
        if (ModList.get().isLoaded("kaleidoscope_tavern")) {
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:pressing_tub"), PressingTubRecipeJS.SCHEMA); // 森罗物语：酒馆 - 果盆配方
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:barrel"), BarrelRecipeJS.SCHEMA); // 森罗物语：酒馆 - 酒桶配方
        }

        if (ModList.get().isLoaded("kaleidoscope_chinesefood")) {
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:freezing"), FreezingRecipeJS.SCHEMA); // 森罗物语：国味 - 冰箱冷冻配方
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:refrigerating"), RefrigeratingRecipeJS.SCHEMA); // 森罗物语：国味 - 冰箱冷藏配方
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:pickle_jar"), PickleJarRecipeJS.SCHEMA); // 森罗物语：国味 - 腌菜罐配方
        }

    }
}
