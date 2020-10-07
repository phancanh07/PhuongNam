package com.example.phuongnam.model;

public class TheLoai {
    public int ID;
    public String tenTl;
    public int soluongtl;




    public TheLoai() {
    }

    public TheLoai(int ID, String tenTl, int soluongtl) {
        this.ID = ID;
        this.tenTl = tenTl;
        this.soluongtl = soluongtl;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenTl() {
        return tenTl;
    }

    public void setTenTl(String tenTl) {
        this.tenTl = tenTl;
    }

    public int getSoluongtl() {
        return soluongtl;
    }

    public void setSoluongtl(int soluongtl) {
        this.soluongtl = soluongtl;
    }
}
