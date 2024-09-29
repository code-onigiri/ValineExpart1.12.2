//基本制御回路の難化
//mods.mekanism.metallurgicInfuser.removeByInput(ore("ingotOsmium"),infusionType("REDSTONE"))
//mods.mekanism.metallurgicInfuser.recipeBuilder()
//    .input(item("pneumaticcraft:printed_circuit_board"))
//    .infuse(infusionType("REDSTONE"))
//    .amount(5)
//    .output(item("mekanism:controlcircuit",0))
//    .register()

//エネルギータブレットの難化
crafting.removeByOutput(item("mekanism:energytablet"))
crafting.addShaped(item("mekanism:energytablet"),[
    [item("minecraft:redstone"),item("minecraft:gold_ingot"),item("pneumaticcraft:ingot_iron_compressed")],
    [item("mekanism:enrichedalloy"),item("pneumaticcraft:failed_pcb"),item("mekanism:enrichedalloy")],
    [item("pneumaticcraft:ingot_iron_compressed"),item("minecraft:gold_ingot"),item("minecraft:redstone")]
])

//鋼鉄ケースの難化
crafting.removeByOutput(item("mekanism:basicblock",8))
crafting.addShaped(item("mekanism:basicblock",8),[
    [ore("ingotSteel"),ore("blockGlass"),ore("ingotSteel")],
    [ore("blockGlass"),item("thermalexpansion:frame",0),ore("blockGlass")],
    [ore("ingotSteel"),ore("blockGlass"),ore("ingotSteel")]
])

//ちきんちゅうにゅうきの難化
crafting.removeByOutput(item("mekanism:machineblock",8))
crafting.addShaped(item("mekanism:machineblock",8),[
    [ore("ingotSteel"),item("minecraft:furnace"),ore("ingotSteel")],
    [item("minecraft:redstone"),item("thermalexpansion:frame",0),item("minecraft:redstone")],
    [ore("ingotSteel"),item("minecraft:furnace"),ore("ingotSteel")]
])

//エネルギーキューブの難化
crafting.removeByOutput(item("mekanism:energycube",0))
crafting.addShaped(item("mekanism:energycube",0),[
    [item("thermalfoundation:material",515),item("mekanism:energytablet"),item("thermalfoundation:material",515)],
    [item("minecraft:iron_ingot"),item("mekanism:basicblock",8),item("minecraft:iron_ingot")],
    [item("thermalfoundation:material",515),item("mekanism:energytablet"),item("thermalfoundation:material",515)]
])

//基本制御回路の容易化
mods.techreborn.assembling_machine.recipeBuilder()
    .input(item("pneumaticcraft:printed_circuit_board")*2,item("mekanism:ingot",1)*2)
    .output(item("mekanism:controlcircuit",0))
    .time(100)
    .perTick(1000)
    .register()