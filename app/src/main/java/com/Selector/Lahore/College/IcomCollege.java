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

public class IcomCollege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icom_college);
        myListView();
    }
    public void myListView() {
        ListView lv = (ListView) findViewById(R.id.myList);

        final String[] Colleges ={"Stars Academy Lahore","Kinnaird College For Women Lahore", "Lahore College For Women University (Lcwu) Lahore","Forman Christian College University Lahore","Hazrat Ayesha Siddiqa Model Degree College Lahore","Altus College of Commerce Science and Technology Lahore","CFE College of Accountancy and Finance Lahore"};
        ListAdapter myAdapter=new ArrayAdapter<String>(
                IcomCollege.this,android.R.layout.simple_list_item_1,Colleges);
        lv.setAdapter(myAdapter);
        //lv.setBackgroundColor(Color.parseColor("#ffffff"));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Colleges = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(IcomCollege.this,Colleges,Toast.LENGTH_SHORT).show();
                if(Colleges.equalsIgnoreCase("Stars Academy Lahore")) {

                    Intent intent = new Intent(IcomCollege.this,Icominfo1.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Kinnaird College For Women Lahore")){
                    Intent intent=new Intent(IcomCollege.this,Icominfo2.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Lahore College For Women University (Lcwu) Lahore")){
                    Intent intent=new Intent(IcomCollege.this,Icominfo3.class);
                    startActivity(intent);
                }

                else if(Colleges.equalsIgnoreCase("Forman Christian College University Lahore")){
                    Intent intent=new Intent(IcomCollege.this,Icominfo4.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Hazrat Ayesha Siddiqa Model Degree College Lahore")){
                    Intent intent=new Intent(IcomCollege.this,Icominfo5.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Altus College of Commerce Science and Technology Lahore")){
                    Intent intent=new Intent(IcomCollege.this,Icominfo6.class);
                    startActivity(intent);
                               }
                else if(Colleges.equalsIgnoreCase("CFE College of Accountancy and Finance Lahore")){
                    Intent intent=new Intent(IcomCollege.this,Icominfo7.class);
                    startActivity(intent);
                }

            }
        });
    }
}




