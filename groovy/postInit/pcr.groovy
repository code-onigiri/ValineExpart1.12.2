
//圧縮鉄の難化
mods.pneumaticcraft.explosion.removeByOutput(item("pneumaticcraft:ingot_iron_compressed"))
mods.pneumaticcraft.explosion.removeByOutput(item("pneumaticcraft:compressed_iron_block"))
mods.pneumaticcraft.explosion.recipeBuilder()
    .input(item('minecraft:iron_nugget')*27)
    .output(item('pneumaticcraft:ingot_iron_compressed'))
    .lossRate(80)
    .register()

//火薬の容易化
crafting.addShapeless(item("minecraft:gunpowder") * 3 ,[item("minecraft:gunpowder"),item("minecraft:sugar"),item("minecraft:sugar"),item("minecraft:sugar"),item("minecraft:sugar"),item("minecraft:sugar"),item("minecraft:sugar"),item("minecraft:sugar"),item("minecraft:sugar")])

//圧縮するマルチブロックのレシピ


//プリンテッドサーキットボードの難化
crafting.remove("pneumaticcraft:printed_circuit_board")
crafting.addShaped(item("pneumaticcraft:printed_circuit_board"),[
    [item("pneumaticcraft:unassembled_pcb"),item("pneumaticcraft:transistor"),item("pneumaticcraft:transistor")],
    [item("pneumaticcraft:transistor"),item("pneumaticcraft:capacitor"),item("pneumaticcraft:capacitor")],
    [item("pneumaticcraft:capacitor"),item("mekanism:ingot",1),item("mekanism:ingot",1)]
])
//プリンテッドサーキットボードをmekで容易化
mods.mekanism.combiner.recipeBuilder()
    .input(item("pneumaticcraft:empty_pcb")*2)
    .extra(item("minecraft:redstone")*16)
    .output(item("pneumaticcraft:printed_circuit_board"))
    .register()

//アドバンスも
mods.mekanism.combiner.recipeBuilder()
    .input(item("pneumaticcraft:printed_circuit_board")*2)
    .extra(item("minecraft:redstone")*16)
    .output(item("pneumaticcraft:advanced_pcb"))
    .register()