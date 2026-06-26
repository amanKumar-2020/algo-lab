class HollowHourglass {

    public static void main(String[] args) {

        int n = 5;

        // Upper Part
        for (int i = n; i >= 1; i--) {

            // Leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == n || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower Part
        for (int i = 2; i <= n; i++) {

            // Leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}