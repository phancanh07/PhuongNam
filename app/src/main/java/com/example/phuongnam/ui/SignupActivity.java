package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.phuongnam.Database.MySQLite;
import com.example.phuongnam.Database.UserDAO;
import com.example.phuongnam.R;
import com.example.phuongnam.model.User;

public class SignupActivity extends AppCompatActivity {
    EditText txt_username, phone_number, email, pass;
    Button btn_dangki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        txt_username = findViewById(R.id.username_dk);
        phone_number = findViewById(R.id.phonenumber_dk);
        email = findViewById(R.id.Email_dk);
        pass = findViewById(R.id.password_dk);
        btn_dangki = findViewById(R.id.btn_dangkitk);

        btn_dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySQLite mySQLite=new MySQLite(SignupActivity.this);
                UserDAO userDAO=new UserDAO( mySQLite);
                User user = new User();
//                String text=txt_username.getText().toString();
                user.setUsername(txt_username.getText().toString());
                user.setPassword(pass.getText().toString());
                user.setEmail(email.getText().toString());
                user.setSoDT(pass.getText().toString());
               userDAO.insertUser(user);

            }
        });


    }


}