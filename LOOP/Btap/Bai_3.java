package LOOP.Btap;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 số thực:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Đây là 3 cạnh của tam giác");
        }
        else{
            System.out.println("Đây ko là 3 cạnh của tam giác");
        }
    }
}
