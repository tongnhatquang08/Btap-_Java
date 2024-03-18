package LOOP.Btap;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap so nguyen n: ");
        n = scanner.nextInt();
        DocSo(n);
    }
    public static void DocSo(int n) {
        int chuc = n / 10 % 10;
        int donvi = n % 10;

        switch (chuc) {
            case 1:
                System.out.print("Muoi ");
                break;
            case 2:
                System.out.print("Hai Muoi ");
                break;
            case 3:
                System.out.print("Ba Muoi ");
                break;
            case 4:
                System.out.print("Bon Muoi ");
                break;
            case 5:
                System.out.print("Nam Muoi ");
                break;
            case 6:
                System.out.print("Sau Muoi ");
                break;
            case 7:
                System.out.print("Bay Muoi ");
                break;
            case 8:
                System.out.print("Tam Muoi ");
                break;
            case 9:
                System.out.print("Chin Muoi ");
                break;
        }
        switch (donvi) {
            case 5:
                if (chuc == 0) {
                    System.out.print("Nam ");
                    break;
                } else {
                    System.out.print("Lam ");
                    break;
                }
            case 1:
                System.out.print("Mot");
                break;
            case 2:
                System.out.print("Hai");
                break;
            case 3:
                System.out.print("Ba");
                break;
            case 4:
                System.out.print("Bon");
                break;
            case 6:
                System.out.print("Sau");
                break;
            case 7:
                System.out.print("Bay");
                break;
            case 8:
                System.out.print("Tam");
                break;
            case 9:
                System.out.print("Chin");
                break;
        }
    }
}


