
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void find(int[] arr, int idx, ArrayList<Integer> al) {
        if (idx >= arr.length) {
            ans.add(new ArrayList<>(al));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!al.contains(arr[i])) {
                al.add(arr[i]);
                find(arr, idx + 1, al);
                al.remove(al.size() - 1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        find(nums, 0, new ArrayList<>());
        return ans;
    }
}
