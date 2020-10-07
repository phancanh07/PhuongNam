package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.phuongnam.R;

public class CodeMkActivity extends AppCompatActivity {
    EditText txt_code;
    Button btn_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_mk);
        txt_code=findViewById(R.id.code);
        btn_code=findViewById(R.id.btn_code);
        btn_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CodeMkActivity.this, LoginActivity.class));
                Toast.makeText(getApplicationContext(), " Thành Công ", Toast.LENGTH_SHORT).show();

            }
        });
    }
}