//頑丈な筐体の難化
crafting.removeByOutput(item("forestry:sturdy_machine"))
crafting.addShaped(item("forestry:sturdy_machine"),[
    [ore("ingotBronze"),ore("ingotBronze"),ore("ingotBronze")],
    [ore("ingotBronze"),item("thermalexpansion:frame",64),ore("ingotBronze")],
    [ore("ingotBronze"),ore("ingotBronze"),ore("ingotBronze")]
])

//圧搾装置の難化
crafting.removeByOutput(item("forestry:squeezer"))
crafting.addShaped(item("forestry:squeezer"),[
    [item("mekanismecoenergistics:moreingot",0),ore("blockGlass"),item("mekanismecoenergistics:moreingot",0)],
    [ore("ingotTin"),item("forestry:sturdy_machine"),ore("ingotTin")],
    [item("mekanismecoenergistics:moreingot",0),ore("blockGlass"),item("mekanismecoenergistics:moreingot",0)]
])

//工作機の難化
crafting.removeByOutput(item("forestry:carpenter"))
crafting.addShaped(item("forestry:carpenter"),[
    [item("mekanismecoenergistics:moreingot",0),ore("blockGlass"),item("mekanismecoenergistics:moreingot",0)],
    [ore("ingotBronze"),item("forestry:sturdy_machine"),ore("ingotBronze")],
    [item("mekanismecoenergistics:moreingot",0),ore("blockGlass"),item("mekanismecoenergistics:moreingot",0)]
])

//はんだごての難化
mods.forestry.carpenter.removeByOutput(item("forestry:soldering_iron"))
mods.immersiveengineering.blueprint_crafting.recipeBuilder()
    .input(item("minecraft:iron_ingot")*6,ore("ingotBronze")*2)
    .output(item('forestry:soldering_iron'))
    .category('components')
    .register()


