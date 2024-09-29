//hammerの難化
crafting.removeByOutput(item("immersiveengineering:tool",0))
crafting.shapedBuilder()                    // create a new shaped recipe
        .name('IEHammer_recipe') 
        .output(item("immersiveengineering:tool",0))
        .matrix(' IS', 
                ' TI', 
                'T  ')
        .key('S', item('minecraft:string')) 
        .key('I', item("pneumaticcraft:ingot_iron_compressed")) 
        .key('T', ore("stickWood"))
        .register() 

        //コークス炉の難化
        crafting.removeByOutput(item("immersiveengineering:stone_decoration",0))
        crafting.addShaped(item("immersiveengineering:stone_decoration",0),[
                [item("clayium:clay_parts",14),item("tconstruct:materials",0),item("clayium:clay_parts",14)],
                [item("tconstruct:materials",0),ore("sand"),item("tconstruct:materials",0)],
                [item("clayium:clay_parts",14),item("tconstruct:materials",0),item("clayium:clay_parts",14)]
        ])

        //合金窯の難化
        crafting.removeByOutput(item("immersiveengineering:stone_decoration",10))
        crafting.addShaped(item("immersiveengineering:stone_decoration",10),[
                [ore("sand"),item("tconstruct:materials",0)],
                [item("tconstruct:materials",0),ore("sand")]
        ])