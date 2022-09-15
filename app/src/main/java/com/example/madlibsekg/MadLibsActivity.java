package com.example.madlibsekg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);

        Intent intent = getIntent();
        String word1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById();
    }
}