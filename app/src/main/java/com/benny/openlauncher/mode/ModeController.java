package com.benny.openlauncher.mode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.benny.openlauncher.util.AppSettings;

public class ModeController extends AppCompatActivity {

    public ModeNormal _modNormal;
    public ModeStudy _modStudy;
    public ModeMusic _modMusic;
    public ModeGame _modGame;

    protected AppSettings _appSettings;
    private String _currentMode;

    public static class Mode {
        public static final String NORMAL = "0";
        public static final String STUDY = "1";
        public static final String MUSIC = "2";
        public static final String GAME = "3";

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        _appSettings = AppSettings.get();
        _currentMode = _appSettings.getMode();
        switch (_currentMode) {
            case Mode.STUDY:
                // return _modStudy;
            case Mode.MUSIC:
                // return _modMusic;
            case Mode.GAME:
                // return _modGame;
            case Mode.NORMAL:
            default:
                // return _modNormal;
        }

        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (_appSettings.getMode().equals(_currentMode)) {
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
