import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter the Number for Find digits :");
            int number = scanner.nextInt();

            if (number < 0 ){
                System.out.println("Programm stopped");
                break;
            }
            int count= 0 ;
            int value = number;

            while (value != 0){
                    value = value /10;
                    count++;

            }
            System.out.println("Number of digits: " + count);

        }








    }
}
