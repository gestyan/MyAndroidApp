package com.example.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        Toast t = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        t.show();
    }

    public void countUp(View view){}

    public void countReset(View view){}
}