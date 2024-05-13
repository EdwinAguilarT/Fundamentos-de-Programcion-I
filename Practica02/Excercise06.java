//6. Dados 2 enteros, deseo saber todos los posibles operadores relacionales aplicables.

import java.util.Scanner;

class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        scanner.close();

        // Equality
        boolean isEqual = num1 == num2;
        System.out.println("Equal: " + isEqual);

        // Not equal
        boolean isNotEqual = num1 != num2;
        System.out.println("Not Equal: " + isNotEqual);

        // Greater than
        boolean isGreater = num1 > num2;
        System.out.println("Greater than: " + isGreater);

        // Less than
        boolean isLess = num1 < num2;
        System.out.println("Less than: " + isLess);

        // Greater than or equal to
        boolean isGreaterOrEqual = num1 >= num2;
        System.out.println("Greater than or Equal to: " + isGreaterOrEqual);

        // Less than or equal to
        boolean isLessOrEqual = num1 <= num2;
        System.out.println("Less than or Equal to: " + isLessOrEqual);
    }
}

