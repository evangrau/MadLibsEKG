package com.example.madlibsekg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE1 = "";
    public static final String MESSAGE2 = "";
    public static final String MESSAGE3 = "";
    public static final String MESSAGE4 = "";
    public static final String MESSAGE5 = "";
    public static final String MESSAGE6 = "";
    public static final String MESSAGE7 = "";
    public static final String MESSAGE8 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goNext(View view) {
        Intent intent = new Intent(this, MadLibsActivity.class);
        // ugly variable declaration
        EditText    editText1 = (EditText) findViewById(R.id.editTextTextPersonName1),
                    editText2 = (EditText) findViewById(R.id.editTextTextPersonName2),
                    editText3 = (EditText) findViewById(R.id.editTextTextPersonName3),
                    editText4 = (EditText) findViewById(R.id.editTextTextPersonName4),
                    editText5 = (EditText) findViewById(R.id.editTextTextPersonName5),
                    editText6 = (EditText) findViewById(R.id.editTextTextPersonName6),
                    editText7 = (EditText) findViewById(R.id.editTextTextPersonName7),
                    editText8 = (EditText) findViewById(R.id.editTextTextPersonName8);
        String      word1 = editText1.getText().toString(),
                    word2 = editText2.getText().toString(),
                    word3 = editText3.getText().toString(),
                    word4 = editText4.getText().toString(),
                    word5 = editText5.getText().toString(),
                    word6 = editText6.getText().toString(),
                    word7 = editText7.getText().toString(),
                    word8 = editText8.getText().toString();
        intent.putExtra(MESSAGE1, word1);
        intent.putExtra(MESSAGE2, word2);
        intent.putExtra(MESSAGE3, word3);
        intent.putExtra(MESSAGE4, word4);
        intent.putExtra(MESSAGE5, word5);
        intent.putExtra(MESSAGE6, word6);
        intent.putExtra(MESSAGE7, word7);
        intent.putExtra(MESSAGE8, word8);
        startActivity(intent);
    }
}