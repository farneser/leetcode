import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            var toFound = target - nums[i];

            if (map.containsKey(toFound)) {
                return new int[]{map.get(toFound), i};
            }

            map.put(nums[i], i);

        }

        return null;
    }
}