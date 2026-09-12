class Solution {
    public int longestOnes(int[] nums, int k) {

        int low = 0;
        int high = nums.length;
        int ans = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canMake(nums, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public boolean canMake(int[] nums, int k, int len) {

        int zeros = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
        }

        if (zeros <= k) {
            return true;
        }

        for (int i = len; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeros++;
            }

            if (nums[i - len] == 0) {
                zeros--;
            }

            if (zeros <= k) {
                return true;
            }
        }

        return false;
    }
}