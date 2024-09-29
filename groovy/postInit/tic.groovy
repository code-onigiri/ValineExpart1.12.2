mods.tconstruct.melting

// Tictweaks


//fluid redstone
//content.createFluid('molten_redstone')
//    .setMetalTexture()
//    .setColor(0x720000)
//    .setTemperature(1000)
//    .setLavaMaterial()
//    .register()
//mods.tconstruct.melting.recipeBuilder()
//    .input(item('minecraft:redstone_ore'))
//    .fluidOutput(fluid('molten_redstone') * 50)
//    .time(40)
//    .register()
//mods.tconstruct.casting_table.recipeBuilder()
//    .fluidInput(fluid('molten_redstone') * 100)
//    .output(item('minecraft:redstone_block'))
//    .coolingTime(100)
//    .register()

//鋼鉄の容易化
mods.tconstruct.melting.recipeBuilder()
    .input(item('minecraft:coal'))
    .fluidOutput(fluid('coal') * 100)
    .time(30)
    .register()
mods.tconstruct.alloying.recipeBuilder()
    .fluidOutput(fluid('steel') * 100)
    .fluidInput(fluid('coal') * 100,fluid('iron') * 100)
    .register()