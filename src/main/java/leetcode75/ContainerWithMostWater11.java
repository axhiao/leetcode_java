package leetcode75;

public class ContainerWithMostWater11 {

    public int maxArea(int[] height) {


        if (height == null || height.length < 2)
            return 0;

        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end)
        {
            max = Math.max(max,(end-start)*Math.min(height[start],height[end]));

            if (height[start] < height[end])
                start++;
            else
                end--;
        }
        return max;
    }

    public static void main(String[] args) {

        ContainerWithMostWater11 sol = new ContainerWithMostWater11();


        int[] height = {1,8,6,2,5,4,8,3,7};

        int r = sol.maxArea(height);

        System.out.println(r);


    }
}
