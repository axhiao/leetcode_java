package leetcode75;

public class ReverseWordsInAString151 {


    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        for (int i = 0; i < arr.length / 2 ; i++) {
            String t = arr[arr.length - i - 1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = t;
        }
        return String.join(" ", arr);
    }

    public static void main(String[] args) {
        ReverseWordsInAString151 solution = new ReverseWordsInAString151();
        String s = "a good   example";
//        String[] arr = s.split("\\s+");
//        System.out.println(arr.length);
//        for (String i : arr)
//            System.out.println(i);
//
//        for (int i = 0; i < arr.length / 2 ; i++) {
//            String t = arr[arr.length - i - 1];
//            arr[arr.length-i-1] = arr[i];
//            arr[i] = t;
//        }
//
//        for (String i : arr)
//            System.out.print(i + " ");

        String r = solution.reverseWords(s);
        System.out.println(r);

    }
}
