import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int x : map.keySet()) {
            int freq = map.get(x);

            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(x);
        }

        int[] ans = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {

            if (bucket[i] != null) {
                for (int x : bucket[i]) {
                    ans[index++] = x;

                    if (index == k)
                        return ans;
                }
            }
        }

        return ans;
    }
}