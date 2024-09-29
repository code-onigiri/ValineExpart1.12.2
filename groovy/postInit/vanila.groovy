
//精錬レシピ削除。
furnace.removeByInput(item("morebees:dustiron"))
furnace.streamRecipes()
    .filter(recipe -> recipe.output in item("minecraft:iron_ingot"))
    .removeAll()

furnace.removeByInput(item("morebees:dustgold"))
furnace.streamRecipes()
    .filter(recipe -> recipe.output in item("minecraft:gold_ingot"))
    .removeAll()