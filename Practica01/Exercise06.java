import java.util.Scanner;

class Excercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = ((celsius * 9) / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

