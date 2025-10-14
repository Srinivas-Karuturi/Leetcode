import java.util.*;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) return true;
        int n = nums.size();
        boolean[] inc = new boolean[n];
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) len++;
            else len = 1;
            if (len >= k) inc[i - k + 1] = true;
        }
        for (int i = 0; i + 2 * k <= n; i++) {
            if (inc[i] && inc[i + k]) return true;
        }
        return false;
    }
}
