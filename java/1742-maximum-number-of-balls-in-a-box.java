class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        // count of  digits in a highLimit number 
        int len=(int)Math.log10(highLimit)+1;

        int[] sums = new int[9*len+1];
        int maxCount = sums[0];

        for (int i = lowLimit; i <= highLimit; ++i) {
            int sum = 0;
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            
            maxCount = Math.max(maxCount, ++sums[sum]);
        }
        
        return maxCount;
    }
}
