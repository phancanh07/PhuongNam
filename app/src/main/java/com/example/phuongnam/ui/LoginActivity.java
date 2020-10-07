package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.example.phuongnam.R;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout user, password;
    TextView taotk, quenmk;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.txt_tk_user);
        password = findViewById(R.id.txt_tk_pass);
        final String admin = "admin";
        final String pass = "123";
        taotk = findViewById(R.id.tvtaotk);
        quenmk = findViewById(R.id.tvquenmk);
        btnlogin = findViewById(R.id.login);
        taotk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });
        quenmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), " Bạn Chọn Quên Mật Khẩu ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, QuenMKActivity.class));
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getEditText().getText().toString().isEmpty() || !user.getEditText().getText().toString().equalsIgnoreCase(admin) || password.getEditText().getText().toString().isEmpty()|| !password.getEditText().getText().toString().equalsIgnoreCase(pass)) {
                    //  user.setErrorEnabled(true);
                    user.getEditText().setError(" Nhập Lại  user ");
                    password.getEditText().setError(" Nhập lại Pass");
                } else {
//                    user.getEditText().setError("");
//                    password.getEditText().setError("");
                    Toast.makeText(getApplicationContext(), " Đăng Nhập Thành Công ", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, GiaoDienActivity.class));
                }
            }
        });

    }

}