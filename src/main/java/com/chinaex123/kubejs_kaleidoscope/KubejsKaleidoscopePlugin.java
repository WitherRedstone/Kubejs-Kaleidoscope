package com.chinaex123.kubejs_kaleidoscope;

import com.chinaex123.kubejs_kaleidoscope.item.KitchenKnifeItemBuilder;
import com.chinaex123.kubejs_kaleidoscope.item.KitchenShovelItemBuilder;
import com.chinaex123.kubejs_kaleidoscope.item.SickleItemBuilder;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood.FreezingRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood.PickleJarRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeChinesefood.RefrigeratingRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern.BarrelRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern.PressingTubRecipeJS;
import com.chinaex123.kubejs_kaleidoscope.recipes.KaleidoscopeTavern.ShakerRecipeJS;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModList;

public class KubejsKaleidoscopePlugin extends KubeJSPlugin {
    boolean isCookeryLoaded = ModList.get().isLoaded("kaleidoscope_cookery"),
            isTavernLoaded = ModList.get().isLoaded("kaleidoscope_tavern"),
            isChinesefoodLoaded = ModList.get().isLoaded("kaleidoscope_chinesefood"),
            isNetherLoaded = ModList.get().isLoaded("kaleidoscope_nether"),
            isEndLoaded = ModList.get().isLoaded("kaleidoscope_end");

    @Override
    public void init() {
        if (isCookeryLoaded) {
            RegistryInfo.ITEM.addType("kaleidoscope_cookery:knife", KitchenKnifeItemBuilder.class, KitchenKnifeItemBuilder::new);
            RegistryInfo.ITEM.addType("kaleidoscope_cookery:kitchen_shovel", KitchenShovelItemBuilder.class, KitchenShovelItemBuilder::new);
            RegistryInfo.ITEM.addType("kaleidoscope_cookery:sickle", SickleItemBuilder.class, SickleItemBuilder::new);
        }
    }

    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent registry) {
        if (isTavernLoaded) {
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:pressing_tub"), PressingTubRecipeJS.SCHEMA); // 森罗物语：酒馆 - 果盆配方
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:barrel"), BarrelRecipeJS.SCHEMA); // 森罗物语：酒馆 - 酒桶配方
            registry.register(ResourceLocation.parse("kaleidoscope_tavern:shaker"), ShakerRecipeJS.SCHEMA); // 森罗物语：酒馆 - 雪克杯配方
        }

        if (isChinesefoodLoaded) {
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:freezing"), FreezingRecipeJS.SCHEMA); // 森罗物语：国味 - 冰箱冷冻配方
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:refrigerating"), RefrigeratingRecipeJS.SCHEMA); // 森罗物语：国味 - 冰箱冷藏配方
            registry.register(ResourceLocation.parse("kaleidoscope_chinesefood:pickle_jar"), PickleJarRecipeJS.SCHEMA); // 森罗物语：国味 - 腌菜罐配方
        }

    }
}
