package io.github.cotrin8672.cpg

import com.simibubi.create.foundation.data.CreateRegistrate
import io.github.cotrin8672.cpg.registrate.KotlinRegistrate
import io.github.cotrin8672.cpg.registry.CpgBlocks
import net.minecraft.resources.ResourceLocation
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(CreatePureGlass.ID)
object CreatePureGlass {
    const val ID = "createpureglass"

    val REGISTRATE: CreateRegistrate = KotlinRegistrate.create(ID)

    fun asResource(path: String): ResourceLocation {
        return ResourceLocation(ID, path)
    }

    init {
        REGISTRATE.registerEventListeners(MOD_BUS)
        CpgBlocks.register()
    }

    fun getColors() = listOf(
        "",
        //"white", "light_gray", "gray", "black", "brown",
        //"red", "orange", "yellow", "lime", "green",
        //"cyan", "light_blue", "blue", "purple", "magenta", "pink"
    )
}
