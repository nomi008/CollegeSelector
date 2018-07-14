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

public class MedicalCollege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_college);
        myListView();
    }
    public void myListView() {
        ListView lv = (ListView) findViewById(R.id.myList);

        final String[] Colleges ={"FMH College of Medicine and Dentistry, Lahore","Lahore Medical and Dental College, Lahore", "University College of Medicine and Dentistry, Lahore", "CMH Lahore Medical College, Lahore","Continental Medical College, Lahore","Akhtar Saeed Medical & Dental College, Lahore","Central Parks Medical College, Lahore.","Shalamar Medical & Dental College, Lahore.","Avicenna Medical College,Lahore","Rashid Latif Medical College, Lahore","Azra Naheed Medical College, Lahore","Pak Red Crescent Medical & Dental College, Lahore"};
        ListAdapter myAdapter=new ArrayAdapter<String>(
                MedicalCollege.this,android.R.layout.simple_list_item_1,Colleges);
        lv.setAdapter(myAdapter);
        //lv.setBackgroundColor(Color.parseColor("#ffffff"));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Colleges = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MedicalCollege.this,Colleges,Toast.LENGTH_SHORT).show();
                if(Colleges.equalsIgnoreCase("FMH College of Medicine and Dentistry, Lahore")) {

                    Intent intent = new Intent(MedicalCollege.this,Medicalinformation.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("Lahore Medical and Dental College, Lahore")){
                    Intent intent=new Intent(MedicalCollege.this,Medicalinformation2.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("University College of Medicine and Dentistry, Lahore")){
                    Intent intent=new Intent(MedicalCollege.this,Medicalinformation3.class);
                    startActivity(intent);
                }
                else if(Colleges.equalsIgnoreCase("CMH Lahore Medical College, Lahore")){
                    Intent intent=new Intent(MedicalCollege.this,Medicalinformation4.class);
                    startActivity(intent);
                }

                        else if(Colleges.equalsIgnoreCase("Continental Medical College, Lahore")){
                        Intent intent=new Intent(MedicalCollege.this,Medicalinformation5.class);
                        startActivity(intent);
                    }
                    else if(Colleges.equalsIgnoreCase("Akhtar Saeed Medical & Dental College, Lahore")){
                        Intent intent=new Intent(MedicalCollege.this,Medicalinformation6.class);
                        startActivity(intent);
                    }
                    else if(Colleges.equalsIgnoreCase("Central Parks Medical College, Lahore.")){
                        Intent intent=new Intent(MedicalCollege.this,Medicalinformation7.class);
                        startActivity(intent);
                    }
                    else if(Colleges.equalsIgnoreCase("Shalamar Medical & Dental College, Lahore.")) {
                    Intent intent = new Intent(MedicalCollege.this, Medicalinformation8.class);
                    startActivity(intent);
                }
                            else if(Colleges.equalsIgnoreCase("Avicenna Medical College,Lahore")){
                            Intent intent=new Intent(MedicalCollege.this,Medicalinformation9.class);
                            startActivity(intent);
                        }
                        else if(Colleges.equalsIgnoreCase("Rashid Latif Medical College, Lahore")){
                            Intent intent=new Intent(MedicalCollege.this,Medicalinformation10.class);
                            startActivity(intent);
                        }
                        else if(Colleges.equalsIgnoreCase("Azra Naheed Medical College, Lahore")){
                            Intent intent=new Intent(MedicalCollege.this,Medicalinformation11.class);
                            startActivity(intent);
                        }
                        else if(Colleges.equalsIgnoreCase("Pak Red Crescent Medical & Dental College, Lahore")){
                            Intent intent=new Intent(MedicalCollege.this,Medicalinformation12.class);
                            startActivity(intent);
                }

            }
        });
    }
}



