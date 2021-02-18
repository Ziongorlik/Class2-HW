 import java.util.Scanner;

public class Main {

    // Exercise-7
    public static void printHello() {
        System.out.println("Hello");
    }

    public static void calculate() {
        System.out.println(5 + 3.2);
    }

    // Exercise-8
    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printDividedNum(int num) {
        System.out.println(num / 2);
    }

    // Exercise-9
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static String spacedString(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Exercise-17
    public static int getNumber() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        return inputScanner.nextInt();
    }

    public static int getDigitsSum() {
        int num = getNumber(), sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Exercise-1
        int x = 3, y = 5;
        if (x > y)
            System.out.println("Big");
        if (x < y)
            System.out.println("Small");

        // Exercise-2
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Exercise-3
        int season = 4;
        switch (season) {
            case 1: {
                System.out.println("Summer");
                break;
            }
            case 2: {
                System.out.println("Winter");
                break;
            }
            case 3: {
                System.out.println("Fall");
                break;
            }
            case 4: {
                System.out.println("Spring");
                break;
            }
        }

        if (season == 1)
            System.out.println("Summer");
        else if (season == 2)
            System.out.println("winter");
        else if (season == 3)
            System.out.println("Fall");
        else if (season == 4)
            System.out.println("Spring");

        // Exercise-4
        System.out.println("The loop will run 10 times.");
        System.out.println("\"Count is: 10\" will be printed last");

        // Exercise-5
        int age = 39;
        char lastNameInitial = 'G';
        double shekelDollarCurrency = 3.20913; // 1 USD = 3.20913 ILS
        boolean hasflown = false;
        String apartmentNum = "17";

        System.out.println("Age: " + age);
        System.out.println("Last Name Initial: " + lastNameInitial);
        System.out.println("Shekel dollar currency: 1 USD = " + shekelDollarCurrency + " 1 ILS");
        System.out.println("Flown aboard: " + hasflown);
        System.out.println("Apartment number: " + apartmentNum);
        System.out.println("\nDouble to int: " + (int) shekelDollarCurrency);
        System.out.println("Apartment number in Integer: " + Integer.parseInt(apartmentNum));

        // Exercise-6
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input your phone number: ");
        String phoneNumber = inputScanner.next();
        System.out.println("Phone number: " + phoneNumber);

        // Exercise-7
        printHello();
        calculate();

        // Exercise-8
        printName("Zion");
        printDividedNum(14);

        // Exercise-9
        System.out.println("Sum: " + sum(800, 2));
        System.out.println("Spaced String: " + spacedString("Zion", "Gorlik"));

        // Exercise-10
        class Car {
            public void drive() {
                System.out.println("go");
            }

            public void stop() {
                System.out.println("finish");
            }
        }

        Car car = new Car();
        car.drive();
        car.stop();

        // Exercise-11
        System.out.println("The value that will be printed is: 20");

        // Exercise-12
        System.out.println("The loop will run forever because 1 is always greater than 0");

        // Exercise-13
        System.out.println("The output will be false because a2 value is with Capital letter, and it is not equal to a1");

        // Exercise-14
        System.out.println("If we want to add more operations provided that X is greater than zero,");
        System.out.println("and then ask if Y is greater than zero, then the first option is correct,");
        System.out.println("otherwise the second is correct");

        // Exercise-15
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Exercise-16
        int rowSize = 7;
        int first = 1, last = rowSize;
        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= rowSize; j++) {
                System.out.print(j == first || j == last ? "*" : " ");
            }
            System.out.println();
            first++;
            last--;
        }

        // Exercise-17
        System.out.println("Digits sum: " + getDigitsSum());

        // Exercise-18
        class Dog {
            int age;
            String name;
            Boolean happy;
        }

        Dog puppy = new Dog();

        // Exercise-19
        int num = 1;
        String letter = switch (num) {
            case 1, 2, 3:
                yield "A";
            case 4, 5, 6:
                yield "B";
            case 7, 8, 9, 10:
                yield "C";
            default:
                yield "";
        };

        System.out.println(letter);
    }
}