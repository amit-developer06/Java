import java.util.*;;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question:Get a number from the user and check number is even or not
        System.out.print("Enter a number to check number is even or not:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is an even number");
        } else {
            System.out.println("The number " + number + " is not an even number");
        }

        // Question:Get a character from user check the character is vowel or not using
        // switch
        // statement
        System.out.print("Enter a character  to check number is vowel or not:");
        char isVowel = sc.next().charAt(0);
        switch (isVowel) {
            case 'a':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'A':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'e':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'E':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'i':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'I':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'o':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'O':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'u':
                System.out.println(isVowel + " is a vowel");
                break;
            case 'U':
                System.out.println(isVowel + " is a vowel");
                break;

            default:
                System.out.println(isVowel + " is not a vowel");
                break;
        }

        sc.close();
    }
}