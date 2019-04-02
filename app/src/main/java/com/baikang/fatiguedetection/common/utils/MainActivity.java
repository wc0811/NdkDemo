package com.baikang.fatiguedetection.common.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int iX = 1;
        int iY = 1;
        int iZ = 1;
        int iWX = 2;
        int iWY = 2;
        int iWZ = 2;
        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(String.valueOf(HeadMovementUtils.getResult(iX, iY, iZ, iWX, iWY, iWZ)));
    }

}
