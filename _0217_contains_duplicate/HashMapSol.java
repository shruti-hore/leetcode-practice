package _0217_contains_duplicate;

import java.util.HashMap;

public class HashMapSol {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);

            if (map.get(x) >= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 1};
        System.out.println(containsDuplicate(nums));
    }
}