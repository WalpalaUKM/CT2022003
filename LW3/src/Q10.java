import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = scanner.nextLine();

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equalsIgnoreCase(reverse)) {
            System.out.println("This is a Palindrome.");
        }
        else {
            System.out.println("This is Not a Palindrome.");
        }

    }
}