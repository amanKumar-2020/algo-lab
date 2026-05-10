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

