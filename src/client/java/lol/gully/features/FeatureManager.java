package lol.gully.features;

import lol.gully.features.features.Keystrokes;
import lol.gully.features.features.Test;
import lol.gully.features.features.Watermark;

import java.util.ArrayList;

public class FeatureManager {
    private ArrayList<Feature> features = new ArrayList<>();

    public ArrayList<Feature> getFeatures() {
        return this.features;
    }

    public FeatureManager(){
        features.add(new Watermark());
        features.add(new Keystrokes());
        features.add(new Test());

        this.RegisterEvents();
    }

    public void RegisterEvents(){
        for (Feature f : this.features){
            f.EventRegister();
        }
    }

}
