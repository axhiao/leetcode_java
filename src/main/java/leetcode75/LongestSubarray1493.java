package leetcode75;

public class LongestSubarray1493 {
    public int longestSubarray(int[] nums) {
        if (nums.length < 2)
            return 0;
        int[] reverseCount = new int[nums.length];
        // compute reversely
        for (int i = nums.length - 2; i >= 0; i--) {
            reverseCount[i] = nums[i+1] == 1 ? 1 + reverseCount[i+1] : 0;
        }
        int max = 0;
        int count = 0;
        // how many consecutive 1s on the left of position i (excluded)
        for (int i = 1; i < nums.length; i++) {
            count = nums[i-1] == 1 ? 1 + count : 0;
            if (count + reverseCount[i] > max) {
                max = count + reverseCount[i];
            }
        }
        return max;
    }

//    private static void reverse(int[] array) {
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//    }

    public static void main(String[] args) {

        LongestSubarray1493 solution = new LongestSubarray1493();

        int[] nums = {1, 1, 0, 1};
        //            0  1  2  3

        // 0120
        // 0101

        // 0 1 0 1 2 3 4 0 1
        //               010123401

        int r = solution.longestSubarray(nums);

        System.out.println();
        System.out.println(r);


        for (int i = 1; i <= 5; i++) {
            System.out.print(i / 2);
            System.out.print(" ");
        }

    }
}
