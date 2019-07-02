package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1=(ListView)findViewById(R.id.listview_units);
        String[] units = {"Area","Length","Volume","Weight","Temperature"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,units);
        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String Clicked_value = (String)list1.getItemAtPosition(i);

                if(Clicked_value=="Area"){
                    Intent Area = new Intent(getApplicationContext(),Area.class);
                    startActivity(Area);

                }
                else if(Clicked_value=="Length"){
                    Intent Length = new Intent(getApplicationContext(),Length.class);
                    startActivity(Length);
                }
                else if(Clicked_value=="Volume"){
                    Intent Volume = new Intent(getApplicationContext(),Volume.class);
                    startActivity(Volume);
                }
                else if(Clicked_value=="Weight"){
                    Intent Weight = new Intent(getApplicationContext(),Weight.class);
                    startActivity(Weight);
                }
                else if(Clicked_value=="Temperature"){
                    Intent Temperature = new Intent(getApplicationContext(),Temperature.class);
                    startActivity(Temperature);
                }
            }
        });

    }
}
