package com.example.bytecorptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bytecorptest.login.view.SignupActivity;
import com.example.bytecorptest.login.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    LoginViewModel loginViewModel;
    boolean Loginpressed=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPref.init(this);

        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);

    }



}