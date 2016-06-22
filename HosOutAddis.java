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

public class HosOutAddis extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        listView = (ListView)findViewById(R.id.list);
        String[] FRUITS = new String[] { "Aster Primary Hospital","Kibru Primary Hospital", "Delt General Hospital",
                "Felegehiwot Referral Hospital"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,FRUITS);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0){
                    Intent myintent = new Intent(view.getContext(), AsterPrimaryHospital.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1){
                    Intent myintent = new Intent(view.getContext(), KibruPrimaryHospital.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2){
                    Intent myintent = new Intent(view.getContext(), DeltGeneralHospital.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3){
                    Intent myintent = new Intent(view.getContext(), FelegehiwotReferralHospital.class);
                    startActivityForResult(myintent, 0);
                }


            }
        });

    }

}