import java.util.Scanner;

public class ArmstrongNumber {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();

    //     int original = num;
    //     int sum = 0;

    //     while (num > 0) {
    //         int digit = num % 10;   // extract last digit
    //         sum += digit * digit * digit; // cube and add
    //         num = num / 10;        // remove last digit
    //     }

    //     if (sum == original) {
    //         System.out.println("Armstrong");
    //     } else {
    //         System.out.println("Not Armstrong");
    //     }

    //     sc.close();
    // }
    // Function to check Armstrong
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        // Count number of digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;

            // power instead of cube (important 🔥)
            sum += Math.pow(digit, digits);

            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive number");
        } else if (isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
