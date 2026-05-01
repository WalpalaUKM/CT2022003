import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your String: ");
        String myString = scanner.next();

        int middleNo = ((myString.length())/2);
        System.out.println(myString.substring(middleNo,middleNo+1));



    }
}
