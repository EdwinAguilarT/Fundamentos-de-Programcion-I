import java.util.Scanner;

class Excercise08 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        // Prompt the user to enter the width
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Display the calculated area
        System.out.println("Area of the rectangle is: " + area);
    }
}

