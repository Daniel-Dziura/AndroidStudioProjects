package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate tag", "onCreate log");
    }
    @Override protected void onStart() {
        super.onStart();
        Log.i("onStart tag", "onStart log");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.i("onResume tag", "onResume log");
    }

    @Override protected void onPause() {
        Log.i("onPause tag", "onPause log");
        super.onPause();
    }

    @Override protected void onStop() {
        Log.i("onStop tag", "onStop log");
        super.onStop();
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.i("onRestart tag", "onRestart log");
    }

    @Override protected void onDestroy() {
        Log.i("onDestroy tag", "onDestroy log");
        super.onDestroy();
    }

}