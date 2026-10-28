package com.luminia.reddeath.mixin;

import com.luminia.reddeath.LockedRedScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public abstract class MinecraftClientMixin {
    @Inject(method = "setScreen", at = @At("HEAD"), cancellable = true)
    private void redDeathScreen$replaceDeathScreen(Screen screen, CallbackInfo ci) {
        if (screen instanceof DeathScreen) {
            ci.cancel();
            ((MinecraftClient) (Object) this).setScreen(new LockedRedScreen());
        }
    }
}
