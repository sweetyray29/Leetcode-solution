import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
            else
                prod *= nums[i];
        }

        if (count > 1) {
            Arrays.fill(nums, 0);
            return nums;
        }

        if (count == 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = prod / nums[i];
            }
        } else if (count == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    nums[i] = prod;
                else
                    nums[i] = 0;
            }
        }

        return nums;
    }
}