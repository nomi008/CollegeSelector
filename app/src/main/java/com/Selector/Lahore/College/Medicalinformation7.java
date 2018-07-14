package com.Selector.Lahore.College;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Medicalinformation7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicalinformation7);
    }
    public void browser1(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myadmission.pk/medical-college/central-park-medical-college-lahore/"));

        startActivity(browserIntent);
    }
}
