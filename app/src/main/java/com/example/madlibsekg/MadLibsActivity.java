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
        String  word1 = intent.getStringExtra("message1"),
                word2 = intent.getStringExtra("message2"),
                word3 = intent.getStringExtra("message3"),
                word4 = intent.getStringExtra("message4"),
                word5 = intent.getStringExtra("message5"),
                word6 = intent.getStringExtra("message6"),
                word7 = intent.getStringExtra("message7"),
                word8 = intent.getStringExtra("message8");

        TextView    textView1 = findViewById(R.id.textView3),
                    textView2 = findViewById(R.id.textView4),
                    textView3 = findViewById(R.id.textView5),
                    textView4 = findViewById(R.id.textView6),
                    textView5 = findViewById(R.id.textView7),
                    textView6 = findViewById(R.id.textView8),
                    textView7 = findViewById(R.id.textView9),
                    textView8 = findViewById(R.id.textView10);
        textView1.setText(word1);
        textView2.setText(word2);
        textView3.setText(word3);
        textView4.setText(word4);
        textView5.setText(word5);
        textView6.setText(word6);
        textView7.setText(word7);
        textView8.setText(word8);
    }
}