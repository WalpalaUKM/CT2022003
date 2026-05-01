
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your BirthYear:");
        int birthYear = scanner.nextInt();

        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);

        int age = (year - birthYear);

        System.out.printf("You were born in %d and will be (are) %d this year",birthYear,age);


    }
}
