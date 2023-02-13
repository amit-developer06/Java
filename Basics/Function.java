import java.util.*;

public class Function {
    // Write the function to print factorial of a number
    public static int factorialOf(int num) {
        int temp = num;
        int result = 1;
        while (temp != 1) {
            result *= temp;
            temp--;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate factorial : ");
        int number = sc.nextInt();
        System.out.println("Factorial of " + number + " is : " + factorialOf((number)));
        sc.close();
    }

}