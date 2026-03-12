/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        int lvl=1;
        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        boolean reverse = false;

        while (!q.isEmpty()) {
            List<Integer> current = new ArrayList<>();
            int level = q.size();

            for (int i = 0; i < level; i++) {
                if (lvl%2!=0) {
                    TreeNode curr = q.pollFirst();
                    current.add(curr.val);
                    if (curr.left != null) q.addLast(curr.left);
                    if (curr.right != null) q.addLast(curr.right);
                } else {
                    TreeNode curr = q.pollLast();
                    current.add(curr.val);
                    if (curr.right != null) q.addFirst(curr.right);
                    if (curr.left != null) q.addFirst(curr.left);
                }
            }
            lvl++;
            res.add(current);
        }
        return res;
    }
}