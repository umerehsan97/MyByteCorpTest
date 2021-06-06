package com.example.bytecorptest.login.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.bytecorptest.SharedPref;
import com.example.bytecorptest.login.model.LoginModel;
import com.example.bytecorptest.login.model.SignUpModel;

import static android.content.Context.MODE_PRIVATE;

public class LoginService {

    public void setSignUp(SignUpModel signUpModel) {
        SharedPref.setSignUpData(signUpModel);
    }

    public LoginModel getLoginData() {
        return SharedPref.getLoginData();
    }

}
