package com.example.bytecorptest;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.bytecorptest.login.model.LoginModel;
import com.example.bytecorptest.login.model.SignUpModel;

public class SharedPref {
    private static SharedPreferences mSharedPref;
    public static final String NAME = "NAME";
    public static final String PASSWORD = "PASSWORD";
    public static final String EMAIL = "EMAIL";

    private SharedPref()
    {

    }

    public static void init(Context context)
    {
        if(mSharedPref == null)
            mSharedPref = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
    }

    public static LoginModel getLoginData() {
        String name = mSharedPref.getString("NAME", "");
        String password = mSharedPref.getString("PASSWORD", "");

        return new LoginModel(name,password);
    }

    public static void setSignUpData(SignUpModel signUpModel) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putString(NAME,signUpModel.name);
        prefsEditor.putString(PASSWORD,signUpModel.password);
        prefsEditor.putString(EMAIL,signUpModel.email);
        prefsEditor.apply();
        prefsEditor.commit();
    }



}
