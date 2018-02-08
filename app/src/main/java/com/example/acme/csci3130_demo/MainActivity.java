package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView changeText = (TextView) findViewById(R.id.textMain);
        final EditText textBox = (EditText) findViewById(R.id.editText);
        final Button button = findViewBYId(R.id.button_id);

        button.setOnClickListener(new View.onClickListener(){
            public void onClick(View v){
                changeText.setText(textBox.getText);
            }
        });
    }
}
