package leetcode75;

public class IsSubsequence392 {

    public boolean isSubsequence(String s, String t) {
        int ps = 0, pt = 0;
        for (; ps < s.length() && pt < t.length(); pt++) {
            if (s.charAt(ps) == t.charAt(pt)) {
                ps++;
            }
        }
        return ps == s.length();
    }
    public static void main(String[] args) {
        IsSubsequence392 sol = new IsSubsequence392();


        String s = "ahb", t = "ahbgdc";

        boolean r = sol.isSubsequence(s, t);

        System.out.println(r);
    }
}
