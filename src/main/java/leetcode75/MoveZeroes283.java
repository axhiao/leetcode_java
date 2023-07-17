package leetcode75;

public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {
        //       q           i
        // |------| |------| |--------|
        // non-zero    0      untouched
        int q = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                continue;
            q++;
            if (q != i) {
                int t = nums[i];
                nums[i] = nums[q];
                nums[q] = t;
            }
        }
    }
    public static void main(String[] args) {

        MoveZeroes283 solution = new MoveZeroes283();

        int[] nums = {0};

        solution.moveZeroes(nums);

        for(int i : nums) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
