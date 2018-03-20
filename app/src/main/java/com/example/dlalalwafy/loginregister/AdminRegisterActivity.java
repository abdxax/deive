package com.example.dlalalwafy.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AdminRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_register);
    }

    public void buClickYanbu(View view) {


        Intent myintenty = new Intent(this, AdminYanbuActivity.class);


        startActivity(myintenty);



        }

    public void buClickUmlij(View view) {

        Intent myintent1 = new Intent(this, AdminYanbuActivity.class);


        startActivity(myintent1);


    }
}
