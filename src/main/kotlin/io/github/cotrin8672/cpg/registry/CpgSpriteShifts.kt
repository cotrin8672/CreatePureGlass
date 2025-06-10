package io.github.cotrin8672.cpg.registry

import com.simibubi.create.foundation.block.connected.AllCTTypes
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry
import com.simibubi.create.foundation.block.connected.CTSpriteShifter
import com.simibubi.create.foundation.block.connected.CTType
import io.github.cotrin8672.cpg.CreatePureGlass.asResource
import net.minecraft.world.item.DyeColor

object CpgSpriteShifts {
    val MAP = DyeColor.entries.associateWith {
        omni("${it.name}_stained_pure_glass", "${it.name}_stained_pure_glass")
    }

    val PURE_GLASS = omni("pure_glass", "pure_glass")

    private fun omni(blockTextureName: String, connectedTextureName: String) =
        getCT(AllCTTypes.OMNIDIRECTIONAL, blockTextureName, connectedTextureName)

    private fun getCT(type: CTType, blockTextureName: String, connectedTextureName: String): CTSpriteShiftEntry {
        return CTSpriteShifter.getCT(
            type, asResource("block/$blockTextureName"),
            asResource("block/" + connectedTextureName + "_connected")
        )
    }
}