import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int firstN,secondN,thirdN;
        int smallest;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Integer:");
        firstN = scanner.nextInt();
        System.out.print("Enter Second Integer:");
        secondN = scanner.nextInt();
        System.out.print("Enter Third Integer:");
        thirdN = scanner.nextInt();


        if (firstN <= secondN && firstN <= thirdN ){
            smallest = firstN;
        }
        else if (secondN <= firstN && secondN <= thirdN){
            smallest = secondN;
        }
        else {
            smallest = thirdN;
        }

        System.out.println("Smallest number is :"+ smallest);
    }
}
