package com.aixcoder.extension;

import java.io.IOException;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import com.aixcoder.lib.Preference;

public class AiXPreInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		ScopedPreferenceStore scopedPreferenceStore = Preference.preferenceManager;
		if (!scopedPreferenceStore.getBoolean("INITIALIZED")) {
			scopedPreferenceStore.setDefault(Preference.ACTIVE, true);
			scopedPreferenceStore.setDefault(Preference.ENDPOINT, "https://api.aixcoder.com/");
			scopedPreferenceStore.setDefault(Preference.SEARCH_ENDPOINT, "https://search.aixcoder.com/");
			scopedPreferenceStore.setDefault(Preference.MODEL, "java(Java)");
			scopedPreferenceStore.setDefault(Preference.ALLOW_TELEMETRY, true);
			scopedPreferenceStore.setDefault("INITIALIZED", true);
			scopedPreferenceStore.setDefault(Preference.PARAMS, "");
			Preference.getUUID();
			try {
				scopedPreferenceStore.save();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
