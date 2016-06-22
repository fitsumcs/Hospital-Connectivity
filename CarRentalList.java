package com.example.yohannes.appbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.yohannes.appbutton.carRental.AbcCarRental;
import com.example.yohannes.appbutton.carRental.AdikaCarRental;
import com.example.yohannes.appbutton.carRental.AmazingCarRental;
import com.example.yohannes.appbutton.carRental.HomenetCarRental;
import com.example.yohannes.appbutton.carRental.RainbowCarRental;
import com.example.yohannes.appbutton.carRental.SenaitCarRental;
import com.example.yohannes.appbutton.carRental.ShangerilaTourCars;
import com.example.yohannes.appbutton.carRental.ZelalemCarRental;
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
import com.example.yohannes.appbutton.school.GreekSchool;

public class CarRentalList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        listView = (ListView)findViewById(R.id.list);
        String[] FRUITS = new String[] { "ABC","Adika","Amazing Ethiopia","Green Land","Homenet",
        "Rainbow","Senait","Shangerila","Zelalem"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,FRUITS);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0){
                    Intent myintent = new Intent(view.getContext(), AbcCarRental.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1){
                    Intent myintent = new Intent(view.getContext(), AdikaCarRental.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2){
                    Intent myintent = new Intent(view.getContext(), AmazingCarRental.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3){
                    Intent myintent = new Intent(view.getContext(), GreekSchool.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4){
                    Intent myintent = new Intent(view.getContext(), HomenetCarRental.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5){
                    Intent myintent = new Intent(view.getContext(), RainbowCarRental.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 6){
                    Intent myintent = new Intent(view.getContext(), SenaitCarRental.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 7){
                    Intent myintent = new Intent(view.getContext(), ShangerilaTourCars.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 8){
                    Intent myintent = new Intent(view.getContext(), ZelalemCarRental.class);
                    startActivityForResult(myintent, 0);
                }

            }
        });

    }

}