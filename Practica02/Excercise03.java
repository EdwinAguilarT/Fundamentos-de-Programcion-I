//3. Dado un monto calcular el descuento considerando que por encima de 100 el descuento es el
//   10% y por debajo de 100 el descuento es el 2%.
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount: $");
        double amount = scanner.nextDouble();
        scanner.close();

        double discount;
        if (amount > 100) {
            discount = 0.10 * amount;
        } else {
            discount = 0.02 * amount;
        }

        System.out.println("Discount: $" + discount);
    }
}

