import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int a=1 ; a<= rows -i ; a++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=(2 * i - 1) ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}