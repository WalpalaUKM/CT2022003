import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature Fahrenheit:");
        double tempFht = scanner.nextDouble();

        double celsius =((5.0/9.0)*(tempFht-32));
        System.out.println(celsius + " celsius");
    }
}
