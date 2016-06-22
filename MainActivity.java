package com.example.yohannes.appbutton;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.yohannes.appbutton.embassys.EmbassyMainActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public int currentimageindex=0;
    //    Timer timer;
//    TimerTask task;
    ImageView slidingimage;

    private int[] IMAGE_IDS = {
            R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        final Handler mHandler = new Handler();
        

        // Create runnable for posting
        final Runnable mUpdateResults = new Runnable() {
            public void run() {

                AnimateandSlideShow();

            }
        };

        int delay = 100; // delay

        int period = 4500; // repeat

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                mHandler.post(mUpdateResults);

            }

        }, delay, period);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }


    public void hotel(View view) {
        startActivity(new Intent(this, HotelList.class));

    }
    public void hospital(View view) {
        startActivity(new Intent(this, Hospitals.class));

    }
    public void embassy(View view) {
        startActivity(new Intent(this, EmbassyMainActivity.class));

    }
    public void school(View view) {
        startActivity(new Intent(this, SchoolList.class));

    }

    public void carRental(View view) {
        startActivity(new Intent(this, CarRentalList.class));

    }
    private void AnimateandSlideShow() {


        slidingimage = (ImageView)findViewById(R.id.imageView);
        slidingimage.setImageResource(IMAGE_IDS[currentimageindex%IMAGE_IDS.length]);

        currentimageindex++;

        //Animation rotateimage = AnimationUtils.loadAnimation(R.anim.fade_in);


        //slidingimage.startAnimation(rotateimage);



    }
    //for drop down menu onclick events
    public void OpenPost(MenuItem item) {
        startActivity(new Intent(this, NewsFeeds.class));
    }

    public void openregister(MenuItem item) {
        startActivity(new Intent(this, RegistrationActivity.class));
    }
}
