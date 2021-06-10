package net.gendevo.stardewarmory.data.client;

import net.gendevo.stardewarmory.StardewArmory;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, StardewArmory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("prismatic_block", modLoc("block/prismatic_block"));
        withExistingParent("prismatic_ore", modLoc("block/prismatic_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        builder(itemGenerated, "special_item");
        // Materials
        builder(itemGenerated, "prismatic_shard");
        builder(itemGenerated, "reinforced_handle");
        builder(itemGenerated, "dragon_tooth");
        builder(itemGenerated, "prehistoric_scapula");
        //Rings
        builder(itemGenerated, "ruby_ring");
        builder(itemGenerated, "lucky_ring");
        builder(itemGenerated, "crabshell_ring");
        //Swords
        builder(itemHandheld, "galaxy_sword");
        builder(itemHandheld, "dragontooth_cutlass");
        builder(itemHandheld, "silver_saber");
        builder(itemHandheld, "rusty_sword");
        builder(itemHandheld, "steel_smallsword");
        builder(itemHandheld, "pirates_sword");
        builder(itemHandheld, "cutlass");
        builder(itemHandheld, "forest_sword");
        builder(itemHandheld, "iron_edge");
        builder(itemHandheld, "insect_head");
        builder(itemHandheld, "bone_sword");
        builder(itemHandheld, "claymore");
        builder(itemHandheld, "neptunes_glaive");
        builder(itemHandheld, "templars_blade");
        builder(itemHandheld, "obsidian_edge");
        builder(itemHandheld, "ossified_blade");
        builder(itemHandheld, "tempered_broadsword");
        builder(itemHandheld, "yeti_tooth");
        builder(itemHandheld, "steel_falchion");
        builder(itemHandheld, "dark_sword");
        builder(itemHandheld, "lava_katana");
        builder(itemHandheld, "dwarf_sword");
        builder(itemHandheld, "infinity_blade");
        //Daggers
        builder(itemHandheld, "carving_knife");
        builder(itemHandheld, "iron_dirk");
        builder(itemHandheld, "wind_spire");
        builder(itemHandheld, "elf_blade");
        builder(itemHandheld, "burglars_shank");
        builder(itemHandheld, "crystal_dagger");
        builder(itemHandheld, "shadow_dagger");
        builder(itemHandheld, "broken_trident");
        builder(itemHandheld, "wicked_kris");
        builder(itemHandheld, "galaxy_dagger");
        builder(itemHandheld, "dwarf_dagger");
        builder(itemHandheld, "dragontooth_shiv");
        builder(itemHandheld, "iridium_needle");
        builder(itemHandheld, "infinity_dagger");
        //Clubs
        builder(itemHandheld, "femur");
        builder(itemHandheld, "wood_club");
        builder(itemHandheld, "wood_mallet");
        builder(itemHandheld, "lead_rod");
        builder(itemHandheld, "kudgel");
        builder(itemHandheld, "slammer");
        builder(itemHandheld, "dwarf_hammer");
        builder(itemHandheld, "dragontooth_club");
        builder(itemHandheld, "galaxy_hammer");
        builder(itemHandheld, "infinity_gavel");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}