package com.chinaex123.kubejs_kaleidoscope;

import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchemaRegistry;
import dev.latvian.mods.kubejs.registry.BuilderTypeRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.ModList;
import com.chinaex123.kubejs_kaleidoscope.item.*;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood.*;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern.*;

public class KubejsKaleidoscopePlugin implements KubeJSPlugin {
    boolean isCookeryLoaded = ModList.get().isLoaded("kaleidoscope_cookery"),
            isTavernLoaded = ModList.get().isLoaded("kaleidoscope_tavern"),
            isChinesefoodLoaded = ModList.get().isLoaded("kaleidoscope_chinesefood"),
            isNetherLoaded = ModList.get().isLoaded("kaleidoscope_nether"),
            isEndLoaded = ModList.get().isLoaded("kaleidoscope_end");

    @Override
    public void registerBuilderTypes(BuilderTypeRegistry registry) {
        if (isCookeryLoaded) {
            registry.of(Registries.ITEM, reg -> {
                reg.add(ResourceLocation.parse("kaleidoscope_cookery:kitchen_knife"), KitchenKnifeItemBuilder.class, KitchenKnifeItemBuilder::new);
                reg.add(ResourceLocation.parse("kaleidoscope_cookery:kitchen_shovel"), KitchenShovelItemBuilder.class, KitchenShovelItemBuilder::new);
                reg.add(ResourceLocation.parse("kaleidoscope_cookery:sickle"), SickleItemBuilder.class, SickleItemBuilder::new);
            });
        }
    }

    @Override
    public void registerRecipeSchemas(RecipeSchemaRegistry registry) {
        if (isTavernLoaded) {
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:pressing_tub"), PressingTubRecipeJS.SCHEMA); // 森罗物语：酒馆 - 果盆配方
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:barrel"), BarrelRecipeJS.SCHEMA); // 森罗物语：酒馆 - 酒桶配方
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:shaker"), ShakerRecipeJS.SCHEMA); // 森罗物语：酒馆 - 酒桶配方
        }

        if (isChinesefoodLoaded) {
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:freezing"), FreezingRecipeJS.SCHEMA); // 森罗物语：国味 - 冰箱冷冻配方
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:refrigerating"), RefrigeratingRecipeJS.SCHEMA); // 森罗物语：国味 - 冰箱冷藏配方
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:pickle_jar"), PickleJarRecipeJS.SCHEMA); // 森罗物语：国味 - 腌菜罐配方
        }

    }
}
