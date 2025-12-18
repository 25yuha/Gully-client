package lol.gully;

import lol.gully.features.FeatureManager;
import net.fabricmc.api.ClientModInitializer;

public class GullyClient implements ClientModInitializer {

	// I think its right?
	public static String MOD_ID = "gully";
	public static String version = "b1";

	public FeatureManager featureManager;


	@Override
	public void onInitializeClient() {

		this.featureManager = new FeatureManager();
	}
}