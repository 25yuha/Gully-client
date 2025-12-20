package lol.gully.features.features;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import lol.gully.GullyClient;
import lol.gully.features.Feature;
import lol.gully.features.FeatureCategory;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
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



            int topRectangleX = positionX + margin + boxSize + margin;
            int topRectangleY = positionY + margin;

            if(Minecraft.getInstance().options.keyUp.isDown()){
                drawContext.fill(topRectangleX, topRectangleY, topRectangleX + boxSize, topRectangleY + boxSize, 0xBFFFFFFF);
            } else {
                drawContext.fill(topRectangleX, topRectangleY, topRectangleX + boxSize, topRectangleY + boxSize, 0x80000000);
            }


            int leftRectangleX = positionX + margin;
            int leftRectangleY = positionY + margin + boxSize + margin;

            if(Minecraft.getInstance().options.keyLeft.isDown()){
                drawContext.fill(leftRectangleX, leftRectangleY, leftRectangleX + boxSize, leftRectangleY + boxSize, 0xBFFFFFFF);
            } else {
                drawContext.fill(leftRectangleX, leftRectangleY, leftRectangleX + boxSize, leftRectangleY + boxSize, 0x80000000);
            }


            int middleRectangleX = positionX + margin + boxSize + margin;
            int middleRectangleY = positionY + margin + boxSize + margin;

            if(Minecraft.getInstance().options.keyDown.isDown()){
                drawContext.fill(middleRectangleX, middleRectangleY, middleRectangleX + boxSize, middleRectangleY + boxSize, 0xBFFFFFFF);
            } else {
                drawContext.fill(middleRectangleX, middleRectangleY, middleRectangleX + boxSize, middleRectangleY + boxSize, 0x80000000);
            }


            int rightRectangleX = positionX + margin + boxSize + margin + boxSize + margin;
            int rightRectangleY = positionY + margin + boxSize + margin;


            if(Minecraft.getInstance().options.keyRight.isDown()){
                drawContext.fill(rightRectangleX, rightRectangleY, rightRectangleX + boxSize, rightRectangleY + boxSize, 0xBFFFFFFF);
            } else {
                drawContext.fill(rightRectangleX, rightRectangleY, rightRectangleX + boxSize, rightRectangleY + boxSize, 0x80000000);
            }


        };



    }

}
