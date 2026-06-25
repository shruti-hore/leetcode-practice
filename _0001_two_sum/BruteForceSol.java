package _0001_two_sum;

// Checks every possible pair in the array and returns the indices when the target sum is found.

public class BruteForceSol {
    public static int[] sol(int [] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 10};
        int target = 18;

        int[] ans = sol(nums, target);

        System.out.println(ans[0] + ", " + ans[1]);

        System.out.println("Time Complexity : O(n^2)");
        System.out.println("Space Complexity : O(1)");

    }
}
