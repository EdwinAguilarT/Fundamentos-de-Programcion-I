import java.util.Scanner;

class Excercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Exam score (50%)
        System.out.print("Enter the exam score (out of 100): ");
        double examScore = scanner.nextDouble();

        // Input: Work folder score (35%)
        System.out.print("Enter the work folder score (out of 100): ");
        double folderScore = scanner.nextDouble();

        // Input: Average of three assignment scores (15%)
        double assignment1, assignment2, assignment3;
        System.out.print("Enter the score for assignment 1 (out of 100): ");
        assignment1 = scanner.nextDouble();
        System.out.print("Enter the score for assignment 2 (out of 100): ");
        assignment2 = scanner.nextDouble();
        System.out.print("Enter the score for assignment 3 (out of 100): ");
        assignment3 = scanner.nextDouble();

        // Calculate the weighted scores
        double weightedExamScore = examScore * 0.50;
        double weightedFolderScore = folderScore * 0.35;
        double weightedAssignmentScore = ((assignment1 + assignment2 + assignment3) / 3) * 0.15;

        // Calculate the final grade
        double finalGrade = weightedExamScore + weightedFolderScore + weightedAssignmentScore;

        // Display the result
        System.out.println("Final Grade: " + finalGrade);
    }
}

