package com.example.nadifa.ecampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivityM_U extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m__u);
    }

    public void btn_ptn(View view) {
        Intent ptn = new Intent(MainActivityM_U.this, MainActivityPTN.class);
        startActivity(ptn);
    }
    public void btn_pts(View view) {
        Intent pts = new Intent(MainActivityM_U.this, MainActivityPTN.class);
        startActivity(pts);
    }
}
