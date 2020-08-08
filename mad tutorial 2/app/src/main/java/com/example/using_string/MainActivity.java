package com.example.using_string;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView msg2 = findViewById(R.id.tv_msg2);
        msg2.setText(R.string.msg2);

        Log.i(tag: "LifeCycle", msg: "onCreate is  called");
    }

    protected void onStart(){
        super.onStart();

        Log.i(tag: "LifeCycle", msg: "onStart is  called");
    }

    protected void onResume(){
        super.onResume();

        Log.i(tag: "LifeCycle", msg: "onResume is  called");
    }

    protected void onPause(){
        super.onPause();

        Log.i(tag: "LifeCycle", msg: "onPause is  called");
    }


    protected void onStop() {
        super.onStop();

        Log.i(tag: "LifeCycle", msg: "onStop is  called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(tag: "LifeCycle", msg: "onDestroy is  called");
    }
}