import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question:Print the addition of first n Natural number using for loop

        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        System.out.println("The result of " + number + "n is: " + result);

        // Question:Print the table of given number using while loop
        System.out.print("Enter a number to print table:");
        int numberForTable = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(numberForTable * i);
            i++;
        }

        sc.close();
    }
}