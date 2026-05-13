import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number You want to multiplication table:");
        int num = scanner.nextInt();

        for (int i=1 ;  i<=10 ; i++){
            int output = num * i;
            System.out.printf("%d x %d = %d\n", num, i, output);
        }
    }
}
