package io.github.cotrin8672.cpg.registry

import com.simibubi.create.content.decoration.palettes.ConnectedGlassBlock
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour
import com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures
import com.tterrag.registrate.util.DataIngredient
import com.tterrag.registrate.util.entry.BlockEntry
import io.github.cotrin8672.cpg.CreatePureGlass.REGISTRATE
import io.github.cotrin8672.cpg.util.itemTag
import net.minecraft.client.renderer.RenderType
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.Blocks
import net.minecraftforge.common.Tags
import java.util.function.Supplier

object CpgBlocks {
    val PURE_GLASS: BlockEntry<ConnectedGlassBlock> = REGISTRATE
        .block("pure_glass", ::ConnectedGlassBlock)
        .onRegister(connectedTextures { SimpleCTBehaviour(CpgSpriteShifts.PURE_GLASS) })
        .addLayer { Supplier(RenderType::translucent) }
        .initialProperties { Blocks.GLASS }
        .loot { table, block -> table.dropWhenSilkTouch(block) }
        .recipe { context, provider ->
            provider.stonecutting(
                DataIngredient.tag(Tags.Items.GLASS_COLORLESS),
                RecipeCategory.BUILDING_BLOCKS,
                context::get
            )
        }
        .properties { it.noOcclusion() }
        .item()
        .tag(Tags.Items.GLASS_COLORLESS)
        .build()
        .register()

    val glassBlocks = DyeColor.entries.map { color ->
        REGISTRATE
            .block("${color.name}_stained_pure_glass", ::ConnectedGlassBlock)
            .onRegister(connectedTextures { SimpleCTBehaviour(CpgSpriteShifts.MAP[color]) })
            .addLayer { Supplier(RenderType::translucent) }
            .initialProperties { Blocks.GLASS }
            .loot { table, block -> table.dropWhenSilkTouch(block) }
            .recipe { context, provider ->
                provider.stonecutting(
                    DataIngredient.tag(color.itemTag),
                    RecipeCategory.BUILDING_BLOCKS,
                    context::get
                )
            }
            .properties { it.noOcclusion() }
            .item()
            .tag(Tags.Items.GLASS_COLORLESS)
            .build()
            .register()
    }

    fun register() {}
}
