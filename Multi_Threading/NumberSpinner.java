package Multi_Threading;

import java.util.Scanner;

public class NumberSpinner extends Thread {
    private boolean running = true;
    private int currentNumber = 0;

    @Override
    public void run() {
        int number = 0;
        boolean increasing = true;

        while (running) {
            System.out.println(number);
            currentNumber = number;

            if (increasing) {
                number++;
                if (number == 100) {
                    increasing = false;
                }
            } else {
                number--;
                if (number == 0) {
                    increasing = true;
                }
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopSpinner() {
        running = false;
    }
    public int getCurrentNumber() {
        return currentNumber;
    }
    public static void main(String[] args) {
        NumberSpinner spinner = new NumberSpinner();
        spinner.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhấn Enter để dừng quay số.");
        scanner.nextLine();
        spinner.stopSpinner();
        try {
            spinner.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Con số đã quay: " + spinner.getCurrentNumber());
    }
}
