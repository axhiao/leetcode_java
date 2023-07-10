package leetcode75;

public class GreatestCommonDivisorofStrings {

    public String gcdOfStrings(String str1, String str2) {

        int l1 = str1.length();
        int l2 = str2.length();
        int l = Integer.min(l1, l2);
        if (l1 == l) {
            String t = str2;
            str2 = str1;
            str1 = t;
        }
        // str1 keeps the long string.
        // str2 keeps the short string.
        for (int i = l; i > 0; i--) {
            if (l1 % i == 0 && l2 % i == 0) {
                String substr = str2.substring(0, i);


                if (divisible(substr, str1) && divisible(substr, str2)) {
                    return substr;
                }
            }
        }

        return "";
    }

    public boolean divisible(String test, String str) {
        int n = test.length();
        int l = str.length();
        if (l % n != 0)
            return false;
        for (int i = 0; i < l; i=i+n) {
            if (!test.equals(str.substring(i, i+n))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        GreatestCommonDivisorofStrings solution = new GreatestCommonDivisorofStrings();

//        String str1 = "ABCABC", str2 = "ABC";

        String str1 = "AAAAAAAAA", str2 = "AAACCC";

        String r = solution.gcdOfStrings(str1, str2);

//        boolean r = solution.divisible("ABC", "ABCABD");

        System.out.println(r);
    }
}
