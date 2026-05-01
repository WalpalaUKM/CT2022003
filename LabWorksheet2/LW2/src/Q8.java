import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        final double PI =3.14;
        Scanner scanner = new Scanner(System.in);
        double volume;

        System.out.print("Enter radius of sphere(cm):");
        double radius = scanner.nextFloat();

        volume = (4.0/3.0) * (PI*Math.pow(radius,3));

        System.out.printf("Volume of the sphere %.3f cm³",volume);

    }
}
