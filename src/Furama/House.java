package Furama;

import java.util.Scanner;

public class House {
    private int soLuongHouse;
    private int soLuongGiuongHouse;
    private String thoiGianThueHouse;
    private double soTienThueHouse;
    public House(){
    }
    public House(int soLuongHouse , int soLuongGiuongHouse, String thoiGianThueHouse, double soTienThueHouse){//hàm dựng có tham số
        this.soLuongHouse=soLuongHouse;
        this.soLuongGiuongHouse=soLuongGiuongHouse;
        this.thoiGianThueHouse=thoiGianThueHouse;
        this.soTienThueHouse=soTienThueHouse;
    }
//    public int getSoLuongHouse() {
//        return soLuongHouse;
//    }
//
//    public void setSoLuongHouse(int soLuongHouse) {
//        this.soLuongHouse = soLuongHouse;
//    }
//
//    public int getSoLuongGiuongHousea() {
//        return soLuongGiuongHouse;
//    }
//
//    public void setSoLuongGiuongHouse(int soLuongGiuongHouse) {
//        this.soLuongGiuongHouse = soLuongGiuongHouse;
//    }
//
//    public String getThoiGianThueHouse() {
//        return thoiGianThueHouse;
//    }
//
//    public void setThoiGianThueHouse(String thoiGianThueHouse) {
//        this.thoiGianThueHouse = thoiGianThueHouse;
//    }

    public double getSoTienThueHouse() {
        return soTienThueHouse;
    }

    public void setSoTienThueHouse(double soTienThueHouse) {
        this.soTienThueHouse = soTienThueHouse;
    }

    public void hienThiHouse(){

        System.out.println("so luong house:"+soLuongHouse);
        System.out.println("so luong giuong house"+soLuongHouse);
        System.out.println("thoi gian thue house"+thoiGianThueHouse);
        System.out.println("so tien thue house"+soTienThueHouse);
    }

}


