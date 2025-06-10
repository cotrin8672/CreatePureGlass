package io.github.cotrin8672.cpg.registry

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

object CpgTags {
    object Items {
        val GLASS_WHITE = bindItem("glass_blocks/white")
        val GLASS_ORANGE = bindItem("glass_blocks/orange")
        val GLASS_MAGENTA = bindItem("glass_blocks/magenta")
        val GLASS_LIGHT_BLUE = bindItem("glass_blocks/light_blue")
        val GLASS_YELLOW = bindItem("glass_blocks/yellow")
        val GLASS_LIME = bindItem("glass_blocks/lime")
        val GLASS_PINK = bindItem("glass_blocks/pink")
        val GLASS_GRAY = bindItem("glass_blocks/gray")
        val GLASS_LIGHT_GRAY = bindItem("glass_blocks/light_gray")
        val GLASS_CYAN = bindItem("glass_blocks/cyan")
        val GLASS_PURPLE = bindItem("glass_blocks/purple")
        val GLASS_BLUE = bindItem("glass_blocks/blue")
        val GLASS_BROWN = bindItem("glass_blocks/brown")
        val GLASS_GREEN = bindItem("glass_blocks/green")
        val GLASS_RED = bindItem("glass_blocks/red")
        val GLASS_BLACK = bindItem("glass_blocks/black")
    }

    object Blocks {
        val GLASS_WHITE = bindBlock("glass_blocks/white")
        val GLASS_ORANGE = bindBlock("glass_blocks/orange")
        val GLASS_MAGENTA = bindBlock("glass_blocks/magenta")
        val GLASS_LIGHT_BLUE = bindBlock("glass_blocks/light_blue")
        val GLASS_YELLOW = bindBlock("glass_blocks/yellow")
        val GLASS_LIME = bindBlock("glass_blocks/lime")
        val GLASS_PINK = bindBlock("glass_blocks/pink")
        val GLASS_GRAY = bindBlock("glass_blocks/gray")
        val GLASS_LIGHT_GRAY = bindBlock("glass_blocks/light_gray")
        val GLASS_CYAN = bindBlock("glass_blocks/cyan")
        val GLASS_PURPLE = bindBlock("glass_blocks/purple")
        val GLASS_BLUE = bindBlock("glass_blocks/blue")
        val GLASS_BROWN = bindBlock("glass_blocks/brown")
        val GLASS_GREEN = bindBlock("glass_blocks/green")
        val GLASS_RED = bindBlock("glass_blocks/red")
        val GLASS_BLACK = bindBlock("glass_blocks/black")
    }

    private fun bindItem(name: String): TagKey<Item> =
        TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name))

    private fun bindBlock(name: String): TagKey<Block> =
        TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", name))
}
