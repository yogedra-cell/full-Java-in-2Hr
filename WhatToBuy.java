import java.util.Scanner;

public class WhatToBuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your budget amount: ");
        int budget = scanner.nextInt();

        if (budget <= 0) {
            System.out.println("Invalid amount! Please enter a positive number.");
        } else if (budget < 10) {
            System.out.println("I will buy a pen");
        } else if (budget < 20) {
            System.out.println("I'm gonna drink coffee");
        } else if (budget < 30) {
            System.out.println("I will buy paper");
        } else if (budget < 100) {
            System.out.println("Saving the money");
        } else {
            System.out.println("Invest in shares");
        }

        scanner.close();
    }
}