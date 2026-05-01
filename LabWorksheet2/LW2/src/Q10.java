import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        final int monthsInYear = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Loan Amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter Your Annual Rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter Your Loan period: ");
        double loanPeriod = scanner.nextDouble();

        double monthlyInterestRate = (annualInterestRate /100.0 / monthsInYear);
        double numberOfPayments = loanPeriod*monthsInYear;
        double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.printf("Monthly Payment : %.2f%n",monthlyPayment);
        System.out.printf("Total Payment : %.2f%n",totalPayment);
    }
}
