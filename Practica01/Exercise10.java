import java.util.Scanner;

class Excercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate the circumference using the formula: C = 2 * π * r
        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + circumference);
    }
}

