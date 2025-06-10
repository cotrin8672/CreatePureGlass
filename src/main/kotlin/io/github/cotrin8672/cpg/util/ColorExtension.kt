package io.github.cotrin8672.cpg.util

import io.github.cotrin8672.cpg.registry.CpgTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.DyeColor.*
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

val DyeColor.itemTag: TagKey<Item>
    get() {
        return when (this) {
            WHITE -> CpgTags.Items.GLASS_WHITE
            ORANGE -> CpgTags.Items.GLASS_ORANGE
            MAGENTA -> CpgTags.Items.GLASS_MAGENTA
            LIGHT_BLUE -> CpgTags.Items.GLASS_LIGHT_BLUE
            YELLOW -> CpgTags.Items.GLASS_YELLOW
            LIME -> CpgTags.Items.GLASS_LIME
            PINK -> CpgTags.Items.GLASS_PINK
            GRAY -> CpgTags.Items.GLASS_GRAY
            LIGHT_GRAY -> CpgTags.Items.GLASS_LIGHT_GRAY
            CYAN -> CpgTags.Items.GLASS_CYAN
            PURPLE -> CpgTags.Items.GLASS_PURPLE
            BLUE -> CpgTags.Items.GLASS_BLUE
            BROWN -> CpgTags.Items.GLASS_BROWN
            GREEN -> CpgTags.Items.GLASS_GREEN
            RED -> CpgTags.Items.GLASS_RED
            BLACK -> CpgTags.Items.GLASS_BLACK
        }
    }

val DyeColor.blockTag: TagKey<Block>
    get() {
        return when (this) {
            WHITE -> CpgTags.Blocks.GLASS_WHITE
            ORANGE -> CpgTags.Blocks.GLASS_ORANGE
            MAGENTA -> CpgTags.Blocks.GLASS_MAGENTA
            LIGHT_BLUE -> CpgTags.Blocks.GLASS_LIGHT_BLUE
            YELLOW -> CpgTags.Blocks.GLASS_YELLOW
            LIME -> CpgTags.Blocks.GLASS_LIME
            PINK -> CpgTags.Blocks.GLASS_PINK
            GRAY -> CpgTags.Blocks.GLASS_GRAY
            LIGHT_GRAY -> CpgTags.Blocks.GLASS_LIGHT_GRAY
            CYAN -> CpgTags.Blocks.GLASS_CYAN
            PURPLE -> CpgTags.Blocks.GLASS_PURPLE
            BLUE -> CpgTags.Blocks.GLASS_BLUE
            BROWN -> CpgTags.Blocks.GLASS_BROWN
            GREEN -> CpgTags.Blocks.GLASS_GREEN
            RED -> CpgTags.Blocks.GLASS_RED
            BLACK -> CpgTags.Blocks.GLASS_BLACK
        }
    }
