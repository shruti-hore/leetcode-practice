package _0001_two_sum;

import java.util.Arrays;

// Sorts the array and uses two pointers from both ends to find whether a pair with the target sum exists.

public class TwoPointerSol {
    public static boolean sol(int[] nums, int target) {
        Arrays.sort(nums);

        int left=0, right=nums.length-1;
        while(left<right) {
            int sum = nums[left] + nums[right];

            if (sum == target) return true;

            else if (sum < target) left++;

            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 10};
        int target = 18;

        System.out.println(sol(nums, target));

        System.out.println("Time Complexity : O(n logn)");
        System.out.println("Space Complexity : O(1)");

    }
}
