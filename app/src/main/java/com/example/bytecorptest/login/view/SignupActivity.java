package com.example.bytecorptest.login.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bytecorptest.R;

public class SignupActivity extends AppCompatActivity {

    View signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupButton = findViewById(R.id.signupButton);
        signupButton.setOnClickListener(openSignup);
    }

    private View.OnClickListener openSignup = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(SignupActivity.this,LoginActivity.class);
            startActivity(i);
        }
    };

}