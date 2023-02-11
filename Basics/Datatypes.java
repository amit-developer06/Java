import java.util.*;;

public class Datatypes {
    public static void main(String[] args) {
        // *Primitive Datatypes:- Primitive data are only single values and have no
        // special capabilities. There are 8 primitive data types

        // Datatypes Size(bit)
        // 1. boolean 1
        // 2. byte 8
        // 3. char 16
        // 4. short 16
        // 5. int 32
        // 6. long 64
        // 7. float 32
        // 8. double 64

        boolean willdo = true;
        System.out.println(willdo);

        byte byteDataType = 8;
        System.out.println(byteDataType);

        char name = 'A';
        System.out.println(name);

        short shortDataType = 69;
        System.out.println(shortDataType);

        int intDataType = 69;
        System.out.println(intDataType);

        long longDataType = 69;
        System.out.println(longDataType);

        float floatDataType = 69.69f;
        System.out.println(floatDataType);

        double doubleDataType = 69.696969;
        System.out.println(doubleDataType);

        // *Non-Primitive:- The Reference Data Types will contain a memory address of
        // variable values because the reference types won’t store the variable value
        // directly in memory. They are strings, objects, arrays, etc.

        // Datatypes Size(bit)
        // 1. Strings
        // 2. Class
        // 3. Interface
        // 4. Array

        String myName = "Amit Thakur";
        System.out.println(myName);

        // Questions: Get a year and check the leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year:");
        int userYear = sc.nextInt();

        System.out.println("The year " + userYear + " is leap year? " + ((userYear % 4) == 0));

        // Questions: Get two value from user and print sum

        System.out.println("Enter 1 Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2 Number:");
        int b = sc.nextInt();
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));

        sc.close();

    }
}