package com.example.deepakrattan.mutipleactivitiesdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by deepak.rattan on 3/15/2017.
 */

public class SecondActivity extends AppCompatActivity {
    private TextView txtUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtUser = (TextView) findViewById(R.id.txtUser);

        String name = getIntent().getExtras().getString("name_key");
        txtUser.setText("Welcome " + name);
    }
}
