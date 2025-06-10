package io.github.cotrin8672.cpg.registry

import com.simibubi.create.content.decoration.palettes.ConnectedGlassBlock
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour
import com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures
import io.github.cotrin8672.cpg.CreatePureGlass.REGISTRATE
import io.github.cotrin8672.cpg.CreatePureGlass.getColors
import net.minecraft.client.renderer.RenderType
import net.minecraft.world.level.block.Blocks
import java.util.function.Supplier

object CpgBlocks {
    fun registerGlass() {
        getColors().onEach { color ->
            REGISTRATE
                .block(
                    if (color.isNotBlank()) "${color}_stained_pure_glass" else "pure_glass",
                    ::ConnectedGlassBlock
                )
                .onRegister(connectedTextures { SimpleCTBehaviour(CpgSpriteShifts.MAP[color]) })
                .addLayer { Supplier(RenderType::translucent) }
                .initialProperties { Blocks.GLASS }
                .properties { it.noOcclusion() }
                .simpleItem()
                .register()
        }
    }

    fun register() {
        registerGlass()
    }
}
