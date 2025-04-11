import java.util.*;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator 1: Mortgage Calculator");

        System.out.print("Enter principal: $");
        double p = scanner.nextDouble();

        System.out.print("Enter annual interest rate in percentage(e.g. 3.5): ");
        double r = scanner.nextDouble();

        System.out.print("Enter loan length in years: ");
        int y = scanner.nextInt();

        // i : monthlyRate
        // n : total times of payment
        double i = r / 100 / 12;
        int n = y * 12;

        // m : monthly payment
        double m = p * (i * Math.pow(1 + i, n)) /
                (Math.pow(1 + i, n) - 1);

        double totalPayment = m * n;
        double totalInterest = totalPayment - p;

        // Display results
        System.out.printf("Monthly Payment: $%.2f\n", m);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);
        scanner.close();
    }
}
