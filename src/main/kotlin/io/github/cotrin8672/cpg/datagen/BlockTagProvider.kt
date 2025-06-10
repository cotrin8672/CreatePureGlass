package io.github.cotrin8672.cpg.datagen

import io.github.cotrin8672.cpg.CreatePureGlass
import io.github.cotrin8672.cpg.registry.CpgBlocks
import io.github.cotrin8672.cpg.registry.CpgTags
import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.world.level.block.Blocks
import net.neoforged.neoforge.common.data.BlockTagsProvider
import net.neoforged.neoforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture

class BlockTagProvider(
    packOutput: PackOutput,
    lookup: CompletableFuture<HolderLookup.Provider>,
    existingFileHelper: ExistingFileHelper,
) : BlockTagsProvider(packOutput, lookup, CreatePureGlass.ID, existingFileHelper) {
    override fun addTags(provider: HolderLookup.Provider) {
        tag(CpgTags.Blocks.GLASS_WHITE).add(Blocks.WHITE_STAINED_GLASS).add(CpgBlocks.glassBlocks[0].get())
        tag(CpgTags.Blocks.GLASS_ORANGE).add(Blocks.ORANGE_STAINED_GLASS).add(CpgBlocks.glassBlocks[1].get())
        tag(CpgTags.Blocks.GLASS_MAGENTA).add(Blocks.MAGENTA_STAINED_GLASS).add(CpgBlocks.glassBlocks[2].get())
        tag(CpgTags.Blocks.GLASS_LIGHT_BLUE).add(Blocks.LIGHT_BLUE_STAINED_GLASS).add(CpgBlocks.glassBlocks[3].get())
        tag(CpgTags.Blocks.GLASS_YELLOW).add(Blocks.YELLOW_STAINED_GLASS).add(CpgBlocks.glassBlocks[4].get())
        tag(CpgTags.Blocks.GLASS_LIME).add(Blocks.LIME_STAINED_GLASS).add(CpgBlocks.glassBlocks[5].get())
        tag(CpgTags.Blocks.GLASS_PINK).add(Blocks.PINK_STAINED_GLASS).add(CpgBlocks.glassBlocks[6].get())
        tag(CpgTags.Blocks.GLASS_GRAY).add(Blocks.GRAY_STAINED_GLASS).add(CpgBlocks.glassBlocks[7].get())
        tag(CpgTags.Blocks.GLASS_LIGHT_GRAY).add(Blocks.LIGHT_GRAY_STAINED_GLASS).add(CpgBlocks.glassBlocks[8].get())
        tag(CpgTags.Blocks.GLASS_CYAN).add(Blocks.CYAN_STAINED_GLASS).add(CpgBlocks.glassBlocks[9].get())
        tag(CpgTags.Blocks.GLASS_PURPLE).add(Blocks.PURPLE_STAINED_GLASS).add(CpgBlocks.glassBlocks[10].get())
        tag(CpgTags.Blocks.GLASS_BLUE).add(Blocks.BLUE_STAINED_GLASS).add(CpgBlocks.glassBlocks[11].get())
        tag(CpgTags.Blocks.GLASS_BROWN).add(Blocks.BROWN_STAINED_GLASS).add(CpgBlocks.glassBlocks[12].get())
        tag(CpgTags.Blocks.GLASS_GREEN).add(Blocks.GREEN_STAINED_GLASS).add(CpgBlocks.glassBlocks[13].get())
        tag(CpgTags.Blocks.GLASS_RED).add(Blocks.RED_STAINED_GLASS).add(CpgBlocks.glassBlocks[14].get())
        tag(CpgTags.Blocks.GLASS_BLACK).add(Blocks.BLACK_STAINED_GLASS).add(CpgBlocks.glassBlocks[15].get())
    }
}
