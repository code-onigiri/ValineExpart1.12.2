//収納コントローラーの難化
crafting.removeByOutput(item("storagedrawers:controller"))
crafting.addShaped(item("storagedrawers:controller"),[
    [item("pneumaticcraft:ingot_iron_compressed"),item("thermalexpansion:frame",0),item("pneumaticcraft:ingot_iron_compressed")],
    [item("minecraft:comparator"),ore("drawerBasic"),item("minecraft:comparator")],
    [item("pneumaticcraft:ingot_iron_compressed"),ore("gemDiamond"),item("pneumaticcraft:ingot_iron_compressed")]
])

crafting.removeByOutput(item("storagedrawers:controllerslave"))
crafting.addShaped(item("storagedrawers:controllerslave"),[
    [item("pneumaticcraft:ingot_iron_compressed"),item("thermalexpansion:frame",0),item("pneumaticcraft:ingot_iron_compressed")],
    [item("minecraft:comparator"),ore("drawerBasic"),item("minecraft:comparator")],
    [item("pneumaticcraft:ingot_iron_compressed"),item("minecraft:gold_ingot"),item("pneumaticcraft:ingot_iron_compressed")]
])

//自動変換タンスの難化
crafting.removeByOutput(item("storagedrawers:compdrawers"))
crafting.addShaped(item("storagedrawers:compdrawers"),[
     [item("pneumaticcraft:ingot_iron_compressed"),item("thermalexpansion:frame",0),item("pneumaticcraft:ingot_iron_compressed")],
    [item("minecraft:comparator"),ore("drawerBasic"),item("minecraft:comparator")],
    [item("pneumaticcraft:ingot_iron_compressed"),item("minecraft:iron_ingot"),item("pneumaticcraft:ingot_iron_compressed")]
])