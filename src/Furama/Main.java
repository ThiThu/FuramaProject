package Furama;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       // Villa villa=new Villa(3, );//đối tượng villa
       // villa.setSoLuongVilla();//thuộc tính của villa____
        Scanner scanner = new Scanner(System.in);
        SwimmingPool swimmingPool = new SwimmingPool();
        Villa villa = new Villa();// doi tuong-tham chieu den doi tuong
        House house = new House();
        Custommer custommer = new Custommer("Nguyen Van A", 20,2);
        System.out.println("Nhap loai hinh muon thue: ");
        String loaiHinh = scanner.nextLine();
        switch(loaiHinh){
            case"Villa":
                System.out.println("Tong tien can phai tra: " + villa.getSoTienThueVilla()*custommer.getThoiGianThue());
                break;
            case "House":
                System.out.println("tong tien can phai tra:"+house.getSoTienThueHouse()*custommer.getThoiGianThue());
                break;
        }
        swimmingPool.hienThiSwimmingPool();
        custommer.disPlayAll();//hien thi
        System.out.println("nhap so tien mang theo:");
        int soTienMangTheo=scanner.nextInt();
        System.out.println("so ngay co the o"+(soTienMangTheo/10));
    }
}
//Raisingthebar