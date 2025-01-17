package net.gendevo.stardewarmory.setup;

import net.gendevo.stardewarmory.StardewArmory;
import net.gendevo.stardewarmory.data.recipes.GalaxyForgeRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeTypes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, StardewArmory.MOD_ID);

    public static final RegistryObject<GalaxyForgeRecipe.Serializer> GALAXY_SERIALIZER =
            RECIPE_SERIALIZER.register("galaxy", GalaxyForgeRecipe.Serializer::new);

    public static RecipeType<GalaxyForgeRecipe> GALAXY_RECIPE =
            new GalaxyForgeRecipe.GalaxyForgeRecipeType();

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, GalaxyForgeRecipe.TYPE_ID, GALAXY_RECIPE);
    }
}
