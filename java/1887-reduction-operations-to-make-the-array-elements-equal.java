import java.util.Arrays;

class Solution {
    public int reductionOperations(int[] nums) {
        int operations = 0;

        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 0; --i) {
            if (nums[i] != nums[i - 1]) {
                operations += nums.length - i;
            }
        }

        return operations;
    }
}
