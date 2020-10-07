package com.example.phuongnam.Database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.phuongnam.model.TheLoai;

import java.util.ArrayList;
import java.util.List;

public class TheLoaiDAO {
    private MySQLite mySQLite;

    public TheLoaiDAO(MySQLite mySQLite) {
        this.mySQLite = mySQLite;
    }

    public void deleteType(String idType) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        sqLiteDatabase.delete("Type", "idType=?", new String[]{idType});
    }

    public long insertType(TheLoai theLoai) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idTheLoai", theLoai.ID);
        contentValues.put("tenTheLoai", theLoai.tenTl);
        contentValues.put("soLuongTheLoai", theLoai.soluongtl);

        return sqLiteDatabase.insert("Type", null, contentValues);
    }

    public List<TheLoai> getAllType() {
        List<TheLoai> inforTypeList = new ArrayList<>();

        String truyVan = "select * from " + MySQLite.TABLE_THELOAI;
        Cursor cursor = mySQLite.getWritableDatabase().rawQuery(truyVan, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false) {
                int idType = cursor.getInt(cursor.getColumnIndex("id"));
                String nameType = cursor.getString(cursor.getColumnIndex("tenTheLoai"));
                int amountType = cursor.getInt(cursor.getColumnIndex("soLuongTheLoai"));

                TheLoai theLoai = new TheLoai();
                theLoai.ID = idType;
                theLoai.tenTl = nameType;
                theLoai.soluongtl = amountType;

                inforTypeList.add(theLoai);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return inforTypeList;
    }

    public int updateType(TheLoai theLoai) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nameType", theLoai.tenTl);
        contentValues.put("amountTpye", theLoai.soluongtl);

        return sqLiteDatabase.update("Type", contentValues, "idType=?", new String[]{String.valueOf(theLoai.ID)});
    }
}
