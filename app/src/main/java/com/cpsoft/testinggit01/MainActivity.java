package com.cpsoft.testinggit01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="GiTesting";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: Update 01");
        Log.e(TAG, "onCreate: update 02 @ 4:35 PM" );
        Log.e(TAG, "onCreate: update 02 @ 4:36 PM" );
    }
}
