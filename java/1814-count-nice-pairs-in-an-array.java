import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countNicePairs(int[] nums) {
        final int MOD = 1000000007;
        int count = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            int diff = num - rev(num);

            frequency.put(diff, frequency.getOrDefault(diff, 0) + 1);
        }

        for (int freq : frequency.values()) {
            count = (int) ((count + (long) freq * (freq - 1) / 2) % MOD);
        }

        return count;
    }

    private int rev(int num) {
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        return reversed;
    }
}
