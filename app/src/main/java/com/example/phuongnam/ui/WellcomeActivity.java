package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.phuongnam.R;

public class WellcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);
        Thread bamgio = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    startActivity(new Intent(WellcomeActivity.this, LoginActivity.class));
                } catch (Exception e) {

                }

            }
        };
        bamgio.start();
    }
}