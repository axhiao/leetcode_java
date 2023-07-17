package leetcode75;

import java.util.Stack;

public class AsteroidCollision735 {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (stack.empty()) {
                stack.push(asteroids[i]);
                continue;
            }
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                if (stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else {
                    if (-asteroids[i] > stack.peek()) {
                        stack.pop();
                        i--;
                    } else if (-asteroids[i] == stack.peek()) {
                        stack.pop();
                    }
                }
            }
        }
        int[] ret = new int[stack.size()];
        int j = stack.size();
        while(--j >= 0) {
            ret[j] = stack.pop();
        }
        return ret;
    }

    public static void main(String[] args) {
        AsteroidCollision735 sol = new AsteroidCollision735();

        int[] asteroids = {4, -4};

        int[] r = sol.asteroidCollision(asteroids);

        for (int i : r) {
            System.out.print(i + " ");
        }

        System.out.println();

    }
}
