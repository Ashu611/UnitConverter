package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Length extends AppCompatActivity {
    Spinner spin1,spin2;
    EditText edt1;
    TextView txt1;
    Button converter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        spin1=(Spinner)findViewById(R.id.spinner);
        spin2=(Spinner)findViewById(R.id.spinner);
        edt1=(EditText)findViewById(R.id.editText);
        txt1=(TextView)findViewById(R.id.textView4);
        converter1=(Button)findViewById(R.id.button);

        final List<String> list1= new ArrayList<String>();
        final List<String> list2= new ArrayList<String>();

        list1.add("Foot");
        list1.add("Inch");
        list1.add("Kilometer");
        list1.add("Meter");
        list1.add("Mile");
        list1.add("Micrometer");
        list1.add("Yard");
        list1.add("Milimeter");

        list2.add("Foot");
        list2.add("Inch");
        list2.add("Kilometer");
        list2.add("Meter");
        list2.add("Mile");
        list2.add("Micrometer");
        list2.add("Yard");
        list2.add("Milimeter");

        ArrayAdapter<String> dataadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<String> dataadapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);

        spin1.setAdapter(dataadapter);
        spin2.setAdapter(dataadapter2);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
