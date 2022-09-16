package com.example.madlibsekg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSubmit = (Button) findViewById(R.id.button);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MadLibsActivity.class);
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
                if (word1.equals("") || word2.equals("") || word3.equals("") || word4.equals("") || word5.equals("") || word6.equals("") || word7.equals("") || word8.equals("")) {
                    Toast.makeText(getApplicationContext(), "All eight fields must be filled to proceed.", Toast.LENGTH_LONG).show();
                }
                else {
                    intent.putExtra("message1", word1);
                    intent.putExtra("message2", word2);
                    intent.putExtra("message3", word3);
                    intent.putExtra("message4", word4);
                    intent.putExtra("message5", word5);
                    intent.putExtra("message6", word6);
                    intent.putExtra("message7", word7);
                    intent.putExtra("message8", word8);
                    startActivity(intent);
                }
            }
        });
    }
}