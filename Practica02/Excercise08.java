//  8. Programa que me diga si un estudiante está aprobado o no, y su nota respectiva, basándose en
//  las condiciones:
//    Está aprobado si sus notas de teoría y de práctica son aprobatorias
//    El promedio que se calcula por la fórmula NF=0.75*NT+0.25*NP, en caso sea aprobado, si
//     no la nota final es la mínima de sus notas.

import java.util.Scanner;
class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the theory score: ");
        double theoryScore = scanner.nextDouble();
        System.out.print("Enter the practice score: ");
        double practiceScore = scanner.nextDouble();
        scanner.close();

        if (theoryScore >= 13 && practiceScore >= 13) {
            double finalGrade = 0.75 * theoryScore + 0.25 * practiceScore;
            System.out.println(" (Pass)");
            System.out.println("Final grade: " +finalGrade);
        } else {
            // If failed, the final grade is the minimum of the two scores
            double minScore = Math.min(theoryScore, practiceScore);
            System.out.println("Does not meet the minimum passing grade. (Fail)");
            System.out.println("Final grade: " + minScore);
        }
    }
}

