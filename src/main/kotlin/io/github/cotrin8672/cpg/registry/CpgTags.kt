package io.github.cotrin8672.cpg.registry

import io.github.cotrin8672.cpg.CreatePureGlass
import net.minecraft.core.registries.Registries
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

object CpgTags {
    val GLASS_WHITE = bind("glass_white")
    val GLASS_ORANGE = bind("glass_orange")
    val GLASS_MAGENTA = bind("glass_magenta")
    val GLASS_LIGHT_BLUE = bind("glass_light_blue")
    val GLASS_YELLOW = bind("glass_yellow")
    val GLASS_LIME = bind("glass_lime")
    val GLASS_PINK = bind("glass_pink")
    val GLASS_GRAY = bind("glass_gray")
    val GLASS_LIGHT_GRAY = bind("glass_light_gray")
    val GLASS_CYAN = bind("glass_cyan")
    val GLASS_PURPLE = bind("glass_purple")
    val GLASS_BLUE = bind("glass_blue")
    val GLASS_BROWN = bind("glass_brown")
    val GLASS_GREEN = bind("glass_green")
    val GLASS_RED = bind("glass_red")
    val GLASS_BLACK = bind("glass_black")

    private fun bind(name: String): TagKey<Item> =
        TagKey.create(Registries.ITEM, CreatePureGlass.asResource(name))
}
