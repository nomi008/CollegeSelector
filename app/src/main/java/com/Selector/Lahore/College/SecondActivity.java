package com.Selector.Lahore.College;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SecondActivity extends AppCompatActivity {

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




        AdView adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-8939663486500862/1787516166");
        MobileAds.initialize(this,"ca-app-pub-8939663486500862~9895669536");

        mAdView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);








        myListView();
    }


    public void myListView() {
        ListView lv = (ListView) findViewById(R.id.myList);

        final String[] Colleges ={"\t\t\t\tMEDICAL COLLEGE","\t\t\t\tICOM/BCOM COLLEGE", "\t\t\t\tDIPLOMA COLLEGE", "\t\t\t\tBBA COLLEGE"};
        ListAdapter myAdapter=new ArrayAdapter<String>(
                SecondActivity.this,android.R.layout.simple_list_item_1,Colleges);
        lv.setAdapter(myAdapter);
        //lv.setBackgroundColor(Color.parseColor("#ffffff"));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Colleges = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(SecondActivity.this,Colleges,Toast.LENGTH_SHORT).show();
                if(Colleges.equalsIgnoreCase("\t\t\t\tMEDICAL COLLEGE")) {

                    Intent intent = new Intent(SecondActivity.this, MedicalCollege.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("\t\t\t\tICOM/BCOM COLLEGE")){
                    Intent intent=new Intent(SecondActivity.this, IcomCollege.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("\t\t\t\tDIPLOMA COLLEGE")){
                    Intent intent=new Intent(SecondActivity.this,DiplomaCollege.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("\t\t\t\tBBA COLLEGE")){
                    Intent intent=new Intent(SecondActivity.this,BBACollege.class);
                    startActivity(intent);
                               }

            }
        });

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
}





