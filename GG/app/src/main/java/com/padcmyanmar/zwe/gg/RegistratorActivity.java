package com.padcmyanmar.zwe.gg;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ZWE on 25/11/2017.
 */

public class RegistratorActivity extends AppCompatActivity {



    public static Intent newinIntent(Context context){
        Intent intent = new Intent(context,RegistratorActivity.class);
        return intent;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }
}
