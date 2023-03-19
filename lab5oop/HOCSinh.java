/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5oop;

/**
 *
 * @author ADMIN
 */
public class HOCSinh {
    private String hoTen;
    private String lop;
    float toan=4;
    float ly=4;
    float hoa=5;
    public HOCSinh(){}
    public HOCSinh(String hoTen, String lop,float toan,float ly,float hoa){
        this.hoTen=hoTen;
        this.lop=lop;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public float getToan() {
        return toan;
    }

    public float getLy() {
        return ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    public float DiemTB(){
        float s;
        return  s = (this.toan+this.ly+this.hoa)/3;
    }
}
class HocSinhChuyenToan extends HOCSinh{
     public float DiemTBToan(){
        float a;
        return  a= (this.hoa+this.toan*2+this.ly)/4;
    }
}

public class Main{
    public static void main(String[] args){
        HocSinhChuyenToan b = new HocSinhChuyenToan();
        System.out.println("  "+b.DiemTBToan());
    }
}
