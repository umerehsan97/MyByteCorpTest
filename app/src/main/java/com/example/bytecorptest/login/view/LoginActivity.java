package com.example.bytecorptest.login.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bytecorptest.R;
import com.example.bytecorptest.market.view.Market;

public class LoginActivity extends AppCompatActivity {

    View login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.signupButton);
        TextView loginTextview = login.findViewById(R.id.textview);
        loginTextview.setText("Login");
        login.setOnClickListener(openMarket);
    }


    private View.OnClickListener openMarket = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(LoginActivity.this, Market.class);
            startActivity(i);
        }
    };
}
