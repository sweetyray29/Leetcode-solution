class Solution {
    int fun(int[] cost, int idx, int[] dp) {
        if (idx >= cost.length) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        return dp[idx] = cost[idx] + Math.min(
            fun(cost, idx + 1, dp),
            fun(cost, idx + 2, dp)
        );
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        java.util.Arrays.fill(dp, -1);

        return Math.min(
            fun(cost, 0, dp),
            fun(cost, 1, dp)
        );
    }
}
