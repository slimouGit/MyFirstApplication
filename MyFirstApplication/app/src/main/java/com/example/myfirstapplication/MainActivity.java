package com.example.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // These are the global variables
    EditText editText;
    TextView result;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText  = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.result);
        buttonSubmit = (Button) findViewById(R.id.button);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                result.setText(input);

            }
        });
    }
}