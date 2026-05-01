import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Name: ");
        String myFname = scanner.next();

        System.out.println("Enter Your First Name: ");
        String myMname = scanner.next();

        System.out.println("Enter Your First Name: ");
        String myLname = scanner.next();

        System.out.println(myLname + "," + myFname +" " + myMname.substring(0,1));
    }
}
