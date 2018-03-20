package com.example.dlalalwafy.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText etUsername = (EditText) findViewById(R.id.etphone);
        final EditText etPassword = (EditText) findViewById(R.id.etID);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        }



    public void buClick(View view) {


        EditText txtuser = (EditText) findViewById(R.id.etphone);
        EditText txtPassword = (EditText) findViewById(R.id.etID);
        Intent myintent = new Intent(this, UserAreaActivity.class);


        startActivity(myintent);

    }



    public void buButton(View view) {

        Intent intentt = new Intent(this, AdminRegisterActivity.class);


        startActivity(intentt);

    }

}




