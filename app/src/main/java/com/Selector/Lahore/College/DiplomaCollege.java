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

public class DiplomaCollege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma_college);
        myListView();
    }
    public void myListView() {
        ListView lv = (ListView) findViewById(R.id.myList);

        final String[] Colleges ={"Govt College of Technology Raiwind Road Lahore","Govt. College of Technology Railway Road Lahore","Imperial College of Technology Lahore","Govt Polytechnic Institute Women Lytton Road Lahore","Ahmad Hassan Polytechnic Lahore","Pak Poly Technic Institute Lahore","Govt. Apprentices Training Centre, Township, Lahore"};
        ListAdapter myAdapter=new ArrayAdapter<String>(
                DiplomaCollege.this,android.R.layout.simple_list_item_1,Colleges);
        lv.setAdapter(myAdapter);
        //lv.setBackgroundColor(Color.parseColor("#ffffff"));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Colleges = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(DiplomaCollege.this,Colleges,Toast.LENGTH_SHORT).show();
                if(Colleges.equalsIgnoreCase("Govt College of Technology Raiwind Road Lahore")) {

                    Intent intent = new Intent(DiplomaCollege.this,Dip1.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Govt. College of Technology Railway Road Lahore")){
                    Intent intent=new Intent(DiplomaCollege.this,Dip2.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Imperial College of Technology Lahore")){
                    Intent intent=new Intent(DiplomaCollege.this,Dip3.class);
                    startActivity(intent);
                }

                else if(Colleges.equalsIgnoreCase("Govt Polytechnic Institute Women Lytton Road Lahore")){
                    Intent intent=new Intent(DiplomaCollege.this,Dip4.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Ahmad Hassan Polytechnic Lahore")){
                    Intent intent=new Intent(DiplomaCollege.this,Dip5.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Pak Poly Technic Institute Lahore")){
                    Intent intent=new Intent(DiplomaCollege.this,Dip6.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Govt. Apprentices Training Centre, Township, Lahore")){
                    Intent intent=new Intent(DiplomaCollege.this,Dip7.class);
                    startActivity(intent);
                }

            }
        });
    }
}

