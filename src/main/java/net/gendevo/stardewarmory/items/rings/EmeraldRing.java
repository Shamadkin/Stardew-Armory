package net.gendevo.stardewarmory.items.rings;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import javax.annotation.Nullable;
import java.util.List;

public class EmeraldRing extends Item implements ICurioItem {

    public EmeraldRing(Item.Properties properties) {
        super(properties);
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity living, ItemStack stack) {
        if (living.tickCount % 40 == 0) {
            living.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 80, 0, true, false));
        }
    }

    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack) {
        return true;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack pStack, @Nullable net.minecraft.world.level.Level pLevel, List<Component> tooltip, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, tooltip, pIsAdvanced);
        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            tooltip.add(new TranslatableComponent("tooltip.stardewarmory.emerald_ring"));
        } else {
            tooltip.add(new TranslatableComponent("tooltip.stardewarmory.hold_shift"));
        }
    }


}
