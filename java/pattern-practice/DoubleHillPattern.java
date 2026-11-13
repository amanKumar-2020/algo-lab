class DoubleHillPattern {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Left spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Left pyramid
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }

            // Right pyramid
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}