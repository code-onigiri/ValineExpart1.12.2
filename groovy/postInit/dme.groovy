//soot-covered redstoneの難化
mods.immersiveengineering.arc_furnace.recipeBuilder()
    .input(item("minecraft:coal")*4)
    .output(item("deepmoblearning:soot_covered_redstone"))
    .time(200)
    .mainInput(item("minecraft:redstone")*2)
    .energyPerTick(20000)
    .alloying()
    .register()
//soot-coveredplateの難化
crafting.removeByOutput(item("deepmoblearning:soot_covered_plate"))
crafting.addShaped(item("deepmoblearning:soot_covered_plate"),[
    [item("mekanism:ingot",0),item("mekanism:ingot",0)],
    [item("mekanism:ingot",0),item("deepmoblearning:soot_covered_redstone")]
])

//polymer clayの難化
crafting.removeByOutput(item("deepmoblearning:polymer_clay"))
crafting.shapedBuilder()
    .name('valine_expart_1_12_2:polymer_clay')
    .output(item("deepmoblearning:polymer_clay")*32)
    .matrix("GC ","CLC"," CI")
    .key('C',item("minecraft:clay_ball"))
    .key('G',item("mekanism:ingot",3))
    .key('I',item("mekanism:ingot",4))
    .key('L',ore("gemLapis"))
    .register()