package lol.gully.features.features;

import lol.gully.GullyClient;
import lol.gully.features.Feature;
import lol.gully.features.FeatureCategory;
import lol.gully.utils.render.ColorUtil;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

public class Watermark extends Feature {
    public Watermark() {
        super("Watermark", FeatureCategory.UTILITY);
    }

    @Override
    public void EventRegister() {
        HudElementRegistry.addLast(ResourceLocation.fromNamespaceAndPath(GullyClient.MOD_ID, "last_element"), hudLayer());
    }

    private HudElement hudLayer(){
        return (drawContext, tickCounter) -> {
            drawContext.drawString(Minecraft.getInstance().font, "Gully client", 10, 10, ColorUtil.getRainboxColor(1), true);
        };
    }

}
