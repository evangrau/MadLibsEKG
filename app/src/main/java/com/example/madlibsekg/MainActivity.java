package com.example.madlibsekg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
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
        intent.putExtra(EXTRA_MESSAGE, word1);
        intent.putExtra(EXTRA_MESSAGE, word2);
        intent.putExtra(EXTRA_MESSAGE, word3);
        intent.putExtra(EXTRA_MESSAGE, word4);
        intent.putExtra(EXTRA_MESSAGE, word5);
        intent.putExtra(EXTRA_MESSAGE, word6);
        intent.putExtra(EXTRA_MESSAGE, word7);
        intent.putExtra(EXTRA_MESSAGE, word8);
        startActivity(intent);
    }
}