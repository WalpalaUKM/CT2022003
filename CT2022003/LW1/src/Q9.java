import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Text: ");
        String objtext = scanner.nextLine();

        //print length of string
        System.out.println(objtext.length());

        //print first character of string
        System.out.println(objtext.substring(0,1));

        //print last character of string
        char lastChar = objtext.charAt(objtext.length()-1);
        System.out.println(lastChar);


    }
}
