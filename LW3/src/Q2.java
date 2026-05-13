import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Output;

        /*System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");*/

        System.out.print("Select the Number (0-4):");
        int selectNumber = scanner.nextInt();

        switch (selectNumber){
            case 0:
                Output = "You are selected Magenta";
                break;
            case 1:
                Output = "You are selected Cyan";
                break;
            case 2:
                Output = "You are selected Red";
                break;
            case 3:
                Output = "You are selected Blue";
                break;
            case 4:
                Output = "You are selected Green";
                break;
            default:
                Output = "Invalid selection";
        }

        System.out.println(Output);

    }
}
