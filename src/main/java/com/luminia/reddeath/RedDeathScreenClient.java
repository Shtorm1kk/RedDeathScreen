package com.luminia.reddeath;

import net.fabricmc.api.ClientModInitializer;

public final class RedDeathScreenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // The mixin intercepts the vanilla death screen on the client.
    }
}
