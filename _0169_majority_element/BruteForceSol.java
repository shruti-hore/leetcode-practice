package _0169_majority_element;

class BruteForceSol {
    public int majorityElement(int[] nums) {
        for(int val : nums) {
            int freq = 0;

            for(int el : nums) {
                if(el == val) {
                    freq++;
                }
            }

            int n = nums.length;
            if(freq > n/2) return val;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        BruteForceSol obj = new BruteForceSol();

        System.out.println(obj.majorityElement(nums));
    }
}