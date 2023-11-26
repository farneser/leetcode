import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        for (int j = 0; j < nums.size(); ++j) {
            // System.out.println(nums.get(j).get(0) + " " + j);
            int i = -1;
            
            for (int h = j; h >= 0; --h) {
                i++;
                if (nums.get(h).size() <= i) {
                    continue;
                }

                System.out.println(nums.get(h).get(i));
            }
        }

        return null;
    }

    public static void main(String[] args) {
        var s = new Solution();
        List<List<Integer>> nums = new ArrayList<List<Integer>>();
        nums.add(Arrays.asList(1, 2, 3));
        nums.add(Arrays.asList(4));
        nums.add(Arrays.asList(5, 6));
        // 100, 110, 101, 120, 111, 102, 121, 122
        s.findDiagonalOrder(nums);
        // System.out.println(Arrays.toString(s.findDiagonalOrder(nums)));
    }
}