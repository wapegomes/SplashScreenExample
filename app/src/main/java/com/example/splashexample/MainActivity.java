package com.example.splashexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

    public String sharedPreferencesFile = "MY_SHARED_PREFERENCES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = getSharedPreferences(sharedPreferencesFile,
                MODE_PRIVATE);
        boolean visited = prefs.getBoolean(getString(R.string.visited_splash), false);
        if (!visited) {
            Intent splash = new Intent(MainActivity.this, SplashScreenActivity.class);
            startActivity(splash);
            finish();
        }
        setContentView(R.layout.activity_main);
    }
}
