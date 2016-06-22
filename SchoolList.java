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
import com.example.yohannes.appbutton.school.AdinetInternationalSchool;
import com.example.yohannes.appbutton.school.BinghamAcadamy;
import com.example.yohannes.appbutton.school.BritishSchool;
import com.example.yohannes.appbutton.school.GreekSchool;
import com.example.yohannes.appbutton.school.InternationalCommunitySchool;
import com.example.yohannes.appbutton.school.OnePlanetInternationalSchool;
import com.example.yohannes.appbutton.school.RiceInternationalSchool;
import com.example.yohannes.appbutton.school.SanfordInternationalSchool;
import com.example.yohannes.appbutton.school.TurkishInternationalSchool;

public class SchoolList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        listView = (ListView)findViewById(R.id.list);
        String[] FRUITS = new String[] { "Adinet International School","Bingham Acadamy","British School","Greek International School",
        "International Community School","One Planet International School","Rice International School","Sanford International School","Turkish International School"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,FRUITS);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0){
                    Intent myintent = new Intent(view.getContext(), AdinetInternationalSchool.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1){
                    Intent myintent = new Intent(view.getContext(), BinghamAcadamy.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2){
                    Intent myintent = new Intent(view.getContext(), BritishSchool.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3){
                    Intent myintent = new Intent(view.getContext(), GreekSchool.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4){
                    Intent myintent = new Intent(view.getContext(), InternationalCommunitySchool.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5){
                    Intent myintent = new Intent(view.getContext(), OnePlanetInternationalSchool.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 6){
                    Intent myintent = new Intent(view.getContext(), RiceInternationalSchool.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 7){
                    Intent myintent = new Intent(view.getContext(), SanfordInternationalSchool
                            .class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 8){
                    Intent myintent = new Intent(view.getContext(), TurkishInternationalSchool.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });

    }

}