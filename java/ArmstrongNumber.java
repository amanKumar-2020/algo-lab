import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;   // extract last digit
            sum += digit * digit * digit; // cube and add
            num = num / 10;        // remove last digit
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
