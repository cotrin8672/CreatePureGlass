package io.github.cotrin8672.cpg.registry

import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour
import com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures
import com.tterrag.registrate.util.entry.BlockEntry
import io.github.cotrin8672.cpg.CreatePureGlass.REGISTRATE
import io.github.cotrin8672.cpg.block.PureGlassBlock
import net.minecraft.client.renderer.RenderType
import net.minecraft.world.level.block.Blocks
import java.util.function.Supplier

object CpgBlocks {
    val PURE_GLASS: BlockEntry<PureGlassBlock> = REGISTRATE
        .block<PureGlassBlock>("pure_glass", ::PureGlassBlock)
        .onRegister(connectedTextures { SimpleCTBehaviour(CpgSpriteShifts.PURE_GLASS) })
        .addLayer { Supplier(RenderType::translucent) }
        .initialProperties { Blocks.GLASS }
        .properties { it.noOcclusion() }
        .simpleItem()
        .register()

    fun register() {}
}
