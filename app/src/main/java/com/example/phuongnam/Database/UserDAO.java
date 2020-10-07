package com.example.phuongnam.Database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.phuongnam.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    // cac cau lenh truy van voi bang User

    private MySQLite mySQLite;
    public UserDAO(MySQLite mySQLite) {
        this.mySQLite = mySQLite;
    }
//    SQLiteDatabase db = mySQLite.getWritableDatabase();

    public void deleteUser(String id) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        sqLiteDatabase.delete("User", "id=?", new String[]{id});
    }

    public long insertUser(User user) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", user.Username);
        contentValues.put("password", user.Password);
        contentValues.put("email", user.Email);
        contentValues.put("sodt", user.soDT);

        return sqLiteDatabase.insert("User", null, contentValues);
    }

    public List<User> getallUser() {
        List<User> inforUserList = new ArrayList<>();

        String truyVan = "select * from " + MySQLite.TABLE_USER;
        Cursor cursor = mySQLite.getWritableDatabase().rawQuery(truyVan, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false) {

                String username = cursor.getString(cursor.getColumnIndex("username"));
                String password = cursor.getString(cursor.getColumnIndex("password"));
                String email = cursor.getString(cursor.getColumnIndex("email"));
                String sodienthoai = cursor.getString(cursor.getColumnIndex("sodt"));

                User user = new User();
                user.Username = username;
                user.Password = password;
                user.Email = email;
                user.soDT = sodienthoai;

                inforUserList.add(user);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return inforUserList;
    }

    public int updateUser(User user) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("password", user.Password);
        contentValues.put("email", user.Email);
        contentValues.put("sodt", user.soDT);

        return sqLiteDatabase.update("User", contentValues, "username=?", new String[]{String.valueOf(user.Username)});
    }


}