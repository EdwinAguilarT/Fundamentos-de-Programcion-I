import java.util.Scanner;

class Excercise01 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number:");
        int number1 = reader.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number:");
        int number2 = reader.nextInt();

        // Display the result
	System.out.println("The sum is " +(number1+number2));
    }
}

