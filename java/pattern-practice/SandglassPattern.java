class SandglassPattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Part
        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Part
        for (int i = 2; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}