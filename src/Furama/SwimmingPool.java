package Furama;

import java.util.Scanner;

public class SwimmingPool {
    private int soLuongHoBoi;
    private int thoiGianMoCua;
    public SwimmingPool(){}
    public SwimmingPool(int soLuongHoBoi,int thoiGianMoCua){
        this.soLuongHoBoi=soLuongHoBoi;
        this.thoiGianMoCua=thoiGianMoCua;
    }

    public int getSoLuongHoBoi() {//lay gia tri
        Scanner scanner=new Scanner(System.in);
        int soLuongHoBoi=scanner.nextInt();
        System.out.println("hien thi so luong:"+soLuongHoBoi);
        return soLuongHoBoi;
    }
    public void setSoLuongHoBoi(int soLuongHoBoi) {//nhap
        this.soLuongHoBoi = soLuongHoBoi;
    }
//java.util.Date//
    public int getThoiGianMoCua() {
        return 9;
    }

    public void setThoiGianMoCua(int thoiGianMoCua) {
        this.thoiGianMoCua = thoiGianMoCua;
    }

    public void hienThiSwimmingPool(){
        System.out.println("so luong"+getSoLuongHoBoi());
        System.out.println("thoi gia mo:"+getThoiGianMoCua());
    }
}
