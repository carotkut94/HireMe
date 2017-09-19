package com.death.hireme;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    Button startResume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        startResume = findViewById(R.id.startResume);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"bridge.ttf");
        startResume.setTypeface(typeface);
    }
}
