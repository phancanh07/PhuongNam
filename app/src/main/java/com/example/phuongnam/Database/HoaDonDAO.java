package com.example.phuongnam.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.phuongnam.model.BillDetai;

import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO {
    Context context;
    MySQLite mySQLite;

    public HoaDonDAO(Context context, MySQLite mySQLite) {
        this.context = context;
        this.mySQLite = mySQLite;
    }

    public void deleteBill(String idBill) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        sqLiteDatabase.delete("Type", "idBill=?", new String[]{idBill});
    }

    public long insertBill(BillDetai bill) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idBill", bill.ID);
        contentValues.put("idBook", bill.idBook);
        contentValues.put("tenSach", bill.tenSach);
        contentValues.put("tenTheLoai", bill.theLoai);
        contentValues.put("tenKhachHang", bill.tenKhachHang);
        contentValues.put("sosach", bill.soSach);
        contentValues.put("gia", bill.gia);
        contentValues.put("ngayBan", bill.ngayBan);

        return sqLiteDatabase.insert("Bill", null, contentValues);
    }

    public List<BillDetai> getAllBill() {
        List<BillDetai> BillList = new ArrayList<>();

        String truyVan = "select * from " + MySQLite.TABLE_BILL;
        Cursor cursor = mySQLite.getWritableDatabase().rawQuery(truyVan, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false) {

                int idBill = cursor.getInt(cursor.getColumnIndex("idBill"));
                int idBook = cursor.getInt(cursor.getColumnIndex("idBook"));
                String nameBook = cursor.getString(cursor.getColumnIndex("tenSach"));
                String tenTheLoai = cursor.getString(cursor.getColumnIndex("tenTheLoai"));
                String tenKhachHang = cursor.getString(cursor.getColumnIndex("tenKhachHang"));
                int amountBook = cursor.getInt(cursor.getColumnIndex("soLuongSach"));
                Double price = cursor.getDouble(cursor.getColumnIndex("giaBan"));
                String date = cursor.getString(cursor.getColumnIndex("ngayBan"));

                BillDetai inforBill = new BillDetai();
                inforBill.ID = idBill;
                inforBill.idBook = idBook;
                inforBill.tenSach = nameBook;
                inforBill.theLoai = tenTheLoai;
                inforBill.tenKhachHang = tenKhachHang;
                inforBill.soSach = amountBook;
                inforBill.gia = price;
                inforBill.ngayBan = date;

                BillList.add(inforBill);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return BillList;
    }
}

