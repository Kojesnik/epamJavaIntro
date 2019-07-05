import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;       // Const

    public static void main(String[] args) {

        double a, b, c;                         // Task 1 variables
        double dinoWeight;                      // Task 2 variables
        double r1, r2;                          // Task 3 variables
        int num;                                // Task 4 variables
        int N;                                  // Task 5 variables
        int nToReverse;                         // Task 6 variables
        double num1, num2;                      // Task 7 variables
        int x1, y1, x2, y2, x3, y3;             // Task 8 variables
        int dragonAge;                          // Task 9 variables
        char letter;                            // Task 10 variables
        int month, year, day;                   // Task 11 variables

        /* Task 1
         * difference check between a, b and c */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: a, b and c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        numCheck(a, b, c);

        /* Task 2
         * kg transfer to milligrams, grams and tons */

        System.out.println("\nEnter dinosaur weight");
        dinoWeight = scanner.nextDouble();
        if (dinoWeight <= 0) {
            while (dinoWeight <= 0) {
                System.out.println("Dino weight cant be <= 0. Enter again");
                dinoWeight = scanner.nextDouble();
            }
        }
        weightTransfer(dinoWeight);

        /* Task 3
         * ring area */

        System.out.println("\nEnter r1 and r2 circle radius (r1 > r2)");
        r1 = scanner.nextDouble();
        r2 = scanner.nextDouble();
        if (r1 < r2) {
            while (r1 < r2) {
                System.out.println("r1 must be > then r2. Enter again");
                r1 = scanner.nextDouble();
                r2 = scanner.nextDouble();
            }
        }
        if ((r1 <= 0) || (r2 <= 0)) {
            while ((r1 <= 0) || (r2 <= 0)) {
                System.out.println("r1 and r2 must be > 0. Enter again");
                r1 = scanner.nextDouble();
                r2 = scanner.nextDouble();
            }
        }
        ringArea(r1, r2);

        /* Task 4
         * decreasing and increasing sequences */

        System.out.println("\nEnter number");
        num = scanner.nextInt();
        if (num < 0 ) {
            num = Math.abs(num);
        }
        sequences(num);

        /* Task 5
         * average and geometrical average */

        System.out.println("\nEnter number");
        N = scanner.nextInt();
        if (N < 0) {
            N = Math.abs(N);
        }
        average(N);

        /* Task 6
         * reverse */

        System.out.println("\nEnter number to reverse it");
        nToReverse = scanner.nextInt();
        reverse(nToReverse);

        /* Task 7
         * change variables btw each other */

        System.out.println("\nEnter 2 numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println(num1 + " = a\n" + num2 + " = b");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " = a\n" + num2 + " = b");

        /* Task 8
         * triangle check */

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

        /* Task 9
         * counting head and eye number */

        System.out.println("\nEnter the age of dragon");
        dragonAge = scanner.nextInt();
        if (dragonAge <= 0) {
            while (dragonAge <= 0) {
                System.out.println("Age cant be <= 0. Enter again");
                dragonAge = scanner.nextInt();
            }
        }
        dragonHeadEyeCount(dragonAge);

        /* Task 10
         * vowel or not (4 METHODS) */

        System.out.println("\nEnter your letter to understand vowel it or not");
        letter = scanner.next().charAt(0);
        letterScan1(letter);
        letterScan2(letter);
        letterScan3(letter);
        letterScan4(letter);

        /* Task 11
         * counting next day */

        System.out.println("\nEnter year");
        year = scanner.nextInt();
        System.out.println("\nEnter month");
        month = scanner.nextInt();
        System.out.println("\nEnter day");
        day = scanner.nextInt();
        nextDay(year, month, day);

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

    public static void weightTransfer(double dinoWeight) {

        double mgrams, grams, tons;
        mgrams = dinoWeight * 1_000_000;                // Transfer to miligrams
        grams = dinoWeight * 1_000;                     // Transfer to grams
        tons = dinoWeight / 1_000;                      // Transfer to tons
        System.out.println(dinoWeight + " kg = " + mgrams + " milligrams");
        System.out.println(dinoWeight + " kg = " + grams + " grams");
        System.out.println(dinoWeight + " kg = " + tons + " tons");

    }

    // Task 3 method

    public static void ringArea(double r1, double r2) {

        double S;
        S = PI * (Math.pow(r1, 2) - Math.pow(r2, 2));
        System.out.println("Ring area S = " + S);

    }

    // Task 4 method (WITHOUT ARRAYLIST) FOR ALL NUMBERS

    public static void sequences(int num) {

        int lastNumeral, prelastNumeral;
        lastNumeral = num % 10;                              // %10 - get last numeral // /10 - remove last numeral
        num = num / 10;
        prelastNumeral = num % 10;
        if (lastNumeral > prelastNumeral) {
            while ((num != 0) && (lastNumeral > prelastNumeral)) {
                lastNumeral = num % 10;
                num = num / 10;
                prelastNumeral = num % 10;
            }
            if (num == 0) {
                System.out.println("It is an increasing sequence");
            } else {
                System.out.println("It is not a sequence");
            }
        } else {
            while ((num != 0) && (prelastNumeral > lastNumeral)) {
                lastNumeral = num % 10;
                num = num / 10;
                prelastNumeral = num % 10;
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

        int lastNumeral, prelastNumeral;
        boolean lastIncrease = true, increase = true, cont = true;
        ArrayList<Integer> numeralList = new ArrayList();
        while (num > 0) {
            numeralList.add(num % 10);                      // %10 - get last numeral // /10 - remove last numeral
            num = num / 10;
        }
            for (int i = 0; i < numeralList.size() - 1; ++i) {
                if (i > 0){
                    lastIncrease = increase;
                }
                lastNumeral = numeralList.get(i);
                prelastNumeral = numeralList.get(i + 1);
                if (lastNumeral > prelastNumeral) {
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

        int sum = 0, proizv = 1, size = 0, N2 = N;
        double average, gAverage;
        while (N != 0) {
            sum += N % 10;                              // %10 - get last numeral // /10 - remove last numeral
            proizv *= N % 10;
            ++size;
            N = N / 10;
        }
        average = (double)sum / size;
        gAverage = Math.pow(proizv, 1/(double)size);
        System.out.println("Average of " + N2 + " = " + average);
        System.out.println("Geometrical average of " + N2 + " = " + gAverage);

    }

    // Task 5 method (USING ARRAYLIST) FOR ALL NUMBERS

    public static void averageArray(int N) {

        ArrayList<Integer> numeralList = new ArrayList<Integer>();
        int sum = 0, N2 = N, proizv = 1;
        double average, gAverage;
        while (N > 0) {
            numeralList.add(N % 10);                    // %10 - get last numeral // /10 - remove last numeral
            N = N / 10;
        }
        for (int i = 0; i < numeralList.size(); ++i) {
            sum = sum + numeralList.get(i);
            proizv = proizv * numeralList.get(i);
        }
        average = (double)sum / numeralList.size();
        gAverage = Math.pow(proizv, 1 / (double)numeralList.size());
        System.out.println("Average of " + N2 + " = " + average);
        System.out.println("Geometrical average of " + N2 + " = " + gAverage);

    }

    // Task 6 method (WITHOUT ARRAYLIST WITHOUT STRINGBUFFER) FOR ALL NUMBERS

    public static void reverse(int nToReverse) {

        String reverse = "";
        if (nToReverse < 0) {
            reverse += "-";
            nToReverse = Math.abs(nToReverse);
        }
        while (nToReverse != 0) {
            reverse += nToReverse % 10;                 // %10 - get last numeral // /10 - remove last numeral
            nToReverse = nToReverse / 10;
        }
        System.out.println(reverse);

    }

    // Task 6 method (WITHOUT ARRAYLIST USING STRINGBUFFER) FOR ALL NUMBERS

    public static void reverseSB(int nToReverse) {

        String string = Integer.toString(nToReverse);
        string = new StringBuffer(string).reverse().toString();
        nToReverse = Integer.parseInt(string);
        System.out.println(nToReverse);

    }

    // Task 6 method (USING ARRAYLIST) FOR ALL NUMBERS

    public static void reverseArray(int nToReverse) {

        int reversedNum = 0, degree;
        ArrayList<Integer> numeralList = new ArrayList<Integer>();
        while (nToReverse > 0) {
            numeralList.add(nToReverse % 10);               // %10 - get last numeral // /10 - remove last numeral
            nToReverse = nToReverse / 10;
        }
        for (int i = 0; i < numeralList.size(); ++i) {
            degree = numeralList.size() - (i + 1);
            reversedNum = reversedNum + numeralList.get(i) * (int)Math.pow(10, degree);
        }
        System.out.println(reversedNum);
    }

    // Task 8 method

    public static void triangleCheck(int x1, int y1, int x2, int y2, int x3, int y3) {

        double firstSide, secSide, thirdSide;
        firstSide = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        secSide = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        thirdSide = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        System.out.println(thirdSide);
        if ( (firstSide < (secSide + thirdSide)) && (secSide < (firstSide + thirdSide)) && (thirdSide < (firstSide + secSide)) ) {
            System.out.println("It is a triangle");
            if ((firstSide > secSide) && (firstSide > thirdSide)) {
                if ((int)Math.pow(firstSide, 2) == (Math.pow(secSide, 2) + Math.pow(thirdSide, 2))) {
                    System.out.println("And it is rectangular");
                } else {
                    System.out.println("And it is not rectangular");
                }
            } else if ((secSide > firstSide) && (secSide > thirdSide)) {
                if ((int)Math.pow(secSide, 2) == (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2))) {
                    System.out.println("And it is rectangular");
                } else {
                    System.out.println("And it is not rectangular");
                }
            } else if ((thirdSide > secSide) && (thirdSide > firstSide)) {
                if ((int)Math.pow(thirdSide, 2) == (Math.pow(secSide, 2) + Math.pow(firstSide, 2))) {
                    System.out.println("And it is rectangular");
                } else {
                    System.out.println("And it is not rectangular");
                }
            }
        } else {
            System.out.println("It is not a triangle");
        }
    }

    // Task 9 method

    public static void dragonHeadEyeCount(int dragonAge) {

        int headCount = 3, eyeCount;
        int threeHeadAge = 200, twoHeadAge = 300;
        for (int i = 1; i <= dragonAge; ++i) {
            if (i < threeHeadAge) {
                headCount += 3;
            } else if ((i >= threeHeadAge) && (i < twoHeadAge)) {
                headCount += 2;
            } else if (i >= twoHeadAge) {
                headCount += 1;
            }
        }
        eyeCount = headCount * 2;
        System.out.println("Head number in " + dragonAge + " years - " + headCount);
        System.out.println("Eye number in " + dragonAge + " years - " + eyeCount);

    }

    // Task 10 method (SWITCH METHOD)

    public static void letterScan1(char letter) {

        switch (letter) {
            case 'a':
                System.out.println("It is a vowel letter");
                break;
            case 'A':
                System.out.println("It is a vowel letter");
                break;
            case 'e':
                System.out.println("It is a vowel letter");
                break;
            case 'E':
                System.out.println("It is a vowel letter");
                break;
            case 'i':
                System.out.println("It is a vowel letter");
                break;
            case 'I':
                System.out.println("It is a vowel letter");
                break;
            case 'o':
                System.out.println("It is a vowel letter");
                break;
            case 'O':
                System.out.println("It is a vowel letter");
                break;
            case 'u':
                System.out.println("It is a vowel letter");
                break;
            case 'U':
                System.out.println("It is a vowel letter");
                break;
            default:
                System.out.println("It is not a vowel letter");
                break;
        }

    }

    // Task 10 method (IF METHOD)

    public static void letterScan2(char letter) {

        if ((letter == 'a') || (letter == 'A') || (letter == 'e') || (letter == 'E')
                            || (letter == 'i') || (letter == 'I') || (letter == 'o')
                            || (letter == 'O') || (letter == 'u') || (letter == 'U')) {

            System.out.println("It is a vowel letter");
        } else {
            System.out.println("It is not a vowel letter");
        }

    }

    // Task 10 method (VOWEL ARRAY METHOD)

    public static void letterScan3(char letter) {

        char[] vowelLetters = {'a', 'A', 'e', 'E', 'o', 'O', 'i', 'I', 'u', 'U'};
        for (int i = 0; i < 10; ++i) {
            if (letter == vowelLetters[i]) {
                System.out.println("It is a vowel letter");
                return;
            }
        }
        System.out.println("It is not a vowel letter");

    }

    // Task 10 method (NOT VOWEL ARRAY METHOD)

    public static void letterScan4(char letter) {

        char[] vowelLetters = {'b', 'B', 'c', 'C', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J',
                                'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'p', 'P', 'q', 'Q', 'r', 'R',
                                's', 'S', 't', 'T', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'};
        for (int i = 0; i < 42; ++i) {
            if (letter == vowelLetters[i]) {
                System.out.println("It is not a vowel letter");
                return;
            }
        }
        System.out.println("It is a vowel letter");

    }

    // Task 11 method

    public static void nextDay(int year, int month, int day) {

        boolean isVisokosniy;
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("Visokosnyy year");
            isVisokosniy = true;
        } else if ((year % 4 == 0) && (year % 100 == 0)) {
            isVisokosniy = false;
            System.out.println("Normal year");
        } else if (year % 4 == 0) {
            System.out.println("Visokosnyy year");
            isVisokosniy = true;
        } else {
            isVisokosniy = false;
            System.out.println("Normal year");
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31) {
                    if (month == 12) {
                        month = 1;
                    } else {
                        ++month;
                    }
                    ++year;
                    System.out.println("Next day - 1." + month + "." + year);
                } else {
                    ++day;
                    System.out.println("Next day - " + day + "." +month + "." + year);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    ++month;
                    System.out.println("Next day - 1." + month + "." + year);
                } else {
                    ++day;
                    System.out.println("Next day - " + day + "." +month + "." + year);
                }
                break;
            case 2:
                if (isVisokosniy == true) {
                    if (day == 29) {
                        ++month;
                        System.out.println("Next day - 1." + month + "." + year);
                    } else {
                        ++day;
                        System.out.println("Next day - " + day + "." +month + "." + year);
                    }
                } else {
                    if (day == 28) {
                        ++month;
                        System.out.println("Next day - 1." + month + "." + year);
                    } else {
                        ++day;
                        System.out.println("Next day - " + day + "." +month + "." + year);
                    }
                }

        }

    }



    }
