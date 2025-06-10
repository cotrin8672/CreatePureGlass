package io.github.cotrin8672.cpg.util

import io.github.cotrin8672.cpg.registry.CpgTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.DyeColor.*
import net.minecraft.world.item.Item

val DyeColor.itemTag: TagKey<Item>
    get() {
        return when (this) {
            WHITE -> CpgTags.GLASS_WHITE
            ORANGE -> CpgTags.GLASS_ORANGE
            MAGENTA -> CpgTags.GLASS_MAGENTA
            LIGHT_BLUE -> CpgTags.GLASS_LIGHT_BLUE
            YELLOW -> CpgTags.GLASS_YELLOW
            LIME -> CpgTags.GLASS_LIME
            PINK -> CpgTags.GLASS_PINK
            GRAY -> CpgTags.GLASS_GRAY
            LIGHT_GRAY -> CpgTags.GLASS_LIGHT_GRAY
            CYAN -> CpgTags.GLASS_CYAN
            PURPLE -> CpgTags.GLASS_PURPLE
            BLUE -> CpgTags.GLASS_BLUE
            BROWN -> CpgTags.GLASS_BROWN
            GREEN -> CpgTags.GLASS_GREEN
            RED -> CpgTags.GLASS_RED
            BLACK -> CpgTags.GLASS_BLACK
        }
    }
