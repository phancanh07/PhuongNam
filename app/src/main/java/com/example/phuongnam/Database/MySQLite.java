package com.example.phuongnam.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLite extends SQLiteOpenHelper {

//    InfoData infoData = new InfoData();

    public MySQLite(@Nullable Context context) {
        super(context, "MYDATA.SQL", null, 1);
    }

    //Bảng User
    public static final String TABLE_USER = "User";
    public static final String COL_USER_NAME = "username";
    public static final String COL_SO_DIEN_THOAI = "sodt";
    public static final String COL_PASSWORD = "password";
    public static final String COL_EMAIL = "email";


    //Bảng Sách
    public static final String TABLE_SACH = "Sach";
    public static final String COL_IDSACH = "idSach";
    public static final String COL_TEN_SACH = "tenSach";
    public static final String COL_THE_LOAI = "theLoai";
    public static final String COL_TAC_GIA = "tacGia";
    public static final String COL_SO_LUONG_SACH = "soLuongSach";
    public static final String COL_GIA_MUA = "giaMua";
    public static final String COL_GIA_BAN = "giaBan";
    public static final String COL_NGAY_THEM_SACH = "ngayThemSach";

    //Bảng Thể loại
    public static final String TABLE_THELOAI = "Type";
    public static final String COL_ID_THE_LOAI = "idType";
    public static final String COL_TEN_THE_LOAI = "tenTheLoai";
    public static final String COL_SO_LUONG_THE_LOAI = "soLuongTheLoai";


    //Bảng Hóa đơn
    public static final String TABLE_BILL = "Bill";
    public static final String COL_IDBILL = "idBill";
    public static final String COL_NAMEBILL = "nameBill";
    public static final String COL_PRICEBILL = "priceBill";
    public static final String COL_NGAY_BAN = "ngayBan";


    //Bảng Hóa đơn chi tiết
    public static final String TABLE_HOA_DON_CHI_TIET = "Hoa_Don_Chi_Tiet";
    public static final String COL_ID_HOA_DON_CHI_TIET = "idHDChiTiet";
    public static final String COL_TEN_HOA_DON_CHI_TIET = "tenHoaDon";
    public static final String COL_ID_SACH_CHI_TIET = "idSachChiTiet";
    public static final String COL_TEN_SACH_CHI_TIET = "tenSachChiTiet";
    public static final String COL_THE_LOAI_SACH_CHI_TIET = "theLoaiChiTiet";
    public static final String COL_SO_LUONG_SACH_CHI_TIET = "soLuongSachChiTiet";
    public static final String COL_GIA_CHI_TIET = "giaChiTiet";
    public static final String COL_TEN_KHACH_HANG_CHI_TIET = "tenKhachHangChiTiet";
    public static final String COL_NGAY_BAN_CHI_CHI_TIET = "ngayBanChiTiet";


    @Override
    public void onCreate(SQLiteDatabase db) {
//username
        final String CREATE_USER = "create table " + TABLE_USER
                + " (" + COL_USER_NAME + " text primary key, "
                + COL_PASSWORD + " text," + COL_EMAIL + " text," + COL_SO_DIEN_THOAI + "text)";
        db.execSQL(CREATE_USER);

        // sách
        final String CREAT_SACH = "create table " + TABLE_SACH
                + " (" + COL_IDSACH + " int primary key autoincrement, "
                + COL_TEN_SACH + " text, "
                + COL_THE_LOAI + " text, "
                + COL_TAC_GIA + " text, "
                + COL_SO_LUONG_SACH + " int, "
                + COL_GIA_MUA + " double, "
                + COL_GIA_BAN + " double, "
                + COL_NGAY_THEM_SACH + " text)";
        db.execSQL(CREAT_SACH);
        //Tạo bảng thể loại
        final String CREATE_THE_LOAI = "create table " + TABLE_THELOAI
                + " (" + COL_ID_THE_LOAI + " int primary key autoincrement, "
                + COL_TEN_THE_LOAI + " text, "
                + COL_SO_LUONG_THE_LOAI + " int)";
        db.execSQL(CREATE_THE_LOAI);

        //Tạo bảng Hóa đơn
        final String CREATE_BILL = "create table " + TABLE_BILL
                + " (" + COL_IDBILL + " int primary key autoincrement, "
                + COL_NAMEBILL + " text, "
                + COL_PRICEBILL + " double, "
                + COL_NGAY_BAN + " text)";
        db.execSQL(CREATE_BILL);

        //Tạo bảng Hóa đơn chi tiết
        final String CREATE_HOA_DON_CHI_TIET = "create table " + TABLE_HOA_DON_CHI_TIET
                + " (" + COL_ID_HOA_DON_CHI_TIET + " int primary key autoincrement, "
                + COL_ID_SACH_CHI_TIET + " text, "
                + COL_ID_HOA_DON_CHI_TIET + " int, "
                + COL_TEN_HOA_DON_CHI_TIET + " text, "
                + COL_TEN_SACH_CHI_TIET + " text, "
                + COL_THE_LOAI_SACH_CHI_TIET + " text, "
                + COL_SO_LUONG_SACH_CHI_TIET + " int, "
                + COL_GIA_CHI_TIET + " double, "
                + COL_TEN_KHACH_HANG_CHI_TIET + " text, "
                + COL_NGAY_BAN_CHI_CHI_TIET + " text)";
        db.execSQL(CREATE_HOA_DON_CHI_TIET);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_USER);
        db.execSQL("drop table if exists " + TABLE_SACH);
        db.execSQL("drop table if exists " + TABLE_THELOAI);
        db.execSQL("drop table if exists " + TABLE_BILL);
        db.execSQL("drop table if exists " + TABLE_HOA_DON_CHI_TIET);
        onCreate(db);

    }
}
