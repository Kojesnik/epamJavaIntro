import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Task 1
         * difference check between a, b and c
         */

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: a, b and c");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        numCheck(a, b, c);
    }

    public static void numCheck(int a, int b, int c) {
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

}
