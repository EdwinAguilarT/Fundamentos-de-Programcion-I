// 5. Un programa que lea dos números y los imprima en forma ascendente.

import java.util.Scanner;

class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();

        if (num1 <= num2) {
            System.out.println("Ascending order: " + num1 + ", " + num2);
        } else {
            System.out.println("Ascending order: " + num2 + ", " + num1);
        }
    }
}

