package _0217_contains_duplicate;

import java.util.HashSet;

class HashSetSol {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 1};

        HashSetSol sol = new HashSetSol();
        System.out.println(sol.containsDuplicate(nums));
    }
}
