package com.Selector.Lahore.College;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Medicalinformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicalinformation);

    }

    public void browser1(View view){

    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fmhcmd.edu.pk/"));

        startActivity(browserIntent);
}
}
