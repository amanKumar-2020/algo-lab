import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(scanner.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Counter variable that keeps incrementing continuously
        int number = 1; 
        
        // Outer loop for the rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the counter after printing
            }
            
            // Move to the next line after finishing a row
            System.out.println();
        }
        
        scanner.close();
    }
}
