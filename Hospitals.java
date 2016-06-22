package com.example.yohannes.appbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.yohannes.appbutton.hospitals.HosClinicList;
import com.example.yohannes.appbutton.hospitals.HosEmergency;
import com.example.yohannes.appbutton.hospitals.HosOutAddis;
import com.example.yohannes.appbutton.hospitals.HospitalList;
import com.example.yohannes.appbutton.hotels.AddisRegencyHotel;
import com.example.yohannes.appbutton.hotels.AgPalaceHotel;
import com.example.yohannes.appbutton.hotels.GetfamHotel;
import com.example.yohannes.appbutton.hotels.HiltonHotel;

public class Hospitals extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        listView = (ListView)findViewById(R.id.list);
        String[] FRUITS = new String[] { "Hospitals in Addis","Emergency Care Givers", "Specialized Clinics",
                "Hospitals out of Addis", };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,FRUITS);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0){
                    Intent myintent = new Intent(view.getContext(), HospitalList.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1){
                    Intent myintent = new Intent(view.getContext(), HosEmergency.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2){
                    Intent myintent = new Intent(view.getContext(), HosClinicList.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3){
                    Intent myintent = new Intent(view.getContext(), HosOutAddis.class);
                    startActivityForResult(myintent, 0);
                }


            }
        });

    }

}