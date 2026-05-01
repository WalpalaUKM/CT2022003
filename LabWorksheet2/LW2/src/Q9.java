import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        double P,R,investment;
        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial money (P): ");
        P = scanner.nextDouble();

        System.out.print("Enter interest rate (R): ");
        R = scanner.nextDouble();

        System.out.print("Enter years (N): ");
        N = scanner.nextInt();

        investment = P *(Math.pow(1+(R /100.0),N));

        System.out.printf("Final amount %.2f after %d years ",investment,N);



    }
}
