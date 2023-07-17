package leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString345 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>(
                Arrays.asList('a', 'A', 'e', 'E', 'i','I','o','O','u','U')
        );
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (set.contains(arr[i]) && set.contains(arr[j])) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (set.contains(arr[i]) && !set.contains(arr[j])) {
                j--;
            } else
                i++;
        }
        return new String(arr);
    }

    public void swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString345 sol = new ReverseVowelsOfAString345();
        String s = "leetcode";
        String r = sol.reverseVowels(s);
        System.out.println(r);
    }
}
