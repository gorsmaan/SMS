package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_list_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setTitle("МОЖЕТ ВЗИМАТЬСЯ ПЛАТА!");}
}