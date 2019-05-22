package com.benny.openlauncher.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.benny.openlauncher.util.AppSettings;

public class ModeActivity extends AppCompatActivity {

    protected AppSettings _appSettings;
    private String _currentMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        _appSettings = AppSettings.get();
        _currentMode = _appSettings.getMode();
        if (_appSettings.getMode().equals("0")) {

        } else if (_appSettings.getMode().equals("1")) {

        } else if (_appSettings.getMode().equals("2")) {

        } else {

        }

        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (!_appSettings.getTheme().equals(_currentMode)) {
            restart();
        }
    }

    protected void restart() {
        Intent intent = new Intent(this, getClass());
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        overridePendingTransition(0, 0);
        startActivity(intent);
    }
}
