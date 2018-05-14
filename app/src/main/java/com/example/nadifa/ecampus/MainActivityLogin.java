package com.example.nadifa.ecampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityLogin extends AppCompatActivity {

    EditText u;
    EditText p;
    Button l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        u = (EditText) findViewById(R.id.username);
        p = (EditText) findViewById(R.id.password);
        l = (Button) findViewById(R.id.button);
        login();
    }


    public void Pindahh(View view) {
        Intent intent = new Intent(MainActivityLogin.this,MainActivitymenu.class);
        startActivity(intent);
    }


    public void login(){
        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (u.getText().toString().equals("admin@gmail.com")&&p.getText().toString().equals("admin")){
                    Toast.makeText(MainActivityLogin.this,"Login Anda Sukses",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivityLogin.this,"Login Anda Gagal,periksa kembali username dan password Anda",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
