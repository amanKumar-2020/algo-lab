<<<<<<< HEAD
class FindDuplicate {

    public static void findDuplicate(int[] arr) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element: " + arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No Duplicate Element Found");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 3, 7, 5};

        findDuplicate(arr);
    }
}
=======
import java.util.HashSet;

class FindDuplicate {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 2, 3, 7, 5 };

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println("Duplicate Element: " + num);
            } else {
                set.add(num);
            }
        }
    }
}
>>>>>>> 705060f (Find Duplicate Number)
