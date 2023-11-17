import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int[] pairs = new int[nums.length / 2];

        for (int i = 0; i < nums.length / 2; i++) {
            pairs[i] = nums[i] + nums[nums.length - i - 1];
        }

        int max = 0;

        for (int pair: pairs) {
            max = Math.max(max, pair);
        }

        return max;
    }
}