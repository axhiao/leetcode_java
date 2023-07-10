package leetcode75;

public class CanPlaceFlowers605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;

        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0)
                return n == 1;
            else
                return false;
        }

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1)
                continue;
            if (i == 0 ) {
                if (flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                    // check 2nd one at first slot
                    flowerbed[i] = 1;
                    count++;
                }
            } else if (i == flowerbed.length-1 ) {
                if (flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                    // check previous one at last slot.
                    count++;
                }
            } else if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) { // other slots except for 1st and last one.
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
    public static void main(String[] args) {

        CanPlaceFlowers605 solution = new CanPlaceFlowers605();

        int[] flowerbed = {0, 0};
        int n = 1;
        boolean r = solution.canPlaceFlowers(flowerbed, n);

        System.out.println(r);

    }
}
