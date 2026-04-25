# Kubejs：Kaleidoscope 功能分类文档

[English](#english) | [中文](#中文)
---

# **中文**

模组为森罗物语系列模组添加Kubejs集成

# 支持的配方类型：
- 森罗物语：厨房 - 汤锅
- 森罗物语：厨房 - 炒锅
- 森罗物语：厨房 - 菜板
- 森罗物语：厨房 - 石磨
- 森罗物语：厨房 - 蒸笼
- 森罗物语：厨房 - 茶壶
- 森罗物语：酒馆 - 果盆配方
- 森罗物语：酒馆 - 酒桶配方

森罗物语：厨房 - 汤锅配方：
```
event.recipes.kaleidoscope_cookery.stockpot(output, input[], soup_base, carrier, time, cooking_bubble_color, cooking_texture, finished_bubble_color, finished_texture)
// output 输出；
// input[] 输入数组；
// soup_base 汤底流体；
// carrier 盛放输出物品的容器(可选)；
// time 配方完成时间(可选)；
// cooking_bubble_color 烹饪时显示的泡泡颜色(可选)；
// cooking_texture 烹饪时显示的汤贴图(可选)；
// finished_bubble_color 配方完成时显示的泡泡颜色(可选)；
// finished_texture 配方完成时显示的汤贴图(可选)。

// 示例
event.recipes.kaleidoscope_cookery.stockpot(
    "minecraft:diamond",
    [
      "minecraft:stone",
      "minecraft:stone",
      "#minecraft:logs"
    ],
    "minecraft:lava", "minecraft:flower_pot", 600,
    parseInt("FF0000", 16), "kaleidoscope_cookery:stockpot/ceshi_cooking",
    parseInt("FFFFFF", 16), "kaleidoscope_cookery:stockpot/ceshi_finished"
  )
```

森罗物语：厨房 - 炒锅配方：
```
event.recipes.kaleidoscope_cookery.pot(output, input[], cooking_time, carrier, time, experience)
// output 输出；
// input[] 输入数组；
// cooking_time 翻炒次数；
// carrier 盛放输出物品的容器(可选)；
// time 烹饪时间(可选)；
// experience 经验(可选)。

// 示例
event.recipes.kaleidoscope_cookery.pot(
    "minecraft:diamond",
    [
      "minecraft:stone",
      "minecraft:stone",
      "#minecraft:logs"
    ],
    5, "minecraft:bowl", 300, 0.5
  )
```

森罗物语：厨房 - 菜板配方：
```
event.recipes.kaleidoscope_cookery.chopping_board(output, input, model_id, cut_count)
// output 输出物品；
// input 输入物品；
// model_id 输入物品放在菜板上显示的模型；
// cut_count 需要切的刀数(可选)。

// 示例
event.recipes.kaleidoscope_cookery.chopping_board("minecraft:diamond", "minecraft:emerald", "minecraft:emerald", 5)
```

森罗物语：厨房 - 石磨配方：
```
event.recipes.kaleidoscope_cookery.millstone(output, input)
// output 输出物品；
// input 输入物品。

// 示例
event.recipes.kaleidoscope_cookery.millstone("minecraft:diamond", "minecraft:grass_block")
```

森罗物语：厨房 - 蒸笼配方：
```
event.recipes.kaleidoscope_cookery.steamer(output, input)
// output 输出物品；
// input 输入物品。

// 示例
event.recipes.kaleidoscope_cookery.steamer("minecraft:diamond", "minecraft:enchanted_golden_apple")
```

森罗物语：厨房 - 茶壶配方：
```
event.recipes.kaleidoscope_cookery.teapot(output, input, tea_fluid, ingredient_count, time)
// output 输出物品；
// input 输入物品；
// tea_fluid 茶流体；
// ingredient_count 输入数量(可选)；
// time 时间(可选)。

// 示例
event.recipes.kaleidoscope_cookery.teapot("minecraft:diamond", "minecraft:emerald", "minecraft:lava", 8, 300)
```

森罗物语：酒馆 - 果盆配方：
```
event.recipes.kaleidoscope_cookery.teapot(fluid, input, fluid_amount)
// fluid 输出流体；
// input 输入；
// fluid_amount 输出流体数量(可选)。

// 示例
event.recipes.kaleidoscope_tavern.pressing_tub("minecraft:lava", "minecraft:diamond", 250)
```

森罗物语：酒馆 - 酒桶配方：
```
event.recipes.kaleidoscope_cookery.teapot(output, fluid, carrier, unit_time, input)
// output 输出；
// fluid 输入流体；
// carrier 容器(可选)；
// unit_time 单位时间(可选)；
// input 输入(可选)。

// 示例
event.recipes.kaleidoscope_tavern.barrel(
    "kaleidoscope_tavern:wine",
    "minecraft:water",
    "kaleidoscope_tavern:empty_bottle",
    1200,
    [
      "minecraft:emerald",
      "minecraft:emerald"
    ]
  )
```












