package com.example.customlistview;

public class Country {
    private String tenNuoc;
    private String thuDo;
    private int hinh;

    public Country(String tenNuoc, String thuDo, int hinh) {
        this.tenNuoc = tenNuoc;
        this.thuDo = thuDo;
        this.hinh = hinh;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public String getThuDo() {
        return thuDo;
    }

    public void setThuDo(String thuDo) {
        this.thuDo = thuDo;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
