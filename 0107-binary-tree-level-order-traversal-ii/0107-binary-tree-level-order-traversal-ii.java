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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> al=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode nn=q.poll();
                if(nn.left != null)
                    q.offer(nn.left);
                if(nn.right != null)
                    q.offer(nn.right);
                al.add(nn.val);    
            }
            res.add(0,al);
        }
        return res;
    }
}