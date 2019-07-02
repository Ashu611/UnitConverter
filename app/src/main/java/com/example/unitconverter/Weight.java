package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Weight extends AppCompatActivity {
    Spinner spin1,spin2;
    EditText edt1;
    TextView txt1;
    Button converter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        spin1=(Spinner)findViewById(R.id.spinner);
        spin2=(Spinner)findViewById(R.id.spinner);
        edt1=(EditText)findViewById(R.id.editText);
        txt1=(TextView)findViewById(R.id.textView4);
        converter1=(Button)findViewById(R.id.button);
    }
}
