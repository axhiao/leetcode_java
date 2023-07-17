package leetcode75;

import java.util.Stack;
public class RemovingStarsFromAString2390 {

    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : arr) {
            if (c == '*') {
                if (!stack.empty())
                    stack.pop();
            } else {
                stack.push(c);
            }
        }

        char[] ret = new char[stack.size()];
        int j = stack.size();
        while(--j >= 0) {
            ret[j] = stack.pop();
        }
        return new String(ret);
    }

    public static void main(String[] args) {

        RemovingStarsFromAString2390 sol = new RemovingStarsFromAString2390();

        String s  = "erase*****";

        String r = sol.removeStars(s);

        System.out.println(r);
    }
}
