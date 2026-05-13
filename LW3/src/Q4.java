import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year :");
        int Year =  scanner.nextInt();

        if(Year%4 == 0 && Year%100 != 0 || Year%400 == 0){
            System.out.printf("You Enter %d.This is a Leap Year ",Year);
        }
        else {
            System.out.printf("You Enter %d. This is Not a Leap Year", Year);
        }
    }
}
