package com.android.settings.validus;

import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceScreen;

import com.android.internal.logging.MetricsProto.MetricsEvent;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.R;

public class LEDsettings extends SettingsPreferenceFragment {

    private Preference mChargingLeds;
    private Preference mNotificationLeds;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.headsetoptions);

        PreferenceScreen prefSet = getPreferenceScreen();

    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.WOLVESDEN;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
