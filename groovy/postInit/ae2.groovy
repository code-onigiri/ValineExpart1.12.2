//粉砕機の難化
crafting.removeByOutput(item("appliedenergistics2:crank"))
crafting.removeByOutput(item("appliedenergistics2:grindstone"))

//刻印機の難化
crafting.removeByOutput(item("appliedenergistics2:inscriber"))
crafting.addShaped(item("appliedenergistics2:inscriber"),[
    [item("minecraft:iron_ingot"),item("minecraft:sticky_piston"),item("minecraft:iron_ingot")],
    [ore("crystalFluix"),item("thermalexpansion:frame",0),item('computercraft:turtle_expanded').withNbt(['rightUpgrade': 'minecraft:crafting_table'])],
    [item("minecraft:iron_ingot"),item("minecraft:sticky_piston"),item("minecraft:iron_ingot")]
])

//プロセッサーの難化
mods.appliedenergistics2.inscriber.removeByOutput(item("appliedenergistics2:material",22))
mods.appliedenergistics2.inscriber.recipeBuilder()
    .input(item("pneumaticcraft:empty_pcb"))
    .output(item("appliedenergistics2:material",22))
    .top(item("appliedenergistics2:material",18))
    .bottom(item("appliedenergistics2:material",20))
    .register()
mods.appliedenergistics2.inscriber.removeByOutput(item("appliedenergistics2:material",23))
mods.appliedenergistics2.inscriber.recipeBuilder()
    .input(item("pneumaticcraft:printed_circuit_board"))
    .output(item("appliedenergistics2:material",23))
    .top(item("appliedenergistics2:material",16))
    .bottom(item("appliedenergistics2:material",20))
    .register()
mods.appliedenergistics2.inscriber.removeByOutput(item("appliedenergistics2:material",24))
mods.appliedenergistics2.inscriber.recipeBuilder()
    .input(item("pneumaticcraft:advanced_pcb"))
    .output(item("appliedenergistics2:material",24))
    .top(item("appliedenergistics2:material",17))
    .bottom(item("appliedenergistics2:material",20))
    .register()