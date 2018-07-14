package com.Selector.Lahore.College;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Icominfo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icominfo4);
    }
    public void browser1(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ilmkidunya.com/colleges/forman-christian-college-university-lahore.aspx"));

        startActivity(browserIntent);
    }
}
