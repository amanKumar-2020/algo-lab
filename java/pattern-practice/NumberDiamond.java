class NumberDiamond {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}