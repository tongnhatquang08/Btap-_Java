package LOOP.Btap;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student code: ");
        String studentCode = scanner.nextLine();
        scanner.close();

        if (studentCode.matches("B[1-9]{7}")) {
            System.out.println("The student code is valid.");
        } else {
            System.out.println("The student code is invalid.");
        }
    }
}
