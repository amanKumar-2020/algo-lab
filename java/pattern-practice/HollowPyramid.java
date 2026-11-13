class HollowPyramid {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}