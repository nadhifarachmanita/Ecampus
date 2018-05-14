package com.example.nadifa.ecampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivitymenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymenu);
    }
    public void btn_univ (View view) {
        Intent univ = new Intent(MainActivitymenu.this,MainActivityM_U.class);
        startActivity(univ);
    }
    public void  btn_st (View view){
        Intent st = new Intent(MainActivitymenu.this,MainActivityST.class);
        startActivity(st);
    }
    public void  btn_inst (View view) {
        Intent inst = new Intent(MainActivitymenu.this, MainActivityInst.class);
        startActivity(inst);
    }
    public void  btn_akd (View view) {
        Intent akd = new Intent(MainActivitymenu.this, MainActivityAkademi.class);
        startActivity(akd);
    }
    public void  btn_share (View view){
        Intent share = new Intent(MainActivitymenu.this,MainActivityLogin.class);
        startActivity(share);
    }
}