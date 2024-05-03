import java.util.Scanner;

class Excercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount in soles
        System.out.print("Enter the amount in Peruvian soles (PEN): ");
        double soles = scanner.nextDouble();

        // Prompt the user to enter the exchange rate (PEN to USD)
        System.out.print("Enter the exchange rate (PEN to USD): ");
        double exchangeRate = scanner.nextDouble();

        // Calculate the equivalent amount in US dollars
        double dollars = soles * exchangeRate;

        // Display the result
        System.out.printf("%.2f PEN is equivalent to %.2f USD%n", soles, dollars);
    }
}

