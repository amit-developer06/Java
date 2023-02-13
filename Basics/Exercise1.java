import java.util.*;;

public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("\t" + i);
        }
        System.out.print("\n\n\tSelect the question number:");
        Scanner sc = new Scanner(System.in);
        int question = sc.nextInt();
        switch (question) {
            case 1:
                System.out.println(
                        "\nQuestion1: Enter 3 numbers from the user & make a function to print their average.");
                int[] numbers;
                numbers = new int[3];
                for (int i = 1; i <= 3; i++) {
                    System.out.print("\nEnter number " + i + " : ");
                    int input = sc.nextInt();
                    numbers[i - 1] = input;
                }
                average(numbers);

                break;
            case 2:
                System.out.println("\nQuestion2: Write a function to print the sum of all odd numbers from 1 to n.");
                System.out.print("\n\n\tEnter a number:");
                int number = sc.nextInt();
                additionOfOdd(number);
                break;
            case 3:
                System.out.println(
                        "\nQuestion3: Write a function which takes in 2 numbers and returns the greater of those two.");
                System.out.print("\n\n\tEnter 1st number:");
                int number1 = sc.nextInt();
                System.out.print("\n\tEnter 2nd number:");
                int number2 = sc.nextInt();
                greaterOfTwo(number1, number2);
                break;
            case 4:
                System.out.println(
                        "\nQuestion4: Write a function that takes in the radius as input and returns the circumference of a circle");
                System.out.print("\n\n\tEnter radius of circle : ");
                int radius = sc.nextInt();
                circumferenceOfCircle(radius);
                break;
            case 5:
                System.out.println(
                        "\nQuestion4:  Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.");
                countPosNegZero();
                break;
            case 6:
                System.out.println(
                        "\nQuestion5: Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.");

                System.out.print("\nEnter value for x : ");
                int x = sc.nextInt();
                System.out.print("\nEnter value for n : ");
                int n = sc.nextInt();
                power(x, n);

                break;

            default:
                System.out.println("\nInvalid question number");
                break;
        }

        sc.close();

    }

    // Question1: Enter 3 numbers from the user & make a function to print their
    // average.
    public static void average(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.print("\nAverage of ");
        for (int i = 0; i < number.length; i++) {
            if (i < number.length - 1) {
                System.out.print(number[i] + " ");
            } else {
                System.out.print("and " + number[i] + " is : " + (sum / number.length));
            }
        }
    }

    // Question2: Write a function to print the sum of all odd numbers from 1 to n.
    public static void additionOfOdd(int n) {
        int temp = n;
        int result = 0;
        while (temp >= 1) {
            if (temp % 2 != 0) {
                result += temp;
            }
            temp--;
        }
        System.out.print("\nAddition of all N(" + n + ") odd number is : " + result);
    }

    // Question3: Write a function which takes in 2 numbers and returns the greater
    // of those two.
    public static void greaterOfTwo(int a, int b) {
        if (a > b) {
            System.out.print("\n\t" + a + " is greater b/w " + a + " & " + b);

        } else {
            System.out.print("\n\t" + b + " is greater b/w " + a + " & " + b);

        }
        return;
    }

    // Question4:Write a function that takes in the radius as input and returns the
    // circumference of a circle.

    public static void circumferenceOfCircle(int radius) {
        double pie = 3.14;
        System.out.print("\n\t Circumference of circle is " + (2 * pie * radius));
    }

    // Question5: Write a program to enter the numbers till the user wants and at
    // the end it should display the count of positive, negative and zeros entered.
    public static void countPosNegZero() {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negetive = 0, zero = 0;
        while (true) {

            System.out.print("\n\t Enter a number or (q) for quit : ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("q")) {
                break;
            }
            int value = Integer.parseInt(choice);
            if (value > 0)
                positive++;
            else if (value < 0)
                negetive++;
            else if (value == 0)
                zero++;
        }
        System.out.println("\n\tPositive : " + positive);
        System.out.println("\tNegetive : " + negetive);
        System.out.println("\tZero : " + zero);
        sc.close();
    }

    // Question5: Two numbers are entered by the user, x and n. Write a function to
    // find the value of one number raised to the power of another i.e. x^n.

    public static void power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        System.out.println("\nResult of " + x + "^" + n + " is : " + result);
    }
}