package com.aixcoder.extension;

import org.eclipse.jface.preference.BooleanFieldEditor;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.aixcoder.core.API;
import com.aixcoder.core.PredictCache;
import com.aixcoder.lib.Preference;
import com.aixcoder.i18n.EN;
import com.aixcoder.i18n.Localization;
import com.aixcoder.i18n.ZH;

import static com.aixcoder.i18n.Localization.R;

public class AiXPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	private IPropertyChangeListener onPropertyChange;

	public AiXPreferencePage() {
		super(GRID);
	}

	public void createFieldEditors() {
		new AiXPreInitializer().initializeDefaultPreferences();
		Composite parent = getFieldEditorParent();
		addField(new BooleanFieldEditor(Preference.ACTIVE, R(Localization.enableAiXCoder), parent));
		addField(new StringFieldEditor(Preference.ENDPOINT, R(Localization.serverURL), parent));
		addField(new StringFieldEditor(Preference.SEARCH_ENDPOINT, R(Localization.searchURL), parent));
		addField(new BooleanFieldEditor(Preference.AUTO_IMPORT, R(Localization.autoImportClasses), parent));
		addField(new BooleanFieldEditor(Preference.SORT_ONLY, R(Localization.sortOnly), parent));
		addField(new BooleanFieldEditor(Preference.ALLOW_TELEMETRY, R(Localization.allowTelemetry), parent));
		addField(new ComboFieldEditor(Preference.LANGUAGE, R(Localization.language),
				new String[][] { { "English", EN.id }, { "简体中文(Chinese Simplified)", ZH.id } }, parent));

		String[][] entryNamesAndValues = getModels();
		addField(new ComboFieldEditor(Preference.MODEL, R(Localization.model), entryNamesAndValues, parent));
		addField(new StringFieldEditor(Preference.PARAMS, R(Localization.additionalParameters), parent));
	}

	private String[][] getModels() {
		String[][] entryNamesAndValues;
		try {
			String[] models = API.getModels();
			entryNamesAndValues = new String[models.length][2];
			for (int i = 0; i < models.length; i++) {
				entryNamesAndValues[i] = new String[] { models[i], models[i] };
			}
		} catch (Exception e) {
			entryNamesAndValues = new String[0][2];
		}
		return entryNamesAndValues;
	}

	@Override
	public void init(IWorkbench workbench) {
		// second parameter is typically the plug-in id
		setPreferenceStore(Preference.preferenceManager);
		onPropertyChange = new IPropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent event) {
				PredictCache.getInstance().cache.clear();
			}
		};
		getPreferenceStore().addPropertyChangeListener(onPropertyChange);
		setDescription(R(Localization.description));
	}

	public void dispose() {
		getPreferenceStore().removePropertyChangeListener(onPropertyChange);
		super.dispose();
	}
}
