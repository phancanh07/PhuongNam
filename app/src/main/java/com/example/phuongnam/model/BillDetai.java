package com.example.phuongnam.model;

public class BillDetai {

    public int ID;
    public int idBook;
    public String tenKhachHang;
    public String tenSach;
    public String theLoai;
    public int soSach;
    public double gia;
    public String ngayBan;

    public BillDetai() {
    }

    public BillDetai(int ID, int idBook, String tenKhachHang, String tenSach, String theLoai, int soSach, double gia, String ngayBan) {
        this.ID = ID;
        this.idBook = idBook;
        this.tenKhachHang = tenKhachHang;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.soSach = soSach;
        this.gia = gia;
        this.ngayBan = ngayBan;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getSoSach() {
        return soSach;
    }

    public void setSoSach(int soSach) {
        this.soSach = soSach;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }
}
