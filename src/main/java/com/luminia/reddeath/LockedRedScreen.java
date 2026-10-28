
package com.luminia.reddeath;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public final class LockedRedScreen extends Screen {
    public LockedRedScreen() {
        super(Text.literal("You died"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.fill(0, 0, this.width, this.height, 0xFFB00000);
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
}
