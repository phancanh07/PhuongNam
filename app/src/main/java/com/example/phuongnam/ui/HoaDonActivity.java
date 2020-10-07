package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.phuongnam.R;
import com.example.phuongnam.adapter.BillDetaiAdapter;
import com.example.phuongnam.model.BillDetai;
import com.example.phuongnam.model.Book;

import java.util.ArrayList;
import java.util.List;

public class HoaDonActivity extends AppCompatActivity {
    ListView listView;
    List<BillDetai> billDetais;
    BillDetai bil;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoa_don);
        listView = findViewById(R.id.hoadonlist);
        billDetais = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
           bil = new BillDetai();
            bil.setID(777);
            bil.setTenKhachHang("ĐOÀN VĂN ĐOÀNG");
            bil.setTenSach("HÀNH ĐỘNG KỊCH TÍNH");
            bil.setSoSach(20);
            bil.setGia(20000);
            bil.setNgayBan("22/7/2001");
            billDetais.add(bil);
        }
        for (int i = 0; i < 3; i++) {
            BillDetai bil = new BillDetai();
            bil.setID(123);
            bil.setTenKhachHang("ĐỖ TRƯỜNG CHUYÊN");
            bil.setTenSach("TÂM LÍ HỌC ĐƯỜNG");
            bil.setSoSach(20);
            bil.setGia(50000);
            bil.setNgayBan("22/7/2020");
            billDetais.add(bil);
        }
        BillDetaiAdapter billDetaiAdapter = new BillDetaiAdapter(billDetais, HoaDonActivity.this);
        listView.setAdapter(billDetaiAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext()," XEM CHI TIẾT ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HoaDonActivity.this, HienThiHoaDonActivity.class);
                Object listItem=listView.getItemAtPosition(position);
                bil=billDetais.get(position);
                Bundle bundle = new Bundle();
                bundle.putString("id", "" + bil.ID);
                bundle.putString("tenkhachhang", "" + bil.tenKhachHang);
                bundle.putString("tensach", "" + bil.tenSach);
                bundle.putString("sosach", "" + bil.soSach);
                bundle.putString("gia", "" + bil.gia);
                bundle.putString("ngayban", "" + bil.ngayBan);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });

    }
}