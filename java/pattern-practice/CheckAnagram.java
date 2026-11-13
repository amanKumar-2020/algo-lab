import java.util.Arrays;

class CheckAnagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings into character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are Not Anagram");
        }
    }
}