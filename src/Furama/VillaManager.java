package Furama;

import java.util.Scanner;

public class VillaManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongVilla;
        String temp;
        do {
            System.out.print("Nhập số lượng villa: ");
            temp = scanner.nextLine();
            soLuongVilla = Integer.parseInt(temp);
            if (soLuongVilla > 0) break;
            else System.out.println("Ko hop le! Nhap lai");
        } while (true);
        String[][] danhSachVilla = new String[3][soLuongVilla];
        //Nhập
        for (int tungCaiVilla = 0; tungCaiVilla < soLuongVilla; tungCaiVilla++) {
            System.out.print("Nhập tên: ");
            danhSachVilla[0][tungCaiVilla] = scanner.nextLine();
            System.out.print("Nhập số giường: ");
            danhSachVilla[1][tungCaiVilla] = scanner.nextLine();
            System.out.print("Nhập hồ bơi: ");
            danhSachVilla[2][tungCaiVilla] = scanner.nextLine();

        }
        //in
        for (int tungCaiVilla = 0; tungCaiVilla < soLuongVilla; tungCaiVilla++) {
            System.out.print("Tên: " + danhSachVilla[0][tungCaiVilla]);
            System.out.print("\t________số giường: " + danhSachVilla[1][tungCaiVilla]);
            System.out.println("\t________số hồ bơi: " + danhSachVilla[2][tungCaiVilla]);
        }
    }
}


//       int [][] villa=new int[3];
//        for (int giuong = 0; giuong <villa.length ; giuong++){
//            for (int hoBoi = 0; hoBoi <villa[giuong].length; hoBoi++) {
//                System.out.print("Villa thu [" + giuong + "," + hoBoi + "]: ");
//                villa[giuong][hoBoi]=scanner.nextInt();
//
//            }
//        }
//        for(int giuong= 0;giuong<villa.length;giuong++){
//            for (int hoBoi = 0; hoBoi <villa[giuong].length ; hoBoi++) {
//                System.out.print(villa[giuong][hoBoi]+"\t ");
//            }
//            System.out.println("");
//        }
//        houseManager();
//        }

//    public static void houseManager(){
//        Scanner scanner = new Scanner(System.in);
//        int [][] house= new int[2][2];
//        for (int i = 0; i <house.length ; i++) {
//            for (int j = 0; j <house[i].length ; j++) {
//                System.out.print("Villa thu [" + i + "," + j + "]: ");
//                house[i][j]=scanner.nextInt();
//            }
//        }
//        for (int i = 0; i <house.length ; i++) {
//            for (int j = 0; j <house[i].length ; j++) {
//                System.out.println(house[i][j]);
//
//            }
//        }


//    }


