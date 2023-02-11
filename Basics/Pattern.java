public class Pattern {
    public static void main(String[] args) {
        int row, col;
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
    }
}