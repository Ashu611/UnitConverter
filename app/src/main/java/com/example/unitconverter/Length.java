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
import java.util.Hashtable;
import java.util.List;

public class Length extends AppCompatActivity {
    Spinner spin1,spin2;
    EditText edt1;
    TextView txt1;
    Button converter1;
    String select,select2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        spin1=(Spinner)findViewById(R.id.spinner);
        spin2=(Spinner)findViewById(R.id.spinner2);
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

        ArrayAdapter<String> dataadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list1);
        ArrayAdapter<String> dataadapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,list2);

        spin1.setAdapter(dataadapter);
        spin2.setAdapter(dataadapter2);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                select=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                select2=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        converter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String enum1 = edt1.getText().toString();
                final Double Num1 = Double.parseDouble(enum1);

                String key = select +" -> "+ select2;
                Hashtable<String, Double> ht = new Hashtable<String, Double>(100);

                ht.put("Foot -> Foot",  1d);
                ht.put("Foot -> Inch", 12d);
                ht.put("Foot -> Kilometer", 0.000305);
                ht.put("Foot -> Meter", 0.3048);
                ht.put("Foot -> Mile", 0.000189);
                ht.put("Foot -> Micrometer", 304800.00);
                ht.put("Foot -> Yard", 0.34);
                ht.put("Foot -> Milimeter", 304.8);

                ht.put("Inch -> Foot",  0.0833);
                ht.put("Inch -> Inch", 1d);
                ht.put("Inch -> Kilometer", 0.000025);
                ht.put("Inch -> Meter", 0.025400);
                ht.put("Inch -> Mile", 0.000016);
                ht.put("Inch -> Micrometer", 25400.00);
                ht.put("Inch -> Yard", 0.027778);
                ht.put("Inch -> Milimeter", 25.400);

                ht.put("Kilometer -> Foot", 3280.8399);
                ht.put("Kilometer -> Inch", 39370.079);
                ht.put("Kilometer -> Kilometer", 1d);
                ht.put("Kilometer -> Meter",1000d);
                ht.put("Kilometer -> Mile", 0.621);
                ht.put("Kilometer -> Micrometer", 1000000000d);
                ht.put("Kilometer -> Yard", 1093.6133);
                ht.put("Kilometer -> Milimeter", 1000000d);

                ht.put("Meter -> Foot", 3.2808);
                ht.put("Meter -> Inch", 39.3701);
                ht.put("Meter -> Kilometer", 0.001);
                ht.put("Meter -> Meter",1d);
                ht.put("Meter -> Mile",0.000621);
                ht.put("Meter -> Micrometer",1000000d);
                ht.put("Meter -> Yard",1.094);
                ht.put("Meter -> Milimeter",1000d);

                ht.put("Mile -> Foot", 5280.00);
                ht.put("Mile -> Inch", 63360.00);
                ht.put("Mile -> Kilometer", 1.6093);
                ht.put("Mile -> Meter",1609.34);
                ht.put("Mile -> Mile",1d);
                ht.put("Mile -> Micrometer",1609344000d);
                ht.put("Mile -> Yard",1760.00);
                ht.put("Mile -> Milimeter",1609344.00);

                ht.put("Micrometer -> Foot", 0.000003);
                ht.put("Micrometer -> Inch", 0.000039);
                ht.put("Micrometer -> Kilometer", 0.999999999999999e-10);
                ht.put("Micrometer -> Meter",0.000001);
                ht.put("Micrometer -> Mile",0.213688756330196e-10);
                ht.put("Micrometer -> Micrometer",1d);
                ht.put("Micrometer -> Yard",0.0000011);
                ht.put("Micrometer -> Milimeter",0.001);

                ht.put("Yard -> Foot", 3d);
                ht.put("Yard -> Inch", 36.00);
                ht.put("Yard -> Kilometer", 0.0009144);
                ht.put("Yard -> Meter",0.9144);
                ht.put("Yard -> Mile",0.000568);
                ht.put("Yard -> Micrometer",914400d);
                ht.put("Yard -> Yard",1d);
                ht.put("Yard -> Milimeter",914.4);

                ht.put("Milimeter -> Foot", 0.0033);
                ht.put("Milimeter -> Inch", 0.0394);
                ht.put("Milimeter -> Kilometer", 0.000001);
                ht.put("Milimeter -> Meter",0.001);
                ht.put("Milimeter -> Mile",0.000001);
                ht.put("Milimeter -> Micrometer",1000.00);
                ht.put("Milimeter -> Yard",0.001094);
                ht.put("Milimeter -> Milimeter",1d);

                double  multiplier = ht.get(key);
                double answer = Num1 * multiplier;
                String enum2 = Double.toString(answer);
                txt1.setText(enum2);
            }
        });


    }
}
