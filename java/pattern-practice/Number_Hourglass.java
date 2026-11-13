class NumberHourglass {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = n; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
