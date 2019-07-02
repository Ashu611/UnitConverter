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

public class Area extends AppCompatActivity {

    Spinner spin1,spin2;
    EditText edt1;
    TextView txt1;
    Button converter1;
    String select,select2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    spin1=(Spinner)findViewById(R.id.spinner);
    spin2=(Spinner)findViewById(R.id.spinner2);
    edt1=(EditText)findViewById(R.id.editText);
    txt1=(TextView)findViewById(R.id.textView4);
    converter1=(Button)findViewById(R.id.button);

    final List<String> list1= new ArrayList<String>();
    final List<String> list2= new ArrayList<String>();

        list1.add("Square Kilometre");
        list1.add("Square Meter");
        list1.add("Square Centimeter");
        list1.add("Square Mile");
        list1.add("Square Foot");
        list1.add("Square Milimeter");
        list1.add("Acre");

        list2.add("Square Kilometre");
        list2.add("Square Meter");
        list2.add("Square Centimeter");
        list2.add("Square Mile");
        list2.add("Square Foot");
        list2.add("Square Milimeter");
        list2.add("Acre");

        ArrayAdapter<String> dataadapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, list1);
        ArrayAdapter<String> dataadapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, list2);


        spin1.setAdapter(dataadapter1);
        spin2.setAdapter(dataadapter2);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                select = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                select2 = adapterView.getItemAtPosition(i).toString();
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

                ht.put("Square Kilometre -> Square Kilometre",1d);
                ht.put("Square Kilometre -> Square Meter",1000000d);
                ht.put("Square Kilometre -> Square Centimeter",10000000000d);
                ht.put("Square Kilometre -> Square Mile",0.386);
                ht.put("Square Kilometre -> Square Foot",10763910.417);
                ht.put("Square Kilometre -> Square Milimeter",1000000000000d);
                ht.put("Square Kilometre -> Acre",247.11);

                ht.put("Square Meter -> Square Kilometre",0.000001);
                ht.put("Square Meter -> Square Meter",1d);
                ht.put("Square Meter -> Square Centimeter",10000d);
                ht.put("Square Meter -> Square Mile",3.86);
                ht.put("Square Meter -> Square Foot",10.76);
                ht.put("Square Meter -> Square Milimeter", 1000000d);
                ht.put("Square Meter -> Acre",0.00024711);

                ht.put("Square Centimeter -> Square Kilometre", 1.E-10);
                ht.put("Square Centimeter -> Square Meter", 0.0001);
                ht.put("Square Centimeter -> Square Centimeter", 1d);
                ht.put("Square Centimeter -> Square Mile", 3.861);
                ht.put("Square Centimeter -> Square Foot", 0.001076);
                ht.put("Square Centimeter -> Square Milimeter", 100d);
                ht.put("Square Centimeter -> Acre", 2.4711);

                ht.put("Square Mile -> Square Kilometre", 2.59);
                ht.put("Square Mile -> Square Meter", 2589990d);
                ht.put("Square Mile -> Square Centimeter", 25899900000d);
                ht.put("Square Mile -> Square Mile", 1d);
                ht.put("Square Mile -> Square Foot", 27878432.34);
                ht.put("Square Mile -> Square Milimeter", 2589990000000d);
                ht.put("Square Mile -> Acre", 640d);

                ht.put("Square Foot -> Square Kilometre", 9.2903e-8);
                ht.put("Square Foot -> Square Meter", 0.092903);
                ht.put("Square Foot -> Square Centimeter", 929.03);
                ht.put("Square Foot -> Square Mile", 3.588);
                ht.put("Square Foot -> Square Foot", 1d);
                ht.put("Square Foot -> Square Milimeter", 92903d);
                ht.put("Square Foot -> Acre", 0.00002296);

                ht.put("Square Milimeter -> Square Kilometre", 1e-12);
                ht.put("Square Milimeter -> Square Meter", 0.000001);
                ht.put("Square Milimeter -> Square Centimeter", 0.00999);
                ht.put("Square Milimeter -> Square Mile", 3.861);
                ht.put("Square Milimeter -> Square Foot", 0.000010763915051182416);
                ht.put("Square Milimeter -> Square Milimeter", 1d);
                ht.put("Square Milimeter -> Acre", 2.4711);

                ht.put("Acre -> Square Kilometre", 0.00405);
                ht.put("Acre -> Square Meter", 4046.86);
                ht.put("Acre -> Square Centimeter", 40468600d);
                ht.put("Acre -> Square Mile", 0.00156);
                ht.put("Acre -> Square Foot", 43560.06);
                ht.put("Acre -> Square Milimeter", 4046860000d);
                ht.put("Acre -> Acre", 1d);

                double multiplier = ht.get(key);
                double answer = Num1 * multiplier;
                String enum2 = Double.toString(answer);
                txt1.setText(enum2);
            }
        });

    }
}
