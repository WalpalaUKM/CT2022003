import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter person's weight :");
        double weight = scanner.nextDouble();

        double calories = weight * 19;
        System.out.println("You want to "+ calories + " calories per day");
    }
}
