package net.gendevo.stardewarmory.items.tools;


import net.gendevo.stardewarmory.data.capabilities.IridiumCapabilityManager;
import net.gendevo.stardewarmory.util.KeybindSetup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class IridiumShovel extends ShovelItem {

    public IridiumShovel(IItemTier p_i48469_1_, float p_i48469_2_, float p_i48469_3_, Properties p_i48469_4_) {
        super(p_i48469_1_, p_i48469_2_, p_i48469_3_, p_i48469_4_);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
        //stack.getCapability(IridiumCapabilityManager.IRIDIUM_CAPABILITY).ifPresent(h -> {
        //    if (h.isIridiumMode()) {
        //        tooltip.add(new TranslationTextComponent("tooltip.stardewarmory.iridium_shovel_on"));
        //    } else {
        //        tooltip.add(new TranslationTextComponent("tooltip.stardewarmory.iridium_shovel_off"));
        //    }
        //});
        if (!Objects.isNull(world)) {
            tooltip.add(new StringTextComponent(new TranslationTextComponent("tooltip.stardewarmory.press").getString() +
                    KeybindSetup.iridiumKey.getKey().getName().replaceAll("key.keyboard.", "").toUpperCase() +
                    new TranslationTextComponent("tooltip.stardewarmory.toggle").getString()));
        }
    }



}