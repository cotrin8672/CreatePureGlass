package io.github.cotrin8672.cpg.util

import net.minecraft.tags.TagKey
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.DyeColor.*
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraftforge.common.Tags

val DyeColor.itemTag: TagKey<Item>
    get() {
        return when (this) {
            WHITE -> Tags.Items.GLASS_WHITE
            ORANGE -> Tags.Items.GLASS_ORANGE
            MAGENTA -> Tags.Items.GLASS_MAGENTA
            LIGHT_BLUE -> Tags.Items.GLASS_LIGHT_BLUE
            YELLOW -> Tags.Items.GLASS_YELLOW
            LIME -> Tags.Items.GLASS_LIME
            PINK -> Tags.Items.GLASS_PINK
            GRAY -> Tags.Items.GLASS_GRAY
            LIGHT_GRAY -> Tags.Items.GLASS_LIGHT_GRAY
            CYAN -> Tags.Items.GLASS_CYAN
            PURPLE -> Tags.Items.GLASS_PURPLE
            BLUE -> Tags.Items.GLASS_BLUE
            BROWN -> Tags.Items.GLASS_BROWN
            GREEN -> Tags.Items.GLASS_GREEN
            RED -> Tags.Items.GLASS_RED
            BLACK -> Tags.Items.GLASS_BLACK
        }
    }

val DyeColor.blockTag: TagKey<Block>
    get() {
        return when (this) {
            WHITE -> Tags.Blocks.GLASS_WHITE
            ORANGE -> Tags.Blocks.GLASS_ORANGE
            MAGENTA -> Tags.Blocks.GLASS_MAGENTA
            LIGHT_BLUE -> Tags.Blocks.GLASS_LIGHT_BLUE
            YELLOW -> Tags.Blocks.GLASS_YELLOW
            LIME -> Tags.Blocks.GLASS_LIME
            PINK -> Tags.Blocks.GLASS_PINK
            GRAY -> Tags.Blocks.GLASS_GRAY
            LIGHT_GRAY -> Tags.Blocks.GLASS_LIGHT_GRAY
            CYAN -> Tags.Blocks.GLASS_CYAN
            PURPLE -> Tags.Blocks.GLASS_PURPLE
            BLUE -> Tags.Blocks.GLASS_BLUE
            BROWN -> Tags.Blocks.GLASS_BROWN
            GREEN -> Tags.Blocks.GLASS_GREEN
            RED -> Tags.Blocks.GLASS_RED
            BLACK -> Tags.Blocks.GLASS_BLACK
        }
    }
