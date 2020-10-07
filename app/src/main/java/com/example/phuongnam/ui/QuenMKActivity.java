package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.phuongnam.R;

public class QuenMKActivity extends AppCompatActivity {
EditText txt_quenmk;
Button btn_dangkilaitaikhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_m_k);
        txt_quenmk=findViewById(R.id.sdt);
        btn_dangkilaitaikhoan=findViewById(R.id.btn_quenmk);
        btn_dangkilaitaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuenMKActivity.this, CodeMkActivity.class));
                Toast.makeText(getApplicationContext(), "Vui Nhập Code", Toast.LENGTH_SHORT).show();

            }
        });
    }
}