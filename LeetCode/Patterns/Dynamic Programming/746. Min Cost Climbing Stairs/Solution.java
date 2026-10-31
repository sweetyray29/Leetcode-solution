class Solution {
    int fun(int[] arr, int idx) {
        if (idx >= arr.length) {
            return 0;
        }
        return arr[idx] + Math.min(fun(arr, idx + 1),fun(arr, idx + 2));
    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(fun(cost, 0), fun(cost, 1));
    }
}
