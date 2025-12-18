package lol.gully.features.features;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import lol.gully.GullyClient;
import lol.gully.features.Feature;
import lol.gully.features.FeatureCategory;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

public class Keystrokes extends Feature {

    int positionX = 10;
    int positionY = 10 + 5 + 5;
    int margin = 5;
    int boxSize = 25;

    public Keystrokes() {
        super("Keystrokes", FeatureCategory.UTILITY);
    }

    @Override
    public void EventRegister() {
        HudElementRegistry.addLast(ResourceLocation.fromNamespaceAndPath(GullyClient.MOD_ID, "last_element2"), hudLayer());
    }

    private HudElement hudLayer(){
        return (drawContext, tickCounter) -> {


            // W
            int topRectangleX = positionX + margin + boxSize + margin;
            int topRectangleY = positionY + margin;
            int topRectangleWidth = boxSize;
            int topRectangleHeight = boxSize;
            // x1,y2, x2,y2,color

            drawContext.fill(topRectangleX, topRectangleY, topRectangleX + topRectangleWidth, topRectangleY + topRectangleHeight, 0xFFFFFFFF);

            // A

            int leftRectangleX = positionX + margin;
            int leftRectangleY = positionY + margin + boxSize + margin;
            int leftRectangleWidth = boxSize;
            int leftRectangleHeight = boxSize;
            // x1,y2, x2,y2,color

            if(Minecraft.getInstance().options.keyLeft.isDown()){
                System.out.println("LEFT KEY PRESSED");
            }

            drawContext.fill(leftRectangleX, leftRectangleY, leftRectangleX + leftRectangleWidth, leftRectangleY + leftRectangleHeight, 0xFF000000);


            // S

            int middleRectangleX = positionX + margin + boxSize + margin;
            int middleRectangleY = positionY + margin + boxSize + margin;
            int middleRectangleWidth = boxSize;
            int middleRectangleHeight = boxSize;
            // x1,y2, x2,y2,color

            drawContext.fill(middleRectangleX, middleRectangleY, middleRectangleX + middleRectangleWidth, middleRectangleY + middleRectangleHeight, 0xFF000000);

            // D

            int rightRectangleX = positionX + margin + boxSize + margin + boxSize + margin;
            int rightRectangleY = positionY + margin + boxSize + margin;
            int rightRectangleWidth = boxSize;
            int rightRectangleHeight = boxSize;
            // x1,y2, x2,y2,color

            drawContext.fill(rightRectangleX, rightRectangleY, rightRectangleX + rightRectangleWidth, rightRectangleY + rightRectangleHeight, 0xFF000000);


        };
    }

}
