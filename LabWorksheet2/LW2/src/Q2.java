import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length centimeter :");
        double cmLen = scanner.nextDouble();

        double totInches = (cmLen/2.54);

        int totFeet = (int)(totInches/12);
        double inches = (totInches % 12);

        System.out.printf("%d feet %.2f inches",totFeet,inches);

    }
}