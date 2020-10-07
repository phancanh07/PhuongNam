package com.example.phuongnam.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.phuongnam.R;

public class GiaoDienActivity extends AppCompatActivity {
    ImageView quanlitk, quanlihd, quanlitheloai, addbook, quanlisach, thongke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien);
        quanlitk = findViewById(R.id.Imgquanlitk);
        quanlihd = findViewById(R.id.quanlihoadon);
        quanlitheloai = findViewById(R.id.quanlitheloai);
        addbook = findViewById(R.id.Imgthemsach);
        quanlisach = findViewById(R.id.Imgbookquanlisach);
        thongke = findViewById(R.id.Imgthongke);
        thongke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thống Kê", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, ThongKeActivity.class));
            }
        });
        quanlitk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thống Kê", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, ThongKeActivity.class));
            }
        });
        quanlihd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Quản lí hóa đơn ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, HoaDonActivity.class));
            }
        });
        addbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "thêm sách ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, ADDBOOKActivity.class));
            }
        });
        quanlitk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Quản lí tài khoản ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, UserListActivity.class));
            }
        });
        quanlisach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Quản lí sách ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, QuanlisachActivity.class));
            }
        });
        quanlitheloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Quản lí thế loại ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, TheLoaiActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.seting, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {

            case R.id.nav_addbook:
                startActivity(new Intent(GiaoDienActivity.this, ADDBOOKActivity.class));
                break;

            case R.id.nav_thongke:
                startActivity(new Intent(GiaoDienActivity.this, ThongKeActivity.class));
                break;

            case R.id.nav_quanlisach:
                startActivity(new Intent(GiaoDienActivity.this, QuanlisachActivity.class));
                break;

            case R.id.nav_quantaikhoan:
                startActivity(new Intent(GiaoDienActivity.this, UserListActivity.class));
                Toast.makeText(getApplicationContext(), "MÀN HÌNH QUẢN LÍ TÀI KHOẢN  USER LIST", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_dangxuat:
                Toast.makeText(getApplicationContext(), "ĐĂNG XUẤT", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(GiaoDienActivity.this, LoginActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}