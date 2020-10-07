package com.example.phuongnam.model;

public class Book {
    public int IDSach;
    public String tenSach;
    public String theLoai;
    public String tacGia;
    public String nhaXuatBan;
    public int soSach;
    public double giaMua;
    public double giaBan;
    public String ngayNhap;

    public Book() {
    }

    public Book(int IDSach, String tenSach, String theLoai, String tacGia, String nhaXuatBan, int soSach, double giaMua, double giaBan, String ngayNhap) {

        this.IDSach = IDSach;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.soSach = soSach;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.ngayNhap = ngayNhap;
    }

    public int getIDSach() {
        return IDSach;
    }

    public void setIDSach(int IDSach) {
        this.IDSach = IDSach;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoSach() {
        return soSach;
    }

    public void setSoSach(int soSach) {
        this.soSach = soSach;
    }

    public double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(double giaMua) {
        this.giaMua = giaMua;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}

