import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dispaly;

        System.out.print("Enter the power of 10:");
        int power = scanner.nextInt();

        switch (power){
            case 6:
                dispaly = "Million";
                break;
            case 9:
                dispaly = "Billion";
                break;
            case 12:
                dispaly = "Trillion";
                break;
            case 15:
                dispaly = "Quadrillion";
                break;
            case 18:
                dispaly = "Quintillion";
                break;
            case 21:
                dispaly = "Sextillion";
                break;
            case 30:
                dispaly = "Nonillion";
                break;
            case 100:
                dispaly = "Googol";
                break;
            default:
                dispaly = "No corresponding word found.";
        }
        System.out.println(dispaly);

    }
}
