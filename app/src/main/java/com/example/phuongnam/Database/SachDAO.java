package com.example.phuongnam.Database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.phuongnam.model.Book;

import java.util.ArrayList;
import java.util.List;

public class SachDAO {
    private MySQLite mySQLite;

    public SachDAO(MySQLite mySQLite) {
        this.mySQLite = mySQLite;
    }

    public void deleteBook(String idBook) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        sqLiteDatabase.delete("Sach", "idSach=?", new String[]{idBook});
    }

    public long insertBook(Book book) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idBook", book.IDSach);
        contentValues.put("nameBook", book.tenSach);
        contentValues.put("type", book.theLoai);
        contentValues.put("author", book.tacGia);
        contentValues.put("amount", book.soSach);
        contentValues.put("importPrice", book.giaMua);
        contentValues.put("price", book.giaBan);
        contentValues.put("dateAdd", book.ngayNhap);
        return sqLiteDatabase.insert("Sach",null,contentValues);
    }

    public List<Book> getallBook() {
        List<Book> inforBookList = new ArrayList<>();

        String truyVan = "select * from " + MySQLite.TABLE_SACH;
        Cursor cursor = mySQLite.getWritableDatabase().rawQuery(truyVan, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false) {
                int idBook = cursor.getInt(cursor.getColumnIndex("idBook"));
                String nameBook = cursor.getString(cursor.getColumnIndex("nameBook"));
                String type = cursor.getString(cursor.getColumnIndex("type"));
                String author = cursor.getString(cursor.getColumnIndex("author"));
                int amount = cursor.getInt(cursor.getColumnIndex("amount"));
                double importPrice = cursor.getDouble(cursor.getColumnIndex("importPrice"));
                double price = cursor.getDouble(cursor.getColumnIndex("price"));
                String dateAdd = cursor.getString(cursor.getColumnIndex("dateAdd"));
                Book book = new Book();
                book.IDSach = (idBook);
                book.tenSach = nameBook;
                book.theLoai = type;
                book.tacGia = author;
                book.soSach = amount;
                book.giaMua = importPrice;
                book.giaBan = price;
                book.ngayNhap = dateAdd;
                inforBookList.add(book);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return inforBookList;
    }

    public int updateBook(Book book) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nameBook", book.tenSach);
        contentValues.put("type", book.theLoai);
        contentValues.put("author", book.tacGia);
        contentValues.put("amount", book.soSach);
        contentValues.put("importPrice", book.giaMua);
        contentValues.put("price", book.giaBan);
        contentValues.put("dateAdd", book.ngayNhap);

        return sqLiteDatabase.update("Book", contentValues, "idBook=?", new String[]{String.valueOf(book.IDSach)});
    }

}
