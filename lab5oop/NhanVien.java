/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5oop;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
   
    private String ten;
    private long luong;

    public NhanVien() {}

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public String loaiNhanVien() {
        return "";
    }

    public void tinhluong() {}

    public void xuatthongtin() {}
}

class NhanVienFullTime extends NhanVien {
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhân viên Full-time";
    }

    @Override
    public void tinhluong() {
        // Thực hiện tính lương cho nhân viên Full-time
    }

    @Override
    public void xuatthongtin() {
        // Xuất thông tin của nhân viên Full-time
    }
}

class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhân viên Part-time";
    }

    @Override
    public void tinhluong() {
        // Thực hiện tính lương cho nhân viên Part-time
    }

    @Override
    public void xuatthongtin() {
        // Xuất thông tin của nhân viên Part-time
    }
}
public class Main {
    public static void main(String[] args) {
        NhanVienFullTime a = new NhanVienFullTime("Nguyen Van A", 10, 1, "Full-time");
        NhanVienPartTime b = new NhanVienPartTime("Tran Thi B", 30);

       a.xuatThongTin();
       b.xuatThongTin();
    }
}


