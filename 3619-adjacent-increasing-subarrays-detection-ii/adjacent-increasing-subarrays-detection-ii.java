import java.util.List;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        if (n < 2) return 0;
        int[] incEnd = new int[n];
        int[] incStart = new int[n];
        incEnd[0] = 1;
        for (int i = 1; i < n; i++) {
            incEnd[i] = nums.get(i) > nums.get(i - 1) ? incEnd[i - 1] + 1 : 1;
        }
        incStart[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            incStart[i] = nums.get(i) < nums.get(i + 1) ? incStart[i + 1] + 1 : 1;
        }
        int ans = 0;
        for (int m = 0; m < n - 1; m++) {
            int k = Math.min(incEnd[m], incStart[m + 1]);
            if (k > ans) ans = k;
        }
        return ans;
    }
}
