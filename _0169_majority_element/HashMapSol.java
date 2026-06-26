package _0169_majority_element;

import java.util.HashMap;

class HashMapSol {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0)+1);

            if (map.get(x) > n/2) return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        BruteForceSol obj = new BruteForceSol();

        System.out.println(obj.majorityElement(nums));
    }
}