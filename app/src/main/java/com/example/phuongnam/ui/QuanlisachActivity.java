package com.example.phuongnam.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.phuongnam.R;
import com.example.phuongnam.adapter.BookAdapter;
import com.example.phuongnam.model.Book;

import java.util.ArrayList;
import java.util.List;

public class QuanlisachActivity extends AppCompatActivity {
    ListView listView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlisach);
        listView = findViewById(R.id.lisviewQuanlisach);
        toolbar = (Toolbar) findViewById(R.id.toolbar_book);
//        setSupportActionBar(toolbar);
        ImageView icAddBook = findViewById(R.id.ic_addBook);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        icAddBook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuanlisachActivity.this, ADDBOOKActivity.class));
                Toast.makeText(getApplicationContext(), "Thêm Sách", Toast.LENGTH_SHORT).show();
            }
        });
        final List<Book> bookss = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Book book = new Book();
            book.setTenSach("Comic Book Preview – Batman ");
            book.setTheLoai("Truyện Tranh");
            book.setTacGia("Mavel Commics");
            book.setNhaXuatBan("Kim Đồng");
            book.setSoSach(500);
            book.setGiaMua(5000);
            book.setGiaBan(12000);
            book.setNgayNhap("04/10/2020");
            bookss.add(book);
        }
        BookAdapter bookAdapter = new BookAdapter(bookss, QuanlisachActivity.this);
        listView.setAdapter(bookAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()  {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"đã OK ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuanlisachActivity.this, HienThiSachCTActivity.class);
                Book book = bookss.get(position);
                Bundle bundle = new Bundle();
//                bundle.putString("id", "" + book.ID);
//                bundle.putString("tensach", "" + book.tenSach);
//                bundle.putString("theloai", "" + book.theLoai);
//                bundle.putString("tacgia", "" + book.tacGia);
//                bundle.putString("nhaxuatban", "" + book.nhaXuatBan);
//                bundle.putString("sosach", "" + book.soSach);
//                bundle.putString("giamua", "" + book.giaMua);
//                bundle.putString("giaban", "" + book.giaBan);
//                bundle.putString("ngaynhap", "" + book.ngayNhap);
//                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.addbookicon, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_addbook:
                startActivity(new Intent(QuanlisachActivity.this, GiaoDienActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}