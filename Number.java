public class Number {import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100!\n");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("🎉 Nice! You are a genius! 🎉");
                System.out.println("You got it in " + attempts + " attempts!");
                guessedCorrectly = true;
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        sc.close();
    }
}
    
}
