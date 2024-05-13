// 4:Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobará si su promedio
//   de tres calificaciones es mayor o igual a 13; reprueba en caso contrario.
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three grades (separated by spaces): ");
        double grade1 = scanner.nextDouble();
        double grade2 = scanner.nextDouble();
        double grade3 = scanner.nextDouble();
        scanner.close();

        double average = (grade1 + grade2 + grade3) / 3;
        if (average >= 13) {
            System.out.println(average+" The student passes.");
        } else {
            System.out.println(average+" The student fails.");
        }
    }
}

