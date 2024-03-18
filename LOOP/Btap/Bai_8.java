package LOOP.Btap;

import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int count;
        for (int i = 2; i<=n;i++){
            count = 0;
            for(int j = 2; j<=i/2;j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
