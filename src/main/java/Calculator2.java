import java.util.*;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator 2: Future Value Calculator");

        System.out.print("Enter deposit: ");
        double p = scanner.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int t = scanner.nextInt();

        // r: dailyRate
        double r = annualRate / 100;

        // FV: Future Value
        double FV = p * Math.pow((1 + r / 365), t * 365);
        double totalInterest = FV - p;

        System.out.printf("Future Value: $%.2f\n", FV);
        System.out.printf("Total Interest Earned: $%.2f\n", totalInterest);
        scanner.close();
    }
}