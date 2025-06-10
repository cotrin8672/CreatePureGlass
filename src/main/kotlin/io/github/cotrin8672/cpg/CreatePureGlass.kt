package io.github.cotrin8672.cpg

import com.simibubi.create.foundation.data.CreateRegistrate
import io.github.cotrin8672.cpg.datagen.CpgDatagen
import io.github.cotrin8672.cpg.registry.CpgBlocks
import io.github.cotrin8672.cpg.registry.CpgCreativeTabs
import net.minecraft.resources.ResourceLocation
import net.neoforged.bus.api.EventPriority
import net.neoforged.fml.common.Mod
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(CreatePureGlass.ID)
object CreatePureGlass {
    const val ID = "createpureglass"

    val REGISTRATE: CreateRegistrate = CreateRegistrate.create(ID)
        .defaultCreativeTab(CpgCreativeTabs.CPG_CREATIVE_TAB.key!!)

    fun asResource(path: String): ResourceLocation {
        return ResourceLocation.fromNamespaceAndPath(ID, path)
    }

    init {
        REGISTRATE.registerEventListeners(MOD_BUS)
        CpgBlocks.register()
        CpgCreativeTabs.register(MOD_BUS)
        MOD_BUS.addListener(EventPriority.LOWEST, CpgDatagen::gatherData)
    }
}
