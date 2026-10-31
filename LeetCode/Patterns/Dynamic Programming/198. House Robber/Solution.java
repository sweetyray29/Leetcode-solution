import java.util.Arrays;
class Solution {
    int fun(int[] nums, int idx, int[] dp) {
        if (idx >= nums.length) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int rob = nums[idx] + fun(nums, idx + 2, dp);
        int skip = fun(nums, idx + 1, dp);
        return dp[idx] = Math.max(rob, skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return fun(nums, 0, dp);
    }
}
