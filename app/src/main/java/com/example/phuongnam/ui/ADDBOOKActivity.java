package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.phuongnam.R;

public class ADDBOOKActivity extends AppCompatActivity {
    EditText  tensach, giaban, giasach,giamua,tacgia,nhaxuatban,sosach,ngaynhap;
    Button themsach,huysach;
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_d_d_b_o_o_k);
        spinner=findViewById(R.id.spinner_theLoai);
        themsach=findViewById(R.id.themsach);
        huysach=findViewById(R.id.add_huy);
        themsach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ADDBOOKActivity.this, GiaoDienActivity.class));
                Toast.makeText(getApplicationContext(),"Thêm Thành Công",Toast.LENGTH_SHORT).show();
            }
        });
        huysach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Đéo Hủy Được Cơ",Toast.LENGTH_SHORT).show();
            }
        });


    }

}