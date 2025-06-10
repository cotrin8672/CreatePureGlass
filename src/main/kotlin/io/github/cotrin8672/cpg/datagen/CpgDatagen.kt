package io.github.cotrin8672.cpg.datagen

import com.tterrag.registrate.providers.RegistrateDataProvider
import io.github.cotrin8672.cpg.CreatePureGlass
import io.github.cotrin8672.cpg.CreatePureGlass.REGISTRATE
import net.neoforged.neoforge.data.event.GatherDataEvent

object CpgDatagen {
    @JvmStatic
    fun gatherData(event: GatherDataEvent) {
        val generator = event.generator
        val packOutput = generator.packOutput
        val lookup = event.lookupProvider
        val existingFileHelper = event.existingFileHelper

        val blockTagProvider = BlockTagProvider(packOutput, lookup, existingFileHelper)
        generator.addProvider(true, blockTagProvider)
        generator.addProvider(
            true,
            ItemTagProvider(packOutput, lookup, blockTagProvider.contentsGetter(), existingFileHelper)
        )

        generator.addProvider(
            true,
            REGISTRATE.setDataProvider(RegistrateDataProvider(REGISTRATE, CreatePureGlass.ID, event))
        )
    }
}
