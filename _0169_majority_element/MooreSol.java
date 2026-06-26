package _0169_majority_element;

public class MooreSol {
    public int majorityElement(int[] nums) {
        int candidate=0, count=0;

        for(int x : nums) {
            if(count == 0) candidate = x;

            if (candidate == x) count++;
            else count--;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,2,3,3};

        MooreSol obj = new MooreSol();

        System.out.println(obj.majorityElement(nums));
    }
}
