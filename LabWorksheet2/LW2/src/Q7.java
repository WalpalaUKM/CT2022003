import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your weight(Kg) :");
        int weight = scanner.nextInt();
        System.out.println("Enter Your Height(cm) :");
        int height = scanner.nextInt();

        double bmi = (weight/ Math.pow(height/100.0,2));

        if (bmi>=20 && bmi<=25){
            System.out.println("Your BMI is normal");
        }else {
            System.out.println("Your BMI is not normal");
        }

        System.out.printf("Your BMI is %.2f",bmi);
    }
}
