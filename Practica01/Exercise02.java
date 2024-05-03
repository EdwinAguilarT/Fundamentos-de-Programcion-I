import java.util.Scanner;

class Excercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter the capital to invest
        System.out.print("Enter the capital amount to invest: ");
        double capital = scanner.nextDouble();

        // Calculate the profit (2% of the capital)
        double profit = capital * 0.02;

        // Display the results
        System.out.println("The profit for the invested capital is: $" + profit);
        System.out.println("The total amount after one month is: $" + (capital + profit));
    }
}

