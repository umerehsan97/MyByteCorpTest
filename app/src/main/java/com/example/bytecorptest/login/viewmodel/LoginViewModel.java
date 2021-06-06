package com.example.bytecorptest.login.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.example.bytecorptest.login.model.LoginModel;
import com.example.bytecorptest.login.model.SignUpModel;
import com.example.bytecorptest.login.service.LoginService;

public class LoginViewModel
{
    LoginService loginService;


    public LoginViewModel() {
        loginService = new LoginService();
    }

    void setSignUpData(SignUpModel signUpModel) {
        loginService.setSignUp(signUpModel);
    }

    public boolean verifyLogin(LoginModel loginModel) {
        LoginModel storedLoginModel = loginService.getLoginData();
        if(loginModel.equals(storedLoginModel)) {
            return true;
        } else {
            return false;
        }
    }
}
