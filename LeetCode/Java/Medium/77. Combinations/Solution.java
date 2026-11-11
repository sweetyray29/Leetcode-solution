class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void find(int start, int n, int k, ArrayList<Integer> al) {
        if (al.size() == k) {
            ans.add(new ArrayList<>(al));
            return;
        }
        for (int i = start; i <= n; i++) {
            al.add(i);
            find(i + 1, n, k, al);
            al.remove(al.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        find(1, n, k, new ArrayList<>());
        return ans;
    }
}
