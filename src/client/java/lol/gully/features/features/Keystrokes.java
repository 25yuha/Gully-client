package lol.gully.features.features;

import lol.gully.GullyClient;
import lol.gully.features.Feature;
import lol.gully.features.FeatureCategory;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

public class Keystrokes extends Feature {

    int positionX = 10;
    int positionY = Minecraft.getInstance().font.lineHeight + 5;
    int margin = 10;

    public Keystrokes() {
        super("Keystrokes", FeatureCategory.UTILITY);
    }

    @Override
    public void EventRegister() {
        HudElementRegistry.addLast(ResourceLocation.fromNamespaceAndPath(GullyClient.MOD_ID, "last_element"), hudLayer());
    }

    private HudElement hudLayer(){
        return (drawContext, tickCounter) -> {

            int rectangleX = positionX + margin;
            int rectangleY = positionY + margin;
            int rectangleWidth = 50;
            int rectangleHeight = 50;
            // x1,y2, x2,y2,color

            //drawContext.fill(rectangleX, rectangleY, rectangleX + rectangleWidth, rectangleY + rectangleHeight, 0xFF0000FF);
        };
    }

}
