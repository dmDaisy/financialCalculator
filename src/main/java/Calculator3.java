import java.util.*;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator 3: Present Value of an Ordinary Annuity");

        System.out.print("Enter monthly payout: ");
        double monthlyPayout = scanner.nextDouble();

        System.out.print("Enter expected interest in percentage: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter number of years to payout: ");
        int years = scanner.nextInt();

        double monthlyRate = annualRate / 100 / 12;
        int totalPayments = years * 12;

        /*
        formula:
        P: monthly payout
        r: monthly rate
        n: total number of payments
         */
        double presentValue = monthlyPayout *
                (1 - Math.pow(1 + monthlyRate, -totalPayments)) / monthlyRate;

        System.out.printf("Total invest today: $%.2f\n", presentValue);
        scanner.close();
    }
}
