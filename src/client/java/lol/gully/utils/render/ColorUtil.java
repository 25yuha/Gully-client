package lol.gully.utils.render;

import java.awt.*;

public class ColorUtil {
    //ty chatgpt
    public static int getRainboxColor(float offset){
        float time = (System.currentTimeMillis() % 5000) / 5000f;
        float hue = (time + offset) % 1f;
        return Color.HSBtoRGB(hue, 1f, 1f);
    }
}
