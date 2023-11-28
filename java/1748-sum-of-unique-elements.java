class Solution {
    public int sumOfUnique(int[] nums) {
        int[] counts = new int[101];

        for(int i = 0; i < nums.length; ++i) {
            counts[nums[i]]++;
        }

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            if (counts[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}
