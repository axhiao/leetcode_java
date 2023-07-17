package leetcode75;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class MaxNumberOfKSumPairs1679 {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;
        int cnt=0;
        while(i<j){
            if(nums[i]+nums[j]==k){
                cnt++; i++; j--;
            }
            else if(nums[i]+nums[j] < k){
                i++;
            }
            else j--;
        }
        return cnt;
    }
    public int maxOperations_timelimited(int[] nums, int k) {
    Map<Integer, Integer> c = new HashMap<>();
    for (int i : nums)  {
        c.put(i, c.getOrDefault(i, 0)+1);
    }
    int  cnt = 0;
    for (int i = 1, j = k-1; i <= j; i++, j--) {
        int head = c.getOrDefault(i, 0);
        int rear = c.getOrDefault(j, 0);
        if (i == j && head > 1) {
            cnt = cnt + (head / 2);
        } else if (i != j && head > 0 && rear > 0) {
            cnt = cnt + Math.min(head, rear);
        }
    }
    return cnt;
}
    public static void main(String[] args) {
//        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int[] nums = {1,1,2,5,3,4,4};
        int k = 5;
        MaxNumberOfKSumPairs1679 sol = new MaxNumberOfKSumPairs1679();
        int r = sol.maxOperations(nums, k);
        System.out.println(r);
    }
}
