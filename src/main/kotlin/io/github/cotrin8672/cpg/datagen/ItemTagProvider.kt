package io.github.cotrin8672.cpg.datagen

import io.github.cotrin8672.cpg.CreatePureGlass
import io.github.cotrin8672.cpg.registry.CpgBlocks
import io.github.cotrin8672.cpg.registry.CpgTags
import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.data.tags.ItemTagsProvider
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Block
import net.neoforged.neoforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture

class ItemTagProvider(
    packOutput: PackOutput,
    lookup: CompletableFuture<HolderLookup.Provider>,
    blockTagProvider: CompletableFuture<TagLookup<Block>>,
    existingFileHelper: ExistingFileHelper,
) : ItemTagsProvider(packOutput, lookup, blockTagProvider, CreatePureGlass.ID, existingFileHelper) {
    override fun addTags(provider: HolderLookup.Provider) {
        tag(CpgTags.Items.GLASS_WHITE).add(Items.WHITE_STAINED_GLASS).add(CpgBlocks.glassBlocks[0].asItem())
        tag(CpgTags.Items.GLASS_ORANGE).add(Items.ORANGE_STAINED_GLASS).add(CpgBlocks.glassBlocks[1].asItem())
        tag(CpgTags.Items.GLASS_MAGENTA).add(Items.MAGENTA_STAINED_GLASS).add(CpgBlocks.glassBlocks[2].asItem())
        tag(CpgTags.Items.GLASS_LIGHT_BLUE).add(Items.LIGHT_BLUE_STAINED_GLASS).add(CpgBlocks.glassBlocks[3].asItem())
        tag(CpgTags.Items.GLASS_YELLOW).add(Items.YELLOW_STAINED_GLASS).add(CpgBlocks.glassBlocks[4].asItem())
        tag(CpgTags.Items.GLASS_LIME).add(Items.LIME_STAINED_GLASS).add(CpgBlocks.glassBlocks[5].asItem())
        tag(CpgTags.Items.GLASS_PINK).add(Items.PINK_STAINED_GLASS).add(CpgBlocks.glassBlocks[6].asItem())
        tag(CpgTags.Items.GLASS_GRAY).add(Items.GRAY_STAINED_GLASS).add(CpgBlocks.glassBlocks[7].asItem())
        tag(CpgTags.Items.GLASS_LIGHT_GRAY).add(Items.LIGHT_GRAY_STAINED_GLASS).add(CpgBlocks.glassBlocks[8].asItem())
        tag(CpgTags.Items.GLASS_CYAN).add(Items.CYAN_STAINED_GLASS).add(CpgBlocks.glassBlocks[9].asItem())
        tag(CpgTags.Items.GLASS_PURPLE).add(Items.PURPLE_STAINED_GLASS).add(CpgBlocks.glassBlocks[10].asItem())
        tag(CpgTags.Items.GLASS_BLUE).add(Items.BLUE_STAINED_GLASS).add(CpgBlocks.glassBlocks[11].asItem())
        tag(CpgTags.Items.GLASS_BROWN).add(Items.BROWN_STAINED_GLASS).add(CpgBlocks.glassBlocks[12].asItem())
        tag(CpgTags.Items.GLASS_GREEN).add(Items.GREEN_STAINED_GLASS).add(CpgBlocks.glassBlocks[13].asItem())
        tag(CpgTags.Items.GLASS_RED).add(Items.RED_STAINED_GLASS).add(CpgBlocks.glassBlocks[14].asItem())
        tag(CpgTags.Items.GLASS_BLACK).add(Items.BLACK_STAINED_GLASS).add(CpgBlocks.glassBlocks[15].asItem())
    }
}
