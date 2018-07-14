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

public class BBACollege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbacollege);
        myListView();
    }
    public void myListView() {
        ListView lv = (ListView) findViewById(R.id.myList);

        final String[] Colleges ={"Hailey College of Commerce Lahore","Govt College of Science Wahdat Road Lahore","University of Veterinary & Animal Sciences UVAS","National College of Business Administration & Economics (NCBAE) Lahore","The Institute Of Management Sciences Lahore","The Superior College Lahore"};
        ListAdapter myAdapter=new ArrayAdapter<String>(
                BBACollege.this,android.R.layout.simple_list_item_1,Colleges);
        lv.setAdapter(myAdapter);
        //lv.setBackgroundColor(Color.parseColor("#ffffff"));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Colleges = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(BBACollege.this,Colleges,Toast.LENGTH_SHORT).show();
                if(Colleges.equalsIgnoreCase("Hailey College of Commerce Lahore")) {

                    Intent intent = new Intent(BBACollege.this,BBA1.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Govt College of Science Wahdat Road Lahore")){
                    Intent intent=new Intent(BBACollege.this,BBA2.class);
                    startActivity(intent);
                }

                else if(Colleges.equalsIgnoreCase("University of Veterinary & Animal Sciences UVAS")){
                    Intent intent=new Intent(BBACollege.this,BBA3.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("National College of Business Administration & Economics (NCBAE) Lahore")){
                    Intent intent=new Intent(BBACollege.this,BBA4.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("The Institute Of Management Sciences Lahore")){
                    Intent intent=new Intent(BBACollege.this,BBA5.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("The Superior College Lahore")) {
                    Intent intent = new Intent(BBACollege.this, BBA6.class);
                    startActivity(intent);
                }

            }
        });
    }
}


