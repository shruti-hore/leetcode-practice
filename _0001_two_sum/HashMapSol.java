package _0001_two_sum;

import java.util.HashMap;

// Stores previously visited numbers in a HashMap and looks for the required complement in constant time.

public class HashMapSol {
    public static int[] sol(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int m = target - nums[i];

            if (map.containsKey(m)) {
                return new int[]{map.get(m), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};

    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 10};
        int target = 18;

        int[] ans = sol(nums, target);

        System.out.println(ans[0] + ", " + ans[1]);

        System.out.println("Time Complexity : O(n)");
        System.out.println("Space Complexity : O(n)");

    }
}
