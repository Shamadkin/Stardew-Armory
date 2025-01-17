package net.gendevo.stardewarmory.setup;

import net.gendevo.stardewarmory.StardewArmory;
import net.gendevo.stardewarmory.entities.GuildMasterEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, StardewArmory.MOD_ID);

    public static final RegistryObject<EntityType<GuildMasterEntity>> GUILD_MASTER = ENTITY_TYPES.register("guild_master",
            () -> EntityType.Builder.of(GuildMasterEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.6f)
                    .build(new ResourceLocation(StardewArmory.MOD_ID, "guild_master").toString()));
}
