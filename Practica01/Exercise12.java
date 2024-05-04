import java.util.Scanner;

class Excercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int n = scanner.nextInt();

        // Calculate the number of matches
        int matches = n * (n - 1) / 2;

        System.out.println("Number of matches in the first round: " + matches);
    }
}

