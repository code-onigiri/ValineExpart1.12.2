crafting.removeByOutput(item("computercraft:computer",0))
crafting.addShaped(item("computercraft:computer",0),[
    [ore("ingotSilver"),item("thermalexpansion:frame",0),ore("ingotSilver")],
    [ore("ingotSilver"),item("pneumaticcraft:advanced_pcb"),ore("ingotSilver")],
    [item("minecraft:stone"),item("integrateddynamics:part_display_panel_item"),item("minecraft:stone")]
])

crafting.removeByOutput(item("computercraft:disk_expanded",0))
crafting.addShapeless(item("computercraft:disk_expanded",0),[
    item("thermalinnovation:magnet",0),ore("dustIron"),ore("dustIron"),item("minecraft:paper"),item("minecraft:redstone")
])