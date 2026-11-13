class HollowNumberDiamond {

    public static void main(String[] args) {

        int rows = 5;

        // Upper Half
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == rows) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower Half
        for (int i = rows - 1; i >= 1; i--) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}