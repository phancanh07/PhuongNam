package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phuongnam.R;

public class HienThiHoaDonActivity extends AppCompatActivity {
    ImageView imageView;
    TextView tvt_id, tvt_tensach, tvt_tenkhachhang, tvt_gia, tvt_ngayban, tvt_sosach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_hoa_don);
        imageView = findViewById(R.id.img_bill_hoadon);
        tvt_id = findViewById(R.id.tvt_id_hoadon);
        tvt_gia = findViewById(R.id.tvt_giasach_hoadon);
        tvt_ngayban = findViewById(R.id.tvt_ngayban_hoadon);
        tvt_tenkhachhang = findViewById(R.id.tvt_tenkhachhang_hoadon);
        tvt_tensach = findViewById(R.id.tvt_tensach_hoadon);
        tvt_sosach = findViewById(R.id.tvt_sosach_hoadon);
        Intent intent = getIntent();
        final Bundle bundle = intent.getBundleExtra("data");
        tvt_id.setText("ID SÁCH : " + bundle.getString("id"));
        tvt_tenkhachhang.setText("TÊN KHÁCH HÀNG  : " + bundle.getString("tenkhachhang"));
        tvt_tensach.setText("TÊN SÁCH: " + bundle.getString("tensach"));
        tvt_sosach.setText("SỐ SÁCH : " + bundle.getString("sosach")+"\tCUỐN");
        tvt_gia.setText("GIÁ SÁCH : " + bundle.getString("gia")+"\tĐỒNG");
        tvt_ngayban.setText("NGÀY  BÁN : " + bundle.getString("ngayban"));
    }
}