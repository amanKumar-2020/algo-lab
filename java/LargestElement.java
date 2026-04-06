// Problem: Find Largest Element in Array (Java)

/**
 * Approach (Step-by-Step)
 * Assume first element is the largest
 * Loop through the array
 * Compare each element with current max
 * Update max if bigger value found
 * Print result
 * 
 */

public class LargestElement {
    public static void main(String[] args) {

        int[] arr = { 10, 25, 5, 40, 15 };

        // Step 1: Assume first element is maximum
        int max = arr[0];

        // Step 2: Traverse array
        for (int i = 1; i < arr.length; i++) {

            // Step 3: Compare
            if (arr[i] > max) {
                max = arr[i]; // Step 4: Update max
            }
        }

        // Step 5: Print result
        System.out.println("Largest element is: " + max);
    }
}
