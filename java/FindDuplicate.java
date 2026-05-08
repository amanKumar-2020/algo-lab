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
