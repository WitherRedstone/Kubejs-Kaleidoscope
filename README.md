# Kubejs：Kaleidoscope 功能分类文档

[English](#english) | [中文](#中文)
---

# **english**

This mod adds KubeJS integration for the Kaleidoscope series mods.

# Recipe Types:
- Kaleidoscope Cookery - Stockpot;
- Kaleidoscope Cookery - Pot;
- Kaleidoscope Cookery - Chopping Board;
- Kaleidoscope Cookery - Millstone;
- Kaleidoscope Cookery - Steamer;
- Kaleidoscope Cookery - Teapot;
- Kaleidoscope Tavern - Pressing Tub;
- Kaleidoscope Tavern - Barrel;
- Kaleidoscope Chinese Food - Freezing;
- Kaleidoscope Chinese Food - Refrigerating;
- Kaleidoscope Chinese Food - Pickle Jar.

# Registerable Item Types:
- Kaleidoscope Cookery - Kitchen Knife;
- Kaleidoscope Cookery - Sickle.

Kaleidoscope Cookery - Stockpot Recipe:
```
event.recipes.kaleidoscope_cookery.stockpot(output, input[], soup_base, carrier, time, cooking_bubble_color, cooking_texture, finished_bubble_color, finished_texture)
// output: Output item; 
// input[]: Array of input ingredients; 
// soup_base: Soup base fluid ID; 
// carrier: Container for the output item (Optional); 
// time: Cooking time in ticks (Optional); 
// cooking_bubble_color: Bubble color during cooking (Optional); 
// cooking_texture: Texture overlay during cooking (Optional); 
// finished_bubble_color: Bubble color when finished (Optional); 
// finished_texture: Texture overlay when finished (Optional).

// Example
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

Kaleidoscope Cookery - Pot Recipe:
```
event.recipes.kaleidoscope_cookery.pot(output, input[], cooking_time, carrier, time, experience)
// output: Output item; 
// input[]: Array of input ingredients; 
// cooking_time: Number of stirs required; 
// carrier: Container for the output item (Optional); 
// time: Cooking time in ticks (Optional); 
// experience: Experience points (Optional).

// Example
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

Kaleidoscope Cookery - Chopping Board Recipe:
```
event.recipes.kaleidoscope_cookery.chopping_board(output, input, model_id, cut_count)
// output: Output item;
// input: Input ingredient;
// model_id: Model ID displayed on the chopping board;
// cut_count: Number of cuts required (Optional).

// Example
event.recipes.kaleidoscope_cookery.chopping_board("minecraft:diamond", "minecraft:emerald", "minecraft:emerald", 5)
```

Kaleidoscope Cookery - Millstone Recipe:
```
event.recipes.kaleidoscope_cookery.millstone(output, input)
// output: Output item;
// input: Input ingredient.

// Example
event.recipes.kaleidoscope_cookery.millstone("minecraft:diamond", "minecraft:grass_block")
```

Kaleidoscope Cookery - Steamer Recipe:
```
event.recipes.kaleidoscope_cookery.steamer(output, input)
// output: Output item; 
// input: Input ingredient.

// Example
event.recipes.kaleidoscope_cookery.steamer("minecraft:diamond", "minecraft:enchanted_golden_apple")
```

Kaleidoscope Cookery - Teapot Recipe:
```
event.recipes.kaleidoscope_cookery.teapot(output, input, tea_fluid, ingredient_count, time)
// output: Output item; 
// input: Input ingredient; 
// tea_fluid: Tea fluid ID; 
// ingredient_count: Number of input ingredients (Optional); 
// time: Brewing time in ticks (Optional).

// Example
event.recipes.kaleidoscope_cookery.teapot("minecraft:diamond", "minecraft:emerald", "minecraft:lava", 8, 300)
```

Kaleidoscope Tavern - Pressing Tub Recipe:
```
event.recipes.kaleidoscope_cookery.teapot(fluid, input, fluid_amount)
// fluid: Output fluid ID; 
// input: Input ingredient; 
// fluid_amount: Output fluid amount in mB (Optional).

// Example
event.recipes.kaleidoscope_tavern.pressing_tub("minecraft:lava", "minecraft:diamond", 250)
```

Kaleidoscope Tavern - Barrel Recipe:
```
event.recipes.kaleidoscope_cookery.teapot(output, fluid, carrier, unit_time, input)
// output: Output item; 
// fluid: Input fluid ID; 
// carrier: Container item (Optional); 
// unit_time: Unit time per brewing stage in ticks (Optional); 
// input: Array of input ingredients (Optional).

// Example
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

Kaleidoscope Chinese Food - Freezing Recipe：
```
event.recipes.kaleidoscope_chinesefood.freezing(input, output, base_time)
// input Input；
// output Output item；
// base_time Processing time in ticks (Optional)。

// Example
event.recipes.kaleidoscope_chinesefood.freezing("minecraft:blue_ice", "minecraft:packed_ice", 200)
```

Kaleidoscope Chinese Food - Refrigerating Recipe：
```
event.recipes.kaleidoscope_chinesefood.freezing(input, output, base_time)
// input Input；
// output Output item；
// base_time Processing time in ticks (Optional)。

// Example
event.recipes.kaleidoscope_chinesefood.refrigerating("minecraft:diamond_block", "minecraft:diamond", 200)
```

Kaleidoscope Chinese Food - Pickle Jar Recipe：
```
event.recipes.kaleidoscope_chinesefood.freezing(input, output, base_time)
// output Output item；
// input[] Array of input ingredients；
// fermentTime: Fermentation time in ticks (Optional).

// Example
  event.recipes.kaleidoscope_chinesefood.pickle_jar(
    "minecraft:diamond",
    [
      "#minecraft:logs",
      "minecraft:iron_ingot"
    ],
    3600
  )
```

Kaleidoscope Cookery - Kitchen Knife Registration:
```
event.create(id, type).tier(tier) 
// id: Item ID; 
// type: Item type (fixed as 'kaleidoscope_cookery:knife'); 
// tier: Tool tier ('wood', 'stone', 'iron', 'diamond', 'netherite').

// Example
event.create('texe_knife', 'kaleidoscope_cookery:knife')
    .tier('netherite')
    .rarity("epic")
    .fireResistant(true)
    .modifyTier(tier => {
      tier.setUses(1024) // Durability
      tier.setAttackDamageBonus(10) // Attack damage bonus
      tier.setSpeed(-1.0) // Attack speed
    })
```

Kaleidoscope Cookery - Sickle Registration:
```
event.create(id, type).tier(tier)
// id: Item ID; 
// type: Item type (fixed as 'kaleidoscope_cookery:knife'); 
// tier: Tool tier ('wood', 'stone', 'iron', 'diamond', 'netherite').

// Example
event.create('texe_sickle', 'kaleidoscope_cookery:sickle')
    .tier('netherite')
    .rarity("epic")
    .fireResistant(true)
    .modifyTier(tier => {
      tier.setUses(1024) // Durability
      tier.setAttackDamageBonus(10) // Attack damage bonus
      tier.setSpeed(-1.0) // Attack speed
    })
```

---

# **中文**

模组为森罗物语系列模组添加Kubejs集成

# 配方类型：
- 森罗物语：厨房 - 汤锅；
- 森罗物语：厨房 - 炒锅；
- 森罗物语：厨房 - 菜板；
- 森罗物语：厨房 - 石磨；
- 森罗物语：厨房 - 蒸笼；
- 森罗物语：厨房 - 茶壶；
- 森罗物语：酒馆 - 果盆配方；
- 森罗物语：酒馆 - 酒桶配方；
- 森罗物语：国味 - 冰箱冷冻配方；
- 森罗物语：国味 - 冰箱冷藏配方；
- 森罗物语：国味 - 腌菜罐配方。

# 注册类型：
- 森罗物语：厨房 - 菜刀；
- 森罗物语：厨房 - 镰刀。

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

森罗物语：国味 - 冰箱冷冻配方：
```
event.recipes.kaleidoscope_chinesefood.freezing(input, output, base_time)
// input 输入；
// output 输出；
// base_time 时间(可选)。

// 示例
event.recipes.kaleidoscope_chinesefood.freezing("minecraft:blue_ice", "minecraft:packed_ice", 200)
```

森罗物语：国味 - 冰箱冷藏配方：
```
event.recipes.kaleidoscope_chinesefood.freezing(input, output, base_time)
// input 输入；
// output 输出；
// base_time 时间(可选)。

// 示例
event.recipes.kaleidoscope_chinesefood.refrigerating("minecraft:diamond_block", "minecraft:diamond", 200)
```

森罗物语：国味 - 腌菜罐配方：
```
event.recipes.kaleidoscope_chinesefood.freezing(input, output, base_time)
// output 输出；
// input[] 输入数组；
// base_time 发酵时间(可选)。

// 示例
  event.recipes.kaleidoscope_chinesefood.pickle_jar(
    "minecraft:diamond",
    [
      "#minecraft:logs",
      "minecraft:iron_ingot"
    ],
    3600
  )
```


森罗物语：厨房 - 菜刀
```
event.create(id, type).tier(tier)
// id: 物品 ID； 
// type: 物品类型 (固定为 'kaleidoscope_cookery:knife')； 
// tier: 工具等级 (如 'wood', 'stone', 'iron', 'diamond', 'netherite' 等)。

// 示例
event.create('texe_knife', 'kaleidoscope_cookery:knife')
    .tier('netherite')
    .rarity("epic")
    .fireResistant(true)
    .modifyTier(tier => {
      tier.setUses(1024) // 耐久度
      tier.setAttackDamageBonus(10) // 攻击伤害加成
      tier.setSpeed(-1.0) // 速度
    })
```

森罗物语：厨房 - 镰刀
```
event.create(id, type).tier(tier)
// id: 物品 ID； 
// type: 物品类型 (固定为 'kaleidoscope_cookery:knife')； 
// tier: 工具等级 (如 'wood', 'stone', 'iron', 'diamond', 'netherite' 等)。

// 示例
event.create('texe_sickle', 'kaleidoscope_cookery:sickle')
    .tier('netherite')
    .rarity("epic")
    .fireResistant(true)
    .modifyTier(tier => {
      tier.setUses(1024) // 耐久度
      tier.setAttackDamageBonus(10) // 攻击伤害加成
      tier.setSpeed(-1.0) // 速度
    })
```










