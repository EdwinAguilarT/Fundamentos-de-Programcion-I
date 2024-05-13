//2. A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a $1000. Por
//encima de $1000 y hasta $2000 el 5% del adicional (diferencia con respecto a sueldo base de
//$1000), y por encima de $2000 el 3% del adicional. Calcular el descuento y sueldo neto que
//recibe el trabajador dado su sueldo.
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the worker's salary: $");
        double salary = scanner.nextDouble();
        scanner.close();

        double discount;
        if (salary <= 1000) {
            discount = 0.10 * salary;
        } else if (salary <= 2000) {
            discount = 0.15 * salary;
        } else {
            discount = 0.83 * salary;
        }

        double netSalary = salary - discount;
        System.out.println("Discount: $" + discount);
        System.out.println("Net Salary: $" + netSalary);
    }
}

