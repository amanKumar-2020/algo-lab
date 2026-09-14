import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr)); // Output: [5, 4, 3, 2, 1]
    }
}
