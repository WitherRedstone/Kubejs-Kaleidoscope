# Kubejs：Kaleidoscope 功能分类文档

[English](#english) | [中文](#中文)
---

# **english**

This mod adds KubeJS integration for the Kaleidoscope series mods.

# Recipe Types:
- Kaleidoscope Tavern - Pressing Tub;
- Kaleidoscope Tavern - Barrel;
- Kaleidoscope Chinese Food - Freezing;
- Kaleidoscope Chinese Food - Refrigerating;
- Kaleidoscope Chinese Food - Pickle Jar.

# Registerable Item Types:
- Kaleidoscope Cookery - Kitchen Knife;
- Kaleidoscope Cookery - Kitchen Shovel;
- Kaleidoscope Cookery - Sickle.


Kaleidoscope Tavern - Pressing Tub Recipe:
```
event.recipes.kaleidoscope_cookery.pressing_tub(fluid, input, fluid_amount)
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

Kaleidoscope Tavern - Shaker Recipe:
```
event.recipes.kaleidoscope_cookery.shaker(output, input)
// output: Output item; 
// input: Array of input ingredients (Optional).

// Example
event.recipes.kaleidoscope_tavern.shaker(
  "kaleidoscope_tavern:vinegar",
  [
    "minecraft:emerald",
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
// type: Item type (fixed as 'kaleidoscope_cookery:kitchen_knife'); 
// tier: Tool tier ('wood', 'stone', 'iron', 'diamond', 'netherite').

// Example
event.create('texe_knife', 'kaleidoscope_cookery:kitchen_knife')
    .tier('netherite')
    .rarity("epic")
    .fireResistant(true)
    .modifyTier(tier => {
      tier.setUses(1024) // Durability
      tier.setAttackDamageBonus(10) // Attack damage bonus
      tier.setSpeed(-1.0) // Attack speed
    })
```

Kaleidoscope Cookery - Kitchen Shovel Registration:
```
event.create(id, type).tier(tier)
// id: Item ID； 
// type: Item type (fixed as 'kaleidoscope_cookery:kitchen_knife'); 
// tier: Tool tier ('wood', 'stone', 'iron', 'diamond', 'netherite').

// Example
event.create('texe_shovel', 'kaleidoscope_cookery:kitchen_shovel')
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
- 森罗物语：酒馆 - 果盆配方；
- 森罗物语：酒馆 - 酒桶配方；
- 森罗物语：国味 - 冰箱冷冻配方；
- 森罗物语：国味 - 冰箱冷藏配方；
- 森罗物语：国味 - 腌菜罐配方。

# 注册类型：
- 森罗物语：厨房 - 菜刀；
- 森罗物语：厨房 - 锅铲；
- 森罗物语：厨房 - 镰刀。

森罗物语：酒馆 - 果盆配方：
```
event.recipes.kaleidoscope_cookery.pressing_tub(fluid, input, fluid_amount)
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

森罗物语：酒馆 - 雪克杯配方：
```
event.recipes.kaleidoscope_cookery.shaker(output, input)
// output 输出；
// input 输入(可选)。

// 示例
event.recipes.kaleidoscope_tavern.shaker(
  "kaleidoscope_tavern:vinegar",
  [
    "minecraft:emerald",
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
// type: 物品类型 (固定为 'kaleidoscope_cookery:kitchen_knife')； 
// tier: 工具等级 (如 'wood', 'stone', 'iron', 'diamond', 'netherite' 等)。

// 示例
event.create('texe_knife', 'kaleidoscope_cookery:kitchen_knife')
    .tier('netherite')
    .rarity("epic")
    .fireResistant(true)
    .modifyTier(tier => {
      tier.setUses(1024) // 耐久度
      tier.setAttackDamageBonus(10) // 攻击伤害加成
      tier.setSpeed(-1.0) // 速度
    })
```

森罗物语：厨房 - 锅铲
```
event.create(id, type).tier(tier)
// id: 物品 ID； 
// type: 物品类型 (固定为 'kaleidoscope_cookery:kitchen_shovel')； 
// tier: 工具等级 (如 'wood', 'stone', 'iron', 'diamond', 'netherite' 等)。

// 示例
event.create('texe_shovel', 'kaleidoscope_cookery:kitchen_shovel')
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
