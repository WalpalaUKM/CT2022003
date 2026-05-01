import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature Celsius:");
        double tempCel = scanner.nextDouble();

        double tempFahrrenheit = ((1.8*tempCel)+32);
        System.out.println(tempFahrrenheit +" Fahrenheit");

    }
}
