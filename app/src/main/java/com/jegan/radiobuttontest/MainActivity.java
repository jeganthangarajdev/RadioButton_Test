package com.jegan.radiobuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton,radioButton2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.RadioGroup) ;
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int selected=radioGroup.getCheckedRadioButtonId();
               radioButton=(RadioButton)findViewById(selected);
               if(selected==-1)
               {
                   Toast.makeText(MainActivity.this," select someone",Toast.LENGTH_LONG).show();
               }
               else
               {
                  String value= radioButton.getText().toString();
                  Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();
               }
            }
        });

    }
}
