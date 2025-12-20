import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Generates a random number between 0 and 99
        int randomNumber = (int)(Math.random() * 100);

        int guess;

        do {
            System.out.println("Guess the Number (0 - 100):");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Nice! You are a genius!");
                break;
            } else if (guess > randomNumber) {
                System.out.println("Nice, but your number is too large.");
            } else {
                System.out.println("Nice, but your number is too small.");
            }

        } while (guess >= 0);

        System.out.println("My number was: " + randomNumber);
    }
}
