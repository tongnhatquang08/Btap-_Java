package LOOP.Btap;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 số thực:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a){
            if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b){
                System.out.println("Đây là 3 cạnh của tam giác vuông");
            }
            else{
                System.out.println("Đây là 3 cạnh của tam giác nhưng kphai tam giác vuông");
            }
        }
        else{
            System.out.println("Đây ko là 3 cạnh của tam giác");
        }
    }
}
