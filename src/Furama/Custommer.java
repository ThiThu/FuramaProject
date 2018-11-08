package Furama;
import Furama.Villa;
import Furama.House;
import Furama.SwimmingPool;

import java.util.Scanner;

public class Custommer {
    private String hoVaTen;
    private int tuoi;
    private int thoiGianThue;
    public Custommer(){}//hàm dựng
    public Custommer(String hoVaTen,int tuoi, int thoiGianThue){
        this.hoVaTen=hoVaTen;
        this.tuoi=tuoi;
        this.thoiGianThue = thoiGianThue;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void hienThiCustommer(){
        System.out.println("ho va ten:"+hoVaTen);
        System.out.println("tuoi:"+tuoi);
    }


    public void disPlayAll() {
        int gioMoCua=9;
        int gioDen=8;
        if (gioDen<gioMoCua){
            System.out.println("Thoi gian den: " + gioDen);
            System.out.println("doi toi gio mo cua:"+gioMoCua);
        }
    }

    public int getThoiGianThue() {
        return thoiGianThue;
    }
}
