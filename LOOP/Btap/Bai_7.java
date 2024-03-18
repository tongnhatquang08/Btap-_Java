package LOOP.Btap;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int tich = 1;
        for (int i = 1; i<=20; i++){
            tich = n * i;
            System.out.println(tich);
        }

    }
}
