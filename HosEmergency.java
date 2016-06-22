package com.example.yohannes.appbutton.hospitals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.yohannes.appbutton.R;
import com.example.yohannes.appbutton.hotels.AddisRegencyHotel;
import com.example.yohannes.appbutton.hotels.AgPalaceHotel;
import com.example.yohannes.appbutton.hotels.GetfamHotel;
import com.example.yohannes.appbutton.hotels.HiltonHotel;
import com.example.yohannes.appbutton.hotels.JupiterHotel;
import com.example.yohannes.appbutton.hotels.NazraHotel;
import com.example.yohannes.appbutton.hotels.RadissonBluHotel;
import com.example.yohannes.appbutton.hotels.SheratonAddisHotel;
import com.example.yohannes.appbutton.hotels.TheResidenceHotel;

public class HosEmergency extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        listView = (ListView)findViewById(R.id.list);
        String[] FRUITS = new String[] { "Tebita Ambulance Pre-Hospital Emergency" +
                "Medical Service","Ethiopian Red Cross Society"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,FRUITS);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0){
                    Intent myintent = new Intent(view.getContext(), TAPHEMedicaService.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1){
                    Intent myintent = new Intent(view.getContext(), EthiopianRedCrossSociety.class);
                    startActivityForResult(myintent, 0);
                }

            }
        });

    }

}