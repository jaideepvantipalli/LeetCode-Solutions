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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=1;i<=n;i++){
                TreeNode nn=q.poll();
                al.add(nn.val);
                if(nn.left!=null)
                    q.offer(nn.left);
                if(nn.right!=null)
                    q.offer(nn.right);
            }
            res.add(al);
        }
        return res;
    }
}