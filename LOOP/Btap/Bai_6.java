package LOOP.Btap;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
