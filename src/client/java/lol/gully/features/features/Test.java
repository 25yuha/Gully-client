package lol.gully.features.features;

import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import lol.gully.GullyClient;
import lol.gully.features.Feature;
import lol.gully.features.FeatureCategory;
import lol.gully.utils.render.ColorUtil;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.ResourceLocation;
import org.joml.Matrix4f;

public class Test extends Feature {
    public Test() {
        super("Test", FeatureCategory.DEVELOPER);
    }

    private static final ResourceLocation blur_image = ResourceLocation.fromNamespaceAndPath(GullyClient.MOD_ID,"textures/gui/blur3.png");


    @Override
    public void EventRegister() {
        HudElementRegistry.addLast(ResourceLocation.fromNamespaceAndPath(GullyClient.MOD_ID, "last_element3"), hudLayer());
    }

    private HudElement hudLayer(){
        return (drawContext, tickCounter) -> {
            int offset = 20;

            int i = drawContext.guiWidth()-Minecraft.getInstance().font.width("FPS " + String.valueOf(Minecraft.getInstance().getFps()))-(offset/2)-5;
            int j = 7;
            int k = drawContext.guiWidth()-(offset/2)+5;
            int l = 8;

            drawContext.fill(drawContext.guiWidth()-Minecraft.getInstance().font.width("FPS " + String.valueOf(Minecraft.getInstance().getFps()))-(offset/2)-5, 7, drawContext.guiWidth()-(offset/2)+5, 20, 0x80000000);
            //drawContext.fill(drawContext.guiWidth()-Minecraft.getInstance().font.width("FPS " + String.valueOf(Minecraft.getInstance().getFps()))-(offset/2)-5, 7, drawContext.guiWidth()-(offset/2)+5, 8, ColorUtil.getRainboxColor(2));
            /*
            //drawContext.enableScissor(i, j, k, l);
            drawContext.enableScissor(i, j, k, l);
            //drawContext.fillGradient(i, j, k, l, ColorUtil.getRainboxColor(2),ColorUtil.getRainboxColor(100));
            drawContext.fillGradient(i, j, k, l, ColorUtil.getRainboxColor(2),ColorUtil.getRainboxColor(100));

            drawContext.enableScissor(j,i, l,k);
            drawContext.fillGradient(j,i, l,k, ColorUtil.getRainboxColor(2),ColorUtil.getRainboxColor(100));

            drawContext.disableScissor();
            */
            drawContext.drawString(Minecraft.getInstance().font, String.valueOf("FPS " + Minecraft.getInstance().getFps()), drawContext.guiWidth()-Minecraft.getInstance().font.width("FPS " + String.valueOf(Minecraft.getInstance().getFps()))-10, 10, ColorUtil.getRainboxColor(5), true);


        };
    }

}
