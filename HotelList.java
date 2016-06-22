package com.example.yohannes.appbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.yohannes.appbutton.hotels.AbyssiniaHotel;
import com.example.yohannes.appbutton.hotels.AddisRegencyHotel;
import com.example.yohannes.appbutton.hotels.AgPalaceHotel;
import com.example.yohannes.appbutton.hotels.GetfamHotel;
import com.example.yohannes.appbutton.hotels.HiltonHotel;
import com.example.yohannes.appbutton.hotels.JupiterHotel;
import com.example.yohannes.appbutton.hotels.NazraHotel;
import com.example.yohannes.appbutton.hotels.RadissonBluHotel;
import com.example.yohannes.appbutton.hotels.SheratonAddisHotel;
import com.example.yohannes.appbutton.hotels.TheResidenceHotel;


public class HotelList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        listView = (ListView)findViewById(R.id.list);
        String[] FRUITS = new String[] { "Abyssinia Renaissance Hotel","Addis Regency Hotel", "Ag palace Hotel",
                "Getfam Hotel", "Hilton Hotel", "Jupiter Hotel", "Nazra Hotel", "Radisson Blu Hotel",
                "Sheraton Addis Hotel", "The Residence Hotel" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,FRUITS);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0){
                    Intent myintent = new Intent(view.getContext(), AbyssiniaHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1){
                    Intent myintent = new Intent(view.getContext(), AddisRegencyHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2){
                    Intent myintent = new Intent(view.getContext(), AgPalaceHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3){
                    Intent myintent = new Intent(view.getContext(), GetfamHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4){
                    Intent myintent = new Intent(view.getContext(), HiltonHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5){
                    Intent myintent = new Intent(view.getContext(), JupiterHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 6){
                    Intent myintent = new Intent(view.getContext(), NazraHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 7){
                    Intent myintent = new Intent(view.getContext(), RadissonBluHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 8){
                    Intent myintent = new Intent(view.getContext(), SheratonAddisHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 9){
                    Intent myintent = new Intent(view.getContext(), TheResidenceHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 10){
                    Intent myintent = new Intent(view.getContext(), AgPalaceHotel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 11){
                    Intent myintent = new Intent(view.getContext(), GetfamHotel.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });

    }

}