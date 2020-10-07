package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.phuongnam.R;

public class HienThiTheLoaiSachActivity extends AppCompatActivity {
    TextView tv_id, tv_tentl, tv_soluong, tv_gia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_the_loai_sach);

        tv_id = findViewById(R.id.IDtheloai);
        tv_tentl = findViewById(R.id.tenTheLoai);
        tv_soluong = findViewById(R.id.soLuongTl);
        tv_gia = findViewById(R.id.giatien_tl);
        Intent intent = getIntent();
        final Bundle bundle = intent.getBundleExtra("data1");
        tv_id.setText("ID SÁCH : " + bundle.getString("id1"));
        tv_tentl.setText("TÊN SÁCH : " + bundle.getString("tentheloai"));
        tv_soluong.setText("SỐ LƯỢNG: " + bundle.getString("soluong"));
        tv_gia.setText("GIÁ SÁCH : " + bundle.getString("gia"));




    }
}