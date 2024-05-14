// 7. Un hombre desea saber cuánto dinero se genera al año por concepto de interés sobre la cantidad
//    que tiene en una cuenta bancaria y si debe seguir invirtiendo en él. El decidirá seguir invirtiendo
//    siempre y cuando los intereses del presente año excedan a $70, y en ese caso desea saber
//    cuánto dinero en total tendrá a fin de año en su cuenta. La tasa de interés es anual.
import java.util.Scanner;


class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: $");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();
        scanner.close();

        // Calculate interest for one year
        double interest = principal * annualInterestRate / 100;

        // Check if interest exceeds $70
        if (interest > 70) {
            double totalAmount = principal + interest;
            System.out.println("Interest earned this year: $" + interest);
            System.out.println("Total amount at the end of the year: $" + totalAmount);
            System.out.println("You should continue investing.");
        } else {
            System.out.println("Interest earned this year: $" + interest);
            System.out.println("You should reconsider your investment strategy.");
        }
    }
}

