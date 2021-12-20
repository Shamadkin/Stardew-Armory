package net.gendevo.stardewarmory.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PrismaticWool extends Block {
    public PrismaticWool() {
        super(Block.Properties.of(Material.WOOL)
                .strength(0.8F)
                .sound(SoundType.WOOL));
    }
}