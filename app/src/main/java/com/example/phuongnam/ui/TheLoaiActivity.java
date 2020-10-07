package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.phuongnam.R;
import com.example.phuongnam.adapter.TheLoaiAdapter;
import com.example.phuongnam.model.Book;
import com.example.phuongnam.model.TheLoai;

import java.util.ArrayList;
import java.util.List;

public class TheLoaiActivity extends AppCompatActivity {
    ListView listView;
    TheLoai theLoai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_loai);
        listView = findViewById(R.id.listViewTheLoai);
        final List<TheLoai> theLoais = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
             theLoai = new TheLoai();
            theLoai.setID(i);
            theLoai.setTenTl("Hành Động");
            theLoai.setSoluongtl(100);
//            theLoai.setAmount(2000);
            theLoais.add(theLoai);
        }
        TheLoaiAdapter theLoaiAdapter = new TheLoaiAdapter(theLoais, TheLoaiActivity.this);
        listView.setAdapter(theLoaiAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "đã OK ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TheLoaiActivity.this, HienThiTheLoaiSachActivity.class);
               TheLoai theLoai=theLoais.get(position);

                Bundle bundle = new Bundle();
                bundle.putString("id1", "" + theLoai.getID());
                bundle.putString("tentheloai", "" + theLoai.getTenTl());
                bundle.putString("soluong", "" + theLoai.getSoluongtl());
//                bundle.putString("gia", "" + theLoai.getAmount());
                intent.putExtra("data1", bundle);
                startActivity(intent);
            }
        });
    }
}