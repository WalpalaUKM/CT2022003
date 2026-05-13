import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;

        int guess;

        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Lower number!");
            }
            else if (guess < randomNumber) {
                System.out.println("Higher number!");
            }
            else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }

    }
}