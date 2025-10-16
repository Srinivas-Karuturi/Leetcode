import java.util.*;

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            int r = ((num % value) + value) % value;
            count.put(r, count.getOrDefault(r, 0) + 1);
        }
        int mex = 0;
        while (true) {
            int r = mex % value;
            if (count.getOrDefault(r, 0) > 0) {
                count.put(r, count.get(r) - 1);
                mex++;
            } else {
                return mex;
            }
        }
    }
}
