import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Task 1
         * difference check between a, b and c
         */

        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: a, b and c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        numCheck(a, b, c);

        /* Task 2
         * kg transfer to milligrams, grams and tons
         */

        double weight;
        System.out.println("\nEnter dinosaur weight");
        weight = scanner.nextDouble();
        weightTransfer(weight);

    }

    public static void numCheck(double a, double b, double c) {

        if (a!=b && b!=c && a!=c) {
            System.out.println("All 3 numbers are different");
        } else if (a==b && b==c && a==c) {
            System.out.println("All 3 numbers are the same");
        } else if (a!=b && b==c) {
            System.out.println("b == c, but a != b and a != c");
        } else if (a==b && b!=c) {
            System.out.println("a == b, but b != c and a != c");
        } else if (a==c && a!=b) {
            System.out.println("a == c, but b != c and b != a");
        }

    }

    public static void weightTransfer(double weight) {

        double mg, g, t;
        mg = weight * 1_000_000;
        g = weight * 1_000;
        t = weight / 1_000;
        System.out.println(weight + " kg = " + mg + " milligrams");
        System.out.println(weight + " kg = " + g + " grams");
        System.out.println(weight + " kg = " + t + " tons");

    }

}
