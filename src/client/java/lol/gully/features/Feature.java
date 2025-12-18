package lol.gully.features;

public abstract class Feature {
    public String name;
    public FeatureCategory featureCategory;

    public Feature(String name, FeatureCategory featureCategory) {
        this.name = name;
        this.featureCategory = featureCategory;
    }

    public void EventRegister() {

    }

}
