package Furama;

import java.util.Scanner;

public class Villa {
    private int soLuongVilla;
    private int soLuongGiuongVilla;
    private String thoiGianThueVilla;
    private double soTienThueVilla;
    public Villa(){
    }
    public Villa(int soLuongVilla, int soLuongGiuongVilla, String thoiGianThueVilla,double soTienThueVilla){//hàm dựng có tham số
        this.soLuongVilla=soLuongVilla;
        this.soLuongGiuongVilla=soLuongGiuongVilla;
        this.thoiGianThueVilla=thoiGianThueVilla;
        this.soTienThueVilla=soTienThueVilla;
    }
    public int getSoLuongVilla() {
        return soLuongVilla;
    }
    public void setSoLuongVilla(int soLuongVilla) {
        this.soLuongVilla = soLuongVilla;
    }
    public int getSoLuongGiuongVilla() {
        return soLuongGiuongVilla;
    }
    public void setSoLuongGiuongVilla(int soLuongGiuongVilla) {
        this.soLuongGiuongVilla = soLuongGiuongVilla;
    }
    public String getThoiGianThueVilla() {
        return thoiGianThueVilla;
    }
    public void setThoiGianThueVilla(String thoiGianThueVilla) {
        this.thoiGianThueVilla = thoiGianThueVilla;
    }
    public double getSoTienThueVilla() {
        return 100;
    }
    public void setSoTienThueVilla(double soTienThueVilla) {
        this.soTienThueVilla = soTienThueVilla;
    }

    public void hienThiVill(){
        System.out.println("so luong villa:"+soLuongVilla);
        System.out.println("so luong giuong villa"+soLuongGiuongVilla);
        System.out.println("thoi gian thue villa"+thoiGianThueVilla);
        System.out.println("so tien thue villa"+soTienThueVilla);
    }

}
