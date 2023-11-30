import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta >= 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1 of x: " + root1);
            System.out.println("Root 2 of x: " + root2);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(Math.abs(delta)) / (2 * a);
            System.out.println("Root 1 of x: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 of x: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}

