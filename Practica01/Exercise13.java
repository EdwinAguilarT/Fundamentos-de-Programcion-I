import java.util.Scanner;
class Excercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate the multip of the series
        int multiplication = 1;
        for (int i = 1; i <= n; i++) {
            multiplication *= i ;
        }

        System.out.println("Multiplication of the series: " + multiplication);
    }
}

