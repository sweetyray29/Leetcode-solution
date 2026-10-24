
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<>();

        if (root == null) {
            return al;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int val = -1;

            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();

                val = cur.val; // Update for every node

                if (cur.left != null) {
                    q.offer(cur.left);
                }

                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }

            al.add(val); // Last node at this level
        }

        return al;
    }
}
