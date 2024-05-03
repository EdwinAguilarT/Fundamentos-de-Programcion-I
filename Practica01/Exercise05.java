import java.util.Scanner;

class Excercise05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total hospital budget
        System.out.print("Enter the total hospital budget: ");
        double totalBudget = scanner.nextDouble();

        // Calculate the amounts for each area
        double gynecologyAmount = totalBudget * 0.45;
        double traumatologyAmount = totalBudget * 0.30;
        double pediatricsAmount = totalBudget * 0.25;

        // Display the results
        System.out.println("Amount for Gynecology: $" + gynecologyAmount);
        System.out.println("Amount for Traumatology: $" + traumatologyAmount);
        System.out.println("Amount for Pediatrics: $" + pediatricsAmount);
    }
}

