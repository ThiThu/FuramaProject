package Furama;

import java.util.Scanner;

public class Furama1 {
    public static void main(String[] args) {
//        //Villa
//        int soLuongVilla;
//        int soLuongGiuongVilla;
//        int thoiGianThueVilla;
//        int soTienThueVilla;
//        //House
//        int soLuongHouse;
//        int soLuongGiuongHouse;
//        int thoiGianThueHouse;
//        int soTienThueHouse;
//        //HoBoi
//        int soLuongHoBoi;
//        int thoiGianThueHoBoi;
//        //Khach thue
//        String hoVaTen;
//        int doTuoi;
//        int ngayThue;
//        int soTienPhaiTra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên khách hàng:");
        String hoVaTen = scanner.nextLine();
        System.out.println("Nhập tuổi khách hàng:");
        int doTuoi = scanner.nextInt();
        System.out.println("Menu");
        System.out.println("1.Villa");
        System.out.println("2.House");
        System.out.println("3.Exit");
        System.out.println("Nhập loại phòng cần thuê:");
        int loaiPhong = scanner.nextInt();
        switch (loaiPhong) {
            case 1:
                villa();
                break;
            case 2:
                house();
                break;
            case 3:
                System.out.println("Exit");
                break;
        }
        hoBoi();
        System.out.println("Nhập số tiền mang theo:");
        int soTienMangTheo = scanner.nextInt();
        System.out.println("số ngày có thể ở trong villa:" + (soTienMangTheo / 10));
    }

    private static void villa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thuê bao nhiêu ngày ở Villa:");
        int thoiGianThueVilla = scanner.nextInt();
        int tinhTienVilla = thoiGianThueVilla * 10;
        System.out.println("Tổng số tiền phải trả:" + tinhTienVilla);
        System.out.println("---------------");
    }

    private static void house() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thuê bao nhiêu ngày ở House:");
        int thoiGianThueHouse = scanner.nextInt();
        int tinhTienHouse = thoiGianThueHouse * 10;
        System.out.println("Tổng số tiền phải trả:" + tinhTienHouse);
        System.out.println("----------------------");
    }

    private static void hoBoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khách đến vào lúc:");
        int gioKhachDen = scanner.nextInt();
        System.out.println("quy định giờ mở cửa:");
        int gioMoCua = scanner.nextInt();
        if (gioKhachDen <= gioMoCua) {
            System.out.println("Chưa mở cửa.Vui lòng đợi đến 9h");


        } else if (gioKhachDen > gioMoCua) {
            System.out.println("Mở cửa,Mời khách vào");
            return;
        }

    }
}



