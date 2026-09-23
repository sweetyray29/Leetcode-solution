class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int i = 0;
        int j = len - 1;
        int k = len - 1;
        int[] ans = new int[len];
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[k] = nums[i] * nums[i];
                i++;
            } else {
                ans[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return ans;
    }
}