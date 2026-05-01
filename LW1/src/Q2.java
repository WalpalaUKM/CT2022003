import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your First Name:");
        String fname = scanner.next();

        System.out.print("Enter Your Last Name:");
        String lanme = scanner.next();

        System.out.print(fname + " " + lanme);
    }
}
