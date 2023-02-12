public class Pattern {
    public static void main(String[] args) {
        int row, col, n;
        // Print the Solid Rectangle
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        System.out.println("Solid Rectangle");
        row = 4;
        col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        // Print the Hollow Rectangle
        // * * * * *
        // * - - - *
        // * - - - *
        // * * * * *
        System.out.println("Hollow Rectangle");
        row = 4;
        col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print(" *");
                } else {
                    System.out.print(" -");
                }
            }
            System.out.print("\n");
        }

        // Print the Half pyramid
        // *
        // * *
        // * * *
        // * * * *

        System.out.println("Half pyramid");

        row = 5;
        for (int i = 1; i <= row; i++) {
            for (int print = 1; print <= i; print++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        // Print the Pattern
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        System.out.println("Print the pattern");

        row = 5;

        for (int i = row; i >= 1; i--) {
            for (int print = 1; print <= i; print++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        // Print the Half pyramid
        // - - - *
        // - - * *
        // - * * *
        // * * * *
        System.out.println("Print the Half pyramid");
        col = 4;
        for (int i = 1; i <= col; i++) {
            for (int print = 1; print <= col; print++) {
                if (print > col - i) {
                    System.out.print(" *");
                } else {
                    System.out.print(" -");
                }

            }
            System.out.print("\n");
        }

        // Print the Half pyramid with number
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        System.out.println("Print the Half pyramid with number");

        n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.print("\n");
        }

        // Print the Inverted Half pyramid with number
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        System.out.println("Print the Inverted Half pyramid with number");

        n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.print("\n");
        }

        // Print the Floyd'd Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        System.out.println("Print the Inverted Half pyramid with number");
        n = 5;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + temp);
                temp++;
            }
            System.out.print("\n");
        }

        // Print the 0-1 Triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        System.out.println("Print the  0-1 Triangle");

        n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(" 1");
                else
                    System.out.print(" 0");
            }
            System.out.print("\n");
        }

    }
}