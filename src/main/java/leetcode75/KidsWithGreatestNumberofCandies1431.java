package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberofCandies1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max = 0;
        for (int c : candies) {
            if (c > max)
                max = c;
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(i, true);
            } else {
                res.add(i, false);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        KidsWithGreatestNumberofCandies1431 solution = new KidsWithGreatestNumberofCandies1431();

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> res = solution.kidsWithCandies(candies, extraCandies);
        for (Boolean i: res) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
