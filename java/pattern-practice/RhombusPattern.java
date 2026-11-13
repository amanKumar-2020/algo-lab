class RhombusPattern {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}