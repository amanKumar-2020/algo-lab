// Move all zeros to end

class MoveZeros {

    public static void moveZerosToEnd(int[] arr) {

        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 5, 0, 3, 0, 9 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        moveZerosToEnd(arr);

        System.out.println("\n\nArray After Moving Zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}