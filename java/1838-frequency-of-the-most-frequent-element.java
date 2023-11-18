import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {

    Arrays.sort(nums);
        
    int l = 0, r = 0, res = 0;
    long total = 0;

    while (r < nums.length) {
        total += nums[r];
        
        while (total + k < nums[r] * (r - l + 1)) {
            total -= nums[l];
            l++;
        }
        
        res = Math.max(res, r - l + 1);
        r++;
    }


    return res;
    }
}