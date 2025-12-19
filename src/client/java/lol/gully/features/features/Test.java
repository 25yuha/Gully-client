package lol.gully.features.features;

import lol.gully.GullyClient;
import lol.gully.features.Feature;
import lol.gully.features.FeatureCategory;
import lol.gully.utils.render.ColorUtil;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

public class Test extends Feature {
    public Test() {
        super("Test", FeatureCategory.DEVELOPER);
    }

    @Override
    public void EventRegister() {
        HudElementRegistry.addLast(ResourceLocation.fromNamespaceAndPath(GullyClient.MOD_ID, "last_element3"), hudLayer());
    }

    private HudElement hudLayer(){
        return (drawContext, tickCounter) -> {

        };
    }

}
