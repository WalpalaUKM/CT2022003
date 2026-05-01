import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("I Love Java");
        System.out.println("Shopping List:");
        System.out.println("\t\t\t\tApple");
        System.out.println("\t\t\t\tBanana");
        System.out.println("\t\t\t\tLow fat Milk");

        System.out.println("Shopping List:\n\tApple\n\tBanana\n\tLow fat Milk");

        String country ="Sri Lanka";
        System.out.println("I love "+country);
        System.out.println(country.length());
        System.out.println(country.indexOf("L"));
        System.out.println(country.substring(4));*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your First Name:");
        String fname = scanner.next();
        System.out.print("Enter Your Middle Name:");
        String mname = scanner.next();
        System.out.print("Enter Your Last Name:");
        String lname = scanner.next();
        System.out.println("Hi "+fname.substring(0,1)+"."+ mname+" "+lname);




    }

}
