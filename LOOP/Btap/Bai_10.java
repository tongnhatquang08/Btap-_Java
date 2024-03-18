package LOOP.Btap;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            System.out.println("Please enter student code " + (count + 1) + ": ");
            String studentCode = scanner.nextLine();

            // Regular expression pattern for student code "B170xxxx"
            String patternString = "B170[1-9]{4}";
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(studentCode);

            if (matcher.matches()) {
                count++;
                System.out.println("The student code is valid.");
            } else {
                System.out.println("The student code is invalid.");
            }
        }

        System.out.println("You have successfully entered 5 student codes.");
    }
}
