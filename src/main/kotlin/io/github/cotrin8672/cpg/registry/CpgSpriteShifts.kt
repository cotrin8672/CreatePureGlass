package io.github.cotrin8672.cpg.registry

import com.simibubi.create.foundation.block.connected.AllCTTypes
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry
import com.simibubi.create.foundation.block.connected.CTSpriteShifter
import com.simibubi.create.foundation.block.connected.CTType
import io.github.cotrin8672.cpg.CreatePureGlass.asResource

object CpgSpriteShifts {
    val PURE_GLASS = getCT(AllCTTypes.OMNIDIRECTIONAL, "pure_glass", "pure_glass")

    private fun getCT(type: CTType, blockTextureName: String, connectedTextureName: String): CTSpriteShiftEntry {
        return CTSpriteShifter.getCT(
            type, asResource("block/$blockTextureName"),
            asResource("block/" + connectedTextureName + "_connected")
        )
    }
}
