public class AdvancePattern {
    public static void main(String[] args) {
        int n;
        // Print the Butterfly pattern
        // * - - - - - - *
        // * * - - - - * *
        // * * * - - * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * - - * * *
        // * * - - - - * *
        // * - - - - - - *
        System.out.println("Print the Butterfly pattern");
        n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");

        }

        // Print the solid rhombus
        // - - - - * * * * *
        // - - - * * * * *
        // - - * * * * *
        // - * * * * *
        // * * * * *
        System.out.println("Print the solid rhombus");

        n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        // Print the number pyramid
        // - - - - 1
        // - - - 2 - 2
        // - - 3 - 3 - 3
        // - 4 - 4 - 4 - 4
        // 5 - 5 - 5 - 5 - 5

        System.out.println("Print the number pyramid");
        n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("   " + i);
            }
            System.out.print("\n");
        }

        // Print the palindromic pattern
        // - - - - 1
        // - - - 2 1 2
        // - - 3 2 1 2 3
        // - 4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        System.out.println("Print the palindromic pattern");
        n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" " + (j + 1));
            }
            System.out.print("\n");
        }

        // Print the diamond pattern
        // - - - - *
        // - - - * * *
        // - - * * * * *
        // - * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * *
        // - * * * * * * *
        // - - * * * * *
        // - - - * * *
        // - - - - *

        System.out.println("Print the diamond pattern");
        n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i + i - 1); j++) {
                System.out.print(" *");
            }
            System.out.print("\n");

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i + i - 1); j++) {
                System.out.print(" *");
            }
            System.out.print("\n");

        }

    }
}