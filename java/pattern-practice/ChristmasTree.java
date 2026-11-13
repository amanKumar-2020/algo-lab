class ChristmasTree {

    public static void main(String[] args) {

        int rows = 5;

        // Tree Leaves
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Tree Trunk
        for (int i = 1; i <= 2; i++) {

            for (int j = 1; j <= rows - 1; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }
    }
}