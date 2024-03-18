package LOOP.Btap;

import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        Fibonacci(n);
    }
    public static void Fibonacci(int n){
        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num2);
    }
}

