package com.padcmyanmar.zwe.gg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ZWE on 05/11/2017.
 */

public class LoginActivity extends AppCompatActivity {

    private TextView btnToRegister;

    private static final String CORRECT_EMAIL = "mtkmzh@gmail.com";
    private static final String CORRECT_PASSWORD = "Abcdefg";//Constant Attribute

    private Button btnLogin;
    private EditText etemailorph;
    private EditText etpassword;
    private TextView btnforget;
    private TextView btnregister;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         btnLogin = findViewById(R.id.btn_login);
         etemailorph = findViewById(R.id.et_email_or_ph);
         etpassword = findViewById(R.id.et_password);
         btnforget = findViewById(R.id.btn_forget_password);
         btnregister = findViewById(R.id.btn_register);

         btnforget.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String forgot = btnforget.getText().toString();
                  Snackbar.make(v,"Forgot Password is coming soon.",Snackbar.LENGTH_INDEFINITE).show();

             }
         });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String register = btnregister.getText().toString();
                Snackbar.make(v,"Registeration is coming soon.",Snackbar.LENGTH_INDEFINITE).show();

            }
        });
        btnToRegister = findViewById(R.id.btn_register);
        btnToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = RegistratorActivity.newinIntent(getApplicationContext());
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String emailorph =  etemailorph.getText().toString();
               String password =   etpassword.getText().toString();


               if(TextUtils.isEmpty(emailorph)){
                   etemailorph.setError("Email or Phone cannot be empty!");
                   return;
               }

               if(TextUtils.isEmpty(password)){
                   etpassword.setError("Password needed!");
                   return;
               }

               if(TextUtils.equals(emailorph,CORRECT_EMAIL)&& TextUtils.equals(password,CORRECT_PASSWORD) ){
                 //  Toast.makeText(v.getContext(),"LogIn Success!",Toast.LENGTH_LONG).show();
                  Intent intent =  MainActivity.newIntent(getApplicationContext());
                    startActivity(intent);
               }
                else{
                   Snackbar.make(v,"Incorrect Email or Password.Please try again!",Snackbar.LENGTH_INDEFINITE).show();
               }
               /* Toast.makeText(v.getContext(),"Logging in",Toast.LENGTH_SHORT).show();*/



            }
        });

    }
}