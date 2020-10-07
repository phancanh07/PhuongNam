package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phuongnam.R;

public class HienThiSachCTActivity extends AppCompatActivity {
    ImageView imageView;
    TextView ht_tensach, ht_theloai, ht_tacgia, ht_nhaxuatban, ht_sosach, ht_giamua, ht_giaban, ht_ngaynhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_sach_c_t);
        imageView = findViewById(R.id.hienthi_anh);
        ht_tensach = findViewById(R.id.hienthi_tensach);
        ht_theloai = findViewById(R.id.hienthi_theloai);
        ht_tacgia = findViewById(R.id.hienthi_tacgia);
        ht_nhaxuatban = findViewById(R.id.hienthi_nhaxuatban);
        ht_sosach = findViewById(R.id.hienthi_sosach);
        ht_giamua = findViewById(R.id.hienthi_giamua);
        ht_giaban = findViewById(R.id.hienthi_giaban);
        ht_ngaynhap = findViewById(R.id.hienthi_ngayNhap);
        Intent intent = getIntent();
        final Bundle bundle = intent.getBundleExtra("data");
        ht_tensach.setText("Tên Sách : " + bundle.getString("tensach"));
        ht_theloai.setText("Thể Loại : " + bundle.getString("theloai"));
        ht_tacgia.setText("Tác Giả : " + bundle.getString("tacgia"));
        ht_nhaxuatban.setText("Nhà Xuất Bản : " + bundle.getString("nhaxuatban"));
        ht_sosach.setText("Số Sách : " + bundle.getString("sosach") + " cuốn");
        ht_giamua.setText("Giá Mua : " + bundle.getString("giamua"));
        ht_giaban.setText("Giá Bán : " + bundle.getString("giaban"));
        ht_ngaynhap.setText("Ngày Nhập : " + bundle.getString("ngaynhap"));


    }
}