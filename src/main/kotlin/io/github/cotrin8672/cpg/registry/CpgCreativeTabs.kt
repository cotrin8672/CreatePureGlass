package io.github.cotrin8672.cpg.registry

import io.github.cotrin8672.cpg.CreatePureGlass
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.RegistryObject
import java.util.function.Supplier

object CpgCreativeTabs {
    private val REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePureGlass.ID)

    val CPG_CREATIVE_TAB: RegistryObject<CreativeModeTab> = REGISTER.register(
        "cpg_default",
        Supplier {
            CreativeModeTab.builder().apply {
                title(Component.literal("Create: Pure Glass"))
                icon { CpgBlocks.PURE_GLASS.asStack() }
            }.build()
        }
    )

    fun register(bus: IEventBus) {
        REGISTER.register(bus)
    }
}