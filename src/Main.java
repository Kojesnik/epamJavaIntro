import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;       // Const

    public static void main(String[] args) {

        double a, b, c;                         // Task 1 variables
        double weight;                          // Task 2 variables
        double r1, r2;                          // Task 3 variables
        int num;                                // Task 4 variables
        int N;                                  // Task 5 variables
        int N2;                                 // Task 6 variables
        double num1, num2;                      // Task 7 variables
        int x1,y1,x2,y2,x3,y3;                  // Task 8 variables

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

        /* Task 5
         * average and geometrical average
         */

        System.out.println("\nEnter number");
        N = scanner.nextInt();
        average(N);

        /* Task 6
         * reverse
         */

        System.out.println("\nEnter number to reverse it");
        N2 = scanner.nextInt();
        reverse(N2);

        /* Task 7
         * change variables btw each other
         */

        System.out.println("\nEnter 2 numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println(num1 + " = a\n" + num2 + " = b");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " = a\n" + num2 + " = b");

        /* Task 8
         * triangle check
         */

        System.out.println("\nEnter 3 dots, first: x1,y1");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Second: x2,y2");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        System.out.println("Third: x3,y3");
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        triangleCheck(x1, y1, x2, y2, x3, y3);

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

    // Task 4 method (WITHOUT ARRAYLIST) FOR ALL NUMBERS

    public static void sequences(int num) {

        int num1, num2;
        num1 = num % 10;
        num = num / 10;
        num2 = num % 10;
        if (num1 > num2) {
            while ((num != 0) && (num1 > num2)) {
                num1 = num % 10;
                num = num / 10;
                num2 = num % 10;
            }
            if (num == 0) {
                System.out.println("It is an increasing sequence");
            } else {
                System.out.println("It is not a sequence");
            }
        } else {
            while ((num != 0) && (num2 > num1)) {
                num1 = num % 10;
                num = num / 10;
                num2 = num % 10;
            }
            if (num == 0) {
                System.out.println("It is a decreasing sequence");
            } else {
                System.out.println("It is not a sequence");
            }
        }

    }

    // Task 4 method (USING ARRAYLIST) FOR ALL NUMBERS

    public static void sequencesArray(int num) {

        int num1, num2;
        boolean lastIncrease = true, increase = true, cont = true, size;
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

    // Task 5 method (WITHOUT ARRAYLIST) FOR ALL NUMBERS

    public static void average(int N) {

        int sum = 0, pro = 1, size = 0, N2 = N;
        double average, gAverage;
        while (N != 0) {
            sum += N % 10;
            pro *= N % 10;
            ++size;
            N = N / 10;
        }
        average = (double)sum / size;
        gAverage = Math.pow(pro, 1/(double)size);
        System.out.println("Average of " + N2 + " = " + average);
        System.out.println("Geometrical average of " + N2 + " = " + gAverage);

    }

    // Task 5 method (USING ARRAYLIST) FOR ALL NUMBERS

    public static void averageArray(int N) {

        ArrayList<Integer> numeralList = new ArrayList<Integer>();
        int sum = 0, N2 = N, pro = 1;
        double average, gAverage;
        while (N > 0) {
            numeralList.add(N % 10);
            N = N / 10;
        }
        for (int i = 0; i < numeralList.size(); ++i) {
            sum = sum + numeralList.get(i);
            pro = pro * numeralList.get(i);
        }
        average = (double)sum / numeralList.size();
        gAverage = Math.pow(pro, 1 / (double)numeralList.size());
        System.out.println("Average of " + N2 + " = " + average);
        System.out.println("Geometrical average of " + N2 + " = " + gAverage);

    }

    // Task 6 method (WITHOUT ARRAYLIST WITHOUT STRINGBUFFER) FOR ALL NUMBERS

    public static void reverse(int N2) {

        String reverse = "";
        while (N2 != 0) {
            reverse += N2 % 10;
            N2 = N2 / 10;
        }
        System.out.println(reverse);

    }

    // Task 6 method (WITHOUT ARRAYLIST USING STRINGBUFFER) FOR ALL NUMBERS

    public static void reverseSB(int N2) {

        String string = Integer.toString(N2);
        string = new StringBuffer(string).reverse().toString();
        N2 = Integer.parseInt(string);
        System.out.println(N2);

    }

    // Task 6 method (USING ARRAYLIST) FOR ALL NUMBERS

    public static void reverseArray(int N2) {

        int reversedNum = 0, degree;
        ArrayList<Integer> numeralList = new ArrayList<Integer>();
        while (N2 > 0) {
            numeralList.add(N2 % 10);
            N2 = N2 / 10;
        }
        for (int i = 0; i < numeralList.size(); ++i) {
            degree = numeralList.size() - (i + 1);
            reversedNum = reversedNum + numeralList.get(i) * (int)Math.pow(10, degree);
        }
        System.out.println(reversedNum);
    }

    // Task 8 method

    public static void triangleCheck(int x1, int y1, int x2, int y2, int x3, int y3) {

        double AB, AC, BC;
        AB = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        BC = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        AC = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        System.out.println(AC);
        if ( (AB < (BC + AC)) && (BC < (AB + AC)) && (AC < (AB + BC)) ) {
            System.out.println("It is a triangle");
            if ((AB > BC) && (AB > AC)) {
                if ((int)Math.pow(AB, 2) == (Math.pow(BC, 2) + Math.pow(AC, 2))) {
                    System.out.println("And it is rectangular");
                } else {
                    System.out.println("And it is not rectangular");
                }
            } else if ((BC > AB) && (BC > AC)) {
                if ((int)Math.pow(BC, 2) == (Math.pow(AB, 2) + Math.pow(AC, 2))) {
                    System.out.println("And it is rectangular");
                } else {
                    System.out.println("And it is not rectangular");
                }
            } else if ((AC > BC) && (AC > AB)) {
                if ((int)Math.pow(AC, 2) == (Math.pow(BC, 2) + Math.pow(AB, 2))) {
                    System.out.println("And it is rectangular");
                } else {
                    System.out.println("And it is not rectangular");
                }
            }
        } else {
            System.out.println("It is not a triangle");
        }
    }

}
