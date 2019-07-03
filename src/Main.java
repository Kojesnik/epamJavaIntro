import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;

    public static void main(String[] args) {

        double a, b, c;                     // Task 1 variables
        double weight;                      // Task 2 variables
        double r1, r2;                      // Task 3 variables
        int num;                            // Task 4 variables

        /* Task 1
         * difference check between a, b and c
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: a, b and c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        numCheck(a, b, c);

        /* Task 2
         * kg transfer to milligrams, grams and tons
         */

        System.out.println("\nEnter dinosaur weight");
        weight = scanner.nextDouble();
        weightTransfer(weight);

        /* Task 3
         * ring area
         */

        System.out.println("\nEnter r1 and r2 circle radius (r1 > r2)");
        r1 = scanner.nextDouble();
        r2 = scanner.nextDouble();
        if(r1 < r2) {
            while(r1 < r2) {
                System.out.println("r1 must be > then r2. Enter again");
                r1 = scanner.nextDouble();
                r2 = scanner.nextDouble();
            }
        }
        ringArea(r1, r2);

        /* Task 4
         * decreasing and increasing sequences
         */

        System.out.println("\nEnter number > 0");
        num = scanner.nextInt();
        if (num <= 0 ) {
            while (num <= 0) {
                System.out.println("Number must be > 0. Enter again");
                num = scanner.nextInt();
            }
        }
        sequences(num);


    }

    // Task 1 method

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

    // Task 2 method

    public static void weightTransfer(double weight) {

        double mg, g, t;
        mg = weight * 1_000_000;
        g = weight * 1_000;
        t = weight / 1_000;
        System.out.println(weight + " kg = " + mg + " milligrams");
        System.out.println(weight + " kg = " + g + " grams");
        System.out.println(weight + " kg = " + t + " tons");

    }

    // Task 3 method

    public static void ringArea(double r1, double r2) {

        double S;
        S = PI * (Math.pow(r1, 2) - Math.pow(r2, 2));
        System.out.println("Ring area S = " + S);

    }

    // Task 4 method

    public static void sequences(int num) {

        int num1, num2;
        boolean lastIncrease = true, increase = true, cont = true, seq;
        ArrayList<Integer> numeralList = new ArrayList<Integer>();
        while (num > 0) {
            numeralList.add(num % 10);
            num = num / 10;
        }
            for (int i = 0; i < numeralList.size() - 1; ++i) {
                if (i > 0){
                    lastIncrease = increase;
                }
                num1 = numeralList.get(i);
                num2 = numeralList.get(i + 1);
                if (num1 > num2) {
                    increase = true;
                } else {
                    increase = false;
                }
                if (i > 0) {
                    if ((lastIncrease == true && increase == true) || (lastIncrease == false && increase == false)) {
                        cont = true;
                    } else {
                        cont = false;
                    }
                }
                if (cont == false) {
                    break;
                }
             }

        if (cont == false) {
            System.out.println("It is not a sequence");
        } else {
            if (increase == true) {
                System.out.println("It is an increasing sequence");
            } else {
                System.out.println("It is an decreasing sequence");
            }
        }

    }

}
