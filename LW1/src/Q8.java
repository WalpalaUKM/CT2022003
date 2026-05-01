import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String with !: ");
        String myStr = scanner.nextLine();

        int exclamation = myStr.indexOf("!");

        String before = myStr.substring(0,exclamation).trim();
        String after = myStr.substring(exclamation+1).trim();

        System.out.println(before);
        System.out.println(after);
    }
}
